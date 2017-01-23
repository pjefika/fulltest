/**
 * DadosComandoAtivacaoNEC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComandoAtivacaoNEC  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn[] configurarBloqueioIn;

    private br.com.gvt.www.col.metaData.NECService.NECRequest necRequest;

    private br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn;

    public DadosComandoAtivacaoNEC() {
    }

    public DadosComandoAtivacaoNEC(
           com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn[] configurarBloqueioIn,
           br.com.gvt.www.col.metaData.NECService.NECRequest necRequest,
           br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn) {
           this.configurarBloqueioIn = configurarBloqueioIn;
           this.necRequest = necRequest;
           this.configurarLinhaIn = configurarLinhaIn;
    }


    /**
     * Gets the configurarBloqueioIn value for this DadosComandoAtivacaoNEC.
     * 
     * @return configurarBloqueioIn
     */
    public com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn[] getConfigurarBloqueioIn() {
        return configurarBloqueioIn;
    }


    /**
     * Sets the configurarBloqueioIn value for this DadosComandoAtivacaoNEC.
     * 
     * @param configurarBloqueioIn
     */
    public void setConfigurarBloqueioIn(com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn[] configurarBloqueioIn) {
        this.configurarBloqueioIn = configurarBloqueioIn;
    }

    public com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn getConfigurarBloqueioIn(int i) {
        return this.configurarBloqueioIn[i];
    }

    public void setConfigurarBloqueioIn(int i, com.gvt.www.ws.eai.oss.configurarBloqueio.ConfigurarBloqueioIn _value) {
        this.configurarBloqueioIn[i] = _value;
    }


    /**
     * Gets the necRequest value for this DadosComandoAtivacaoNEC.
     * 
     * @return necRequest
     */
    public br.com.gvt.www.col.metaData.NECService.NECRequest getNecRequest() {
        return necRequest;
    }


    /**
     * Sets the necRequest value for this DadosComandoAtivacaoNEC.
     * 
     * @param necRequest
     */
    public void setNecRequest(br.com.gvt.www.col.metaData.NECService.NECRequest necRequest) {
        this.necRequest = necRequest;
    }


    /**
     * Gets the configurarLinhaIn value for this DadosComandoAtivacaoNEC.
     * 
     * @return configurarLinhaIn
     */
    public br.com.gvt.www.oss.necservice.ConfigurarLinhaIn getConfigurarLinhaIn() {
        return configurarLinhaIn;
    }


    /**
     * Sets the configurarLinhaIn value for this DadosComandoAtivacaoNEC.
     * 
     * @param configurarLinhaIn
     */
    public void setConfigurarLinhaIn(br.com.gvt.www.oss.necservice.ConfigurarLinhaIn configurarLinhaIn) {
        this.configurarLinhaIn = configurarLinhaIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComandoAtivacaoNEC)) return false;
        DadosComandoAtivacaoNEC other = (DadosComandoAtivacaoNEC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configurarBloqueioIn==null && other.getConfigurarBloqueioIn()==null) || 
             (this.configurarBloqueioIn!=null &&
              java.util.Arrays.equals(this.configurarBloqueioIn, other.getConfigurarBloqueioIn()))) &&
            ((this.necRequest==null && other.getNecRequest()==null) || 
             (this.necRequest!=null &&
              this.necRequest.equals(other.getNecRequest()))) &&
            ((this.configurarLinhaIn==null && other.getConfigurarLinhaIn()==null) || 
             (this.configurarLinhaIn!=null &&
              this.configurarLinhaIn.equals(other.getConfigurarLinhaIn())));
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
        if (getConfigurarBloqueioIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigurarBloqueioIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigurarBloqueioIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNecRequest() != null) {
            _hashCode += getNecRequest().hashCode();
        }
        if (getConfigurarLinhaIn() != null) {
            _hashCode += getConfigurarLinhaIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComandoAtivacaoNEC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComandoAtivacaoNEC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurarBloqueioIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "configurarBloqueioIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/configurarBloqueio", "ConfigurarBloqueioIn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("necRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "necRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NECRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurarLinhaIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "configurarLinhaIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn"));
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
