package org.boot.dao;

import org.boot.pojo.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Hello world!
 *
 */
@Repository
public class AppDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public App getByUserid(long userId){
    	return jdbcTemplate.queryForObject("select * from app where userId = ?", new Object[]{userId},  
    			(rs, rowNum) -> new App(rs.getLong("userId"), rs.getString("name"))
    	);
    }
    
    public int insertApp(App app){
    	return jdbcTemplate.update("insert into app(name) values(?)", app.getName());
    }
}
