package com.spring.service;

import com.spring.domain.Message;
import com.spring.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static com.spring.utils.Color.*;

@Component("insta_service")
//@Scope("singleton")
public class InstaService implements MessageService {

    @PostConstruct
    public void postConstruct() {
        System.out.println(YELLOW + "====> Insta Service Object created !" + RESET);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(RED + "====> Insta Service Object destroyed !" + RESET);
    }

    //field injection
    @Autowired
    @Qualifier("fileRepo")
    Repository repo;

    @Override
    public void sendMessage(Message message) {
        System.out.println(PURPLE + "Your message is being sent via Insta..." + message + RESET);
    }

    @Override
    public void saveMessage(Message message) {
        repo.saveMessage(message);
    }
}
