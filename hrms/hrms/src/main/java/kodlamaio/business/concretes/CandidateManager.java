package kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.business.abstracts.CandidateService;
import kodlamaio.dataAccess.abstracts.CandidateDao;
import kodlamaio.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll(); //Tüm verileri getir.
	}
	@Override
	public String add(Candidate candidate) {
		
		this.candidateDao.save(candidate);
		return "Added!";
	}
	
}
