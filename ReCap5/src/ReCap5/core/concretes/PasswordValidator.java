package ReCap5.core.concretes;

import ReCap5.core.abstracts.ValidatorService;
import ReCap5.entities.concretes.User;

public class PasswordValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getPassword().length()>=6) {
			System.out.println("Password Applies...");
			return true;
		}
		System.out.println("Password Is Invalid");
		return false;
	}

}
