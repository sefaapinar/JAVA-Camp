package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
		

}
