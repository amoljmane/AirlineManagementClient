/**
 * TravelerBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class TravelerBean  implements java.io.Serializable {
    private int booking_id;

    private int person_id;

    private int ssn;

    private int ticket_id;

    public TravelerBean() {
    }

    public TravelerBean(
           int booking_id,
           int person_id,
           int ssn,
           int ticket_id) {
           this.booking_id = booking_id;
           this.person_id = person_id;
           this.ssn = ssn;
           this.ticket_id = ticket_id;
    }


    /**
     * Gets the booking_id value for this TravelerBean.
     * 
     * @return booking_id
     */
    public int getBooking_id() {
        return booking_id;
    }


    /**
     * Sets the booking_id value for this TravelerBean.
     * 
     * @param booking_id
     */
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }


    /**
     * Gets the person_id value for this TravelerBean.
     * 
     * @return person_id
     */
    public int getPerson_id() {
        return person_id;
    }


    /**
     * Sets the person_id value for this TravelerBean.
     * 
     * @param person_id
     */
    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }


    /**
     * Gets the ssn value for this TravelerBean.
     * 
     * @return ssn
     */
    public int getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this TravelerBean.
     * 
     * @param ssn
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the ticket_id value for this TravelerBean.
     * 
     * @return ticket_id
     */
    public int getTicket_id() {
        return ticket_id;
    }


    /**
     * Sets the ticket_id value for this TravelerBean.
     * 
     * @param ticket_id
     */
    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerBean)) return false;
        TravelerBean other = (TravelerBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.booking_id == other.getBooking_id() &&
            this.person_id == other.getPerson_id() &&
            this.ssn == other.getSsn() &&
            this.ticket_id == other.getTicket_id();
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
        _hashCode += getBooking_id();
        _hashCode += getPerson_id();
        _hashCode += getSsn();
        _hashCode += getTicket_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "TravelerBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "booking_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "person_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ssn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ticket_id"));
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
