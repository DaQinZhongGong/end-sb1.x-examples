package com.daqinzhonggong.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DaQingZhongGongProperties {

  @Value("${com.daqinzhonggong.title}")
  private String title;
  @Value("${com.daqinzhonggong.description}")
  private String description;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
