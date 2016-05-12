package org.boot.web;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
@ConfigurationProperties(prefix="my")
public class Config {
	
	@NotNull
	private String name;
	
	@NotBlank
	private String pwd;
	
	private List<String> servers = Lists.newArrayList();
	
	public List<String> getServers(){
		return this.servers;
	}

	public void setServers(List<String> servers) {
		this.servers = servers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
