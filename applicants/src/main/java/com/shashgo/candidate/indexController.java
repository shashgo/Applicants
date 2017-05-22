package com.shashgo.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shashgo.candidate.Dao.infoDao;
import com.shashgo.candidate.Entity.Info;

@Controller
public class indexController {
	
	@Autowired	//Creates the bean of the object as a property of this class
	infoDao idao;
	
	Info info;
	
	@RequestMapping("/")
//	Can use a return type of String instead of a ModelandView object as this is a static page and has no dynamically generated values
//	public modelandView home(){
	public String home(){
		return("index.jsp");
//		return new ModelandView("index.jsp");
	}
	
	@RequestMapping("/apply.htm")
	public String apply(){
		return("apply.jsp");
	}
	
	@RequestMapping("/addInfo")
//	public String addFeedback(@RequestParam("name") String name, @RequestParam("email") String email,@RequestParam("phone") String phone,@RequestParam("experience") int experience, @RequestParam("code") String code,@RequestParam("rating") int rating){
	public ModelAndView addInfo(@ModelAttribute ("input") Info info){
//		info=new Info(name, email, message, phone, experience, code, rating);
		
		idao.addInfo(info);
		
		
		return new ModelAndView("welcome.jsp");

	}
}
