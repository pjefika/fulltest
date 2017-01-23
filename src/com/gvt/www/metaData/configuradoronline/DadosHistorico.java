/**
 * DadosHistorico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosHistorico  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao;

    private java.util.Calendar data;

    private java.lang.String causaSolucao;

    private java.lang.Long idProcessoBpm;

    private com.gvt.www.metaData.configuradoronline.DadosArea areaSolucionadora;

    private java.lang.Integer sla;

    public DadosHistorico() {
    }

    public DadosHistorico(
           com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao,
           java.util.Calendar data,
           java.lang.String causaSolucao,
           java.lang.Long idProcessoBpm,
           com.gvt.www.metaData.configuradoronline.DadosArea areaSolucionadora,
           java.lang.Integer sla) {
           this.statusExecucao = statusExecucao;
           this.data = data;
           this.causaSolucao = causaSolucao;
           this.idProcessoBpm = idProcessoBpm;
           this.areaSolucionadora = areaSolucionadora;
           this.sla = sla;
    }


    /**
     * Gets the statusExecucao value for this DadosHistorico.
     * 
     * @return statusExecucao
     */
    public com.gvt.www.metaData.configuradoronline.DadosStatusExecucao getStatusExecucao() {
        return statusExecucao;
    }


    /**
     * Sets the statusExecucao value for this DadosHistorico.
     * 
     * @param statusExecucao
     */
    public void setStatusExecucao(com.gvt.www.metaData.configuradoronline.DadosStatusExecucao statusExecucao) {
        this.statusExecucao = statusExecucao;
    }


    /**
     * Gets the data value for this DadosHistorico.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this DadosHistorico.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the causaSolucao value for this DadosHistorico.
     * 
     * @return causaSolucao
     */
    public java.lang.String getCausaSolucao() {
        return causaSolucao;
    }


    /**
     * Sets the causaSolucao value for this DadosHistorico.
     * 
     * @param causaSolucao
     */
    public void setCausaSolucao(java.lang.String causaSolucao) {
        this.causaSolucao = causaSolucao;
    }


    /**
     * Gets the idProcessoBpm value for this DadosHistorico.
     * 
     * @return idProcessoBpm
     */
    public java.lang.Long getIdProcessoBpm() {
        return idProcessoBpm;
    }


    /**
     * Sets the idProcessoBpm value for this DadosHistorico.
     * 
     * @param idProcessoBpm
     */
    public void setIdProcessoBpm(java.lang.Long idProcessoBpm) {
        this.idProcessoBpm = idProcessoBpm;
    }


    /**
     * Gets the areaSolucionadora value for this DadosHistorico.
     * 
     * @return areaSolucionadora
     */
    public com.gvt.www.metaData.configuradoronline.DadosArea getAreaSolucionadora() {
        return areaSolucionadora;
    }


    /**
     * Sets the areaSolucionadora value for this DadosHistorico.
     * 
     * @param areaSolucionadora
     */
    public void setAreaSolucionadora(com.gvt.www.metaData.configuradoronline.DadosArea areaSolucionadora) {
        this.areaSolucionadora = areaSolucionadora;
    }


    /**
     * Gets the sla value for this DadosHistorico.
     * 
     * @return sla
     */
    public java.lang.Integer getSla() {
        return sla;
    }


    /**
     * Sets the sla value for this DadosHistorico.
     * 
     * @param sla
     */
    public void setSla(java.lang.Integer sla) {
        this.sla = sla;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosHistorico)) return false;
        DadosHistorico other = (DadosHistorico) obj;
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
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.causaSolucao==null && other.getCausaSolucao()==null) || 
             (this.causaSolucao!=null &&
              this.causaSolucao.equals(other.getCausaSolucao()))) &&
            ((this.idProcessoBpm==null && other.getIdProcessoBpm()==null) || 
             (this.idProcessoBpm!=null &&
              this.idProcessoBpm.equals(other.getIdProcessoBpm()))) &&
            ((this.areaSolucionadora==null && other.getAreaSolucionadora()==null) || 
             (this.areaSolucionadora!=null &&
              this.areaSolucionadora.equals(other.getAreaSolucionadora()))) &&
            ((this.sla==null && other.getSla()==null) || 
             (this.sla!=null &&
              this.sla.equals(other.getSla())));
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
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getCausaSolucao() != null) {
            _hashCode += getCausaSolucao().hashCode();
        }
        if (getIdProcessoBpm() != null) {
            _hashCode += getIdProcessoBpm().hashCode();
        }
        if (getAreaSolucionadora() != null) {
            _hashCode += getAreaSolucionadora().hashCode();
        }
        if (getSla() != null) {
            _hashCode += getSla().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosHistorico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosHistorico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "statusExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosStatusExecucao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaSolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "causaSolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProcessoBpm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "idProcessoBpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaSolucionadora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "areaSolucionadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosArea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "sla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
