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


@Component("slack_service")
@Scope("prototype")
public class SlackService implements MessageService {

    @PostConstruct
    public void postConstruct() {
        System.out.println(YELLOW + "====> Slack Service Object created !" + RESET);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(RED + "====> Slack Service Object deleted !" + RESET);
    }

    private Repository repository;

    // constructor injection
    @Autowired
    public SlackService(@Qualifier("fileRepo") Repository repository) {
        this.repository = repository;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println(RED + "Your message is being sent via Slack..." + message + RESET);
    }

    @Override
    public void saveMessage(Message message) {
        repository.saveMessage(message);
    }
}
