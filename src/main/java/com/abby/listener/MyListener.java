package com.abby.listener;

import com.abby.event.Event1;
import com.abby.event.Event2;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @Async
    @EventListener
    void sendMsgEvent(Event1 event1) {
        System.out.println("==EmailListener 1 (接收Event1)==="+ event1.getMessage());
    }

    @Async
    @EventListener
    void sendMsgEvent(Event2 event2) {
        System.out.println("==EmailListener 2 (接收Event2)===" + event2.getMessage());
    }

}
