package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
