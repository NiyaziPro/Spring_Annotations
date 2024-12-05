package com.spring.repository;

import com.spring.domain.Message;

public interface Repository {
    void saveMessage(Message message);
}
