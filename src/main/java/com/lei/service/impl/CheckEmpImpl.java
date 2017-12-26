package com.lei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lei.bean.Employee;
import com.lei.dao.EmployeeMapper;
import com.lei.service.CheckEmp;
@Service
public class CheckEmpImpl implements CheckEmp {
	@Autowired
	EmployeeMapper employeeMapper;

	public Employee getEmpById(Integer id) {

		return employeeMapper.selectByPrimaryKey(id);
	}

}
