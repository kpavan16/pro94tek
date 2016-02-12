package com.pms.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.inventory.bean.Category;
import com.pms.inventory.bean.Medicine;
import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.dataaccess.manager.ICategoryDataAccessManager;
import com.pms.inventory.dataaccess.manager.IMedicineDataAccessManager;
import com.pms.inventory.dataaccess.manager.ISubCategoryDataAccessManager;
import com.pms.inventory.exeception.PMSException;
import com.pms.inventory.service.IInvetoryDataRetrivalService;

@Service ("invetoryDataRetrivalService")
public class InvetoryDataRetrivalServiceImpl implements IInvetoryDataRetrivalService {

   @Autowired
   private ICategoryDataAccessManager    categoryDataAccessManager;
   @Autowired
   private ISubCategoryDataAccessManager subCategoryDataAccessManager;
   @Autowired
   private IMedicineDataAccessManager    medicineDataAccessManager;

   @Override
   public Category getCategoryByName (String categoryName) throws PMSException {
      return categoryDataAccessManager.getCategoryByName(categoryName);
   }

   @Override
   public SubCategory getSubCategoryByName (String subCategoryName) throws PMSException {
      return subCategoryDataAccessManager.getSubCategoryByName(subCategoryName);
   }

   @Override
   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws PMSException {
      return subCategoryDataAccessManager.getSubCategoryByCategoryId(categoryId);
   }

   @Override
   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws PMSException {
      return medicineDataAccessManager.getAllMedicinesByCategoryName(categoryName);
   }

   @Override
   public Medicine getMedicineByName (String name) throws PMSException {
      return medicineDataAccessManager.getMedicineByName(name);
   }

   @Override
   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws PMSException {
      return medicineDataAccessManager.getAllMedicinesByChemicalCombination(chemicalCombination);
   }

   @Override
   public List<Medicine> getAllMedicinesByManufacturerName (String manufacturerName) throws PMSException {
      return medicineDataAccessManager.getAllMedicinesByManufacturerName(manufacturerName);
   }

}
