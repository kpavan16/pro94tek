package com.pms.security.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.pms.security.bean.User;

public interface IUserManagementDAO {

   public User getUser (String userid) throws DataAccessException;

   public void createUser (User user) throws DataAccessException;

   public void deleteUser (User user) throws DataAccessException;

   public void updateUser (User user) throws DataAccessException;

}
