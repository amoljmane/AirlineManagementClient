/**
 * BookingDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class BookingDetailBean  implements java.io.Serializable {
    private int booking_cancelled;

    private int booking_id;

    private int booking_status;

    private int journry_id;

    private int payment_id;

    public BookingDetailBean() {
    }

    public BookingDetailBean(
           int booking_cancelled,
           int booking_id,
           int booking_status,
           int journry_id,
           int payment_id) {
           this.booking_cancelled = booking_cancelled;
           this.booking_id = booking_id;
           this.booking_status = booking_status;
           this.journry_id = journry_id;
           this.payment_id = payment_id;
    }


    /**
     * Gets the booking_cancelled value for this BookingDetailBean.
     * 
     * @return booking_cancelled
     */
    public int getBooking_cancelled() {
        return booking_cancelled;
    }


    /**
     * Sets the booking_cancelled value for this BookingDetailBean.
     * 
     * @param booking_cancelled
     */
    public void setBooking_cancelled(int booking_cancelled) {
        this.booking_cancelled = booking_cancelled;
    }


    /**
     * Gets the booking_id value for this BookingDetailBean.
     * 
     * @return booking_id
     */
    public int getBooking_id() {
        return booking_id;
    }


    /**
     * Sets the booking_id value for this BookingDetailBean.
     * 
     * @param booking_id
     */
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }


    /**
     * Gets the booking_status value for this BookingDetailBean.
     * 
     * @return booking_status
     */
    public int getBooking_status() {
        return booking_status;
    }


    /**
     * Sets the booking_status value for this BookingDetailBean.
     * 
     * @param booking_status
     */
    public void setBooking_status(int booking_status) {
        this.booking_status = booking_status;
    }


    /**
     * Gets the journry_id value for this BookingDetailBean.
     * 
     * @return journry_id
     */
    public int getJournry_id() {
        return journry_id;
    }


    /**
     * Sets the journry_id value for this BookingDetailBean.
     * 
     * @param journry_id
     */
    public void setJournry_id(int journry_id) {
        this.journry_id = journry_id;
    }


    /**
     * Gets the payment_id value for this BookingDetailBean.
     * 
     * @return payment_id
     */
    public int getPayment_id() {
        return payment_id;
    }


    /**
     * Sets the payment_id value for this BookingDetailBean.
     * 
     * @param payment_id
     */
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingDetailBean)) return false;
        BookingDetailBean other = (BookingDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.booking_cancelled == other.getBooking_cancelled() &&
            this.booking_id == other.getBooking_id() &&
            this.booking_status == other.getBooking_status() &&
            this.journry_id == other.getJournry_id() &&
            this.payment_id == other.getPayment_id();
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
        _hashCode += getBooking_cancelled();
        _hashCode += getBooking_id();
        _hashCode += getBooking_status();
        _hashCode += getJournry_id();
        _hashCode += getPayment_id();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "BookingDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "booking_cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "booking_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "booking_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journry_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "journry_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "payment_id"));
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
