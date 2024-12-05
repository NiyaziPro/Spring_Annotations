package com.spring.repository;

import com.spring.domain.Message;
import org.springframework.stereotype.Component;

import static com.spring.utils.Color.*;

@Component("fileRepo")
public class FileRepo implements Repository{
    @Override
    public void saveMessage(Message message) {
        System.out.println(CYAN + "Message saved in File repository" + RESET);
    }
}
