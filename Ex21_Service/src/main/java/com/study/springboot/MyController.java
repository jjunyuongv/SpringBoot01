package com.study.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.service.ISimpleBbsService;

import jakarta.servlet.http.HttpServletRequest;

@Controller	
public class MyController
{
//	@Autowired
//	ISimpleBbsDao dao;
	@Autowired
	ISimpleBbsService bbs;	// 서비스를 사용.

	@GetMapping("/")		
	public String root() throws Exception
	{
		return "redirect:list";	 // /list로 보냄
	}
	
	// 게시물 목록
	@GetMapping("/list")	
	public String userlistPage(Model model)	
	{			
//		model.addAttribute("list", dao.listDao());
		model.addAttribute("list", bbs.list());		// bbs(서비스)로 변경됨
		
//		int nTotalCount = dao.articaleCount();
		int nTotalCount = bbs.count();
		System.out.println("Count : " + nTotalCount);
		
		return "list";		 
	}
	
	// 게시물 내용 보기
	@GetMapping("/writeForm")
	public String writeForm()
	{
		return "writeForm";			// 입력폼을 가진 JSP 파일을 호출
	}
	
	// 게시물 등록
	@PostMapping("/write")
	public String write(HttpServletRequest request, Model model)
	{		
		String sName = request.getParameter("writer");
		String sTitle = request.getParameter("title");
		String sContent = request.getParameter("content");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("item1", sName);
		map.put("item2", sTitle);
		map.put("item3", sContent);
		
//		int nResult = dao.writeDao(map);
		int nResult = bbs.write(map);
		System.out.println("Write : " + nResult);
		
		return "redirect:list";
	}
	
	// 게시물 내용 보기
	@GetMapping("/view")
	public String view(HttpServletRequest request, Model model)
	{
		String sId = request.getParameter("id");
//		model.addAttribute("dto", dao.viewDao(sId));
		model.addAttribute("dto", bbs.view(sId));
		return "view";
	}
	
	// 게시물 삭제
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, Model model)
	{
		String sID = request.getParameter("id");
		
//		int nResult = dao.deleteDao(sID);
		int nResult = bbs.delete(sID);
		System.out.println("Delete : " + nResult);
		
		return "redirect:list";
	}
}
