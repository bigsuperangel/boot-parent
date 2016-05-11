package org.boot.web;

import org.boot.pojo.App;
import org.boot.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class AppController {
	@Autowired
	private AppService appService;
	
	@Autowired
	private Config config;
	
	@RequestMapping("/query")
	public App query(Long userId){
		System.out.println(new Gson().toJson(config.getServers()));
		return appService.getByUserid(1L);
	}
}
