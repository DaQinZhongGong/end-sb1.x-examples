package com.daqinzhonggong.entity;

import com.daqinzhonggong.enums.UserSexEnum;
import java.io.Serializable;

public class UserEntity implements Serializable {

  private static final long serialVersionUID = 6366555931986892046L;

  private Long id;
  private String userName;
  private String passWord;
  private UserSexEnum userSex;
  private String nickName;

  public UserEntity() {
    super();
  }

  public UserEntity(String userName, String passWord, UserSexEnum userSex) {
    super();
    this.passWord = passWord;
    this.userName = userName;
    this.userSex = userSex;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  public UserSexEnum getUserSex() {
    return userSex;
  }

  public void setUserSex(UserSexEnum userSex) {
    this.userSex = userSex;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
  }

}