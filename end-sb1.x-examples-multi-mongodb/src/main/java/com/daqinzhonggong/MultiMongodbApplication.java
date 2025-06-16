package com.daqinzhonggong;

import com.daqinzhonggong.config.props.MultipleMongoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(MultipleMongoProperties.class)
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class MultiMongodbApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiMongodbApplication.class, args);
  }
}
