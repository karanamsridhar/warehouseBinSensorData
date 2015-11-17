package com.yash.iot.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.iot.dao.IfcFetchWarehouseSensorData;
import com.yash.iot.domain.BinSensorDataRecord;
import com.yash.iot.domain.GetWarehouseBinSensorDataRequest;
import com.yash.iot.domain.GetWarehouseBinSensorDataResponse;
import com.yash.iot.domain.ObjectFactory;
import com.yash.iot.service.IfcWarehouseBinSensorDataService;

@Service(value="WarehouseBinSensorDataService")
public class WarehouseBinSensorDataServiceImpl implements IfcWarehouseBinSensorDataService {

	@Autowired
	private IfcFetchWarehouseSensorData ifcFetchWarehouseSensorData;
	
	private static ObjectFactory factory;
	
	private static ObjectFactory getObjectFactory(){
		if(factory == null){
			factory = new ObjectFactory();
		}
		return factory;
	}
	
	public GetWarehouseBinSensorDataResponse getWarehouseBinSensorData(GetWarehouseBinSensorDataRequest warehouseBinSensorDataRequest) {
		GetWarehouseBinSensorDataResponse warehouseBinSensorDataResponse = getObjectFactory().createGetWarehouseBinSensorDataResponse();
		List<BinSensorDataRecord> sensorDataList = ifcFetchWarehouseSensorData.getWarehouseSensorDataForLocationAndTimestamp(warehouseBinSensorDataRequest.getLocation(), warehouseBinSensorDataRequest.getTimestamp());
		warehouseBinSensorDataResponse.getSensorDataRecords().addAll(sensorDataList);
		return warehouseBinSensorDataResponse;
	}

}
