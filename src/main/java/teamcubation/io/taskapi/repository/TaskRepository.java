package teamcubation.io.taskapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamcubation.io.taskapi.domain.Task;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findTaskByStatus(String status);
}
