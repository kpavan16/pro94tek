package com.pms.utils;

public class CommonUtils {
	
	public InventoryRequestResponse  createResponseData(String comments,String responseMessage,String status,String recordCount,Object data){
	
		InventoryRequestResponse response = new InventoryRequestResponse();
		
		response.setComments(comments);
		response.setData(data);
		response.setRecordCount(recordCount);
		response.setResponseMessage(responseMessage);
		response.setStatus(status);
		
		return response;
	}

}