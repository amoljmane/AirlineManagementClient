/**
 * ReservationLists.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class ReservationLists  implements java.io.Serializable {
    private sjsu.cmpe273.project.beans.ReservationBean[] activeReservations;

    private sjsu.cmpe273.project.beans.ReservationBean[] cancelledReservations;

    public ReservationLists() {
    }

    public ReservationLists(
           sjsu.cmpe273.project.beans.ReservationBean[] activeReservations,
           sjsu.cmpe273.project.beans.ReservationBean[] cancelledReservations) {
           this.activeReservations = activeReservations;
           this.cancelledReservations = cancelledReservations;
    }


    /**
     * Gets the activeReservations value for this ReservationLists.
     * 
     * @return activeReservations
     */
    public sjsu.cmpe273.project.beans.ReservationBean[] getActiveReservations() {
        return activeReservations;
    }


    /**
     * Sets the activeReservations value for this ReservationLists.
     * 
     * @param activeReservations
     */
    public void setActiveReservations(sjsu.cmpe273.project.beans.ReservationBean[] activeReservations) {
        this.activeReservations = activeReservations;
    }


    /**
     * Gets the cancelledReservations value for this ReservationLists.
     * 
     * @return cancelledReservations
     */
    public sjsu.cmpe273.project.beans.ReservationBean[] getCancelledReservations() {
        return cancelledReservations;
    }


    /**
     * Sets the cancelledReservations value for this ReservationLists.
     * 
     * @param cancelledReservations
     */
    public void setCancelledReservations(sjsu.cmpe273.project.beans.ReservationBean[] cancelledReservations) {
        this.cancelledReservations = cancelledReservations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReservationLists)) return false;
        ReservationLists other = (ReservationLists) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activeReservations==null && other.getActiveReservations()==null) || 
             (this.activeReservations!=null &&
              java.util.Arrays.equals(this.activeReservations, other.getActiveReservations()))) &&
            ((this.cancelledReservations==null && other.getCancelledReservations()==null) || 
             (this.cancelledReservations!=null &&
              java.util.Arrays.equals(this.cancelledReservations, other.getCancelledReservations())));
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
        if (getActiveReservations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveReservations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveReservations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCancelledReservations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelledReservations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelledReservations(), i);
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
        new org.apache.axis.description.TypeDesc(ReservationLists.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ReservationLists"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeReservations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "activeReservations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ReservationBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://service.project.cmpe273.sjsu", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledReservations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "cancelledReservations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "ReservationBean"));
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
