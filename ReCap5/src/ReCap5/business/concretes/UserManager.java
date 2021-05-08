package ReCap5.business.concretes;



import java.util.Scanner;

import ReCap5.GoogleAuth.GoogleAutService;
import ReCap5.business.abstracts.UserService;
import ReCap5.core.abstracts.UserVerifyService;
import ReCap5.core.abstracts.ValidatorService;
import ReCap5.dataAccess.abstracts.UserDao;
import ReCap5.entities.concretes.User;

public class UserManager implements UserService{

	private ValidatorService[] validatorService;
	private UserDao userDao;
	private UserVerifyService userVerifyService;
	private GoogleAutService autService;
		
	public UserManager(UserDao userDao, ValidatorService[] validatorService, UserVerifyService userVerifyService, GoogleAutService googleAutService) {
		super();
		this.userDao = userDao;
		this.validatorService = validatorService;
		this.userVerifyService = userVerifyService;
		this.autService = autService;
		
	}
	
	
	@Override
	public void register(User user) {
		
		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false){
				
				System.out.println("Kayýt Baþarýsýzdýr...");
				return;
			}
				
		}
		
		if(userVerifyService.userVerify()==false) {
			System.out.println("Doðrulama baþarýsýz...");
			return;
		}else {
			System.out.println("Doðrulama Baþarýlý...");
			System.out.println("Kayýt Baþarýlý...");
			userDao.add(user);
		}
		
	
		
}
	@Override
	public void login(User user) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen mail adresinizi giriniz..");
		String mail=input.next();
		System.out.println("Lütfen Þifrenizi giriniz...");
		String password = input.next();
		
		if(mail.equals(user.getEmail()) && password.equals(user.getPassword())) {
			
			userDao.login(user.getEmail(), user.getPassword());
			System.out.println("Giriþ Baþarýlý...");
			return;
		}
		else{
			System.out.println("Giriþ Baþarýsýz...");
		}
		
		
	}


	@Override
	public void Googlelogin(User user) {
		
		for(ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Google ile Kayýt Baþarýsýz...");
				return;
			}
		}
		if(autService.checkMail(user.getEmail())==true) {
			autService.log("Google iyi kayýt olundu..." + user.getEmail());
			System.out.println("@@@@@@");
			userDao.add(user);
		}
		
	}


	@Override
	public void GoogleRegister(User user) {
		
	}

}






















