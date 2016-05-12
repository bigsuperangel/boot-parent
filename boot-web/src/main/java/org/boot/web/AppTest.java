package org.boot.web;

import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.boot.pojo.App;
import org.boot.service.AppService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.google.common.collect.Lists;
import com.google.gson.Gson;

@SpringBootApplication
public class AppTest {
	
	@Bean
	JdbcTemplate jdbcTemplate(DataSource dataSource){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppTest.class, args);
		
		AppService appService = ctx.getBean(AppService.class);
		
//		List<App> apps = Lists.newArrayList();
//		for (int i = 0; i < 3; i++) {
//			App app = new App(new Random().nextInt()+ "");
//			apps.add(app);
//		}
//		for (App app2 : apps) {
//			int count = appService.insertApp(app2);
//			System.out.println(count);
//		}
		
		App app = appService.getByUserid(1L);
		System.out.println(new Gson().toJson(app));
	}
}
