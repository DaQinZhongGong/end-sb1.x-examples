package com.daqinzhonggong.service;

import com.daqinzhonggong.entity.User;
import java.util.List;

public interface UserService {

  public List<User> getUserList();

  public User findUserById(long id);

  public void save(User user);

  public void edit(User user);

  public void delete(long id);


}
