package com.yash.iot.dao.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.yash.iot.dao.IfcFetchWarehouseSensorData;
import com.yash.iot.domain.BinSensorDataRecord;

@Repository
public class FetchWarehouseSensorDataImpl implements IfcFetchWarehouseSensorData {

	private DynamoDB dynamoDB;
	
	public FetchWarehouseSensorDataImpl() {
		AmazonDynamoDBClient client = new AmazonDynamoDBClient(new ProfileCredentialsProvider());
		client.setRegion(Region.getRegion(Regions.US_WEST_2));
		dynamoDB = new DynamoDB(client);
	}
	
	
	public List<BinSensorDataRecord> getWarehouseSensorDataForLocationAndTimestamp(String location, String timestamp) {
		
		List<BinSensorDataRecord> sensorDataList = new ArrayList<BinSensorDataRecord>();
		
		Table table = dynamoDB.getTable("WAREHOUSE_BIN_SENSOR_DATA");
		
		Map<String, Object> valueMap = new HashMap<String, Object>();
		valueMap.put(":V_ID", location);
		valueMap.put(":V_SK", timestamp);
		
		QuerySpec spec = new QuerySpec()
		.withKeyConditionExpression("PICK_LOCATION = :V_ID AND TIME_STAMP > :V_SK")
		.withValueMap(valueMap)
		.withConsistentRead(true);
		
		ItemCollection<QueryOutcome> itemCollection = table.query(spec);
		Iterator<Item> iterator = itemCollection.iterator();
		while(iterator.hasNext()){
			Item item = iterator.next();
			BinSensorDataRecord binSensorDataRecord = new BinSensorDataRecord();
			binSensorDataRecord.setLocation(item.getString("PICK_LOCATION"));
			binSensorDataRecord.setPartNumber(item.getString("PART_NUMBER"));
			binSensorDataRecord.setPickType(item.getString("PICK_TYPE"));
			String quantity = item.getString("QUANTITY");
			if(quantity!=null && !quantity.trim().equals("")){
				binSensorDataRecord.setQuantity(new BigInteger(quantity));	
			}
			String sensorId = item.getString("SENSOR_ID");
			if(sensorId!=null && !sensorId.trim().equals("")){
				binSensorDataRecord.setSensorId(new BigInteger(sensorId));	
			}
			
			binSensorDataRecord.setWarehouse(item.getString("WAREHOUSE"));
			
			String weight = item.getString("WEIGHT");
			if(weight!=null && !weight.trim().equals("")){
				binSensorDataRecord.setWeight(new BigDecimal(weight));				
			}
			binSensorDataRecord.setZone(item.getString("ZONE"));
			sensorDataList.add(binSensorDataRecord);
		}
		
		return sensorDataList;
	}

}
