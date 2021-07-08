package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Notification;
import dev.iagorodrigues.dslearn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    @Query("SELECT n FROM Notification n WHERE n.user = :user " +
            "AND (:unreadOnly = false OR n.read = false) " +
            "ORDER BY n.moment DESC ")
    Page<Notification> findByUser(User user, boolean unreadOnly, Pageable pageable);
}
