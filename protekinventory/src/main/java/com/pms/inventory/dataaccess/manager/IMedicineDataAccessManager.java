package com.pms.inventory.dataaccess.manager;

import java.util.List;

import com.pms.inventory.bean.Medicine;
import com.pms.inventory.exeception.PMSException;

public interface IMedicineDataAccessManager {

   public void createMedicine (Medicine medicine) throws PMSException;

   public void updateMedicine (Medicine medicine) throws PMSException;

   public void deleteMedicine (Medicine medicine) throws PMSException;

   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws PMSException;

   public Medicine getMedicineByName (String name) throws PMSException;

   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws PMSException;

   public List<Medicine> getAllMedicinesByManufacturerName (String manufacturerName) throws PMSException;

}
