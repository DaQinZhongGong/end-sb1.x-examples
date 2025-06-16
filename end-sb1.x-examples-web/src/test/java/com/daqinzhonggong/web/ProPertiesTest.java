package com.daqinzhonggong.web;

import com.daqinzhonggong.util.DaQingZhongGongProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProPertiesTest {


  @Autowired
  private DaQingZhongGongProperties daQingZhongGongProperties;


  @Test
  public void getHello() throws Exception {
    System.out.println(daQingZhongGongProperties.getTitle());
    Assert.assertEquals(daQingZhongGongProperties.getTitle(), "大秦重工");
    Assert.assertEquals(daQingZhongGongProperties.getDescription(), "都是额的");
  }

  @Test
  public void testMap() throws Exception {
    Map<String, Long> orderMinTime = new HashMap<String, Long>();
    long xx = orderMinTime.get("123");
  }

}