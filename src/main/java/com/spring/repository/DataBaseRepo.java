package com.spring.repository;

import com.spring.domain.Message;
import org.springframework.stereotype.Component;

import static com.spring.utils.Color.*;

@Component("dataBaseRepo")
public class DataBaseRepo implements Repository {
    @Override
    public void saveMessage(Message message) {
        System.out.println(PURPLE + "Message saved in Database" + RESET);
    }
}
