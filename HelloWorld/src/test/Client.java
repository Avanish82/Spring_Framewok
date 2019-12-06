package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client 
{
	public static void main(String ak[])
	{
		//find xml file
		Resource r=new ClassPathResource("resource/spring.xml");
	    
		//load xml into controller
	    BeanFactory factory=new XmlBeanFactory(r);
	    
	    //Create Test class object
	    Object o1=factory.getBean("t");
	    Object o2=factory.getBean("t");
	    Object o3=factory.getBean("t");
	    
	    System.out.println(o1==o2);
	    System.out.println(o2==o3);
	    
	    //Test t=(Test)o;
	    //t.hello();
	    
	    
	}

}
