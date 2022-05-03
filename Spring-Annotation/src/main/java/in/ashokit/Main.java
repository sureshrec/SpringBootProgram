package in.ashokit;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		UserService userService = c.getBean(UserService.class);
		userService.ctUser();
	}
	
}
