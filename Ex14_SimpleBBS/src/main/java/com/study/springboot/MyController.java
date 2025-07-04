package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.dao.ISimpleBbsDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller	// 컴포넌트
public class MyController
{
	
	@Autowired
	ISimpleBbsDao dao;

	@GetMapping("/")		
	public String root() throws Exception
	{
		return "redirect:list";
	}
	
	@GetMapping("/list")	
	public String userlistPage(Model model)	
	{			

		model.addAttribute("list", dao.listDao());
		
		return "list";		 
	}
	
	@GetMapping("/writeForm")
	public String writeForm()
	{
		return "writeForm";		// 입력폼 호출
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest request, Model model)
	{
		// 파라미터가 몇개 안 될때 다 쓰는것이 좋음.
		// 폼의 입력값을 파라미터로 받아 dao의 writeDao 메서드를 
		// 호출해 데이터베이스에 insert를 한다
		dao.writeDao(request.getParameter("writer"), 
				request.getParameter("title"), 
				request.getParameter("content"));
		
		return "redirect:list";
	}
	
	@GetMapping("/view")
	public String view(HttpServletRequest request, Model model)
	{
		String sId = request.getParameter("id");
		// 개별 게시글을 보기 위해 dao의 viewDao메서드를 호출하여 리턴값을
		// model 변수에 담음.
		model.addAttribute("dto", dao.viewDao(sId));
		return "view";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, Model model)
	{
		// 파라미터로 넘어온 값을 이용해 dao의 deleteDao 메서드를 호출해 
		// 데이터베이스에서 게시글을 delete한다.
		dao.deleteDao(request.getParameter("id"));
		return "redirect:list";
	}
}
