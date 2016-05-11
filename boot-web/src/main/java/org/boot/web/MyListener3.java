package org.boot.web;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListener3 implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		if(event instanceof ApplicationStartedEvent){
			System.out.println("started");
		}else if (event instanceof ApplicationReadyEvent) {
			System.out.println("ready");
		}else if(event instanceof ApplicationFailedEvent){
			System.out.println("failed");
		}
	}

}
