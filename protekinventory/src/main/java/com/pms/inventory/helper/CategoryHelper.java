package com.pms.inventory.helper;

import com.pms.inventory.bean.Category;
import com.pms.inventory.modal.CategoryModal;

public class CategoryHelper {
	
	
	public CategoryModal createCategoryModal(Category category){
		CategoryModal categoryModal = new CategoryModal();
		categoryModal.setCategoryName(category.getCategoryName());
		categoryModal.setCreatedBy(category.getCreatedBy());
		categoryModal.setCreatedDate(category.getCreatedDate());
		categoryModal.setDescription(category.getDescription());
		categoryModal.setId(category.getId());
		
		
		return categoryModal;
	}

	public Category createCategoryEntity(CategoryModal categoryModal){
		Category category = new Category();
		category.setCategoryName(categoryModal.getCategoryName());
		category.setCreatedBy(categoryModal.getCreatedBy());
		category.setCreatedDate(categoryModal.getCreatedDate());
		category.setDescription(categoryModal.getDescription());
		category.setId(categoryModal.getId());
		
		return category;
	}
}
