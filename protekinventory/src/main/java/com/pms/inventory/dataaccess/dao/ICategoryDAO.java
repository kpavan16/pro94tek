package com.pms.inventory.dataaccess.dao;

import org.springframework.dao.DataAccessException;

import com.pms.inventory.bean.Category;


public interface ICategoryDAO {
   
   public Category getCategoryByName(String categoryName) throws DataAccessException;
   
   public void createCategory(Category category)throws DataAccessException;
   
   public void updateCategory(Category category)throws DataAccessException;
   
   public void deleteCategory(Category category)throws DataAccessException;
}
