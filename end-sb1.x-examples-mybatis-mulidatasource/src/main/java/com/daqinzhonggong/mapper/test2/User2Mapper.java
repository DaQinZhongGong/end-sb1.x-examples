package com.daqinzhonggong.mapper.test2;

import com.daqinzhonggong.entity.UserEntity;
import java.util.List;

public interface User2Mapper {

  List<UserEntity> getAll();

  UserEntity getOne(Long id);

  void insert(UserEntity user);

  void update(UserEntity user);

  void delete(Long id);

}