package com.tobias.saul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tobias.saul.bean.Car;
import com.tobias.saul.bean.Engine;

@Configuration
public class AppConfig {
	
	@Bean
	public Car car() {
		Car car = new Car();
		car.setModel("Ford");
		car.setEngine(engine());
		return car;
	}
	
	@Bean
	public Engine engine() {
		Engine engine = new Engine();
		engine.setEngineSize("V8");
		return engine;
	}
	
}
