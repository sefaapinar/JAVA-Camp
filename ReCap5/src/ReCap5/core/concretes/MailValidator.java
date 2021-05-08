package ReCap5.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ReCap5.core.abstracts.ValidatorService;
import ReCap5.entities.concretes.User;

public class MailValidator implements ValidatorService{

	String mailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean checkUser(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()==true) {
			System.out.println("Mail Pattern Baþarýlý... ");
			return true;
		}
			System.out.println("Geçersiz Mail Adresi...");
			return false;
		
	
	}

}
