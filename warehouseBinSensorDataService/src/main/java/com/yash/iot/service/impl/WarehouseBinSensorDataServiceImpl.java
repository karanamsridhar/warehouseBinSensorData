package com.yash.iot.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
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
/*		BinSensorDataRecord record = getObjectFactory().createBinSensorDataRecord();
		record.setLocation("ABC");
		record.setPartNumber("112121");
		record.setPickType("A");
		record.setQuantity(new BigInteger("1212"));
		record.setSensorId(new BigInteger("1212"));
		record.setWarehouse("DY00");
		record.setWeight(new BigDecimal("1212.121"));
		record.setZone("A");
		warehouseBinSensorDataResponse.getSensorDataRecords().add(record);
*/		return warehouseBinSensorDataResponse;
	}

}
