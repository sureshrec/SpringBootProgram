package com.suresh;

import org.springframework.beans.factory.annotation.Autowired;

public class UserSer {
	
	@Autowired
	UserDao userDao;
	
	public Object raja()
	{
		userDao.ctUser();
		return raja();
	}
	


}
