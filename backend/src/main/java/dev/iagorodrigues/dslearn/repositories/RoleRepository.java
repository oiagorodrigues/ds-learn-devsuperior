package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
