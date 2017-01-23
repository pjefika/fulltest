/**
 * GetSSByFilterUraOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class GetSSByFilterUraOut  implements java.io.Serializable {
    private int outputCode;

    private java.lang.String outputMessage;

    private int pnumeross;

    private java.util.Calendar pdataultimovencimento;

    private java.lang.String psolicitacoes;

    private java.lang.String ptipo;

    private java.lang.String pinstancia;

    public GetSSByFilterUraOut() {
    }

    public GetSSByFilterUraOut(
           int outputCode,
           java.lang.String outputMessage,
           int pnumeross,
           java.util.Calendar pdataultimovencimento,
           java.lang.String psolicitacoes,
           java.lang.String ptipo,
           java.lang.String pinstancia) {
           this.outputCode = outputCode;
           this.outputMessage = outputMessage;
           this.pnumeross = pnumeross;
           this.pdataultimovencimento = pdataultimovencimento;
           this.psolicitacoes = psolicitacoes;
           this.ptipo = ptipo;
           this.pinstancia = pinstancia;
    }


    /**
     * Gets the outputCode value for this GetSSByFilterUraOut.
     * 
     * @return outputCode
     */
    public int getOutputCode() {
        return outputCode;
    }


    /**
     * Sets the outputCode value for this GetSSByFilterUraOut.
     * 
     * @param outputCode
     */
    public void setOutputCode(int outputCode) {
        this.outputCode = outputCode;
    }


    /**
     * Gets the outputMessage value for this GetSSByFilterUraOut.
     * 
     * @return outputMessage
     */
    public java.lang.String getOutputMessage() {
        return outputMessage;
    }


    /**
     * Sets the outputMessage value for this GetSSByFilterUraOut.
     * 
     * @param outputMessage
     */
    public void setOutputMessage(java.lang.String outputMessage) {
        this.outputMessage = outputMessage;
    }


    /**
     * Gets the pnumeross value for this GetSSByFilterUraOut.
     * 
     * @return pnumeross
     */
    public int getPnumeross() {
        return pnumeross;
    }


    /**
     * Sets the pnumeross value for this GetSSByFilterUraOut.
     * 
     * @param pnumeross
     */
    public void setPnumeross(int pnumeross) {
        this.pnumeross = pnumeross;
    }


    /**
     * Gets the pdataultimovencimento value for this GetSSByFilterUraOut.
     * 
     * @return pdataultimovencimento
     */
    public java.util.Calendar getPdataultimovencimento() {
        return pdataultimovencimento;
    }


    /**
     * Sets the pdataultimovencimento value for this GetSSByFilterUraOut.
     * 
     * @param pdataultimovencimento
     */
    public void setPdataultimovencimento(java.util.Calendar pdataultimovencimento) {
        this.pdataultimovencimento = pdataultimovencimento;
    }


    /**
     * Gets the psolicitacoes value for this GetSSByFilterUraOut.
     * 
     * @return psolicitacoes
     */
    public java.lang.String getPsolicitacoes() {
        return psolicitacoes;
    }


    /**
     * Sets the psolicitacoes value for this GetSSByFilterUraOut.
     * 
     * @param psolicitacoes
     */
    public void setPsolicitacoes(java.lang.String psolicitacoes) {
        this.psolicitacoes = psolicitacoes;
    }


    /**
     * Gets the ptipo value for this GetSSByFilterUraOut.
     * 
     * @return ptipo
     */
    public java.lang.String getPtipo() {
        return ptipo;
    }


    /**
     * Sets the ptipo value for this GetSSByFilterUraOut.
     * 
     * @param ptipo
     */
    public void setPtipo(java.lang.String ptipo) {
        this.ptipo = ptipo;
    }


    /**
     * Gets the pinstancia value for this GetSSByFilterUraOut.
     * 
     * @return pinstancia
     */
    public java.lang.String getPinstancia() {
        return pinstancia;
    }


    /**
     * Sets the pinstancia value for this GetSSByFilterUraOut.
     * 
     * @param pinstancia
     */
    public void setPinstancia(java.lang.String pinstancia) {
        this.pinstancia = pinstancia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSSByFilterUraOut)) return false;
        GetSSByFilterUraOut other = (GetSSByFilterUraOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.outputCode == other.getOutputCode() &&
            ((this.outputMessage==null && other.getOutputMessage()==null) || 
             (this.outputMessage!=null &&
              this.outputMessage.equals(other.getOutputMessage()))) &&
            this.pnumeross == other.getPnumeross() &&
            ((this.pdataultimovencimento==null && other.getPdataultimovencimento()==null) || 
             (this.pdataultimovencimento!=null &&
              this.pdataultimovencimento.equals(other.getPdataultimovencimento()))) &&
            ((this.psolicitacoes==null && other.getPsolicitacoes()==null) || 
             (this.psolicitacoes!=null &&
              this.psolicitacoes.equals(other.getPsolicitacoes()))) &&
            ((this.ptipo==null && other.getPtipo()==null) || 
             (this.ptipo!=null &&
              this.ptipo.equals(other.getPtipo()))) &&
            ((this.pinstancia==null && other.getPinstancia()==null) || 
             (this.pinstancia!=null &&
              this.pinstancia.equals(other.getPinstancia())));
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
        _hashCode += getOutputCode();
        if (getOutputMessage() != null) {
            _hashCode += getOutputMessage().hashCode();
        }
        _hashCode += getPnumeross();
        if (getPdataultimovencimento() != null) {
            _hashCode += getPdataultimovencimento().hashCode();
        }
        if (getPsolicitacoes() != null) {
            _hashCode += getPsolicitacoes().hashCode();
        }
        if (getPtipo() != null) {
            _hashCode += getPtipo().hashCode();
        }
        if (getPinstancia() != null) {
            _hashCode += getPinstancia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSSByFilterUraOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "getSSByFilterUraOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnumeross");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pnumeross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdataultimovencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pdataultimovencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psolicitacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psolicitacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ptipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinstancia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinstancia"));
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
