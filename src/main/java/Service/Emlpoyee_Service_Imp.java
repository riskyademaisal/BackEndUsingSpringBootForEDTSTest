package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.Employee;
import DAO.Emplpoyee_DAO;

@Service
@Transactional
public class Emlpoyee_Service_Imp implements Emlpoyee_Service {
 
	@Autowired
	private Emplpoyee_DAO employeedao;
	
	@Override
	public boolean saveEmployee(Employee employee) {
		return employeedao.saveEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeedao.getEmployees();
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		return employeedao.deleteEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeByID(Employee employee) {
		return employeedao.getEmployeeByID(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeedao.updateEmployee(employee);
	}

}
