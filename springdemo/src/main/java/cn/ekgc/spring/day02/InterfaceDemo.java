package cn.ekgc.spring.day02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ekgc.spring.day02.service.UserService;

public class InterfaceDemo {
	public static void main(String[] args) {
		// 加载Spring配置文件获得ApplicationContext对象
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day02/ioc1.xml");
		
		// 获得UserService的对象
		UserService userService = (UserService) context.getBean("userService");
		userService.saveUser();
	}
}
