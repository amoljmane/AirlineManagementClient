/**
 * ReservationDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class ReservationDetailBean  implements java.io.Serializable {
    private sjsu.cmpe273.project.beans.BookingDetailBean bookingDetailBean;

    private sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean;

    private sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean;

    private sjsu.cmpe273.project.beans.PersonBean personBean;

    private sjsu.cmpe273.project.beans.TravelerBean travelerBean;

    public ReservationDetailBean() {
    }

    public ReservationDetailBean(
           sjsu.cmpe273.project.beans.BookingDetailBean bookingDetailBean,
           sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean,
           sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean,
           sjsu.cmpe273.project.beans.PersonBean personBean,
           sjsu.cmpe273.project.beans.TravelerBean travelerBean) {
           this.bookingDetailBean = bookingDetailBean;
           this.flightDetailBean = flightDetailBean;
           this.journeyDetailBean = journeyDetailBean;
           this.personBean = personBean;
           this.travelerBean = travelerBean;
    }


    /**
     * Gets the bookingDetailBean value for this ReservationDetailBean.
     * 
     * @return bookingDetailBean
     */
    public sjsu.cmpe273.project.beans.BookingDetailBean getBookingDetailBean() {
        return bookingDetailBean;
    }


    /**
     * Sets the bookingDetailBean value for this ReservationDetailBean.
     * 
     * @param bookingDetailBean
     */
    public void setBookingDetailBean(sjsu.cmpe273.project.beans.BookingDetailBean bookingDetailBean) {
        this.bookingDetailBean = bookingDetailBean;
    }


    /**
     * Gets the flightDetailBean value for this ReservationDetailBean.
     * 
     * @return flightDetailBean
     */
    public sjsu.cmpe273.project.beans.FlightDetailBean getFlightDetailBean() {
        return flightDetailBean;
    }


    /**
     * Sets the flightDetailBean value for this ReservationDetailBean.
     * 
     * @param flightDetailBean
     */
    public void setFlightDetailBean(sjsu.cmpe273.project.beans.FlightDetailBean flightDetailBean) {
        this.flightDetailBean = flightDetailBean;
    }


    /**
     * Gets the journeyDetailBean value for this ReservationDetailBean.
     * 
     * @return journeyDetailBean
     */
    public sjsu.cmpe273.project.beans.JourneyDetailBean getJourneyDetailBean() {
        return journeyDetailBean;
    }


    /**
     * Sets the journeyDetailBean value for this ReservationDetailBean.
     * 
     * @param journeyDetailBean
     */
    public void setJourneyDetailBean(sjsu.cmpe273.project.beans.JourneyDetailBean journeyDetailBean) {
        this.journeyDetailBean = journeyDetailBean;
    }


    /**
     * Gets the personBean value for this ReservationDetailBean.
     * 
     * @return personBean
     */
    public sjsu.cmpe273.project.beans.PersonBean getPersonBean() {
        return personBean;
    }


    /**
     * Sets the personBean value for this ReservationDetailBean.
     * 
     * @param personBean
     */
    public void setPersonBean(sjsu.cmpe273.project.beans.PersonBean personBean) {
        this.personBean = personBean;
    }


    /**
     * Gets the travelerBean value for this ReservationDetailBean.
     * 
     * @return travelerBean
     */
    public sjsu.cmpe273.project.beans.TravelerBean getTravelerBean() {
        return travelerBean;
    }


    /**
     * Sets the travelerBean value for this ReservationDetailBean.
     * 
     * @param travelerBean
     */
    public void setTravelerBean(sjsu.cmpe273.project.beans.TravelerBean travelerBean) {
        this.travelerBean = travelerBean;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationDetailBean)) return false;
        ReservationDetailBean other = (ReservationDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingDetailBean==null && other.getBookingDetailBean()==null) || 
             (this.bookingDetailBean!=null &&
              this.bookingDetailBean.equals(other.getBookingDetailBean()))) &&
            ((this.flightDetailBean==null && other.getFlightDetailBean()==null) || 
             (this.flightDetailBean!=null &&
              this.flightDetailBean.equals(other.getFlightDetailBean()))) &&
            ((this.journeyDetailBean==null && other.getJourneyDetailBean()==null) || 
             (this.journeyDetailBean!=null &&
              this.journeyDetailBean.equals(other.getJourneyDetailBean()))) &&
            ((this.personBean==null && other.getPersonBean()==null) || 
             (this.personBean!=null &&
              this.personBean.equals(other.getPersonBean()))) &&
            ((this.travelerBean==null && other.getTravelerBean()==null) || 
             (this.travelerBean!=null &&
              this.travelerBean.equals(other.getTravelerBean())));
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
        if (getBookingDetailBean() != null) {
            _hashCode += getBookingDetailBean().hashCode();
        }
        if (getFlightDetailBean() != null) {
            _hashCode += getFlightDetailBean().hashCode();
        }
        if (getJourneyDetailBean() != null) {
            _hashCode += getJourneyDetailBean().hashCode();
        }
        if (getPersonBean() != null) {
            _hashCode += getPersonBean().hashCode();
        }
        if (getTravelerBean() != null) {
            _hashCode += getTravelerBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ReservationDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingDetailBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "bookingDetailBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "BookingDetailBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightDetailBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flightDetailBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "FlightDetailBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyDetailBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "journeyDetailBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "JourneyDetailBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "personBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PersonBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelerBean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "travelerBean"));
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
