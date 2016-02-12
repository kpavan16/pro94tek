package com.pms.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.inventory.bean.Category;
import com.pms.inventory.bean.Medicine;
import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.dataaccess.dao.IMedicineDAO;
import com.pms.inventory.dataaccess.manager.ICategoryDataAccessManager;
import com.pms.inventory.dataaccess.manager.IMedicineDataAccessManager;
import com.pms.inventory.dataaccess.manager.ISubCategoryDataAccessManager;
import com.pms.inventory.exeception.PMSException;
import com.pms.inventory.service.IInvetoryDataManagmentService;

@Service ("invetoryDataManagmentService")
public class InvetoryDataManagmentServiceImpl implements IInvetoryDataManagmentService {

   @Autowired
   private ICategoryDataAccessManager    categoryDataAccessManager;
   @Autowired
   private ISubCategoryDataAccessManager subCategoryDataAccessManager;
   @Autowired
   private IMedicineDataAccessManager    medicineDataAccessManager;

   @Override
   public void createCategory (Category category) throws PMSException {
      categoryDataAccessManager.createCategory(category);
   }

   @Override
   public void updateCategory (Category category) throws PMSException {
      categoryDataAccessManager.updateCategory(category);

   }

   @Override
   public void deleteCategory (Category category) throws PMSException {
      categoryDataAccessManager.deleteCategory(category);
   }

   @Override
   public void createSubCategory (SubCategory subCategory) throws PMSException {
      subCategoryDataAccessManager.createSubCategory(subCategory);
   }

   @Override
   public void updateSubCategory (SubCategory subCategory) throws PMSException {
      subCategoryDataAccessManager.updateSubCategory(subCategory);
   }

   @Override
   public void deleteSubCategory (SubCategory subCategory) throws PMSException {
      subCategoryDataAccessManager.deleteSubCategory(subCategory);

   }

   @Override
   public void createMedicine (Medicine medicine) throws PMSException {
      medicineDataAccessManager.createMedicine(medicine);
   }

   @Override
   public void updateMedicine (Medicine medicine) throws PMSException {
      medicineDataAccessManager.updateMedicine(medicine);
   }

   @Override
   public void deleteMedicine (Medicine medicine) throws PMSException {
      medicineDataAccessManager.deleteMedicine(medicine);
   }
}
