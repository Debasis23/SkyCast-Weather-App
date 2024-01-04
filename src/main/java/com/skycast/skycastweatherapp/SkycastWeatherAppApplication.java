package com.skycast.skycastweatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SkycastWeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkycastWeatherAppApplication.class, args);
	}

}
