package com.myw.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myw.ssm.beans.Employee;
import com.myw.ssm.mapper.EmployeeMapper;
import com.myw.ssm.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> employees = employeeMapper.getAllEmployee();
		return employees;
	}

}
