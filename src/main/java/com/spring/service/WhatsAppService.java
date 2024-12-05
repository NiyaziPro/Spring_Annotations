package com.spring.service;

import com.spring.domain.Message;
import com.spring.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.spring.utils.Color.*;

@Component("whatsapp_service")
public class WhatsAppService implements MessageService {
    @Autowired
    @Qualifier("fileRepo")
    private Repository repository;

    @Override
    public void sendMessage(Message message) {
        System.out.println(GREEN + "Your message is being sent via WhatsApp..." + message + RESET);
    }

    @Override
    public void saveMessage(Message message) {

        repository.saveMessage(message);
    }

}
