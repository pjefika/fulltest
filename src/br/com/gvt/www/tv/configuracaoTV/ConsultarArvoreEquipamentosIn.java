/**
 * ConsultarArvoreEquipamentosIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarArvoreEquipamentosIn  implements java.io.Serializable {
    private java.lang.String ordemDeServico;

    private java.lang.String designadorBandaLarga;

    private java.lang.String designadorTv;

    public ConsultarArvoreEquipamentosIn() {
    }

    public ConsultarArvoreEquipamentosIn(
           java.lang.String ordemDeServico,
           java.lang.String designadorBandaLarga,
           java.lang.String designadorTv) {
           this.ordemDeServico = ordemDeServico;
           this.designadorBandaLarga = designadorBandaLarga;
           this.designadorTv = designadorTv;
    }


    /**
     * Gets the ordemDeServico value for this ConsultarArvoreEquipamentosIn.
     * 
     * @return ordemDeServico
     */
    public java.lang.String getOrdemDeServico() {
        return ordemDeServico;
    }


    /**
     * Sets the ordemDeServico value for this ConsultarArvoreEquipamentosIn.
     * 
     * @param ordemDeServico
     */
    public void setOrdemDeServico(java.lang.String ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }


    /**
     * Gets the designadorBandaLarga value for this ConsultarArvoreEquipamentosIn.
     * 
     * @return designadorBandaLarga
     */
    public java.lang.String getDesignadorBandaLarga() {
        return designadorBandaLarga;
    }


    /**
     * Sets the designadorBandaLarga value for this ConsultarArvoreEquipamentosIn.
     * 
     * @param designadorBandaLarga
     */
    public void setDesignadorBandaLarga(java.lang.String designadorBandaLarga) {
        this.designadorBandaLarga = designadorBandaLarga;
    }


    /**
     * Gets the designadorTv value for this ConsultarArvoreEquipamentosIn.
     * 
     * @return designadorTv
     */
    public java.lang.String getDesignadorTv() {
        return designadorTv;
    }


    /**
     * Sets the designadorTv value for this ConsultarArvoreEquipamentosIn.
     * 
     * @param designadorTv
     */
    public void setDesignadorTv(java.lang.String designadorTv) {
        this.designadorTv = designadorTv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarArvoreEquipamentosIn)) return false;
        ConsultarArvoreEquipamentosIn other = (ConsultarArvoreEquipamentosIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ordemDeServico==null && other.getOrdemDeServico()==null) || 
             (this.ordemDeServico!=null &&
              this.ordemDeServico.equals(other.getOrdemDeServico()))) &&
            ((this.designadorBandaLarga==null && other.getDesignadorBandaLarga()==null) || 
             (this.designadorBandaLarga!=null &&
              this.designadorBandaLarga.equals(other.getDesignadorBandaLarga()))) &&
            ((this.designadorTv==null && other.getDesignadorTv()==null) || 
             (this.designadorTv!=null &&
              this.designadorTv.equals(other.getDesignadorTv())));
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
        if (getOrdemDeServico() != null) {
            _hashCode += getOrdemDeServico().hashCode();
        }
        if (getDesignadorBandaLarga() != null) {
            _hashCode += getDesignadorBandaLarga().hashCode();
        }
        if (getDesignadorTv() != null) {
            _hashCode += getDesignadorTv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarArvoreEquipamentosIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordemDeServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ordemDeServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorBandaLarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorBandaLarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTv"));
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
