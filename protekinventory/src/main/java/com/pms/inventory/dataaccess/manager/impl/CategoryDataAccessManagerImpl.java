package com.pms.inventory.dataaccess.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.pms.inventory.bean.Category;
import com.pms.inventory.dataaccess.dao.ICategoryDAO;
import com.pms.inventory.dataaccess.dao.ISubCategoryDAO;
import com.pms.inventory.dataaccess.manager.ICategoryDataAccessManager;
import com.pms.inventory.exeception.PMSException;

@Service ("categoryDataAccessManager")
public class CategoryDataAccessManagerImpl implements ICategoryDataAccessManager {

   @Autowired
   private ICategoryDAO categoryDAO;

   @Override
   public Category getCategoryByName (String categoryName) throws PMSException {
      try {
         return categoryDAO.getCategoryByName(categoryName);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   @Override
   public void createCategory (Category category) throws PMSException {
      try {
         categoryDAO.createCategory(category);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   @Override
   public void updateCategory (Category category) throws PMSException {
      try {
         categoryDAO.updateCategory(category);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

   @Override
   public void deleteCategory (Category category) throws PMSException {
      try {
         categoryDAO.deleteCategory(category);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }
   }

}
