package com.daqinzhonggong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.daqinzhonggong.mapper")
public class MybatisXmlApplication {

  public static void main(String[] args) {
    SpringApplication.run(MybatisXmlApplication.class, args);
  }

}
