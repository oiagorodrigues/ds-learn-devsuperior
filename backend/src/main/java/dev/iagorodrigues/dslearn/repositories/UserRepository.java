package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
