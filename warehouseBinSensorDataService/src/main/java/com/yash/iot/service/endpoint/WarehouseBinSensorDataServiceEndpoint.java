package com.yash.iot.service.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.yash.iot.domain.GetWarehouseBinSensorDataRequest;
import com.yash.iot.domain.GetWarehouseBinSensorDataResponse;
import com.yash.iot.service.IfcWarehouseBinSensorDataService;

@Endpoint
public class WarehouseBinSensorDataServiceEndpoint {

	@Autowired
	private IfcWarehouseBinSensorDataService ifcWarehouseBinSensorDataService;
	
	@PayloadRoot(localPart="GetWarehouseBinSensorDataRequest", namespace="http://www.iot.yash.com/WarehouseBinSensorData")
	public @ResponsePayload JAXBElement<GetWarehouseBinSensorDataResponse> getWarehouseBinSensorData(@RequestPayload JAXBElement<GetWarehouseBinSensorDataRequest> request){
		GetWarehouseBinSensorDataRequest warehouseBinSensorDataRequest = request.getValue();
		GetWarehouseBinSensorDataResponse response = ifcWarehouseBinSensorDataService.getWarehouseBinSensorData(warehouseBinSensorDataRequest);
		JAXBElement<GetWarehouseBinSensorDataResponse> responseElement = new JAXBElement<GetWarehouseBinSensorDataResponse>(new QName("GetWarehouseBinSensorDataResponse"), GetWarehouseBinSensorDataResponse.class, response);
		return responseElement;
	}
}
