package com.pms.inventory.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.pms.inventory.bean.SubCategory;

public interface ISubCategoryDAO {

   public SubCategory getSubCategoryByName (String subCategoryName) throws DataAccessException;

   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws DataAccessException;

   public void createSubCategory (SubCategory subCategory) throws DataAccessException;

   public void updateSubCategory (SubCategory subCategory) throws DataAccessException;

   public void deleteSubCategory (SubCategory subCategory) throws DataAccessException;
}
