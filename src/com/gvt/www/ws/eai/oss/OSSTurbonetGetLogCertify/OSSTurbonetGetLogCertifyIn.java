/**
 * OSSTurbonetGetLogCertifyIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetGetLogCertify;

public class OSSTurbonetGetLogCertifyIn  implements java.io.Serializable {
    private java.util.Calendar dataInicial;

    private java.util.Calendar dataFinal;

    private java.lang.String designador;

    private java.lang.String instancia;

    private java.lang.String numeroProtocolo;

    public OSSTurbonetGetLogCertifyIn() {
    }

    public OSSTurbonetGetLogCertifyIn(
           java.util.Calendar dataInicial,
           java.util.Calendar dataFinal,
           java.lang.String designador,
           java.lang.String instancia,
           java.lang.String numeroProtocolo) {
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.designador = designador;
           this.instancia = instancia;
           this.numeroProtocolo = numeroProtocolo;
    }


    /**
     * Gets the dataInicial value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @return dataInicial
     */
    public java.util.Calendar getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.util.Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @return dataFinal
     */
    public java.util.Calendar getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.util.Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the designador value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the instancia value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the numeroProtocolo value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @return numeroProtocolo
     */
    public java.lang.String getNumeroProtocolo() {
        return numeroProtocolo;
    }


    /**
     * Sets the numeroProtocolo value for this OSSTurbonetGetLogCertifyIn.
     * 
     * @param numeroProtocolo
     */
    public void setNumeroProtocolo(java.lang.String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetGetLogCertifyIn)) return false;
        OSSTurbonetGetLogCertifyIn other = (OSSTurbonetGetLogCertifyIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.numeroProtocolo==null && other.getNumeroProtocolo()==null) || 
             (this.numeroProtocolo!=null &&
              this.numeroProtocolo.equals(other.getNumeroProtocolo())));
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
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getNumeroProtocolo() != null) {
            _hashCode += getNumeroProtocolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetGetLogCertifyIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "OSSTurbonetGetLogCertifyIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "dataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocolo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetGetLogCertify", "numeroProtocolo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
