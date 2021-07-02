package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
