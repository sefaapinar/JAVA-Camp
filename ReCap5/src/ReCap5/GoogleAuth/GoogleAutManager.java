package ReCap5.GoogleAuth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GoogleAutManager implements GoogleAutService{

	@Override
	public boolean checkMail(String mail) {

		String mailPattern = "^[A-Z0-9._%+-]+@(gmail)+.(com)?$";
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
		
		
		 
			Matcher matcher = pattern.matcher(mail);
			if(matcher.matches()==true) {
				System.out.println("Mail Pattern Ba�ar�l�... ");
				return true;
			}
				System.out.println("Ge�ersiz Mail Adresi...");
				return false;
		
	}

	@Override
	public void log(String message) {
		
		System.out.println("Google Giri� Do�rulamas� Ba�ar�l�");
	}

}
