package com.wds.listener;


import com.wds.event.TestEvent;
import org.springframework.context.ApplicationListener;

public class TestListener1 implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        testEvent.printMessage("TestListener1 已触发");
    }
}
