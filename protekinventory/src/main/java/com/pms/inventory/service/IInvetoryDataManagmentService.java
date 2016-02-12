package com.pms.inventory.service;

import com.pms.inventory.bean.Category;
import com.pms.inventory.bean.Medicine;
import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.exeception.PMSException;

public interface IInvetoryDataManagmentService {

   public void createCategory (Category category) throws PMSException;

   public void updateCategory (Category category) throws PMSException;

   public void deleteCategory (Category category) throws PMSException;

   public void createSubCategory (SubCategory subCategory) throws PMSException;

   public void updateSubCategory (SubCategory subCategory) throws PMSException;

   public void deleteSubCategory (SubCategory subCategory) throws PMSException;

   public void createMedicine (Medicine medicine) throws PMSException;

   public void updateMedicine (Medicine medicine) throws PMSException;

   public void deleteMedicine (Medicine medicine) throws PMSException;

}
