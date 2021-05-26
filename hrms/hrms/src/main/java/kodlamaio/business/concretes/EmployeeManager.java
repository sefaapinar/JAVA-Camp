package kodlamaio.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.business.abstracts.EmployeeService;
import kodlamaio.core.utilities.DataResult;
import kodlamaio.core.utilities.Result;
import kodlamaio.core.utilities.SuccessDataResult;
import kodlamaio.core.utilities.SuccessResult;
import kodlamaio.dataAccess.abstracts.EmployeeDao;
import kodlamaio.entities.concretes.Employee;


	public class EmployeeManager implements EmployeeService {
	
		private EmployeeDao employeeDao;

	@Autowired
	public EmployeeManager (EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao; 
	}
	
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Çalışan Eklendi!");
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

}
