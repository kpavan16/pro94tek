package com.pms.inventory.dataaccess.manager;

import com.pms.inventory.bean.Category;
import com.pms.inventory.exeception.PMSException;

public interface ICategoryDataAccessManager {

   public Category getCategoryByName (String categoryName) throws PMSException;

   public void createCategory (Category category) throws PMSException;

   public void updateCategory (Category category) throws PMSException;

   public void deleteCategory (Category category) throws PMSException;

}
