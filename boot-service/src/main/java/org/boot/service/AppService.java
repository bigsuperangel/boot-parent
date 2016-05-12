package org.boot.service;

import org.boot.dao.AppDao;
import org.boot.pojo.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService 
{
    @Autowired
	private AppDao appDao;
    
    public App getByUserid(long userId){
    	return appDao.getByUserid(userId);
    }
    
    public int insertApp(App app){
    	return appDao.insertApp(app);
    }
}
