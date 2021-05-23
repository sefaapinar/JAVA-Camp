package kodlamaio.business.abstracts;

import java.util.List;

import kodlamaio.entities.concretes.JobTitle;

public interface JobPositionsService {
	
	List<JobTitle>getAll();
	
	JobTitle newJobPositions(JobTitle newJobPosition);
}
