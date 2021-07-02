package dev.iagorodrigues.dslearn.controllers;

import dev.iagorodrigues.dslearn.dto.NotificationDTO;
import dev.iagorodrigues.dslearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationForCurrentUser(Pageable pageable) {
        Page<NotificationDTO> result = service.notificationForCurrentUser(pageable);
        return ResponseEntity.ok(result);
    }
}
