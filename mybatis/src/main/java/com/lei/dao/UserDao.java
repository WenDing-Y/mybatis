package com.lei.dao;

import com.lei.bean.User;

public interface UserDao {
 
  public User getUser(int id);
  public User getUser(String name);
  public User getUser();
  public void addUser(User user);
  public void deleteUser(int id);
  public void deleteUser(String name);
  public void updateUser(User user);
}
