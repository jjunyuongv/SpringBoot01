package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;

@Controller
public class MyController
{
	@GetMapping("/")		
	public @ResponseBody String root() throws Exception
	{
		return "Valid Annotation (4)";
	}
	
	@GetMapping("/insertForm")	
	public String insert1()	
	{
		return "createPage";		 
	}
	
	/*
		폼값이 전송되면 ContentDto객체를 통해 한꺼번에 받는다.
		해당 객체에는 폼값 검증을 위한 어노테이션이 추가되어 있으므로
		해당 객체를 통해 검증을 하겠다는 의미로 @Validated어노테이션을 
		추가해야 한다.
	*/
	@GetMapping("/create")		// create 가 호출되면
	 // 의존성 추가 @Valid 어노테이션 추가
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, BindingResult result)	
	{			
		String page = "createDonePage";
		System.out.println(contentDto);
		
//		ContentValidator validator = new ContentValidator();	// 강한 결합
//		validator.validate(contentDto, result);	// 검증

		if (result.hasErrors())
		{
			System.out.println("getAllErrors : " + result.getAllErrors());
			
			// 제목 검증에 실패한 경우 디폴트 에러코드를 출력한다.
			if (result.getFieldError("writer") != null)
			{
//				System.out.println("1:"+result.getFieldError("writer").getCode());
				System.out.println("1:"+result.getFieldError("writer").getDefaultMessage());
			}
			if (result.getFieldError("content") != null)
			{
//				System.out.println("2:"+result.getFieldError("content").getCode());
				System.out.println("2:"+result.getFieldError("content").getDefaultMessage());
			}
			page = "createPage";	// 에러가 있으면 이페이지로... 
		}
		// 에러가 없다면...
		return page;		 
	}
	
//	@InitBinder	// ContentValidator 대체
//	protected void initBinder(WebDataBinder binder)
//	{
//		binder.setValidator(new ContentValidator());
//	}
}
