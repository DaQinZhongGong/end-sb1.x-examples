package com.daqinzhonggong.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.daqinzhonggong.model.repository.secondary",
    mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {

  protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
