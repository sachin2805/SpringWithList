package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("spring.xml");
			Actor a=(Actor) c.getBean("act");
			a.display();
	
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}

}
}

/*OUTPUT :
Actor Name : PoojaHegde
Age : 23
Address : Keral
Movies : 
Mohenjedado
DJ
VaikantamPuram
*/