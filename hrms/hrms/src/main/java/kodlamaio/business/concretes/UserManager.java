package kodlamaio.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.business.abstracts.UserService;
import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.core.utilities.SuccessDataResult;
import kodlamaio.core.utilities.SuccessResult;
import kodlamaio.dataAccess.abstracts.UserDao;
import kodlamaio.entities.concretes.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao){
		super();
		this.userDao = userDao;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi!");
	}


	

}
