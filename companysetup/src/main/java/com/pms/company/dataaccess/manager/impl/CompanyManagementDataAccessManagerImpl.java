package com.pms.company.dataaccess.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pms.company.bean.Company;
import com.pms.company.dataaccess.dao.ICompanyManagementDAO;
import com.pms.company.exeception.PMSException;

@Service("companyManagementDataAccessManager")
public class CompanyManagementDataAccessManagerImpl {

	@Autowired
	private ICompanyManagementDAO companyManagementDAO;

	public Company getCompany(String companyid) throws PMSException {
		try {
			return companyManagementDAO.getCompany(companyid);
		} catch (org.springframework.dao.DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
	}

	public void createCompany(Company company) throws PMSException {
		try {
			companyManagementDAO.createCompany(company);
		} catch (org.springframework.dao.DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
	}

	public void deleteCompany(Company company) throws PMSException {
		try {
			companyManagementDAO.deleteCompany(company);
		} catch (org.springframework.dao.DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
	}

	public void updateComapny(Company company) throws PMSException {
		try {
			companyManagementDAO.updateCompany(company);
		} catch (org.springframework.dao.DataAccessException dae) {
			throw new PMSException(1000, dae);
		}
	}

}
