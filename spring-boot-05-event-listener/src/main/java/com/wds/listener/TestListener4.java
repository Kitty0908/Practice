package com.wds.listener;


import com.wds.event.TestEvent;
import org.springframework.context.ApplicationListener;

public class TestListener4 implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        testEvent.printMessage("TestListener4 已被触发");
    }
}
