package repository;

import entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

interface JobRepository extends JpaRepository<Job, Integer> {
}
