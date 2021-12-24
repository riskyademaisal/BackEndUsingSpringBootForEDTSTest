package Service;

import java.util.List;

import Model.Employee;

public interface Emlpoyee_Service {

	
	public boolean saveEmployee(Employee employee);
	public List<Employee> getEmployees();
	public boolean deleteEmployee(Employee employee);
	public List<Employee> getEmployeeByID(Employee employee);
	public boolean updateEmployee(Employee employee);
}
