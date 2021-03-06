//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.15 at 06:12:21 AM CST 
//


package com.yash.iot.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yash.iot.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWarehouseBinSensorDataRequest_QNAME = new QName("http://www.iot.yash.com/WarehouseBinSensorData", "GetWarehouseBinSensorDataRequest");
    private final static QName _GetWarehouseBinSensorDataResponse_QNAME = new QName("http://www.iot.yash.com/WarehouseBinSensorData", "GetWarehouseBinSensorDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yash.iot.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWarehouseBinSensorDataRequest }
     * 
     */
    public GetWarehouseBinSensorDataRequest createGetWarehouseBinSensorDataRequest() {
        return new GetWarehouseBinSensorDataRequest();
    }

    /**
     * Create an instance of {@link GetWarehouseBinSensorDataResponse }
     * 
     */
    public GetWarehouseBinSensorDataResponse createGetWarehouseBinSensorDataResponse() {
        return new GetWarehouseBinSensorDataResponse();
    }

    /**
     * Create an instance of {@link BinSensorDataRecord }
     * 
     */
    public BinSensorDataRecord createBinSensorDataRecord() {
        return new BinSensorDataRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWarehouseBinSensorDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iot.yash.com/WarehouseBinSensorData", name = "GetWarehouseBinSensorDataRequest")
    public JAXBElement<GetWarehouseBinSensorDataRequest> createGetWarehouseBinSensorDataRequest(GetWarehouseBinSensorDataRequest value) {
        return new JAXBElement<GetWarehouseBinSensorDataRequest>(_GetWarehouseBinSensorDataRequest_QNAME, GetWarehouseBinSensorDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWarehouseBinSensorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iot.yash.com/WarehouseBinSensorData", name = "GetWarehouseBinSensorDataResponse")
    public JAXBElement<GetWarehouseBinSensorDataResponse> createGetWarehouseBinSensorDataResponse(GetWarehouseBinSensorDataResponse value) {
        return new JAXBElement<GetWarehouseBinSensorDataResponse>(_GetWarehouseBinSensorDataResponse_QNAME, GetWarehouseBinSensorDataResponse.class, null, value);
    }

}
