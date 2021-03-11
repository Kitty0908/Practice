package com.wds.event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    public TestEvent(Object source) {
        super(source);
    }

    public void printMessage(String msg){
        System.out.println("TestEvent事件已启动,触发监听器:" + msg);
    }
}
