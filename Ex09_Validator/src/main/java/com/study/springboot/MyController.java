package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController
{
	@GetMapping("/")		
	public @ResponseBody String root() throws Exception
	{
		return "Validator (1)";
	}
	
	 // 글쓰기 폼에 대한 매핑
	@GetMapping("/insertForm")	
	public String insert1()	
	{
		// 단순히 JSP 페이지를 리턴
		return "createPage";		 
	}
	
	// Validator 인터페이스를 통한 폼값 유효성 검증
	@GetMapping("/create")		// create 가 호출되면
	// 커맨드 객체 파라미터로 폼 데이터를 받아서 처리
	public String insert2(@ModelAttribute("dto") ContentDto contentDto, BindingResult result)	
	{	/*
			해당 메서드의 첫번째 매개변수는 폼값을 한꺼번에 받을수 있는
			커멘드객체를 정의한다. 폼값을 받은 후 View로 전달할 때는 
			@ModelAttribute을 통해 객체명을 dto로 변경한다.
			두번째 매개변수 BindingResult 객체는 폼값검증의 결과를
			확인하기위해 정의한다.
		*/
		
		// 폼값 검증이 완료된 후 포워드할 View의 경로를 설정한다. 
		String page = "createDonePage";
		System.out.println(contentDto);
		
		// 유효성 검증 객체를 만들고 파라미터로 받은 커맨드 객체의 값을 아래에서 검증
		ContentValidator validator = new ContentValidator();
		// 폼값 검증을 위해 메서드를 호출한다.
		validator.validate(contentDto, result);	// 검증
		// 폼값 검증에 실패했는지 확인한다.
		if (result.hasErrors())
		{
			// 실패한 경우 재입력을 받기위해 쓰기페이지 경로를 설정한다.
			page = "createPage";	// 에러가 있으면 이페이지로... 
		}
		// 에러가 없다면...
		return page;		 
	}
}
