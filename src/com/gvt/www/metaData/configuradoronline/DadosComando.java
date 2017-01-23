/**
 * DadosComando.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.metaData.configuradoronline;

public class DadosComando  implements java.io.Serializable {
    private com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo;

    private java.lang.String codigoArea;

    private java.lang.String codigoProcesso;

    private java.util.Calendar data;

    private java.lang.String responsavel;

    private java.lang.String sistemaOrigem;

    private java.lang.Integer percentual;

    private java.lang.String[] whiteList;

    private com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha opcoesConfigurarLinha;

    private br.com.gvt.www.oss.necservice.ConfigurarLinhaIn opcoesConfigurarLinhaSAS;

    private java.math.BigInteger idCaso;

    public DadosComando() {
    }

    public DadosComando(
           com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo,
           java.lang.String codigoArea,
           java.lang.String codigoProcesso,
           java.util.Calendar data,
           java.lang.String responsavel,
           java.lang.String sistemaOrigem,
           java.lang.Integer percentual,
           java.lang.String[] whiteList,
           com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha opcoesConfigurarLinha,
           br.com.gvt.www.oss.necservice.ConfigurarLinhaIn opcoesConfigurarLinhaSAS,
           java.math.BigInteger idCaso) {
           this.codigoTipo = codigoTipo;
           this.codigoArea = codigoArea;
           this.codigoProcesso = codigoProcesso;
           this.data = data;
           this.responsavel = responsavel;
           this.sistemaOrigem = sistemaOrigem;
           this.percentual = percentual;
           this.whiteList = whiteList;
           this.opcoesConfigurarLinha = opcoesConfigurarLinha;
           this.opcoesConfigurarLinhaSAS = opcoesConfigurarLinhaSAS;
           this.idCaso = idCaso;
    }


    /**
     * Gets the codigoTipo value for this DadosComando.
     * 
     * @return codigoTipo
     */
    public com.gvt.www.metaData.configuradoronline.TipoComando getCodigoTipo() {
        return codigoTipo;
    }


    /**
     * Sets the codigoTipo value for this DadosComando.
     * 
     * @param codigoTipo
     */
    public void setCodigoTipo(com.gvt.www.metaData.configuradoronline.TipoComando codigoTipo) {
        this.codigoTipo = codigoTipo;
    }


    /**
     * Gets the codigoArea value for this DadosComando.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this DadosComando.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the codigoProcesso value for this DadosComando.
     * 
     * @return codigoProcesso
     */
    public java.lang.String getCodigoProcesso() {
        return codigoProcesso;
    }


    /**
     * Sets the codigoProcesso value for this DadosComando.
     * 
     * @param codigoProcesso
     */
    public void setCodigoProcesso(java.lang.String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }


    /**
     * Gets the data value for this DadosComando.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this DadosComando.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the responsavel value for this DadosComando.
     * 
     * @return responsavel
     */
    public java.lang.String getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this DadosComando.
     * 
     * @param responsavel
     */
    public void setResponsavel(java.lang.String responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the sistemaOrigem value for this DadosComando.
     * 
     * @return sistemaOrigem
     */
    public java.lang.String getSistemaOrigem() {
        return sistemaOrigem;
    }


    /**
     * Sets the sistemaOrigem value for this DadosComando.
     * 
     * @param sistemaOrigem
     */
    public void setSistemaOrigem(java.lang.String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }


    /**
     * Gets the percentual value for this DadosComando.
     * 
     * @return percentual
     */
    public java.lang.Integer getPercentual() {
        return percentual;
    }


    /**
     * Sets the percentual value for this DadosComando.
     * 
     * @param percentual
     */
    public void setPercentual(java.lang.Integer percentual) {
        this.percentual = percentual;
    }


    /**
     * Gets the whiteList value for this DadosComando.
     * 
     * @return whiteList
     */
    public java.lang.String[] getWhiteList() {
        return whiteList;
    }


    /**
     * Sets the whiteList value for this DadosComando.
     * 
     * @param whiteList
     */
    public void setWhiteList(java.lang.String[] whiteList) {
        this.whiteList = whiteList;
    }


    /**
     * Gets the opcoesConfigurarLinha value for this DadosComando.
     * 
     * @return opcoesConfigurarLinha
     */
    public com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha getOpcoesConfigurarLinha() {
        return opcoesConfigurarLinha;
    }


    /**
     * Sets the opcoesConfigurarLinha value for this DadosComando.
     * 
     * @param opcoesConfigurarLinha
     */
    public void setOpcoesConfigurarLinha(com.gvt.www.metaData.configuradoronline.DadosOpcoesConfigurarLinha opcoesConfigurarLinha) {
        this.opcoesConfigurarLinha = opcoesConfigurarLinha;
    }


    /**
     * Gets the opcoesConfigurarLinhaSAS value for this DadosComando.
     * 
     * @return opcoesConfigurarLinhaSAS
     */
    public br.com.gvt.www.oss.necservice.ConfigurarLinhaIn getOpcoesConfigurarLinhaSAS() {
        return opcoesConfigurarLinhaSAS;
    }


    /**
     * Sets the opcoesConfigurarLinhaSAS value for this DadosComando.
     * 
     * @param opcoesConfigurarLinhaSAS
     */
    public void setOpcoesConfigurarLinhaSAS(br.com.gvt.www.oss.necservice.ConfigurarLinhaIn opcoesConfigurarLinhaSAS) {
        this.opcoesConfigurarLinhaSAS = opcoesConfigurarLinhaSAS;
    }


    /**
     * Gets the idCaso value for this DadosComando.
     * 
     * @return idCaso
     */
    public java.math.BigInteger getIdCaso() {
        return idCaso;
    }


    /**
     * Sets the idCaso value for this DadosComando.
     * 
     * @param idCaso
     */
    public void setIdCaso(java.math.BigInteger idCaso) {
        this.idCaso = idCaso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosComando)) return false;
        DadosComando other = (DadosComando) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoTipo==null && other.getCodigoTipo()==null) || 
             (this.codigoTipo!=null &&
              this.codigoTipo.equals(other.getCodigoTipo()))) &&
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.codigoProcesso==null && other.getCodigoProcesso()==null) || 
             (this.codigoProcesso!=null &&
              this.codigoProcesso.equals(other.getCodigoProcesso()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            ((this.sistemaOrigem==null && other.getSistemaOrigem()==null) || 
             (this.sistemaOrigem!=null &&
              this.sistemaOrigem.equals(other.getSistemaOrigem()))) &&
            ((this.percentual==null && other.getPercentual()==null) || 
             (this.percentual!=null &&
              this.percentual.equals(other.getPercentual()))) &&
            ((this.whiteList==null && other.getWhiteList()==null) || 
             (this.whiteList!=null &&
              java.util.Arrays.equals(this.whiteList, other.getWhiteList()))) &&
            ((this.opcoesConfigurarLinha==null && other.getOpcoesConfigurarLinha()==null) || 
             (this.opcoesConfigurarLinha!=null &&
              this.opcoesConfigurarLinha.equals(other.getOpcoesConfigurarLinha()))) &&
            ((this.opcoesConfigurarLinhaSAS==null && other.getOpcoesConfigurarLinhaSAS()==null) || 
             (this.opcoesConfigurarLinhaSAS!=null &&
              this.opcoesConfigurarLinhaSAS.equals(other.getOpcoesConfigurarLinhaSAS()))) &&
            ((this.idCaso==null && other.getIdCaso()==null) || 
             (this.idCaso!=null &&
              this.idCaso.equals(other.getIdCaso())));
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
        if (getCodigoTipo() != null) {
            _hashCode += getCodigoTipo().hashCode();
        }
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getCodigoProcesso() != null) {
            _hashCode += getCodigoProcesso().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        if (getSistemaOrigem() != null) {
            _hashCode += getSistemaOrigem().hashCode();
        }
        if (getPercentual() != null) {
            _hashCode += getPercentual().hashCode();
        }
        if (getWhiteList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhiteList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhiteList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpcoesConfigurarLinha() != null) {
            _hashCode += getOpcoesConfigurarLinha().hashCode();
        }
        if (getOpcoesConfigurarLinhaSAS() != null) {
            _hashCode += getOpcoesConfigurarLinhaSAS().hashCode();
        }
        if (getIdCaso() != null) {
            _hashCode += getIdCaso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosComando.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosComando"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "codigoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "TipoComando"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "codigoProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "sistemaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "percentual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whiteList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "whiteList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "instancia"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcoesConfigurarLinha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "opcoesConfigurarLinha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "DadosOpcoesConfigurarLinha"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcoesConfigurarLinhaSAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "opcoesConfigurarLinhaSAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCaso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/metaData/configuradoronline", "idCaso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
