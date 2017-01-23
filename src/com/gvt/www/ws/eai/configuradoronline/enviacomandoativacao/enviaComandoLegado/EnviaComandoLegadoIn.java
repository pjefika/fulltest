/**
 * EnviaComandoLegadoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.enviacomandoativacao.enviaComandoLegado;

public class EnviaComandoLegadoIn  implements java.io.Serializable {
    private java.lang.String responsavel;

    private java.lang.String sistemaOrigem;

    private br.com.gvt.www.col.metaData.NECService.NECRequest necRequest;

    private java.lang.String documento;

    private java.lang.String numeroSS;

    public EnviaComandoLegadoIn() {
    }

    public EnviaComandoLegadoIn(
           java.lang.String responsavel,
           java.lang.String sistemaOrigem,
           br.com.gvt.www.col.metaData.NECService.NECRequest necRequest,
           java.lang.String documento,
           java.lang.String numeroSS) {
           this.responsavel = responsavel;
           this.sistemaOrigem = sistemaOrigem;
           this.necRequest = necRequest;
           this.documento = documento;
           this.numeroSS = numeroSS;
    }


    /**
     * Gets the responsavel value for this EnviaComandoLegadoIn.
     * 
     * @return responsavel
     */
    public java.lang.String getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this EnviaComandoLegadoIn.
     * 
     * @param responsavel
     */
    public void setResponsavel(java.lang.String responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the sistemaOrigem value for this EnviaComandoLegadoIn.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this EnviaComandoLegadoIn.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the necRequest value for this EnviaComandoLegadoIn.
     * 
     * @return necRequest
     */
    public br.com.gvt.www.col.metaData.NECService.NECRequest getNecRequest() {
        return necRequest;
    }


    /**
     * Sets the necRequest value for this EnviaComandoLegadoIn.
     * 
     * @param necRequest
     */
    public void setNecRequest(br.com.gvt.www.col.metaData.NECService.NECRequest necRequest) {
        this.necRequest = necRequest;
    }


    /**
     * Gets the documento value for this EnviaComandoLegadoIn.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this EnviaComandoLegadoIn.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the numeroSS value for this EnviaComandoLegadoIn.
     * 
     * @return numeroSS
     */
    public java.lang.String getNumeroSS() {
        return numeroSS;
    }


    /**
     * Sets the numeroSS value for this EnviaComandoLegadoIn.
     * 
     * @param numeroSS
     */
    public void setNumeroSS(java.lang.String numeroSS) {
        this.numeroSS = numeroSS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviaComandoLegadoIn)) return false;
        EnviaComandoLegadoIn other = (EnviaComandoLegadoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.necRequest==null && other.getNecRequest()==null) || 
             (this.necRequest!=null &&
              this.necRequest.equals(other.getNecRequest()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.numeroSS==null && other.getNumeroSS()==null) || 
             (this.numeroSS!=null &&
              this.numeroSS.equals(other.getNumeroSS())));
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
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getNecRequest() != null) {
            _hashCode += getNecRequest().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getNumeroSS() != null) {
            _hashCode += getNumeroSS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviaComandoLegadoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "EnviaComandoLegadoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("necRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "necRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NECRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/enviacomandoativacao/enviaComandoLegado", "numeroSS"));
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
