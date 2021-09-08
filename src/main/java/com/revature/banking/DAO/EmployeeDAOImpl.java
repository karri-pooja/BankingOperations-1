package com.revature.banking.DAO;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.banking.model.Customer;
import com.revature.banking.model.Employee;
import com.revature.banking.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	
	public boolean isEmployeeexists(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int addEmployee(Employee employee) {

		Transaction transaction = session.beginTransaction();
		session.save(employee);
		int employeeId = employee.getEmployeeId();
		transaction.commit();
		return employeeId;
	}

	
	public boolean validateEmployee(int employeeId, String password) {
		
		Query query = session.createQuery("from Employee where employeeId = "+employeeId+ " and password = '"+password + "'");
        if (query.list().size() == 0)
        {
          return false;
        }
        else
        {
          return true;
        }
	}

	
	public String getNameById(int employeeId) {
		
		Employee employee =  (Employee) session.load(Employee.class, employeeId);
        return employee.getEmployeeName();
	}

	
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
