package com.daqinzhonggong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class JpaThymeleafCrudApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(JpaThymeleafCrudApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(JpaThymeleafCrudApplication.class, args);
  }

}

