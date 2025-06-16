package com.daqinzhonggong.sevice.impl;

import com.daqinzhonggong.dao.UserInfoDao;
import com.daqinzhonggong.entity.UserInfo;
import com.daqinzhonggong.sevice.UserInfoService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

  @Resource
  private UserInfoDao userInfoDao;

  @Override
  public UserInfo findByUsername(String username) {
    return userInfoDao.findByUsername(username);
  }

}