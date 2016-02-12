package com.pms.company.dataaccess.manager;

import com.pms.company.bean.Company;
import com.pms.company.exeception.PMSException;


public interface ICompanyManagementDataAccessManager {
   
   public Company getCompany (String companyid) throws PMSException;
   
   public void createCompany(Company company)throws PMSException;
   
   public void deleteCompany(Company company)throws PMSException;
   
   public void updateComapny(Company company)throws PMSException;

}
