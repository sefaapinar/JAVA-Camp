package kodlamaio.business.abstracts;

import kodlamaio.core.utilities.Result;
import kodlamaio.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	Result add(VerificationCode code);

}
