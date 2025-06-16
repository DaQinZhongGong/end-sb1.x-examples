package com.daqinzhonggong.repository;

import com.daqinzhonggong.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findById(long id);

  Long deleteById(Long id);

}