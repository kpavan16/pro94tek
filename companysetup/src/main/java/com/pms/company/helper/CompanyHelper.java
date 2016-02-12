package com.pms.company.helper;

import java.util.ArrayList;
import java.util.List;

import com.pms.company.bean.Address;
import com.pms.company.bean.Company;
import com.pms.company.modal.AddressModal;
import com.pms.company.modal.CompanyModal;

public class CompanyHelper {
	
	
	public Company createCompanyEntity(CompanyModal companyModal){
		Company company = new Company();
		company.setCompanyName(companyModal.getCompanyName());
		company.setDateOfIncorporation(companyModal.getDateOfIncorporation());
		company.setDisplayName(companyModal.getDisplayName());
		company.setEmail(companyModal.getEmail());
		company.setId(companyModal.getId());
		company.setIsDealer(companyModal.getIsDealer());
		company.setIsRetailer(companyModal.getIsRetailer());
		company.setLandLineNo(companyModal.getLandLineNo());
		company.setLogo(companyModal.getLogo());
		company.setSignatureInNameOf(companyModal.getSignatureInNameOf());
		company.setMobileNo(companyModal.getMobileNo());
		return company;
	}
	
	public CompanyModal createCompanyModal(Company company){
		CompanyModal companyModal = new CompanyModal();
		companyModal.setCompanyName(company.getCompanyName());
		companyModal.setDateOfIncorporation(company.getDateOfIncorporation());
		companyModal.setDisplayName(company.getDisplayName());
		companyModal.setEmail(company.getEmail());
		companyModal.setId(company.getId());
		companyModal.setIsDealer(company.getIsDealer());
		companyModal.setIsRetailer(company.getIsRetailer());
		companyModal.setLandLineNo(company.getLandLineNo());
		companyModal.setLogo(company.getLogo());
		companyModal.setSignatureInNameOf(company.getSignatureInNameOf());
		companyModal.setMobileNo(company.getMobileNo());
		//companyModal.setAddress(address);
		return companyModal;
	}
	
	
	public List<AddressModal> createAddressModal(List<Address> addressEntityList){
		List<AddressModal> addressList = new ArrayList<AddressModal>();
		
		for(Address address : addressEntityList) {
			
			AddressModal aModal = new AddressModal();
			aModal.setAddressLine1(address.getAddressLine1());
			aModal.setAddressLine2(address.getAddressLine2());
			aModal.setAddressType(address.getAddressType());
			aModal.setCity(address.getCity());
			aModal.setCountry(address.getCountry());
			aModal.setDistrict(address.getDistrict());
			aModal.setId(address.getId());
			aModal.setState(address.getState());
			aModal.setStatus(address.getStatus());
			aModal.setZip(address.getZip());
			addressList.add(aModal);
		}
		
		
		return addressList;
	}

}