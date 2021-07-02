package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
