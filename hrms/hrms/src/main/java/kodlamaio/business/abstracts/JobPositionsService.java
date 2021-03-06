package kodlamaio.business.abstracts;

import java.util.List;

import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.entities.concretes.JobTitle;

public interface JobPositionsService {
	
	DataResult<List<JobTitle>>getAll();
	DataResult<JobTitle> getByTitle(String title);
	Result add(JobTitle jobTitle);
	
}
