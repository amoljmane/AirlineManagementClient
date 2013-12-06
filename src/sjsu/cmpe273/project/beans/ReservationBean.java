/**
 * ReservationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class ReservationBean  implements java.io.Serializable {
    private java.lang.String arrivalTime;

    private int bookingId;

    private java.lang.String bookingStatus;

    private java.lang.String customerName;

    private java.lang.String departureTime;

    private java.lang.String destinationAirport;

    private java.lang.String paymentstatus;

    private java.lang.String sourceAirport;

    public ReservationBean() {
    }

    public ReservationBean(
           java.lang.String arrivalTime,
           int bookingId,
           java.lang.String bookingStatus,
           java.lang.String customerName,
           java.lang.String departureTime,
           java.lang.String destinationAirport,
           java.lang.String paymentstatus,
           java.lang.String sourceAirport) {
           this.arrivalTime = arrivalTime;
           this.bookingId = bookingId;
           this.bookingStatus = bookingStatus;
           this.customerName = customerName;
           this.departureTime = departureTime;
           this.destinationAirport = destinationAirport;
           this.paymentstatus = paymentstatus;
           this.sourceAirport = sourceAirport;
    }


    /**
     * Gets the arrivalTime value for this ReservationBean.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this ReservationBean.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the bookingId value for this ReservationBean.
     * 
     * @return bookingId
     */
    public int getBookingId() {
        return bookingId;
    }


    /**
     * Sets the bookingId value for this ReservationBean.
     * 
     * @param bookingId
     */
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }


    /**
     * Gets the bookingStatus value for this ReservationBean.
     * 
     * @return bookingStatus
     */
    public java.lang.String getBookingStatus() {
        return bookingStatus;
    }


    /**
     * Sets the bookingStatus value for this ReservationBean.
     * 
     * @param bookingStatus
     */
    public void setBookingStatus(java.lang.String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }


    /**
     * Gets the customerName value for this ReservationBean.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ReservationBean.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the departureTime value for this ReservationBean.
     * 
     * @return departureTime
     */
    public java.lang.String getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this ReservationBean.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.lang.String departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the destinationAirport value for this ReservationBean.
     * 
     * @return destinationAirport
     */
    public java.lang.String getDestinationAirport() {
        return destinationAirport;
    }


    /**
     * Sets the destinationAirport value for this ReservationBean.
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(java.lang.String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }


    /**
     * Gets the paymentstatus value for this ReservationBean.
     * 
     * @return paymentstatus
     */
    public java.lang.String getPaymentstatus() {
        return paymentstatus;
    }


    /**
     * Sets the paymentstatus value for this ReservationBean.
     * 
     * @param paymentstatus
     */
    public void setPaymentstatus(java.lang.String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }


    /**
     * Gets the sourceAirport value for this ReservationBean.
     * 
     * @return sourceAirport
     */
    public java.lang.String getSourceAirport() {
        return sourceAirport;
    }


    /**
     * Sets the sourceAirport value for this ReservationBean.
     * 
     * @param sourceAirport
     */
    public void setSourceAirport(java.lang.String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationBean)) return false;
        ReservationBean other = (ReservationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            this.bookingId == other.getBookingId() &&
            ((this.bookingStatus==null && other.getBookingStatus()==null) || 
             (this.bookingStatus!=null &&
              this.bookingStatus.equals(other.getBookingStatus()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.destinationAirport==null && other.getDestinationAirport()==null) || 
             (this.destinationAirport!=null &&
              this.destinationAirport.equals(other.getDestinationAirport()))) &&
            ((this.paymentstatus==null && other.getPaymentstatus()==null) || 
             (this.paymentstatus!=null &&
              this.paymentstatus.equals(other.getPaymentstatus()))) &&
            ((this.sourceAirport==null && other.getSourceAirport()==null) || 
             (this.sourceAirport!=null &&
              this.sourceAirport.equals(other.getSourceAirport())));
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
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        _hashCode += getBookingId();
        if (getBookingStatus() != null) {
            _hashCode += getBookingStatus().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getDestinationAirport() != null) {
            _hashCode += getDestinationAirport().hashCode();
        }
        if (getPaymentstatus() != null) {
            _hashCode += getPaymentstatus().hashCode();
        }
        if (getSourceAirport() != null) {
            _hashCode += getSourceAirport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ReservationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "bookingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "bookingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "destinationAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "paymentstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "sourceAirport"));
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
