package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
