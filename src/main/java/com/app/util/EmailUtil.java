package com.app.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class EmailUtil {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendTo(String to,String subject,String text, String[] cc,String[] bcc,MultipartFile file) {
		
		boolean flag=false;
		
		try {
			
		MimeMessage message=mailSender.createMimeMessage();
		
		MimeMessageHelper helper= new MimeMessageHelper(message, file!=null?true:false);
		
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(text);
		helper.setCc(cc);
		helper.setFrom("sathish69314@gmail.com");
		if(file!=null)
					helper.addAttachment(file.getOriginalFilename(), file);
		
		mailSender.send(message);
		flag=true;
		}catch(Exception e)
		{ 
			flag=false;
		}
         return flag;
}
}