package com.pms.security.service;

import com.pms.security.bean.User;
import com.pms.security.exeception.PMSException;

public interface IUserManagementService {

   public User getUser (String userid) throws PMSException;

   public void createUser (User user) throws PMSException;

   public void deleteUser (User user) throws PMSException;

   public void updateUser (User user) throws PMSException;
}
