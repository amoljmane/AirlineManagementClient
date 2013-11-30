/**
 * AirlineEmployeeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class AirlineEmployeeBean  implements java.io.Serializable {
    private int designation;

    private java.lang.String joining_date;

    private int person_id;

    private int ssn;

    public AirlineEmployeeBean() {
    }

    public AirlineEmployeeBean(
           int designation,
           java.lang.String joining_date,
           int person_id,
           int ssn) {
           this.designation = designation;
           this.joining_date = joining_date;
           this.person_id = person_id;
           this.ssn = ssn;
    }


    /**
     * Gets the designation value for this AirlineEmployeeBean.
     * 
     * @return designation
     */
    public int getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this AirlineEmployeeBean.
     * 
     * @param designation
     */
    public void setDesignation(int designation) {
        this.designation = designation;
    }


    /**
     * Gets the joining_date value for this AirlineEmployeeBean.
     * 
     * @return joining_date
     */
    public java.lang.String getJoining_date() {
        return joining_date;
    }


    /**
     * Sets the joining_date value for this AirlineEmployeeBean.
     * 
     * @param joining_date
     */
    public void setJoining_date(java.lang.String joining_date) {
        this.joining_date = joining_date;
    }


    /**
     * Gets the person_id value for this AirlineEmployeeBean.
     * 
     * @return person_id
     */
    public int getPerson_id() {
        return person_id;
    }


    /**
     * Sets the person_id value for this AirlineEmployeeBean.
     * 
     * @param person_id
     */
    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }


    /**
     * Gets the ssn value for this AirlineEmployeeBean.
     * 
     * @return ssn
     */
    public int getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this AirlineEmployeeBean.
     * 
     * @param ssn
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineEmployeeBean)) return false;
        AirlineEmployeeBean other = (AirlineEmployeeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.designation == other.getDesignation() &&
            ((this.joining_date==null && other.getJoining_date()==null) || 
             (this.joining_date!=null &&
              this.joining_date.equals(other.getJoining_date()))) &&
            this.person_id == other.getPerson_id() &&
            this.ssn == other.getSsn();
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
        _hashCode += getDesignation();
        if (getJoining_date() != null) {
            _hashCode += getJoining_date().hashCode();
        }
        _hashCode += getPerson_id();
        _hashCode += getSsn();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineEmployeeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "AirlineEmployeeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "designation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("joining_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "joining_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
