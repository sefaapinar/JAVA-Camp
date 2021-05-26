package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate,Integer>{

	Candidate findByidentificationNumber(String identificationNumber);
	Candidate findByMail(String mail);
}
