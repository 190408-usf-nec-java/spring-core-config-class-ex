package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.revature.beans.Dish;
import com.revature.beans.Food;

@Configuration
public class ConfigBeanExample {

	@Bean(name = "rice")
	@Primary
	public Food getFood(Dish dish) {
		return new Food("Dirty Rice", 7, 1, dish);
	}
	
	@Bean(name="spaghetti")
	public Food getSpaghetti(Dish dish) {
		return new Food("Spaghetti", 12, 0, dish);
	}
	
	@Bean(name="soup")
	public Food getSoup() {
		return new Food("Chicken Noodle Soup", 1, 0, getBowl());
	}

	@Bean(name="plate")
	@Primary
	public Dish getPlate() {
		return new Dish("plate");
	}
	
	@Bean(name="bowl")
	public Dish getBowl() {
		return new Dish("bowl");
	}
}
