package com.abby.controller;

import com.abby.dto.PostmanDTO;
import com.abby.event.Event1;
import com.abby.event.Event2;
import com.abby.publisher.MyPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @Autowired
    MyPublisher myPublisher;

    @PostMapping("/notify/event")
    public void publishEvent(@RequestBody PostmanDTO postmanDTO){
        postmanDTO.setDate(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        myPublisher
                .publishEvent1
                    (new Event1("使用者：" + postmanDTO.getUser() + " 時間：" + postmanDTO.getDate().format(formatter)));

        myPublisher
                .publishEvent2
                        (new Event2("訊息：" + postmanDTO.getMsg() + " 時間：" + postmanDTO.getDate().format(formatter)));
    }
}
