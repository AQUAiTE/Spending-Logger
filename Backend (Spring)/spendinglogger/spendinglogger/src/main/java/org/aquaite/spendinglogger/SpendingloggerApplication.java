package org.aquaite.spendinglogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpendingloggerApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory("src/main/resources").load();
		SpringApplication.run(SpendingloggerApplication.class, args);
	}

}
