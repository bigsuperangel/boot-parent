package org.boot.web;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
@ConfigurationProperties(prefix="my")
public class Config {
	private List<String> servers = Lists.newArrayList();
	
	public List<String> getServers(){
		return this.servers;
	}

	public void setServers(List<String> servers) {
		this.servers = servers;
	}
	
	
}
