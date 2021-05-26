package kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.business.abstracts.JobPositionsService;
import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.ErrorResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.core.utilities.SuccessDataResult;
import kodlamaio.core.utilities.SuccessResult;
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
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobPositionsDao.findAll(),"Veriler Listelendi");
		
	}
	@Override
	public DataResult<JobTitle> getByTitle(String title) {
		return new SuccessDataResult<>(this.jobPositionsDao.findByTitle(title));
		
	}
	@Override
	public Result add(JobTitle jobTitle) {
		if(jobPositionsDao.existsByTitle(jobTitle.getTitle())) {
			return new ErrorResult("Bu pozisyon zaten kayıtlı.");
		}
		this.jobPositionsDao.save(jobTitle);
		return new SuccessResult("pozisyon eklendi.");
	}
	
	

}
