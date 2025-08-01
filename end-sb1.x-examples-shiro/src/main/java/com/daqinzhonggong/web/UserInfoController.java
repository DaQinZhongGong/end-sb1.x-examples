package com.daqinzhonggong.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

  /**
   * 用户查询.
   *
   * @return
   */
  @RequestMapping("/userList")
  // 权限管理;
  @RequiresPermissions("userInfo:view")
  public String userInfo() {
    return "userInfo";
  }

  /**
   * 用户添加;
   *
   * @return
   */
  @RequestMapping("/userAdd")
  // 权限管理;
  @RequiresPermissions("userInfo:add")
  public String userInfoAdd() {
    return "userInfoAdd";
  }

  /**
   * 用户删除;
   *
   * @return
   */
  @RequestMapping("/userDel")
  // 权限管理;
  @RequiresPermissions("userInfo:del")
  public String userDel() {
    return "userInfoDel";
  }
}