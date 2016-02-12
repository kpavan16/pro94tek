package com.pms.inventory.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author PrasannaKumar
 */
@Entity
@Table (name = "category", uniqueConstraints = { @UniqueConstraint (columnNames = "category_id") })
public class Category {

   private Long             id;
   private String           categoryName;
   private String           description;
   private String           createdBy;
   private Date             createdDate;
   private Set<SubCategory> subCategories;

   @Id
   @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "ID_seq")
   @SequenceGenerator (sequenceName = "category_id_seq", name = "ID_seq")
   @Column (name = "category_id", unique = true, nullable = false)
   public Long getId () {
      return id;
   }

   public void setId (Long id) {
      this.id = id;
   }

   @Column (name = "category_name", nullable = false)
   public String getCategoryName () {
      return categoryName;
   }

   public void setCategoryName (String categoryName) {
      this.categoryName = categoryName;
   }

   @Column (name = "description", nullable = true)
   public String getDescription () {
      return description;
   }

   public void setDescription (String description) {
      this.description = description;
   }

   @Column (name = "created_by", nullable = false)
   public String getCreatedBy () {
      return createdBy;
   }

   public void setCreatedBy (String createdBy) {
      this.createdBy = createdBy;
   }

   @Column (name = "created_date", nullable = false)
   public Date getCreatedDate () {
      return createdDate;
   }

   public void setCreatedDate (Date createddate) {
      this.createdDate = createddate;
   }

   @OneToMany (fetch = FetchType.LAZY, mappedBy = "category")
   public Set<SubCategory> getSubCategories () {
      return subCategories;
   }

   public void setSubCategories (Set<SubCategory> subCategories) {
      this.subCategories = subCategories;
   }

}
