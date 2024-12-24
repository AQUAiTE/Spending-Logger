package org.aquaite.spendinglogger;

import me.paulschwarz.springdotenv.DotenvPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpendingloggerApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext();
    DotenvPropertySource.addToEnvironment(applicationContext.getEnvironment());

    applicationContext.register(Config.class);
    applicationContext.refresh();

    Config config = applicationContext.getBean(Config.class);

    SpringApplication.run(SpendingloggerApplication.class, args);

    System.out.println("Hello World, " + config.gmail);
  }
}
