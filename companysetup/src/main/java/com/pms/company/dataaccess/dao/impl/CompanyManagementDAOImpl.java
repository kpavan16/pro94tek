package com.pms.company.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;

import com.pms.company.bean.Company;
import com.pms.company.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.pms.company.bean.Company;
import com.pms.utils.PmsUtil;

@SuppressWarnings("unused")
public class CompanyManagementDAOImpl extends CustomHibernateDaoSupport {

	@SuppressWarnings("unchecked")
	@Transactional
	public Company getCompany(String companyName) throws DataAccessException {
		Company company = null;
		String queryString = "from user where companyName= : companyName";
		Query query = getSession().getNamedQuery(queryString);
		query.setString("CompanyName", companyName);
		List<Company> companies = query.list();
		if (PmsUtil.isCollectionNotEmpty(companies)) {
			company = companies.get(0);
		}
		return company;
	}

	@Transactional
	public void createCompany(Company company) throws DataAccessException {
		getSession().save(company);
	}

	@Transactional
	public void deleteCompany(Company company) throws DataAccessException {
		getSession().delete(company);
	}

	@Transactional
	public void updateCompany(Company company) throws DataAccessException {
		getSession().saveOrUpdate(company);
	}

}
