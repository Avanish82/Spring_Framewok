package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client 
{
	public static void main(String ak[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resource/spring.xml");
		Car c=(Car)ap.getBean("c");
		c.printCarData();
	}

}
