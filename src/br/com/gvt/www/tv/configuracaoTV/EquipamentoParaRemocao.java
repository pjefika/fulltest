/**
 * EquipamentoParaRemocao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class EquipamentoParaRemocao  implements java.io.Serializable {
    private boolean pvr;

    private java.lang.String serial;

    private com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada;

    public EquipamentoParaRemocao() {
    }

    public EquipamentoParaRemocao(
           boolean pvr,
           java.lang.String serial,
           com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada) {
           this.pvr = pvr;
           this.serial = serial;
           this.motivoRetirada = motivoRetirada;
    }


    /**
     * Gets the pvr value for this EquipamentoParaRemocao.
     * 
     * @return pvr
     */
    public boolean isPvr() {
        return pvr;
    }


    /**
     * Sets the pvr value for this EquipamentoParaRemocao.
     * 
     * @param pvr
     */
    public void setPvr(boolean pvr) {
        this.pvr = pvr;
    }


    /**
     * Gets the serial value for this EquipamentoParaRemocao.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this EquipamentoParaRemocao.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the motivoRetirada value for this EquipamentoParaRemocao.
     * 
     * @return motivoRetirada
     */
    public com.gvt.www.metaData.configuradoronline.MotivoRetirada getMotivoRetirada() {
        return motivoRetirada;
    }


    /**
     * Sets the motivoRetirada value for this EquipamentoParaRemocao.
     * 
     * @param motivoRetirada
     */
    public void setMotivoRetirada(com.gvt.www.metaData.configuradoronline.MotivoRetirada motivoRetirada) {
        this.motivoRetirada = motivoRetirada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquipamentoParaRemocao)) return false;
        EquipamentoParaRemocao other = (EquipamentoParaRemocao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pvr == other.isPvr() &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.motivoRetirada==null && other.getMotivoRetirada()==null) || 
             (this.motivoRetirada!=null &&
              this.motivoRetirada.equals(other.getMotivoRetirada())));
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
        _hashCode += (isPvr() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getMotivoRetirada() != null) {
            _hashCode += getMotivoRetirada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquipamentoParaRemocao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EquipamentoParaRemocao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoRetirada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "motivoRetirada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "MotivoRetirada"));
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
