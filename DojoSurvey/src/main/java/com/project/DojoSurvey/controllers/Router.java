package com.project.DojoSurvey.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/*") // Wildcard all routes.
public class Router{
	public Router(){

	}

	@RequestMapping("index")
	public String index(){
		return "index";
	}

	@RequestMapping("/info")
	public String info(
		@RequestParam(value = "name") String name,
		@RequestParam(value = "location") String location,
		@RequestParam(value = "language") String language,
		@RequestParam(value = "comment")  String comment,
		HttpSession session){
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comment", comment);
			return "redirect:/result";
		}


	@RequestMapping("result")
	public String result(){
		return "result";
	}


	@RequestMapping("")
	public String redirect(HttpServletRequest req){		
		String url = req.getRequestURI().toString();
		return "redirect:/index";
	}		
}
