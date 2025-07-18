package com.daqinzhonggong.mapper;

import com.daqinzhonggong.entity.UserEntity;
import com.daqinzhonggong.enums.UserSexEnum;
import com.daqinzhonggong.mapper.test1.User1Mapper;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class User1MapperTest {

  @Autowired
  private User1Mapper userMapper;

  @Test
  public void testInsert() throws Exception {
    userMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
    userMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
    userMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

    Assert.assertEquals(3, userMapper.getAll().size());
  }

  @Test
  public void testQuery() throws Exception {
    List<UserEntity> users = userMapper.getAll();
    if (users == null || users.size() == 0) {
      System.out.println("is null");
    } else {
      System.out.println(users.size());
    }
  }


  @Test
  public void testUpdate() throws Exception {
    UserEntity user = userMapper.getOne(6l);
    System.out.println(user.toString());
    user.setNickName("daqinzhonggong");
    userMapper.update(user);
    Assert.assertTrue(("daqinzhonggong".equals(userMapper.getOne(6l).getNickName())));
  }

}