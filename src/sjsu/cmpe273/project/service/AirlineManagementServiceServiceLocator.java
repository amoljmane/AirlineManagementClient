/**
 * AirlineManagementServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.service;

public class AirlineManagementServiceServiceLocator extends org.apache.axis.client.Service implements sjsu.cmpe273.project.service.AirlineManagementServiceService {

    public AirlineManagementServiceServiceLocator() {
    }


    public AirlineManagementServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AirlineManagementServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AirlineManagementService
    private java.lang.String AirlineManagementService_address = "http://localhost:8080/AirlineManagementService/services/AirlineManagementService";

    public java.lang.String getAirlineManagementServiceAddress() {
        return AirlineManagementService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AirlineManagementServiceWSDDServiceName = "AirlineManagementService";

    public java.lang.String getAirlineManagementServiceWSDDServiceName() {
        return AirlineManagementServiceWSDDServiceName;
    }

    public void setAirlineManagementServiceWSDDServiceName(java.lang.String name) {
        AirlineManagementServiceWSDDServiceName = name;
    }

    public sjsu.cmpe273.project.service.AirlineManagementService getAirlineManagementService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AirlineManagementService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAirlineManagementService(endpoint);
    }

    public sjsu.cmpe273.project.service.AirlineManagementService getAirlineManagementService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sjsu.cmpe273.project.service.AirlineManagementServiceSoapBindingStub _stub = new sjsu.cmpe273.project.service.AirlineManagementServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAirlineManagementServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAirlineManagementServiceEndpointAddress(java.lang.String address) {
        AirlineManagementService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sjsu.cmpe273.project.service.AirlineManagementService.class.isAssignableFrom(serviceEndpointInterface)) {
                sjsu.cmpe273.project.service.AirlineManagementServiceSoapBindingStub _stub = new sjsu.cmpe273.project.service.AirlineManagementServiceSoapBindingStub(new java.net.URL(AirlineManagementService_address), this);
                _stub.setPortName(getAirlineManagementServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AirlineManagementService".equals(inputPortName)) {
            return getAirlineManagementService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.project.cmpe273.sjsu", "AirlineManagementServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.project.cmpe273.sjsu", "AirlineManagementService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AirlineManagementService".equals(portName)) {
            setAirlineManagementServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
