package com.lei.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lei.bean.Employee;
import com.lei.service.CheckEmp;

@Controller
public class CheckEmpController {

	@Autowired
	 CheckEmp  checkEmp; 
		 

	@RequestMapping("checkemp")
	public String  getEmp(HttpServletRequest request,Model model) {
		 
		Employee employee = checkEmp.getEmpById(3);
		model.addAttribute("emp", employee);
		return "index";

	}

}
