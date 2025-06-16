package com.daqinzhonggong.dao;

import com.daqinzhonggong.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

  /**
   * 通过 username 查找用户信息;
   */
  public UserInfo findByUsername(String username);

}