package cn.ekgc.spring.day02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDemo {
	public static void main(String[] args) {
		// 加载Spring配置文件获得ApplicationContext对象
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day02/ioc1.xml");
		
		User user = (User) context.getBean("user");
		user.show();
	}
}
