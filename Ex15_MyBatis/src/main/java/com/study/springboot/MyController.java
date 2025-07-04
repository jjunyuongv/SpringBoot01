package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.IMyUserDao;

@Controller	// 컴포넌트
public class MyController
{
	// MyBatis 사용을 위한 자동 주입
	@Autowired
	private IMyUserDao userDao;

	@GetMapping("/")		
	public @ResponseBody String root() throws Exception
	{
		return "MyBatis 사용하기";
	}
	
	@GetMapping("/user")	
	public String userlistPage(Model model)	
	{			
		// DAO(Mapper)의 getUser()메서드를 호출해서 게시물 목록을 인출
		model.addAttribute("users", userDao.getUser());
		
		return "userlist";		 
	}
}
