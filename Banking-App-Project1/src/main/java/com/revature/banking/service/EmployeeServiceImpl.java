package com.revature.banking.service;

import java.util.List;

import com.revature.banking.DAO.EmployeeDAO;
import com.revature.banking.DAO.EmployeeDAOImpl;
import com.revature.banking.model.Customer;
import com.revature.banking.model.Employee;



public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public boolean isEmployeeexists(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
	}

	
	public boolean validateEmployee(int employeeId, String password) {
		if(employeeId<0)
			return false;
		else
			return employeeDAO.validateEmployee(employeeId, password);
	}

	
	public String getNameById(int employeeId) {
		return employeeDAO.getNameById(employeeId);
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
