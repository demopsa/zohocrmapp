package com.zohocrm.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
	private JavaMailSender javaMailSender;


	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage mailMessage =new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(msg);
		javaMailSender.send(mailMessage);
	}

}
