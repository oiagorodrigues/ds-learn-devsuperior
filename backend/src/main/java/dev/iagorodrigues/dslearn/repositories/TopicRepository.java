package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
