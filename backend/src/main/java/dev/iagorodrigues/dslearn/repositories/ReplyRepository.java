package dev.iagorodrigues.dslearn.repositories;

import dev.iagorodrigues.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
