package com.app.model;

import lombok.Data;

@Data
public class Email {
	
	private String to;
	private String subject;
	private String[] cc;
	private String[] bcc;
	private String text;
	private String file;
	

}
