/**
 * ConsultInfoGponOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class ConsultInfoGponOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.gpon.InfoEquipamentoGpon infoEquipamentoGpon;

    public ConsultInfoGponOut() {
    }

    public ConsultInfoGponOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.gpon.InfoEquipamentoGpon infoEquipamentoGpon) {
           this.mensagem = mensagem;
           this.infoEquipamentoGpon = infoEquipamentoGpon;
    }


    /**
     * Gets the mensagem value for this ConsultInfoGponOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this ConsultInfoGponOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the infoEquipamentoGpon value for this ConsultInfoGponOut.
     * 
     * @return infoEquipamentoGpon
     */
    public com.gvt.www.ws.eai.oss.gpon.InfoEquipamentoGpon getInfoEquipamentoGpon() {
        return infoEquipamentoGpon;
    }


    /**
     * Sets the infoEquipamentoGpon value for this ConsultInfoGponOut.
     * 
     * @param infoEquipamentoGpon
     */
    public void setInfoEquipamentoGpon(com.gvt.www.ws.eai.oss.gpon.InfoEquipamentoGpon infoEquipamentoGpon) {
        this.infoEquipamentoGpon = infoEquipamentoGpon;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultInfoGponOut)) return false;
        ConsultInfoGponOut other = (ConsultInfoGponOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.infoEquipamentoGpon==null && other.getInfoEquipamentoGpon()==null) || 
             (this.infoEquipamentoGpon!=null &&
              this.infoEquipamentoGpon.equals(other.getInfoEquipamentoGpon())));
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getInfoEquipamentoGpon() != null) {
            _hashCode += getInfoEquipamentoGpon().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultInfoGponOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "ConsultInfoGponOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoEquipamentoGpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "infoEquipamentoGpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "InfoEquipamentoGpon"));
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
