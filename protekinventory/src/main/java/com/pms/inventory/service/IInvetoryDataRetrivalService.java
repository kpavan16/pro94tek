package com.pms.inventory.service;

import java.util.List;

import com.pms.inventory.bean.Category;
import com.pms.inventory.bean.Medicine;
import com.pms.inventory.bean.SubCategory;
import com.pms.inventory.exeception.PMSException;

public interface IInvetoryDataRetrivalService {

   public Category getCategoryByName (String categoryName) throws PMSException;

   public SubCategory getSubCategoryByName (String subCategoryName) throws PMSException;

   public SubCategory getSubCategoryByCategoryId (Long categoryId) throws PMSException;

   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws PMSException;

   public Medicine getMedicineByName (String name) throws PMSException;

   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws PMSException;

   public List<Medicine> getAllMedicinesByManufacturerName (String manufacturerName) throws PMSException;

}
