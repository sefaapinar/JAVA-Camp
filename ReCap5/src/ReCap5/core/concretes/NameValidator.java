package ReCap5.core.concretes;

import ReCap5.core.abstracts.ValidatorService;
import ReCap5.entities.concretes.User;

public class NameValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			System.out.println("Ad ve Soyad Geçerlidir...");
			return true;
		}
		System.out.println("Geçersiz Ad - Soyad...");
		return false;
	}

	
}
