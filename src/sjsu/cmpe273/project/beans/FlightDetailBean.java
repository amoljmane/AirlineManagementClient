/**
 * FlightDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class FlightDetailBean  implements java.io.Serializable {
    private int airline_id;

    private java.lang.String date_added;

    private int flight_id;

    private java.lang.String flight_name;

    private int seats;

    public FlightDetailBean() {
    }

    public FlightDetailBean(
           int airline_id,
           java.lang.String date_added,
           int flight_id,
           java.lang.String flight_name,
           int seats) {
           this.airline_id = airline_id;
           this.date_added = date_added;
           this.flight_id = flight_id;
           this.flight_name = flight_name;
           this.seats = seats;
    }


    /**
     * Gets the airline_id value for this FlightDetailBean.
     * 
     * @return airline_id
     */
    public int getAirline_id() {
        return airline_id;
    }


    /**
     * Sets the airline_id value for this FlightDetailBean.
     * 
     * @param airline_id
     */
    public void setAirline_id(int airline_id) {
        this.airline_id = airline_id;
    }


    /**
     * Gets the date_added value for this FlightDetailBean.
     * 
     * @return date_added
     */
    public java.lang.String getDate_added() {
        return date_added;
    }


    /**
     * Sets the date_added value for this FlightDetailBean.
     * 
     * @param date_added
     */
    public void setDate_added(java.lang.String date_added) {
        this.date_added = date_added;
    }


    /**
     * Gets the flight_id value for this FlightDetailBean.
     * 
     * @return flight_id
     */
    public int getFlight_id() {
        return flight_id;
    }


    /**
     * Sets the flight_id value for this FlightDetailBean.
     * 
     * @param flight_id
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }


    /**
     * Gets the flight_name value for this FlightDetailBean.
     * 
     * @return flight_name
     */
    public java.lang.String getFlight_name() {
        return flight_name;
    }


    /**
     * Sets the flight_name value for this FlightDetailBean.
     * 
     * @param flight_name
     */
    public void setFlight_name(java.lang.String flight_name) {
        this.flight_name = flight_name;
    }


    /**
     * Gets the seats value for this FlightDetailBean.
     * 
     * @return seats
     */
    public int getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this FlightDetailBean.
     * 
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightDetailBean)) return false;
        FlightDetailBean other = (FlightDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.airline_id == other.getAirline_id() &&
            ((this.date_added==null && other.getDate_added()==null) || 
             (this.date_added!=null &&
              this.date_added.equals(other.getDate_added()))) &&
            this.flight_id == other.getFlight_id() &&
            ((this.flight_name==null && other.getFlight_name()==null) || 
             (this.flight_name!=null &&
              this.flight_name.equals(other.getFlight_name()))) &&
            this.seats == other.getSeats();
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
        _hashCode += getAirline_id();
        if (getDate_added() != null) {
            _hashCode += getDate_added().hashCode();
        }
        _hashCode += getFlight_id();
        if (getFlight_name() != null) {
            _hashCode += getFlight_name().hashCode();
        }
        _hashCode += getSeats();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "FlightDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "airline_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_added");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "date_added"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flight_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flight_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
