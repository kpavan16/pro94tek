package com.pms.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.security.bean.User;
import com.pms.security.dataaccess.manager.IUserManagementDataAccessManager;
import com.pms.security.exeception.PMSException;
import com.pms.security.service.IUserManagementService;

@Service ("userManagementService")
public class UserManagementServiceImpl implements IUserManagementService {

   @Autowired
   private IUserManagementDataAccessManager userManagementDataAccessManager;

   public User getUser (String userid) throws PMSException {
      return userManagementDataAccessManager.getUser(userid);
   }

   public void createUser (User user) throws PMSException {
      userManagementDataAccessManager.createUser(user);
   }

   public void deleteUser (User user) throws PMSException {
      userManagementDataAccessManager.deleteUser(user);
   }

   public void updateUser (User user) throws PMSException {
      userManagementDataAccessManager.updateUser(user);
   }

}
