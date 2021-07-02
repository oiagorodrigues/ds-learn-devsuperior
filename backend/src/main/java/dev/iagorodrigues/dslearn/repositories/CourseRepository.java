package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
