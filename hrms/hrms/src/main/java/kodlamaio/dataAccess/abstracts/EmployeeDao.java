package kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
