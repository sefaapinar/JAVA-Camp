package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions,Integer> {

}
