package com.pms.company.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Company {

	private Long id;
	private String companyName;
	private String displayName;
	private String signatureInNameOf;
	private String mailingAddress;
	private String billingAddress;
	private String corporateAddress;
	private Date dateOfIncorporation;
	private String logo;
	private Long mobileNo;
	private Long landLineNo;
	private String email;
	private Boolean isDealer;
	private Boolean isRetailer;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_seq")
	@SequenceGenerator(sequenceName = "user_id_seq", name = "ID_seq")
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "company_name", unique = true, nullable = false)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "display_name", unique = true, nullable = false)
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "signature_name", unique = true, nullable = false)
	public String getSignatureInNameOf() {
		return signatureInNameOf;
	}

	public void setSignatureInNameOf(String signatureInNameOf) {
		this.signatureInNameOf = signatureInNameOf;
	}

	@Column(name = "mailing_address", unique = true, nullable = false)
	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	@Column(name = "billing_address", unique = true, nullable = false)
	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Column(name = "corporate_address", nullable = false)
	public String getCorporateAddress() {
		return corporateAddress;
	}

	public void setCorporateAddress(String corporateAddress) {
		this.corporateAddress = corporateAddress;
	}

	@Column(name = "incorporation_date", nullable = false)
	public Date getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(Date dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	@Column(name = "logo", unique = true, nullable = false)
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "mobile", unique = true, nullable = false)
	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "land_line", unique = true, nullable = false)
	public Long getLandLineNo() {
		return landLineNo;
	}

	public void setLandLineNo(Long landLineNo) {
		this.landLineNo = landLineNo;
	}

	@Column(name = "email", unique = true, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "isdealer", nullable = false)
	public Boolean getIsDealer() {
		return isDealer;
	}

	public void setIsDealer(Boolean isDealer) {
		this.isDealer = isDealer;
	}

	@Column(name = "isretailer", nullable = false)
	public Boolean getIsRetailer() {
		return isRetailer;
	}

	public void setIsRetailer(Boolean isRetailer) {
		this.isRetailer = isRetailer;
	}

}
