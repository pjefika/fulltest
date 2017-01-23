/**
 * DadosStatusComando.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosStatusComando  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao;

    private com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] tipoBloqueio;

    public DadosStatusComando() {
    }

    public DadosStatusComando(
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao,
           com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] tipoBloqueio) {
           this.statusExecucao = statusExecucao;
           this.tipoBloqueio = tipoBloqueio;
    }


    /**
     * Gets the statusExecucao value for this DadosStatusComando.
     * 
     * @return statusExecucao
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatusExecucao() {
        return statusExecucao;
    }


    /**
     * Sets the statusExecucao value for this DadosStatusComando.
     * 
     * @param statusExecucao
     */
    public void setStatusExecucao(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao) {
        this.statusExecucao = statusExecucao;
    }


    /**
     * Gets the tipoBloqueio value for this DadosStatusComando.
     * 
     * @return tipoBloqueio
     */
    public com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] getTipoBloqueio() {
        return tipoBloqueio;
    }


    /**
     * Sets the tipoBloqueio value for this DadosStatusComando.
     * 
     * @param tipoBloqueio
     */
    public void setTipoBloqueio(com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio[] tipoBloqueio) {
        this.tipoBloqueio = tipoBloqueio;
    }

    public com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio getTipoBloqueio(int i) {
        return this.tipoBloqueio[i];
    }

    public void setTipoBloqueio(int i, com.gvt.www.metaData.configuradoronline.DadosTipoBloqueio _value) {
        this.tipoBloqueio[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosStatusComando)) return false;
        DadosStatusComando other = (DadosStatusComando) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusExecucao==null && other.getStatusExecucao()==null) || 
             (this.statusExecucao!=null &&
              this.statusExecucao.equals(other.getStatusExecucao()))) &&
            ((this.tipoBloqueio==null && other.getTipoBloqueio()==null) || 
             (this.tipoBloqueio!=null &&
              java.util.Arrays.equals(this.tipoBloqueio, other.getTipoBloqueio())));
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
        if (getStatusExecucao() != null) {
            _hashCode += getStatusExecucao().hashCode();
        }
        if (getTipoBloqueio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTipoBloqueio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTipoBloqueio(), i);
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
        new org.apache.axis.description.TypeDesc(DadosStatusComando.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusComando"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "tipoBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosTipoBloqueio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
