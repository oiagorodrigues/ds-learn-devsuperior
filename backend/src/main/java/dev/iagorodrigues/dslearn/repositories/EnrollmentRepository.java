package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Enrollment;
import dev.iagorodrigues.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
