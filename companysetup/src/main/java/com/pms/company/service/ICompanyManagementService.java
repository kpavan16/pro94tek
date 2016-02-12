package com.pms.company.service;

import com.pms.company.bean.Company;
import com.pms.company.exeception.PMSException;
import com.pms.company.modal.CompanyModal;

public interface ICompanyManagementService {
	public CompanyModal getCompany(String id) throws PMSException;

	public void createCompany(Company company) throws PMSException;

	public void deleteCompany(Company company) throws PMSException;

	public void updateCompany(Company company) throws PMSException;

}
