package com.wipro.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbAssignment1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext apctx = SpringApplication.run(SbAssignment1Application.class, args);
		String[] beanNames = apctx.getBeanDefinitionNames();
		
		int x=0;
		for (String beanName: beanNames) {
			System.out.println("Bean" + (++x)+": " +beanName);
		}
	}

}
