package com.daqinzhonggong.mapper;

import com.daqinzhonggong.entity.UserEntity;
import com.daqinzhonggong.enums.UserSexEnum;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

  @Autowired
  private UserMapper UserMapper;

  @Test
  public void testInsert() throws Exception {
    UserMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
    UserMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
    UserMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

    Assert.assertEquals(3, UserMapper.getAll().size());
  }

  @Test
  public void testQuery() throws Exception {
    List<UserEntity> users = UserMapper.getAll();
    System.out.println(users.toString());
  }


  @Test
  public void testUpdate() throws Exception {
    UserEntity user = UserMapper.getOne(3l);
    System.out.println(user.toString());
    user.setNickName("daqinzhonggong");
    UserMapper.update(user);
    Assert.assertTrue(("daqinzhonggong".equals(UserMapper.getOne(3l).getNickName())));
  }

}