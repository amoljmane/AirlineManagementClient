/**
 * UserBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class UserBean  implements java.io.Serializable {
    private sjsu.cmpe273.project.beans.AirlineEmployeeBean employeeBean;

    private sjsu.cmpe273.project.beans.PersonBean person;

    private sjsu.cmpe273.project.beans.TravelerBean traveler;

    public UserBean() {
    }

    public UserBean(
           sjsu.cmpe273.project.beans.AirlineEmployeeBean employeeBean,
           sjsu.cmpe273.project.beans.PersonBean person,
           sjsu.cmpe273.project.beans.TravelerBean traveler) {
           this.employeeBean = employeeBean;
           this.person = person;
           this.traveler = traveler;
    }


    /**
     * Gets the employeeBean value for this UserBean.
     * 
     * @return employeeBean
     */
    public sjsu.cmpe273.project.beans.AirlineEmployeeBean getEmployeeBean() {
        return employeeBean;
    }


    /**
     * Sets the employeeBean value for this UserBean.
     * 
     * @param employeeBean
     */
    public void setEmployeeBean(sjsu.cmpe273.project.beans.AirlineEmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }


    /**
     * Gets the person value for this UserBean.
     * 
     * @return person
     */
    public sjsu.cmpe273.project.beans.PersonBean getPerson() {
        return person;
    }


    /**
     * Sets the person value for this UserBean.
     * 
     * @param person
     */
    public void setPerson(sjsu.cmpe273.project.beans.PersonBean person) {
        this.person = person;
    }


    /**
     * Gets the traveler value for this UserBean.
     * 
     * @return traveler
     */
    public sjsu.cmpe273.project.beans.TravelerBean getTraveler() {
        return traveler;
    }


    /**
     * Sets the traveler value for this UserBean.
     * 
     * @param traveler
     */
    public void setTraveler(sjsu.cmpe273.project.beans.TravelerBean traveler) {
        this.traveler = traveler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserBean)) return false;
        UserBean other = (UserBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeBean==null && other.getEmployeeBean()==null) || 
             (this.employeeBean!=null &&
              this.employeeBean.equals(other.getEmployeeBean()))) &&
            ((this.person==null && other.getPerson()==null) || 
             (this.person!=null &&
              this.person.equals(other.getPerson()))) &&
            ((this.traveler==null && other.getTraveler()==null) || 
             (this.traveler!=null &&
              this.traveler.equals(other.getTraveler())));
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
        if (getEmployeeBean() != null) {
            _hashCode += getEmployeeBean().hashCode();
        }
        if (getPerson() != null) {
            _hashCode += getPerson().hashCode();
        }
        if (getTraveler() != null) {
            _hashCode += getTraveler().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "UserBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "employeeBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "AirlineEmployeeBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "person"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PersonBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traveler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "traveler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "TravelerBean"));
        elemField.setNillable(true);
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
