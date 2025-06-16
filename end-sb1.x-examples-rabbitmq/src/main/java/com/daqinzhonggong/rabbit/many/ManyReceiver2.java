package com.daqinzhonggong.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "daqinzhonggong")
public class ManyReceiver2 {

  @RabbitHandler
  public void process(String msg) {
    System.out.println("Receiver 2: " + msg);
  }

}
