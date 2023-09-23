package com.neebal.collegemgmt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Async
    public void sendEmail(String email,String text){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setFrom("akshaysagrawal99@gmail.com");
        message.setSubject("Book Issued successfully");
        message.setText(text);
        //uncomment when SMTP server settings is sorted out
        //mailSender.send(message);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Email sent to "+email);
    }
}
