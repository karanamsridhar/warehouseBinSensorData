package com.yash.iot.service;

import com.yash.iot.domain.GetWarehouseBinSensorDataRequest;
import com.yash.iot.domain.GetWarehouseBinSensorDataResponse;

public interface IfcWarehouseBinSensorDataService {
	public GetWarehouseBinSensorDataResponse getWarehouseBinSensorData(GetWarehouseBinSensorDataRequest warehouseBinSensorDataRequest);
}
