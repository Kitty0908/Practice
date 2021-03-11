package com.wds.listener;

import com.wds.event.TestEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener2 implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        testEvent.printMessage("TestListener2 已监听");
    }
}
