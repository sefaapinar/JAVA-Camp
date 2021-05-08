package ReCap5.core.concretes;

import java.util.Scanner;

import ReCap5.core.abstracts.UserVerifyService;

public class UserVerifyCode implements UserVerifyService{

	
	@Override
	public boolean userVerify() {
		int realCode = (int) (100 * Math.random() * 1000);
		System.out.println("Sistem Doðrulama Kodunuz " + realCode);
		Scanner input = new Scanner(System.in);
		System.out.println("Doðrulama Kodunu Giriniz...");
		int inputCode = input.nextInt();
		
		if(realCode == inputCode ) {
			return true;
		}
		return false;
	}

}
