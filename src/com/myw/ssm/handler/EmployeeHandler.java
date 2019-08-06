package com.myw.ssm.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myw.ssm.beans.Department;
import com.myw.ssm.beans.Employee;
import com.myw.ssm.service.DepartmentService;
import com.myw.ssm.service.EmployeeService;

@Controller
public class EmployeeHandler {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/emps")
	public String getAllEmployee(Map<String ,Object> map) {
		List<Employee> list = employeeService.getAllEmployee();
		map.put("list", list);
		return "list";
	}
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String getAllDepartment(Map<String,Object> map) {
		List<Department> depts = departmentService.getAllDepartment();
		map.put("depts", depts);
		return "input";
	}
}
