package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

}
