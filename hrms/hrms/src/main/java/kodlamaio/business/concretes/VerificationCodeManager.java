package kodlamaio.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.business.abstracts.VerificationCodeService;
import kodlamaio.core.utilities.Result;
import kodlamaio.core.utilities.SuccessResult;
import kodlamaio.dataAccess.abstracts.VerificationCodeDao;
import kodlamaio.entities.concretes.VerificationCode;

public class VerificationCodeManager implements VerificationCodeService {

	private VerificationCodeDao verificationCodeDao;
	
	@Autowired //bir bean içerisinde ki verileri başka bir bean'e enjeckte edebiliriz.
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	@Override
	public Result add(VerificationCode code) {
		
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code Eklendi!");
	}

}
