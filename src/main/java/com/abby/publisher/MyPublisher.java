package com.abby.publisher;

import com.abby.event.Event1;
import com.abby.event.Event2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyPublisher {

    private final ApplicationEventPublisher eventPublisher;

    MyPublisher(ApplicationEventPublisher publisher) {
        this.eventPublisher = publisher;
    }

    public void publishEvent1(Event1 event1) {
        eventPublisher.publishEvent(event1);
    }

    public void publishEvent2(Event2 event2) {
        eventPublisher.publishEvent(event2);
    }
}
