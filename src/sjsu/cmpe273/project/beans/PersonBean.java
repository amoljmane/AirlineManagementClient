/**
 * PersonBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class PersonBean  implements java.io.Serializable {
    private java.lang.String address_line1;

    private java.lang.String address_line2;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String dob;

    private java.lang.String email_address;

    private java.lang.String first_name;

    private java.lang.String last_name;

    private java.lang.String passport_number;

    private int person_deleted;

    private int person_id;

    private int person_type;

    private java.lang.String state;

    private java.lang.String zip_code;

    public PersonBean() {
    }

    public PersonBean(
           java.lang.String address_line1,
           java.lang.String address_line2,
           java.lang.String city,
           java.lang.String country,
           java.lang.String dob,
           java.lang.String email_address,
           java.lang.String first_name,
           java.lang.String last_name,
           java.lang.String passport_number,
           int person_deleted,
           int person_id,
           int person_type,
           java.lang.String state,
           java.lang.String zip_code) {
           this.address_line1 = address_line1;
           this.address_line2 = address_line2;
           this.city = city;
           this.country = country;
           this.dob = dob;
           this.email_address = email_address;
           this.first_name = first_name;
           this.last_name = last_name;
           this.passport_number = passport_number;
           this.person_deleted = person_deleted;
           this.person_id = person_id;
           this.person_type = person_type;
           this.state = state;
           this.zip_code = zip_code;
    }


    /**
     * Gets the address_line1 value for this PersonBean.
     * 
     * @return address_line1
     */
    public java.lang.String getAddress_line1() {
        return address_line1;
    }


    /**
     * Sets the address_line1 value for this PersonBean.
     * 
     * @param address_line1
     */
    public void setAddress_line1(java.lang.String address_line1) {
        this.address_line1 = address_line1;
    }


    /**
     * Gets the address_line2 value for this PersonBean.
     * 
     * @return address_line2
     */
    public java.lang.String getAddress_line2() {
        return address_line2;
    }


    /**
     * Sets the address_line2 value for this PersonBean.
     * 
     * @param address_line2
     */
    public void setAddress_line2(java.lang.String address_line2) {
        this.address_line2 = address_line2;
    }


    /**
     * Gets the city value for this PersonBean.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PersonBean.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this PersonBean.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PersonBean.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the dob value for this PersonBean.
     * 
     * @return dob
     */
    public java.lang.String getDob() {
        return dob;
    }


    /**
     * Sets the dob value for this PersonBean.
     * 
     * @param dob
     */
    public void setDob(java.lang.String dob) {
        this.dob = dob;
    }


    /**
     * Gets the email_address value for this PersonBean.
     * 
     * @return email_address
     */
    public java.lang.String getEmail_address() {
        return email_address;
    }


    /**
     * Sets the email_address value for this PersonBean.
     * 
     * @param email_address
     */
    public void setEmail_address(java.lang.String email_address) {
        this.email_address = email_address;
    }


    /**
     * Gets the first_name value for this PersonBean.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this PersonBean.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the last_name value for this PersonBean.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this PersonBean.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the passport_number value for this PersonBean.
     * 
     * @return passport_number
     */
    public java.lang.String getPassport_number() {
        return passport_number;
    }


    /**
     * Sets the passport_number value for this PersonBean.
     * 
     * @param passport_number
     */
    public void setPassport_number(java.lang.String passport_number) {
        this.passport_number = passport_number;
    }


    /**
     * Gets the person_deleted value for this PersonBean.
     * 
     * @return person_deleted
     */
    public int getPerson_deleted() {
        return person_deleted;
    }


    /**
     * Sets the person_deleted value for this PersonBean.
     * 
     * @param person_deleted
     */
    public void setPerson_deleted(int person_deleted) {
        this.person_deleted = person_deleted;
    }


    /**
     * Gets the person_id value for this PersonBean.
     * 
     * @return person_id
     */
    public int getPerson_id() {
        return person_id;
    }


    /**
     * Sets the person_id value for this PersonBean.
     * 
     * @param person_id
     */
    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }


    /**
     * Gets the person_type value for this PersonBean.
     * 
     * @return person_type
     */
    public int getPerson_type() {
        return person_type;
    }


    /**
     * Sets the person_type value for this PersonBean.
     * 
     * @param person_type
     */
    public void setPerson_type(int person_type) {
        this.person_type = person_type;
    }


    /**
     * Gets the state value for this PersonBean.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this PersonBean.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip_code value for this PersonBean.
     * 
     * @return zip_code
     */
    public java.lang.String getZip_code() {
        return zip_code;
    }


    /**
     * Sets the zip_code value for this PersonBean.
     * 
     * @param zip_code
     */
    public void setZip_code(java.lang.String zip_code) {
        this.zip_code = zip_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonBean)) return false;
        PersonBean other = (PersonBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address_line1==null && other.getAddress_line1()==null) || 
             (this.address_line1!=null &&
              this.address_line1.equals(other.getAddress_line1()))) &&
            ((this.address_line2==null && other.getAddress_line2()==null) || 
             (this.address_line2!=null &&
              this.address_line2.equals(other.getAddress_line2()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.dob==null && other.getDob()==null) || 
             (this.dob!=null &&
              this.dob.equals(other.getDob()))) &&
            ((this.email_address==null && other.getEmail_address()==null) || 
             (this.email_address!=null &&
              this.email_address.equals(other.getEmail_address()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.passport_number==null && other.getPassport_number()==null) || 
             (this.passport_number!=null &&
              this.passport_number.equals(other.getPassport_number()))) &&
            this.person_deleted == other.getPerson_deleted() &&
            this.person_id == other.getPerson_id() &&
            this.person_type == other.getPerson_type() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip_code==null && other.getZip_code()==null) || 
             (this.zip_code!=null &&
              this.zip_code.equals(other.getZip_code())));
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
        if (getAddress_line1() != null) {
            _hashCode += getAddress_line1().hashCode();
        }
        if (getAddress_line2() != null) {
            _hashCode += getAddress_line2().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDob() != null) {
            _hashCode += getDob().hashCode();
        }
        if (getEmail_address() != null) {
            _hashCode += getEmail_address().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getPassport_number() != null) {
            _hashCode += getPassport_number().hashCode();
        }
        _hashCode += getPerson_deleted();
        _hashCode += getPerson_id();
        _hashCode += getPerson_type();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip_code() != null) {
            _hashCode += getZip_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PersonBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "address_line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_line2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "address_line2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "dob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "email_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "passport_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("person_deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "person_deleted"));
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
        elemField.setFieldName("person_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "person_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "zip_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
