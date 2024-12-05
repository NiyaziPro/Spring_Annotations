package com.spring.controller;

import com.spring.domain.Message;
import com.spring.repository.FileRepo;
import com.spring.service.*;


public class MessageApplication {
    public static void main(String[] args) {
/*
        Message message = new Message();
        message.setBody("Hello, I'm Spring :)");

        MailService mailService = new MailService(new FileRepo());
        mailService.sendMessage(message);
*//*
        WhatsAppService whatsApp = new WhatsAppService();
        whatsApp.sendMessage(message);

        SmsService smsService = new SmsService();
        smsService.sendMessage(message);

        MessageService service = new WhatsAppService();
        service.sendMessage(message);
        service.saveMessage(message);*/

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /*MessageService messageService = new WhatsAppService(new FileRepo());
        messageService.sendMessage(message);
        messageService.saveMessage(message);
*/
    }
}
