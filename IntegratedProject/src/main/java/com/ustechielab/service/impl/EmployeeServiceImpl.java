package com.ustechielab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ustechielab.dao.EmployeeDAO;
import com.ustechielab.entity.Employee;
import com.ustechielab.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public long createEmployee(Employee employee) {
		return employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeDAO.deleteEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployee(long id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees(String employeeName) {
		return employeeDAO.getAllEmployees(employeeName);
	}
}
