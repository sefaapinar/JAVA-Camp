package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.entities.concretes.JobTitle;

public interface JobPositionsDao extends JpaRepository<JobTitle,Integer> {

	JobTitle findByTitle(String title);
	
	boolean existsByTitle(String title);
}
