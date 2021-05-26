package kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.business.abstracts.CandidateService;
import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.ErrorResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.core.utilities.SuccessDataResult;
import kodlamaio.core.utilities.SuccessResult;
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
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Data listed"); 
	}
	
	@Override
	public Result add(Candidate candidate) {
		if(getByidentificationNumber(candidate.getIdentificationNumber()).getData() !=null) {
			return new ErrorResult("Bu aday kimlik numarası zaten var.");
		}else if(getByEmailAddress(candidate.getMail()).getData() !=null) {
			return new ErrorResult("Bu e-posta zaten var.");
		}
		
		this.candidateDao.save(candidate);
		return new SuccessResult("Aday Eklendi!");
	}

	@Override
	public DataResult<Candidate> getByidentificationNumber(String identificationNumber) {
		
		return new SuccessDataResult<>(this.candidateDao.findByidentificationNumber(identificationNumber));
	}

	@Override
	public DataResult<Candidate> getByEmailAddress(String EmailAddress) {
		
		return new SuccessDataResult<Candidate>(this.candidateDao.findByMail(EmailAddress));
	}
	
}
