package com.pms.security.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * This bean is used for user registration and authentication.
 * 
 * @author PrasannaKumar
 */

@Entity
@Table (name = "users", uniqueConstraints = { @UniqueConstraint (columnNames = "id"),
         @UniqueConstraint (columnNames = "username") })
public class User implements Serializable {

   private Long   id;
   private String userName;
   private String password;
   private String firstName;
   private String lastName;
   private String fullName;
   private String emailId;
   private Date   lastLoginDate;
   private Date   createdDate;
   private Date   modifiedDate;
   private String address1;
   private String address2;
   private String city;
   private String state;
   private String zip;
   private String Country;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_seq")
   @SequenceGenerator(sequenceName = "user_id_seq", name = "ID_seq")
   @Column (name = "id", unique = true, nullable = false)
   public Long getId () {
      return id;
   }

   public void setId (Long id) {
      this.id = id;
   }

   @Column (name = "username", unique = true, nullable = false)
   public String getUsername () {
      return userName;
   }

   public void setUsername (String username) {
      this.userName = username;
   }

   @Column (name = "password", nullable = false)
   public String getPassword () {
      return password;
   }

   public void setPassword (String password) {
      this.password = password;
   }

   @Column (name = "firstname", nullable = false)
   public String getFirstName () {
      return firstName;
   }

   public void setFirstName (String firstName) {
      this.firstName = firstName;
   }

   @Column (name = "lastname", nullable = true)
   public String getLastName () {
      return lastName;
   }

   public void setLastName (String lastName) {
      this.lastName = lastName;
   }

   @Column (name = "fullname", nullable = true)
   public String getFullName () {
      return fullName;
   }

   public void setFullName (String fullName) {
      this.fullName = fullName;
   }

   @Column (name = "emailid", nullable = false)
   public String getEmailId () {
      return emailId;
   }

   public void setEmailId (String emailId) {
      this.emailId = emailId;
   }

   @Column (name = "lastlogindate", nullable = true)
   public Date getLastLoginDate () {
      return lastLoginDate;
   }

   public void setLastLoginDate (Date lastLoginDate) {
      this.lastLoginDate = lastLoginDate;
   }

   @Column (name = "createddate", nullable = false)
   public Date getCreatedDate () {
      return createdDate;
   }

   public void setCreatedDate (Date createdDate) {
      this.createdDate = createdDate;
   }

   @Column (name = "modifieddate", nullable = true)
   public Date getModifiedDate () {
      return modifiedDate;
   }

   public void setModifiedDate (Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @Column (name = "address1", nullable = true)
   public String getAddress1 () {
      return address1;
   }

   public void setAddress1 (String address1) {
      this.address1 = address1;
   }

   @Column (name = "address2", nullable = true)
   public String getAddress2 () {
      return address2;
   }

   public void setAddress2 (String address2) {
      this.address2 = address2;
   }

   @Column (name = "city", nullable = false)
   public String getCity () {
      return city;
   }

   public void setCity (String city) {
      this.city = city;
   }

   @Column (name = "state", nullable = false)
   public String getState () {
      return state;
   }

   public void setState (String state) {
      this.state = state;
   }

   @Column (name = "zip", nullable = false)
   public String getZip () {
      return zip;
   }

   public void setZip (String zip) {
      this.zip = zip;
   }

   @Column (name = "country", nullable = false)
   public String getCountry () {
      return Country;
   }

   public void setCountry (String country) {
      Country = country;
   }

}
