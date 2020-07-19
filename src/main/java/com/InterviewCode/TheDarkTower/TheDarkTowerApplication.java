package com.InterviewCode.TheDarkTower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.InterviewCode.TheDarkTower")
@EntityScan("com.InterviewCode.TheDarkTower")
@SpringBootApplication
public class TheDarkTowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheDarkTowerApplication.class, args);
	}

}
