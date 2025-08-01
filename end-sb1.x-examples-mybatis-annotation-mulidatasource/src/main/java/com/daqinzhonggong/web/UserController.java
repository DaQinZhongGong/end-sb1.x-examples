package com.daqinzhonggong.web;

import com.daqinzhonggong.entity.UserEntity;
import com.daqinzhonggong.mapper.test1.User1Mapper;
import com.daqinzhonggong.mapper.test2.User2Mapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private User1Mapper user1Mapper;

  @Autowired
  private User2Mapper user2Mapper;

  @RequestMapping("/getUsers")
  public List<UserEntity> getUsers() {
    List<UserEntity> users = user1Mapper.getAll();
    return users;
  }

  @RequestMapping("/getUser")
  public UserEntity getUser(Long id) {
    UserEntity user = user2Mapper.getOne(id);
    return user;
  }

  @RequestMapping("/add")
  public void save(UserEntity user) {
    user2Mapper.insert(user);
  }

  @RequestMapping(value = "update")
  public void update(UserEntity user) {
    user2Mapper.update(user);
  }

  @RequestMapping(value = "/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    user1Mapper.delete(id);
  }

}