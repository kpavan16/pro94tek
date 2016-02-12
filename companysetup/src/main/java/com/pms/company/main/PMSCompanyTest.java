package com.pms.company.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pms.company.bean.Company;
import com.pms.company.exeception.PMSException;
import com.pms.company.service.ICompanyManagementService;

public class PMSCompanyTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws PMSException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/config/application-context.xml");
		ICompanyManagementService companyManagementService = (ICompanyManagementService) appContext
				.getBean("companyManagementService");

		// insert company
		Company company = new Company();
		company.setCompanyName("phorma");
		company.setDisplayName("phorma display");
		company.setSignatureInNameOf("xyz");
		company.setBillingAddress("hyderabad");
		company.setMailingAddress("hyderabad@gmail");
		company.setCorporateAddress("company address");
		company.setDateOfIncorporation(new Date());
		company.setLogo("company logo");
		company.setMobileNo(Long.parseLong("9912925956"));
		company.setLandLineNo(Long.parseLong("9912230303"));
		company.setEmail("phorma@gmail.com");
		company.setIsDealer(Boolean.parseBoolean("y"));
		company.setIsRetailer(Boolean.parseBoolean("y"));

		companyManagementService.createCompany(company);
	}

}
