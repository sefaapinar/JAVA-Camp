package kodlamaio.business.abstracts;

import java.util.List;

import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.entities.concretes.Candidate;

public interface CandidateService {

	DataResult<List<Candidate>>getAll();
	DataResult<Candidate> getByidentificationNumber(String identificationNumber);
	DataResult<Candidate> getByEmailAddress(String EmailAddress);

	Result add(Candidate candidate);
}
