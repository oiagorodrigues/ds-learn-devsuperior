package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
