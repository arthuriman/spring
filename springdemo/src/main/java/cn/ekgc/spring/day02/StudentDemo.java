package cn.ekgc.spring.day02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day02/ioc1.xml");
		Student student = (Student) context.getBean("student");
		student.show();
	}
}
