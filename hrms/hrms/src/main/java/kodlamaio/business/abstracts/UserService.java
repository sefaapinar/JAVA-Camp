package kodlamaio.business.abstracts;

import java.util.List;

import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.entities.concretes.Candidate;
import kodlamaio.entities.concretes.JobTitle;
import kodlamaio.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>>getAll();
	Result add(User user);

}
