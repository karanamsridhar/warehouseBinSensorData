package com.yash.iot.dao;

import java.util.List;

import com.yash.iot.domain.BinSensorDataRecord;

public interface IfcFetchWarehouseSensorData {
	public List<BinSensorDataRecord> getWarehouseSensorDataForLocationAndTimestamp(String location, String timestamp);
}
