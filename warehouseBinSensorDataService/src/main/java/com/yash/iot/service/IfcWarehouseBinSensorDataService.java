package com.yash.iot.service;

import com.yash.iot.domain.WarehouseBinSensorDataRequest;
import com.yash.iot.domain.WarehouseBinSensorDataResponse;

public interface IfcWarehouseBinSensorDataService {
	public WarehouseBinSensorDataResponse getWarehouseBinSensorData(WarehouseBinSensorDataRequest warehouseBinSensorDataRequest);
}
