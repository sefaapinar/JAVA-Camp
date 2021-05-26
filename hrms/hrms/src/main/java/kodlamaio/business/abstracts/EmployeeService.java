package kodlamaio.business.abstracts;

import java.util.List;

import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.entities.concretes.Employee;

public interface EmployeeService {
	
	Result add(Employee employee);
	DataResult<List<Employee>>getAll();
}
