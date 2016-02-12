package com.pms.inventory.dataaccess.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.dataaccess.dao.ISubCategoryDAO;
import com.pms.inventory.dataaccess.manager.ISubCategoryDataAccessManager;
import com.pms.inventory.exeception.PMSException;

@Service ("subCategoryDataAccessManagerImpl")
public class SubCategoryDataAccessManagerImpl implements ISubCategoryDataAccessManager {

   @Autowired
   private ISubCategoryDAO subCategoryDAO;

   @Override
   public SubCategory getSubCategoryByName (String subCategoryName) throws PMSException {
      try {
         return subCategoryDAO.getSubCategoryByName(subCategoryName);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }

   }

   @Override
   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws PMSException {
      try {
         return subCategoryDAO.getSubCategoryByCategoryId(categoryId);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }

   }

   @Override
   public void createSubCategory (SubCategory subCategory) throws PMSException {
      try {
         subCategoryDAO.createSubCategory(subCategory);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }

   }

   @Override
   public void updateSubCategory (SubCategory subCategory) throws PMSException {
      try {
         subCategoryDAO.updateSubCategory(subCategory);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }

   }

   @Override
   public void deleteSubCategory (SubCategory subCategory) throws PMSException {
      try {
         subCategoryDAO.deleteSubCategory(subCategory);
      } catch (DataAccessException dae) {
         throw new PMSException(1000, dae);
      }

   }

}
