package com.spring.controller;

import com.spring.AppConfiguration;
import com.spring.domain.Message;
import com.spring.service.InstaService;
import com.spring.service.MessageService;
import com.spring.service.PrintService;
import com.spring.service.SlackService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class MessageApplicationSpring {
    public static void main(String[] args) {
        Message message = new Message();
        message.setBody("Hello, I'm Spring :)");

        // Reads the configuration class and scans components and beans with componentscan
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageService service = context.getBean("insta_service",MessageService.class);
        service.sendMessage(message);
        service.saveMessage(message);


        Random random = context.getBean(Random.class);
        System.out.println(random.nextInt(100));

        SlackService service1 = context.getBean(SlackService.class);
        SlackService service2 = context.getBean(SlackService.class);
        SlackService service3 = context.getBean(SlackService.class);

        InstaService service4 = context.getBean(InstaService.class);
        InstaService service5 = context.getBean(InstaService.class);
        InstaService service6 = context.getBean(InstaService.class);

        if (service1==service2){
            System.out.println("two objects are the same");
        }else {
            System.out.println("two objects are different");
        }

        PrintService printService = context.getBean(PrintService.class);
        printService.printContact();

        printService.getContact();



        context.close();







    }
}
