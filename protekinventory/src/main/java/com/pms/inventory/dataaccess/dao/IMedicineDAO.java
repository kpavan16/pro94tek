package com.pms.inventory.dataaccess.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.pms.inventory.bean.Medicine;

public interface IMedicineDAO {

   public void createMedicine (Medicine medicine) throws DataAccessException;

   public void updateMedicine (Medicine medicine) throws DataAccessException;

   public void deleteMedicine (Medicine medicine) throws DataAccessException;

   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws DataAccessException;

   public Medicine getMedicineByName (String name) throws DataAccessException;

   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws DataAccessException;
   
   public List<Medicine> getAllMedicinesByManufacturerName(String manufacturerName)throws DataAccessException;
}
