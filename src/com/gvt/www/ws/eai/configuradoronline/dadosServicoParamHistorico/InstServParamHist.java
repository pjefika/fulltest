/**
 * InstServParamHist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServicoParamHistorico;

public class InstServParamHist  implements java.io.Serializable {
    private java.lang.String parametroNew;

    private java.lang.String parametroOld;

    private java.lang.String valorStrNew;

    private java.lang.String valorStrOld;

    private java.lang.String acao;

    private java.util.Date data;

    public InstServParamHist() {
    }

    public InstServParamHist(
           java.lang.String parametroNew,
           java.lang.String parametroOld,
           java.lang.String valorStrNew,
           java.lang.String valorStrOld,
           java.lang.String acao,
           java.util.Date data) {
           this.parametroNew = parametroNew;
           this.parametroOld = parametroOld;
           this.valorStrNew = valorStrNew;
           this.valorStrOld = valorStrOld;
           this.acao = acao;
           this.data = data;
    }


    /**
     * Gets the parametroNew value for this InstServParamHist.
     * 
     * @return parametroNew
     */
    public java.lang.String getParametroNew() {
        return parametroNew;
    }


    /**
     * Sets the parametroNew value for this InstServParamHist.
     * 
     * @param parametroNew
     */
    public void setParametroNew(java.lang.String parametroNew) {
        this.parametroNew = parametroNew;
    }


    /**
     * Gets the parametroOld value for this InstServParamHist.
     * 
     * @return parametroOld
     */
    public java.lang.String getParametroOld() {
        return parametroOld;
    }


    /**
     * Sets the parametroOld value for this InstServParamHist.
     * 
     * @param parametroOld
     */
    public void setParametroOld(java.lang.String parametroOld) {
        this.parametroOld = parametroOld;
    }


    /**
     * Gets the valorStrNew value for this InstServParamHist.
     * 
     * @return valorStrNew
     */
    public java.lang.String getValorStrNew() {
        return valorStrNew;
    }


    /**
     * Sets the valorStrNew value for this InstServParamHist.
     * 
     * @param valorStrNew
     */
    public void setValorStrNew(java.lang.String valorStrNew) {
        this.valorStrNew = valorStrNew;
    }


    /**
     * Gets the valorStrOld value for this InstServParamHist.
     * 
     * @return valorStrOld
     */
    public java.lang.String getValorStrOld() {
        return valorStrOld;
    }


    /**
     * Sets the valorStrOld value for this InstServParamHist.
     * 
     * @param valorStrOld
     */
    public void setValorStrOld(java.lang.String valorStrOld) {
        this.valorStrOld = valorStrOld;
    }


    /**
     * Gets the acao value for this InstServParamHist.
     * 
     * @return acao
     */
    public java.lang.String getAcao() {
        return acao;
    }


    /**
     * Sets the acao value for this InstServParamHist.
     * 
     * @param acao
     */
    public void setAcao(java.lang.String acao) {
        this.acao = acao;
    }


    /**
     * Gets the data value for this InstServParamHist.
     * 
     * @return data
     */
    public java.util.Date getData() {
        return data;
    }


    /**
     * Sets the data value for this InstServParamHist.
     * 
     * @param data
     */
    public void setData(java.util.Date data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstServParamHist)) return false;
        InstServParamHist other = (InstServParamHist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametroNew==null && other.getParametroNew()==null) || 
             (this.parametroNew!=null &&
              this.parametroNew.equals(other.getParametroNew()))) &&
            ((this.parametroOld==null && other.getParametroOld()==null) || 
             (this.parametroOld!=null &&
              this.parametroOld.equals(other.getParametroOld()))) &&
            ((this.valorStrNew==null && other.getValorStrNew()==null) || 
             (this.valorStrNew!=null &&
              this.valorStrNew.equals(other.getValorStrNew()))) &&
            ((this.valorStrOld==null && other.getValorStrOld()==null) || 
             (this.valorStrOld!=null &&
              this.valorStrOld.equals(other.getValorStrOld()))) &&
            ((this.acao==null && other.getAcao()==null) || 
             (this.acao!=null &&
              this.acao.equals(other.getAcao()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getParametroNew() != null) {
            _hashCode += getParametroNew().hashCode();
        }
        if (getParametroOld() != null) {
            _hashCode += getParametroOld().hashCode();
        }
        if (getValorStrNew() != null) {
            _hashCode += getValorStrNew().hashCode();
        }
        if (getValorStrOld() != null) {
            _hashCode += getValorStrOld().hashCode();
        }
        if (getAcao() != null) {
            _hashCode += getAcao().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstServParamHist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "InstServParamHist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametroNew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "parametroNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametroOld");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "parametroOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorStrNew");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "valorStrNew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorStrOld");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "valorStrOld"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "acao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServicoParamHistorico", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
