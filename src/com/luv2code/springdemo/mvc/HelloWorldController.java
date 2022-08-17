package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//Need a controller method to show html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Need a controller method to process html form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controllesr method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//Read the request parameter from html form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Programmer Name :"+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processForm(@RequestParam("studentName")String theName,
			Model model) {
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Hello My Friend from version three :"+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
