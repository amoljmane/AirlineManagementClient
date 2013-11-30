/**
 * JourneyDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class JourneyDetailBean  implements java.io.Serializable {
    private java.lang.String arrival_time;

    private java.lang.String departure_time;

    private int flight_destination;

    private int flight_id;

    private int flight_source;

    private int journey_id;

    private int seats_available;

    private int seats_booked;

    private float ticket_price;

    public JourneyDetailBean() {
    }

    public JourneyDetailBean(
           java.lang.String arrival_time,
           java.lang.String departure_time,
           int flight_destination,
           int flight_id,
           int flight_source,
           int journey_id,
           int seats_available,
           int seats_booked,
           float ticket_price) {
           this.arrival_time = arrival_time;
           this.departure_time = departure_time;
           this.flight_destination = flight_destination;
           this.flight_id = flight_id;
           this.flight_source = flight_source;
           this.journey_id = journey_id;
           this.seats_available = seats_available;
           this.seats_booked = seats_booked;
           this.ticket_price = ticket_price;
    }


    /**
     * Gets the arrival_time value for this JourneyDetailBean.
     * 
     * @return arrival_time
     */
    public java.lang.String getArrival_time() {
        return arrival_time;
    }


    /**
     * Sets the arrival_time value for this JourneyDetailBean.
     * 
     * @param arrival_time
     */
    public void setArrival_time(java.lang.String arrival_time) {
        this.arrival_time = arrival_time;
    }


    /**
     * Gets the departure_time value for this JourneyDetailBean.
     * 
     * @return departure_time
     */
    public java.lang.String getDeparture_time() {
        return departure_time;
    }


    /**
     * Sets the departure_time value for this JourneyDetailBean.
     * 
     * @param departure_time
     */
    public void setDeparture_time(java.lang.String departure_time) {
        this.departure_time = departure_time;
    }


    /**
     * Gets the flight_destination value for this JourneyDetailBean.
     * 
     * @return flight_destination
     */
    public int getFlight_destination() {
        return flight_destination;
    }


    /**
     * Sets the flight_destination value for this JourneyDetailBean.
     * 
     * @param flight_destination
     */
    public void setFlight_destination(int flight_destination) {
        this.flight_destination = flight_destination;
    }


    /**
     * Gets the flight_id value for this JourneyDetailBean.
     * 
     * @return flight_id
     */
    public int getFlight_id() {
        return flight_id;
    }


    /**
     * Sets the flight_id value for this JourneyDetailBean.
     * 
     * @param flight_id
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }


    /**
     * Gets the flight_source value for this JourneyDetailBean.
     * 
     * @return flight_source
     */
    public int getFlight_source() {
        return flight_source;
    }


    /**
     * Sets the flight_source value for this JourneyDetailBean.
     * 
     * @param flight_source
     */
    public void setFlight_source(int flight_source) {
        this.flight_source = flight_source;
    }


    /**
     * Gets the journey_id value for this JourneyDetailBean.
     * 
     * @return journey_id
     */
    public int getJourney_id() {
        return journey_id;
    }


    /**
     * Sets the journey_id value for this JourneyDetailBean.
     * 
     * @param journey_id
     */
    public void setJourney_id(int journey_id) {
        this.journey_id = journey_id;
    }


    /**
     * Gets the seats_available value for this JourneyDetailBean.
     * 
     * @return seats_available
     */
    public int getSeats_available() {
        return seats_available;
    }


    /**
     * Sets the seats_available value for this JourneyDetailBean.
     * 
     * @param seats_available
     */
    public void setSeats_available(int seats_available) {
        this.seats_available = seats_available;
    }


    /**
     * Gets the seats_booked value for this JourneyDetailBean.
     * 
     * @return seats_booked
     */
    public int getSeats_booked() {
        return seats_booked;
    }


    /**
     * Sets the seats_booked value for this JourneyDetailBean.
     * 
     * @param seats_booked
     */
    public void setSeats_booked(int seats_booked) {
        this.seats_booked = seats_booked;
    }


    /**
     * Gets the ticket_price value for this JourneyDetailBean.
     * 
     * @return ticket_price
     */
    public float getTicket_price() {
        return ticket_price;
    }


    /**
     * Sets the ticket_price value for this JourneyDetailBean.
     * 
     * @param ticket_price
     */
    public void setTicket_price(float ticket_price) {
        this.ticket_price = ticket_price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JourneyDetailBean)) return false;
        JourneyDetailBean other = (JourneyDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrival_time==null && other.getArrival_time()==null) || 
             (this.arrival_time!=null &&
              this.arrival_time.equals(other.getArrival_time()))) &&
            ((this.departure_time==null && other.getDeparture_time()==null) || 
             (this.departure_time!=null &&
              this.departure_time.equals(other.getDeparture_time()))) &&
            this.flight_destination == other.getFlight_destination() &&
            this.flight_id == other.getFlight_id() &&
            this.flight_source == other.getFlight_source() &&
            this.journey_id == other.getJourney_id() &&
            this.seats_available == other.getSeats_available() &&
            this.seats_booked == other.getSeats_booked() &&
            this.ticket_price == other.getTicket_price();
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
        if (getArrival_time() != null) {
            _hashCode += getArrival_time().hashCode();
        }
        if (getDeparture_time() != null) {
            _hashCode += getDeparture_time().hashCode();
        }
        _hashCode += getFlight_destination();
        _hashCode += getFlight_id();
        _hashCode += getFlight_source();
        _hashCode += getJourney_id();
        _hashCode += getSeats_available();
        _hashCode += getSeats_booked();
        _hashCode += new Float(getTicket_price()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JourneyDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "JourneyDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrival_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "arrival_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departure_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "departure_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flight_destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flight_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flight_source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "flight_source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journey_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "journey_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "seats_available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats_booked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "seats_booked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ticket_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
