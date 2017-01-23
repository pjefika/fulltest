/**
 * GetSwitchInfoByFilterIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class GetSwitchInfoByFilterIn  implements java.io.Serializable {
    private java.lang.String switchName;

    private java.lang.String switchType;

    private java.lang.String correspondingIMS;

    private java.lang.String numero;

    public GetSwitchInfoByFilterIn() {
    }

    public GetSwitchInfoByFilterIn(
           java.lang.String switchName,
           java.lang.String switchType,
           java.lang.String correspondingIMS,
           java.lang.String numero) {
           this.switchName = switchName;
           this.switchType = switchType;
           this.correspondingIMS = correspondingIMS;
           this.numero = numero;
    }


    /**
     * Gets the switchName value for this GetSwitchInfoByFilterIn.
     * 
     * @return switchName
     */
    public java.lang.String getSwitchName() {
        return switchName;
    }


    /**
     * Sets the switchName value for this GetSwitchInfoByFilterIn.
     * 
     * @param switchName
     */
    public void setSwitchName(java.lang.String switchName) {
        this.switchName = switchName;
    }


    /**
     * Gets the switchType value for this GetSwitchInfoByFilterIn.
     * 
     * @return switchType
     */
    public java.lang.String getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this GetSwitchInfoByFilterIn.
     * 
     * @param switchType
     */
    public void setSwitchType(java.lang.String switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the correspondingIMS value for this GetSwitchInfoByFilterIn.
     * 
     * @return correspondingIMS
     */
    public java.lang.String getCorrespondingIMS() {
        return correspondingIMS;
    }


    /**
     * Sets the correspondingIMS value for this GetSwitchInfoByFilterIn.
     * 
     * @param correspondingIMS
     */
    public void setCorrespondingIMS(java.lang.String correspondingIMS) {
        this.correspondingIMS = correspondingIMS;
    }


    /**
     * Gets the numero value for this GetSwitchInfoByFilterIn.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this GetSwitchInfoByFilterIn.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSwitchInfoByFilterIn)) return false;
        GetSwitchInfoByFilterIn other = (GetSwitchInfoByFilterIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.switchName==null && other.getSwitchName()==null) || 
             (this.switchName!=null &&
              this.switchName.equals(other.getSwitchName()))) &&
            ((this.switchType==null && other.getSwitchType()==null) || 
             (this.switchType!=null &&
              this.switchType.equals(other.getSwitchType()))) &&
            ((this.correspondingIMS==null && other.getCorrespondingIMS()==null) || 
             (this.correspondingIMS!=null &&
              this.correspondingIMS.equals(other.getCorrespondingIMS()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero())));
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
        if (getSwitchName() != null) {
            _hashCode += getSwitchName().hashCode();
        }
        if (getSwitchType() != null) {
            _hashCode += getSwitchType().hashCode();
        }
        if (getCorrespondingIMS() != null) {
            _hashCode += getCorrespondingIMS().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSwitchInfoByFilterIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "getSwitchInfoByFilterIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondingIMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correspondingIMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
