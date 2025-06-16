package com.daqinzhonggong.dao;

import com.daqinzhonggong.entity.UserEntity;

public interface UserDao {

  public void saveUser(UserEntity user);

  public UserEntity findUserByUserName(String userName);

  public int updateUser(UserEntity user);

  public void deleteUserById(Long id);

}
