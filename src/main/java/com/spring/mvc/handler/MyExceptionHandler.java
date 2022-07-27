package com.spring.mvc.handler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


// centralize exception handler class for handling all exceptions in project
@ControllerAdvice
public class MyExceptionHandler 
{
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNullPointerFormat(Model model)
	{
		System.out.println("null pointer exception");
		model.addAttribute("message","null pointer exception has occured");
		return "error";
	}

	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model model)	{
		System.out.println("number format exception");
		model.addAttribute("message", "number format exception has occured");
		return "error";
	}
	
	

}
