package com.pms.inventory.dataaccess.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.pms.inventory.bean.Medicine;
import com.pms.inventory.dataaccess.dao.IMedicineDAO;
import com.pms.inventory.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.pms.utils.PmsUtil;

@Repository ("medicineDAO")
public class MedicineDAOImpl extends CustomHibernateDaoSupport implements IMedicineDAO {

   @Override
   public void createMedicine (Medicine medicine) throws DataAccessException {
      getSession().save(medicine);
   }

   @Override
   public void updateMedicine (Medicine medicine) throws DataAccessException {
      getSession().update(medicine);
   }

   @Override
   public void deleteMedicine (Medicine medicine) throws DataAccessException {
      getSession().delete(medicine);
   }

   @SuppressWarnings ("unchecked")
   @Override
   public List<Medicine> getAllMedicinesByCategoryName (String categoryName) throws DataAccessException {
      String medicinesByCategoryName = "from medicine where category = :categoryName";
      Query query = getSession().getNamedQuery(medicinesByCategoryName);
      query.setString("categoryName", categoryName);
      return query.list();
   }

   @SuppressWarnings ("unchecked")
   @Override
   public Medicine getMedicineByName (String name) throws DataAccessException {
      Medicine medicine = null;
      String medicineByName = "from medicine where name = :name";
      Query query = getSession().getNamedQuery(medicineByName);
      query.setString("name", name);
      List<Medicine> medicines = query.list();
      if (PmsUtil.isCollectionNotEmpty(medicines)) {
         medicine = medicines.get(0);
      }
      return medicine;
   }

   @SuppressWarnings ("unchecked")
   @Override
   public List<Medicine> getAllMedicinesByChemicalCombination (String chemicalCombination) throws DataAccessException {
      String medicinesByChemicalCombination = "from medicine where chemicalCombinations = :chemicalCombination";
      Query query = getSession().getNamedQuery(medicinesByChemicalCombination);
      query.setString("chemicalCombination", chemicalCombination);
      return query.list();
   }

   @SuppressWarnings ("unchecked")
   @Override
   public List<Medicine> getAllMedicinesByManufacturerName (String manufacturerName) throws DataAccessException {
      String medicinesByManufacturerName = "from medicine where manufacturerName = : manufacturerName";
      Query query = getSession().getNamedQuery(medicinesByManufacturerName);
      query.setString("manufacturerName", manufacturerName);
      return query.list();
   }

}
