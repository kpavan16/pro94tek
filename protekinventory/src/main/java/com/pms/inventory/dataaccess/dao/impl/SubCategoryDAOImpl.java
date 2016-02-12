package com.pms.inventory.dataaccess.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.dataaccess.dao.ISubCategoryDAO;
import com.pms.inventory.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.pms.utils.PmsUtil;

@Repository("subCategoryDAO")
public class SubCategoryDAOImpl extends CustomHibernateDaoSupport implements ISubCategoryDAO {

   @SuppressWarnings ("unchecked")
   @Override
   public SubCategory getSubCategoryByName (String subCategoryName) throws DataAccessException {
      SubCategory subCategory = null;
      String subCategoryNamequery = "from SubCategory where subCategoryName= :subCategoryName";
      Query query = getSession().getNamedQuery(subCategoryNamequery);
      query.setString("subCategoryName", subCategoryName);
      List<SubCategory> subCategories = query.list();
      if (PmsUtil.isCollectionNotEmpty(subCategories)) {
         subCategory = subCategories.get(0);
      }
      return subCategory;
   }

   @Override
   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws DataAccessException {
      // SubCategory subCategory = null;
      // String categoryIdquery=" from SubCategory where ";
      return null;
   }

   @Override
   public void createSubCategory (SubCategory subCategory) throws DataAccessException {
      getSession().save(subCategory);
   }

   @Override
   public void updateSubCategory (SubCategory subCategory) throws DataAccessException {
      getSession().update(subCategory);
   }

   @Override
   public void deleteSubCategory (SubCategory subCategory) throws DataAccessException {
      getSession().delete(subCategory);
   }

}
