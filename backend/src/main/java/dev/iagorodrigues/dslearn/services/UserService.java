package dev.iagorodrigues.dslearn.services;

import dev.iagorodrigues.dslearn.dto.UserDTO;
import dev.iagorodrigues.dslearn.entities.User;
import dev.iagorodrigues.dslearn.repositories.UserRepository;
import dev.iagorodrigues.dslearn.services.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired private UserRepository repository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> userOptional = repository.findById(id);
        return userOptional
                .map(UserDTO::new)
                .orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByEmail(username);

        if(user == null) {
            logger.error("User not found: " + username);
            throw new UsernameNotFoundException("Email not found");
        }

        return user;
    }
}
