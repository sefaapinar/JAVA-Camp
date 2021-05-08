package ReCap5.dataAccess.concretes;

import java.util.ArrayList;


import ReCap5.dataAccess.abstracts.UserDao;
import ReCap5.entities.concretes.User;

public class DBUserDao implements UserDao {

	public ArrayList<User> users=new ArrayList<User>();
	
	public DBUserDao() {
		
	
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Saved to db: ");
		for(User user1:users) {
			System.out.println(user1.getFirstName());
			System.out.println("@@@@@@@");
		}
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String mail, String password) {
		System.out.println("Sisteme Giriþ Yapýldý...");
	}

}
