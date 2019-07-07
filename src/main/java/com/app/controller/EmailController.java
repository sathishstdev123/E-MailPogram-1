package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Email;
import com.app.util.EmailUtil;

@Controller
public class EmailController {
	
	@Autowired
	private EmailUtil util;
	
	@RequestMapping("/new")
	public String see(Model map) {
		map.addAttribute("email", new Email());
		 return "Register";
	}
	@RequestMapping(value="get", method=RequestMethod.POST)
	public String seeData(@ModelAttribute Email email,@RequestParam MultipartFile fob,Model map) {
		
		boolean flag=util.sendTo(email.getTo(),email.getSubject(),email.getText(),
				email.getBcc(),email.getCc(),fob);
		String msg="";
		if(flag) {
			msg="Mail Sent";
		}else {
			msg="Sending Failed";
	}
	map.addAttribute("msg",msg);
		return "Register";
	}

}
