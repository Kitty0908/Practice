package com.wds.controller;

import com.wds.event.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ApplicationEventPublisher publisher;

    @GetMapping("/event")
    public String event(){
        publisher.publishEvent(new TestEvent(this));
        return "Success";
    }
}
