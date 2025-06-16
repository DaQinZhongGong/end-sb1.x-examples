package com.daqinzhonggong.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

  @Autowired
  private AmqpTemplate rabbitTemplate;

  public void send() {
    String context = "hi, fanout msg ";
    this.rabbitTemplate.convertAndSend("fanoutExchange", "", context);
  }

}