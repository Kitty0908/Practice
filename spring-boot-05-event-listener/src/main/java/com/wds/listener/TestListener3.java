package com.wds.listener;

import com.wds.event.TestEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener3 {

    @EventListener
    public void onEventStarted(TestEvent testEvent){
        testEvent.printMessage("TestListener3 已触发");
    }
}
