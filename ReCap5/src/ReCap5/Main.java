package ReCap5;



import ReCap5.GoogleAuth.GoogleAutManager;
import ReCap5.GoogleAuth.GoogleAutService;
import ReCap5.business.abstracts.UserService;
import ReCap5.business.concretes.UserManager;
import ReCap5.core.abstracts.UserVerifyService;
import ReCap5.core.abstracts.ValidatorService;
import ReCap5.core.concretes.MailValidator;
import ReCap5.core.concretes.NameValidator;
import ReCap5.core.concretes.PasswordValidator;
import ReCap5.core.concretes.RepeatMailValidator;
import ReCap5.core.concretes.UserVerifyCode;
import ReCap5.dataAccess.concretes.DBUserDao;
import ReCap5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
			
			ValidatorService [] validatorService = {new MailValidator(), new PasswordValidator(), new NameValidator(), new RepeatMailValidator()};
		
			UserVerifyService userVerifyService = new UserVerifyCode();
			GoogleAutService googleAutService= new GoogleAutManager();
			
			User user1= new User(1,"sefa@gmail.com","2134443","Sefa","Pýnar");
			UserService userService = new UserManager(new DBUserDao(),validatorService, userVerifyService,googleAutService);
			userService.register(user1);
			
			userService.GoogleRegister(user1);
			User user2= new User(1,"sefa@gmail.com","2134443","Sefa","Pýnar");
			userService.register(user2);
			userService.GoogleRegister(user2);
			
			userService.login(user1);
			User User3 = new User(1,"irem@gmail.com","234344","Ýrem","Yüksel");
			userService.register(User3);
			userService.login(User3);
			
			
			
	}

}
