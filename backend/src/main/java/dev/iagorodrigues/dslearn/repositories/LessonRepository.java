package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
