package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
