package com.pms.inventory.dataaccess.manager;

import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.exeception.PMSException;

public interface ISubCategoryDataAccessManager {

   public SubCategory getSubCategoryByName (String subCategoryName) throws PMSException;

   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws PMSException;

   public void createSubCategory (SubCategory subCategory) throws PMSException;

   public void updateSubCategory (SubCategory subCategory) throws PMSException;

   public void deleteSubCategory (SubCategory subCategory) throws PMSException;

}
