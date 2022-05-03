package com.suresh;

import org.springframework.beans.factory.annotation.Autowired;

import com.suresh.controller.WelcomeController;

public class UserDao {
	@Autowired
	WelcomeController welcomeController;
	
	public void ctUser()
	{
		welcomeController.ct();
	}

}
