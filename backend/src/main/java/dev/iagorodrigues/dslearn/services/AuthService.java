package dev.iagorodrigues.dslearn.services;

import dev.iagorodrigues.dslearn.entities.User;
import dev.iagorodrigues.dslearn.entities.enums.RoleEnum;
import dev.iagorodrigues.dslearn.repositories.UserRepository;
import dev.iagorodrigues.dslearn.services.exceptions.ForbiddenException;
import dev.iagorodrigues.dslearn.services.exceptions.UnathorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        } catch (Exception ex) {
            throw new UnathorizedException("Invalid user");
        }
    }

    public void validateSelfOrAdming(Long userId) {
        User user = authenticated();
        if (!user.getId().equals(userId) && !user.hasRole(RoleEnum.ADMIN.name())) {
            throw new ForbiddenException("Access denied");
        }
    }
}
