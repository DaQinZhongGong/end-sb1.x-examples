package com.daqinzhonggong.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class SysRole {

  /**
   * 编号
   */
  @Id
  @GeneratedValue
  private Integer id;
  /**
   * 角色标识程序中判断使用,如"admin",这个是唯一的:
   */
  private String role;
  /**
   * 角色描述,UI界面显示使用
   */
  private String description;
  /**
   * 是否可用,如果不可用将不会添加给用户
   */
  private Boolean available = Boolean.FALSE;
  /**
   * 角色 -- 权限关系：多对多关系;
   */
  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "SysRolePermission", joinColumns = {
      @JoinColumn(name = "roleId")}, inverseJoinColumns = {@JoinColumn(name = "permissionId")})
  private List<SysPermission> permissions;

  /**
   * 用户 - 角色关系定义;
   */
  @ManyToMany
  @JoinTable(name = "SysUserRole", joinColumns = {
      @JoinColumn(name = "roleId")}, inverseJoinColumns = {@JoinColumn(name = "uid")})
  private List<UserInfo> userInfos;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public List<SysPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<SysPermission> permissions) {
    this.permissions = permissions;
  }

  public List<UserInfo> getUserInfos() {
    return userInfos;
  }

  public void setUserInfos(List<UserInfo> userInfos) {
    this.userInfos = userInfos;
  }

}