package com.spring.service;

import com.spring.domain.Message;

public interface MessageService {

    void sendMessage(Message message);
    void saveMessage(Message message);
}
