package com.daqinzhonggong.service.impl;

import com.daqinzhonggong.entity.User;
import com.daqinzhonggong.repository.UserRepository;
import com.daqinzhonggong.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUserList() {
    return userRepository.findAll();
  }

  @Override
  public User findUserById(long id) {
    return userRepository.findById(id);
  }

  @Override
  public void save(User user) {
    userRepository.save(user);
  }

  @Override
  public void edit(User user) {
    userRepository.save(user);
  }

  @Override
  public void delete(long id) {
    userRepository.delete(id);
  }
}


