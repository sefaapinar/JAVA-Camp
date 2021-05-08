package ReCap5.core.concretes;

import java.util.ArrayList;

import ReCap5.core.abstracts.ValidatorService;
import ReCap5.entities.concretes.User;

public class RepeatMailValidator implements ValidatorService{

	private ArrayList<String> mails = new ArrayList<String>();
	
	public RepeatMailValidator() {
		
	}

	@Override
	public boolean checkUser(User user) {
		if(mails.isEmpty()) {
			System.out.println("Mail Adresi Daha Önce KAYDEDÝLMEDÝ....");
			mails.add(user.getEmail());
			return true;
		}
		
		for (String mail : mails) {
			if(mail ==user.getEmail()) {
				System.out.println("Mail Adresi Zaten Sisteme Kayýtlý...");
				return false;
			}
			System.out.println("Mail Adresi Daha Önce KAYDEDÝLMEDÝ....");
			mails.add(user.getEmail());
			return true;
		}
		return false;
	}

}














