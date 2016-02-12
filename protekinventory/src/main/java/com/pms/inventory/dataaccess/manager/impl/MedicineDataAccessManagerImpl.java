package com.pms.inventory.dataaccess.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.inventory.bean.Medicine;
import com.pms.inventory.dataaccess.dao.IMedicineDAO;
import com.pms.inventory.dataaccess.manager.IMedicineDataAccessManager;
import com.pms.inventory.exeception.PMSException;

@Service ("medicineDataAccessManager")
public class MedicineDataAccessManagerImpl implements IMedicineDataAccessManager {

   @Autowired
   private IMedicineDAO medicineDAO;

   @Override
   public void createMedicine (Medicine medicine) throws PMSException {
      medicineDAO.createMedicine(medicine);
   }

   @Override
   public void updateMedicine (Medicine medicine) throws PMSException {
      medicineDAO.updateMedicine(medicine);
   }

   @Override
   public void deleteMedicine (Medicine medicine) throws PMSException {
      medicineDAO.deleteMedicine(medicine);
   }

   @Override
   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws PMSException {
      return medicineDAO.getAllMedicinesByCategoryName(categoryName);
   }

   @Override
   public Medicine getMedicineByName (String name) throws PMSException {
      return medicineDAO.getMedicineByName(name);
   }

   @Override
   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws PMSException {
      return medicineDAO.getAllMedicinesByChemicalCombination(chemicalCombination);
   }

   @Override
   public List<Medicine> getAllMedicinesByManufacturerName (String manufacturerName) throws PMSException {
      return medicineDAO.getAllMedicinesByManufacturerName(manufacturerName);
   }

}
