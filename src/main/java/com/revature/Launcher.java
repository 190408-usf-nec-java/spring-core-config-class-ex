package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.Food;
import com.revature.config.ConfigBeanExample;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigBeanExample.class);
		
		Food food = context.getBean(Food.class);
		System.out.println(food);
		
		Food spaghetti = context.getBean("spaghetti", Food.class);
		System.out.println(spaghetti);
		
		Food soup = context.getBean("soup", Food.class);
		System.out.println(soup);
	}
}
