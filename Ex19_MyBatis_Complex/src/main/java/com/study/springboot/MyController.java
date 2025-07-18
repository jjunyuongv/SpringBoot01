package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.IDao;

@Controller	
public class MyController
{
	@Autowired
	private IDao userDao;

	@GetMapping("/")		
	public @ResponseBody String root() throws Exception
	{
		return "MyBatis : 복잡한(join) 쿼리 결과 출력하기";	 // /list로 보냄
	}
	
	@RequestMapping("/employee")	
	public String userlistPage(Model model)	
	{			
		model.addAttribute("employees", userDao.getEmployee());
		
		return "employeelist";		 
	}
}
