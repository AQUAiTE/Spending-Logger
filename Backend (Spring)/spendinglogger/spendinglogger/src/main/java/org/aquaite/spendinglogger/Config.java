package org.aquaite.spendinglogger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Config {

  @Value("${spring.mail.username}")
  String gmail;
}
