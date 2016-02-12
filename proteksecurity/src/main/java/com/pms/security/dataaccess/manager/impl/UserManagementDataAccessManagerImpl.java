package com.pms.security.dataaccess.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.security.bean.User;
import com.pms.security.dataaccess.dao.IUserManagementDAO;
import com.pms.security.dataaccess.manager.IUserManagementDataAccessManager;
import com.pms.security.exeception.PMSException;

@Service ("userManagementDataAccessManager")
public class UserManagementDataAccessManagerImpl implements IUserManagementDataAccessManager {

   @Autowired
   private IUserManagementDAO userManagementDAO;

   public User getUser (String userid) throws PMSException {
      try {
         return userManagementDAO.getUser(userid);
      } catch (org.springframework.dao.DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   public void createUser (User user) throws PMSException {
      try {
         userManagementDAO.createUser(user);
      } catch (org.springframework.dao.DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   public void deleteUser (User user) throws PMSException {
      try {
         userManagementDAO.deleteUser(user);
      } catch (org.springframework.dao.DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   public void updateUser (User user) throws PMSException {
      try {
         userManagementDAO.updateUser(user);
      } catch (org.springframework.dao.DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

}
