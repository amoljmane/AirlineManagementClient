/**
 * PaymentDetailsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sjsu.cmpe273.project.beans;

public class PaymentDetailsBean  implements java.io.Serializable {
    private long account_number;

    private int amount_paid;

    private long card_number;

    private boolean paymentCancelled;

    private int payment_id;

    private int payment_method;

    private int payment_status;

    public PaymentDetailsBean() {
    }

    public PaymentDetailsBean(
           long account_number,
           int amount_paid,
           long card_number,
           boolean paymentCancelled,
           int payment_id,
           int payment_method,
           int payment_status) {
           this.account_number = account_number;
           this.amount_paid = amount_paid;
           this.card_number = card_number;
           this.paymentCancelled = paymentCancelled;
           this.payment_id = payment_id;
           this.payment_method = payment_method;
           this.payment_status = payment_status;
    }


    /**
     * Gets the account_number value for this PaymentDetailsBean.
     * 
     * @return account_number
     */
    public long getAccount_number() {
        return account_number;
    }


    /**
     * Sets the account_number value for this PaymentDetailsBean.
     * 
     * @param account_number
     */
    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }


    /**
     * Gets the amount_paid value for this PaymentDetailsBean.
     * 
     * @return amount_paid
     */
    public int getAmount_paid() {
        return amount_paid;
    }


    /**
     * Sets the amount_paid value for this PaymentDetailsBean.
     * 
     * @param amount_paid
     */
    public void setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
    }


    /**
     * Gets the card_number value for this PaymentDetailsBean.
     * 
     * @return card_number
     */
    public long getCard_number() {
        return card_number;
    }


    /**
     * Sets the card_number value for this PaymentDetailsBean.
     * 
     * @param card_number
     */
    public void setCard_number(long card_number) {
        this.card_number = card_number;
    }


    /**
     * Gets the paymentCancelled value for this PaymentDetailsBean.
     * 
     * @return paymentCancelled
     */
    public boolean isPaymentCancelled() {
        return paymentCancelled;
    }


    /**
     * Sets the paymentCancelled value for this PaymentDetailsBean.
     * 
     * @param paymentCancelled
     */
    public void setPaymentCancelled(boolean paymentCancelled) {
        this.paymentCancelled = paymentCancelled;
    }


    /**
     * Gets the payment_id value for this PaymentDetailsBean.
     * 
     * @return payment_id
     */
    public int getPayment_id() {
        return payment_id;
    }


    /**
     * Sets the payment_id value for this PaymentDetailsBean.
     * 
     * @param payment_id
     */
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }


    /**
     * Gets the payment_method value for this PaymentDetailsBean.
     * 
     * @return payment_method
     */
    public int getPayment_method() {
        return payment_method;
    }


    /**
     * Sets the payment_method value for this PaymentDetailsBean.
     * 
     * @param payment_method
     */
    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }


    /**
     * Gets the payment_status value for this PaymentDetailsBean.
     * 
     * @return payment_status
     */
    public int getPayment_status() {
        return payment_status;
    }


    /**
     * Sets the payment_status value for this PaymentDetailsBean.
     * 
     * @param payment_status
     */
    public void setPayment_status(int payment_status) {
        this.payment_status = payment_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetailsBean)) return false;
        PaymentDetailsBean other = (PaymentDetailsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.account_number == other.getAccount_number() &&
            this.amount_paid == other.getAmount_paid() &&
            this.card_number == other.getCard_number() &&
            this.paymentCancelled == other.isPaymentCancelled() &&
            this.payment_id == other.getPayment_id() &&
            this.payment_method == other.getPayment_method() &&
            this.payment_status == other.getPayment_status();
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
        _hashCode += new Long(getAccount_number()).hashCode();
        _hashCode += getAmount_paid();
        _hashCode += new Long(getCard_number()).hashCode();
        _hashCode += (isPaymentCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPayment_id();
        _hashCode += getPayment_method();
        _hashCode += getPayment_status();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentDetailsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "PaymentDetailsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "account_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount_paid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "amount_paid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "card_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "paymentCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "payment_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "payment_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.project.cmpe273.sjsu", "payment_status"));
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
