package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class PrintService {
    @Value("${email}")
    private String email = "nik@tester.com";

    @Value("${phone}")
    private String phone = "123456789";

    public void printContact() {
        System.out.println("Email : " + this.email);
        System.out.println("Phone : " + this.phone);

    }
    @Autowired
    private Properties properties;
    public void getContact(){
        System.out.println("Email : " + properties.getProperty("mymail"));
        System.out.println("Phone : " + properties.getProperty("myphone"));
    }
}
