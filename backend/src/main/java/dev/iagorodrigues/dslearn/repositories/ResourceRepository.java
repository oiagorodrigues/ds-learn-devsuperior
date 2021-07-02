package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
