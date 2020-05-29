package com.tobias.saul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tobias.saul.bean.Car;
import com.tobias.saul.bean.Engine;
import com.tobias.saul.config.AppConfig;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = context.getBean(Car.class);
		Engine engine = context.getBean(Engine.class);
		
		System.out.println(car);
		System.out.println(engine);
	}

}
