package org.boot.web;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class MyListener2 implements ApplicationListener<ApplicationReadyEvent>{

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("准备好了");
		System.out.println(event.getSource().toString());
		System.out.println(event.getTimestamp());
	}

}
