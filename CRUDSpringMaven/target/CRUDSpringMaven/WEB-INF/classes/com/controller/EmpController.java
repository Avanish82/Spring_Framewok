package com.controller;

import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController 
{
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(value="/employee", mothed=RequstMethod.POST)
	public ModelAndView saveEmploye@ModelAttribute("employee")Employee employee)
	{
		try{
			if(empDao.getEmployeeById(employee.getId()!=null);
			employeeDao.updateEmployee(employee);
		}
		catch(EmptyResultDataAccessException e)
		{
			System.out.println("inside catch");
			empDao.saveEmployee(emaployee);
		}
		return new ModelAndView("redirect/success");
	}
	
 
}
