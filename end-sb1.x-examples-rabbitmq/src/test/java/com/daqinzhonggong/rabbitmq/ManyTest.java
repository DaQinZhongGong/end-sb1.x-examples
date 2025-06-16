package com.daqinzhonggong.rabbitmq;

import com.daqinzhonggong.rabbit.many.ManySender;
import com.daqinzhonggong.rabbit.many.ManySender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {

  @Autowired
  private ManySender manySender;

  @Autowired
  private ManySender2 manySender2;

  @Test
  public void oneToMany() throws Exception {
    for (int i = 0; i < 100; i++) {
      manySender.send(i);
    }
  }

  @Test
  public void manyToMany() throws Exception {
    for (int i = 0; i < 100; i++) {
      manySender.send(i);
      manySender2.send(i);
    }
  }

}