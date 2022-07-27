package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.model.User;


@Controller
public class UserController {


	@RequestMapping("/user")
	public String showForm()
	{
		String str = null;
		System.out.println(str.length());
		return "user";
	}
	
	@RequestMapping(path="/userform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, BindingResult result)
	{	
		if(result.hasErrors())
		{
			return "user";
		}
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/user/{id}/{userName}")
	public String getUserDetail(@PathVariable("id") long id,@PathVariable("userName") String userName)
	{
		System.out.println("user id is " + id);
		Integer.parseInt(userName);
		return "home";
	} 
	// handling exception in spring mvc
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNullPointerFormat(Model model)
//	{
//		System.out.println("null pointer exception");
//		model.addAttribute("message","null pointer exception has occured");
//		return "error";
//	}
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model model)
//	{
//		System.out.println("number format exception");
//		model.addAttribute("message", "number format exception has occured");
//		return "error";
//	}
	
//	@ExceptionHandler({NumberFormatException.class, NullPointerException.class})
//	public String exceptionHandler()
//	{
//		System.out.println("exception occurs");
//		return "error";
//	}
}
