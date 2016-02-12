package com.pms.security.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pms.security.bean.User;
import com.pms.security.dataaccess.dao.IUserManagementDAO;
import com.pms.security.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.pms.security.exeception.PMSException;
import com.pms.utils.PmsUtil;

@Repository
public class UserManagementDAOImpl extends CustomHibernateDaoSupport implements IUserManagementDAO {

   @SuppressWarnings ("unchecked")
   @Transactional
   public User getUser (String userName) throws DataAccessException {
      User user = null;
      String queryString = "from user where userName= :userName";
      Query query = getSession().getNamedQuery(queryString);
      query.setString("UserName", userName);
      List<User> users = query.list();
      if (PmsUtil.isCollectionNotEmpty(users)) {
         user = users.get(0);
      }
      return user;
   }

   @Transactional
   public void createUser (User user) throws DataAccessException {
      getSession().save(user);
   }

   @Transactional
   public void deleteUser (User user) throws DataAccessException {
      getSession().delete(user);
   }

   @Transactional
   public void updateUser (User user) throws DataAccessException {
      getSession().saveOrUpdate(user);
   }

}
