package com.pms.inventory.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pms.inventory.bean.Category;
import com.pms.inventory.dataaccess.dao.ICategoryDAO;
import com.pms.inventory.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.pms.utils.PmsUtil;

@Repository("categoryDAO")
public class CategoryDAOImpl extends CustomHibernateDaoSupport implements ICategoryDAO {

   @Override
   @SuppressWarnings ("unchecked")
   @Transactional
   public Category getCategoryByName (String categoryName) throws DataAccessException {
      Category category = null;
      String queryCategoryByName = "from category where categoryName = : categoryName";
//      String hql = "FROM Employee E WHERE E.id = :employee_id";
//      Query query = session.createQuery(hql);
//      query.setParameter("employee_id",10);
      Query query = getSession().createQuery(queryCategoryByName);
      query.setParameter("categoryName", categoryName);
      List<Category> categories = query.list();
      if (PmsUtil.isCollectionNotEmpty(categories)) {
         category = categories.get(0);
      }
      return category;
   }

   @Override
   @Transactional
   public void createCategory (Category category) throws DataAccessException {
      getSession().save(category);
   }

   @Override
   @Transactional
   public void updateCategory (Category category) throws DataAccessException {
      getSession().saveOrUpdate(category);
   }

   @Override
   @Transactional
   public void deleteCategory (Category category) throws DataAccessException {
      getSession().delete(category);
   }

}
