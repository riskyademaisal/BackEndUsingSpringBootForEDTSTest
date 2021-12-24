package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Employee;

@Repository
public class Employee_DAO_Imp  implements Emplpoyee_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveEmployee(Employee employee) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(employee);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getEmployees() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query=currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteEmployee(Employee employee) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(employee);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getEmployeeByID(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> query=currentSession.createQuery("from Employee where id=:id", Employee.class);
		query.setParameter("id", employee.getId());
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(employee);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
