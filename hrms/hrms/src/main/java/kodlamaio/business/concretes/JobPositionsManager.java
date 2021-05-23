package kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.business.abstracts.JobPositionsService;
import kodlamaio.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.entities.concretes.JobTitle;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}
	@Override
	public List<JobTitle> getAll() {
		return this.jobPositionsDao.findAll();
	}
	@Override
	public JobTitle newJobPositions(JobTitle newJobPosition) {
		
		return jobPositionsDao.save(newJobPosition);
	}
	

}
