package ReCap5.business.abstracts;

import ReCap5.entities.concretes.User;

public interface UserService {
	public void register(User user);
	public void login(User user);
	
	public void Googlelogin(User user);
	public void GoogleRegister(User user);
}
