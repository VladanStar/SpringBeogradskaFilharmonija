package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		//Instrument instrument = (Instrument) context.getBean("instrument");
		Muzicar muzicar1 = (Muzicar) context.getBean("muzicar1");
		System.out.println(muzicar1.toString());
		
		Muzicar muzicar2 = (Muzicar) context.getBean("muzicar2");
		System.out.println(muzicar2.toString());
		
		Muzicar muzicar3 = (Muzicar) context.getBean("muzicar3");
		System.out.println(muzicar3.toString());
		
		Orkestar orkestar = (Orkestar)context.getBean("orkestar");
		System.out.println(orkestar.toString());
		
		((FileSystemXmlApplicationContext)context).close();

	}

}
