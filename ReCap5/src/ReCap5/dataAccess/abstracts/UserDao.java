package ReCap5.dataAccess.abstracts;

import ReCap5.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	public void login(String mail, String password);
	public void update(User user);
	public void delete(User user);
}
