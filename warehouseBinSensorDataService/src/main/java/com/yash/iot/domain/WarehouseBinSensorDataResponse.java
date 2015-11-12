//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 02:50:37 PM CST 
//


package com.yash.iot.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarehouseBinSensorDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseBinSensorDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sensorDataRecords" type="{http://www.example.org/WarehouseBinSensorDataRequest}BinSensorDataRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehouseBinSensorDataResponse", propOrder = {
    "sensorDataRecords"
})
public class WarehouseBinSensorDataResponse {

    protected List<BinSensorDataRecord> sensorDataRecords;

    /**
     * Gets the value of the sensorDataRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensorDataRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensorDataRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinSensorDataRecord }
     * 
     * 
     */
    public List<BinSensorDataRecord> getSensorDataRecords() {
        if (sensorDataRecords == null) {
            sensorDataRecords = new ArrayList<BinSensorDataRecord>();
        }
        return this.sensorDataRecords;
    }

}