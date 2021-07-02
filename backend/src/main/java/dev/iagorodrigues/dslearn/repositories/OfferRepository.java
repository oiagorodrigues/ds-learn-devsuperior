package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
