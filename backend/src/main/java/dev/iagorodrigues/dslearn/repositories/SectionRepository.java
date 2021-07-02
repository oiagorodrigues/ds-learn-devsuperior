package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
