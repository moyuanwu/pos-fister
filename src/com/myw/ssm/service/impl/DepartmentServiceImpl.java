package com.myw.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myw.ssm.beans.Department;
import com.myw.ssm.mapper.DepartmentMapper;
import com.myw.ssm.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> getAllDepartment() {
		List<Department> departments = departmentMapper.getAllDepartment();
		return departments;
	}

}
