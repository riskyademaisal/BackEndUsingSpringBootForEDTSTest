package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Model.Employee;
import Service.Emlpoyee_Service;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {
	
        @GetMapping("/")
	public Map<String, Object> greeting() {
		return Collections.singletonMap("message", "EDTS Test Employee");
	}
    
	@Autowired
	private Emlpoyee_Service employeeservice;
	
	@PostMapping("save-employee")
	public boolean saveEmployee(@RequestBody Employee employee) {
		 return employeeservice.saveEmployee(employee);
		
	}
	
	@GetMapping("employees-list")
	public List<Employee> allEmployees() {
            
		 return employeeservice.getEmployees();
	}
	
	
	@DeleteMapping("delete-employee/{id}")
	public boolean deleteEmployee(@PathVariable("id") BigInteger id,Employee employee) {
		employee.setId(id);
		return employeeservice.deleteEmployee(employee);
	}

	@GetMapping("employee/{id}")
	public List<Employee> allEmployeeByID(@PathVariable("id") BigInteger id,Employee employee) {
		 employee.setId(id);
		 return employeeservice.getEmployeeByID(employee);
	}
	
	@PostMapping("update-employee/{id}")
	public boolean updateEmployee(@RequestBody Employee employee,@PathVariable("id") BigInteger id) {
		employee.setId(id);
		return employeeservice.updateEmployee(employee);
	}
}
