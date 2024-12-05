package com.spring.service;

import com.spring.domain.Message;
import com.spring.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.spring.utils.Color.*;

@Component("mail_service")
public class MailService implements MessageService{
    //setter injection
    @Autowired
    @Qualifier("dataBaseRepo")
    private Repository repository;

    public void setRepository(Repository repository) {
        this.repository = repository;
    }


    @Override
    public void sendMessage(Message message) {
        System.out.println(BLUE + "Your message is being sent via E-mail..." + message + RESET);
    }

    @Override
    public void saveMessage(Message message) {
        repository.saveMessage(message);
    }
}
