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
	@Autowired
	ISimpleBbsService bbs;

	@GetMapping("/")		
	public String root() throws Exception
	{
		return "redirect:list";	 // /list로 보냄
	}
	
	// 게시물 목록
	@GetMapping("/list")	
	public String userlistPage(Model model)	
	{			
		model.addAttribute("list", bbs.list());
		
		// nTotalCount => 카운터 한 값을 받음.
		// 게시판의 리스트를 페이징 처리할 때는 이 값을 사용해야 한다.
		int nTotalCount = bbs.count();
		System.out.println("Count : " + nTotalCount);
		
		return "list";		 
	}
	
	@GetMapping("/writeForm")
	public String writeForm()
	{
		return "writeForm";			// 입력폼을 가진 JSP 파일을 호출
	}
	
	// 게시물 등록
	@PostMapping("/write")
	public String write(HttpServletRequest request, Model model)
	{
//		dao.writeDao(request.getParameter("writer"), 
//				request.getParameter("title"), 
//				request.getParameter("content"));
		
		String sName = request.getParameter("writer");
		String sTitle = request.getParameter("title");
		String sContent = request.getParameter("content");
		
		// HashMap은 이름이 여러개인 값를 넣을 때. Map에 파라미터를 저장한다.
		Map<String, String> map = new HashMap<String, String>();
		map.put("item1", sName);
		map.put("item2", sTitle);
		map.put("item3", sContent);
		
		// 인서트가 성공했다면 1이 리턴되고, 실패했다면 0이 리턴될 것이다
		int nResult = bbs.write(map);
		System.out.println("Write : " + nResult);
		
		return "redirect:list";
	}
	
	// 게시물 내용 보기
	@GetMapping("/view")
	public String view(HttpServletRequest request, Model model)
	{
		String sId = request.getParameter("id");
		model.addAttribute("dto", bbs.view(sId));
		return "view";
	}
	
	// 게시물 삭제
	@GetMapping("/delete")
	public String delete(HttpServletRequest request, Model model)
	{
//		dao.deleteDao(request.getParameter("id"));
		String sID = request.getParameter("id");
		
		int nResult = bbs.delete(sID);
		System.out.println("Delete : " + nResult);
		
		return "redirect:list";
	}
}
