package com.pms.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pms.inventory.helper.CategoryHelper;
import com.pms.inventory.modal.CategoryModal;
import com.pms.inventory.service.IInvetoryDataManagmentService;
import com.pms.inventory.service.IInvetoryDataRetrivalService;
import com.pms.utils.CommonUtils;
import com.pms.utils.InventoryRequestResponse;
import com.pms.utils.InventoryURIConstant;
import com.pms.utils.ResponseMessages;



@Controller
public class InventorySetup {

	
	private static final Logger logger = LoggerFactory.getLogger(InventorySetup.class);
	
	@Autowired
	IInvetoryDataManagmentService inventoryMasterService;
	
	@Autowired
	IInvetoryDataRetrivalService  invetoryDataRetrivalService;
	
	CommonUtils commonUtils = new CommonUtils();
	ResponseMessages message = new ResponseMessages();
	InventoryRequestResponse response = new InventoryRequestResponse();
	InventoryURIConstant inventoryURIConstants = new InventoryURIConstant();
	CategoryModal categoryModal = new CategoryModal();
	
	@RequestMapping(value = InventoryURIConstant.GET_INVENTORY_DETAILS, method = RequestMethod.GET)
	public @ResponseBody InventoryRequestResponse getCompanyDetails(@PathVariable("id") String categoryId) {
		
		logger.info("Start getCompanyDetails. ID="+categoryId);
		
		try {
			     CategoryHelper cHelper = new CategoryHelper();
			     categoryModal = cHelper.createCategoryModal(invetoryDataRetrivalService.getCategoryByName(categoryId));
		     	
				response = commonUtils.createResponseData(categoryModal.getCategoryName(), message.GENERALL_FETCH_SUCCESS, message.SUCCESS, "1", categoryModal);
				
		} catch (Exception e) {
			
			e.printStackTrace();
			response = commonUtils.createResponseData(e.getMessage(), message.GENERALL_FETCH_FAIL, message.FAIL, "0", categoryId);
			
		} 
		return response;
	}
	
	
}
