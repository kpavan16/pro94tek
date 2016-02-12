package com.pms.company.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.pms.company.bean.Company;

public interface ICompanyManagementDAO {

   public Company getCompany (String companyid) throws DataAccessException;

   public void createCompany (Company company) throws DataAccessException;

   public void deleteCompany (Company company) throws DataAccessException;

   public void updateCompany (Company company) throws DataAccessException;

}
