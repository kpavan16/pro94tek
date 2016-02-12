package com.pms.utils;

public class CommonUtils {
	
	public CompanySetupRequestResponse  createResponseData(String comments,String responseMessage,String status,String recordCount,Object data){
	
		CompanySetupRequestResponse response = new CompanySetupRequestResponse();
		
		response.setComments(comments);
		response.setData(data);
		response.setRecordCount(recordCount);
		response.setResponseMessage(responseMessage);
		response.setStatus(status);
		
		return response;
	}

}
