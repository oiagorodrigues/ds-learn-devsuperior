package dev.iagorodrigues.dslearn.services;

import dev.iagorodrigues.dslearn.dto.NotificationDTO;
import dev.iagorodrigues.dslearn.entities.Notification;
import dev.iagorodrigues.dslearn.entities.User;
import dev.iagorodrigues.dslearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired private NotificationRepository repository;
    @Autowired private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();
        Page<Notification> page = repository.findByUser(user, pageable);
        return page.map(NotificationDTO::new);
    }
}
