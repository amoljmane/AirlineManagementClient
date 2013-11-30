/**
 * PassengerBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class PassengerBean  implements java.io.Serializable {
    private sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean;

    private sjsu.cmpe273.project.beans.PersonBean[] passengers;

    public PassengerBean() {
    }

    public PassengerBean(
           sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean,
           sjsu.cmpe273.project.beans.PersonBean[] passengers) {
           this.flightDetailBean = flightDetailBean;
           this.passengers = passengers;
    }


    /**
     * Gets the flightDetailBean value for this PassengerBean.
     * 
     * @return flightDetailBean
     */
    public sjsu.cmpe273.project.beans.FlightDetailBean getFlightDetailBean() {
        return flightDetailBean;
    }


    /**
     * Sets the flightDetailBean value for this PassengerBean.
     * 
     * @param flightDetailBean
     */
    public void setFlightDetailBean(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) {
        this.flightDetailBean = flightDetailBean;
    }


    /**
     * Gets the passengers value for this PassengerBean.
     * 
     * @return passengers
     */
    public sjsu.cmpe273.project.beans.PersonBean[] getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this PassengerBean.
     * 
     * @param passengers
     */
    public void setPassengers(sjsu.cmpe273.project.beans.PersonBean[] passengers) {
        this.passengers = passengers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerBean)) return false;
        PassengerBean other = (PassengerBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightDetailBean==null && other.getFlightDetailBean()==null) || 
             (this.flightDetailBean!=null &&
              this.flightDetailBean.equals(other.getFlightDetailBean()))) &&
            ((this.passengers==null && other.getPassengers()==null) || 
             (this.passengers!=null &&
              java.util.Arrays.equals(this.passengers, other.getPassengers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFlightDetailBean() != null) {
            _hashCode += getFlightDetailBean().hashCode();
        }
        if (getPassengers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassengerBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PassengerBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightDetailBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flightDetailBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "FlightDetailBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PersonBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.project.cmpe273.sjsu", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
