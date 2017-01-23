/**
 * CriarChavesReservaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarChavesReserva;

public class CriarChavesReservaIn  implements java.io.Serializable {
    private java.lang.String nomeProduto;

    private int qtdeChavesSolicitadas;

    private java.util.Calendar dataInicioSolicitacao;

    private java.lang.String[] chaves;

    public CriarChavesReservaIn() {
    }

    public CriarChavesReservaIn(
           java.lang.String nomeProduto,
           int qtdeChavesSolicitadas,
           java.util.Calendar dataInicioSolicitacao,
           java.lang.String[] chaves) {
           this.nomeProduto = nomeProduto;
           this.qtdeChavesSolicitadas = qtdeChavesSolicitadas;
           this.dataInicioSolicitacao = dataInicioSolicitacao;
           this.chaves = chaves;
    }


    /**
     * Gets the nomeProduto value for this CriarChavesReservaIn.
     * 
     * @return nomeProduto
     */
    public java.lang.String getNomeProduto() {
        return nomeProduto;
    }


    /**
     * Sets the nomeProduto value for this CriarChavesReservaIn.
     * 
     * @param nomeProduto
     */
    public void setNomeProduto(java.lang.String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    /**
     * Gets the qtdeChavesSolicitadas value for this CriarChavesReservaIn.
     * 
     * @return qtdeChavesSolicitadas
     */
    public int getQtdeChavesSolicitadas() {
        return qtdeChavesSolicitadas;
    }


    /**
     * Sets the qtdeChavesSolicitadas value for this CriarChavesReservaIn.
     * 
     * @param qtdeChavesSolicitadas
     */
    public void setQtdeChavesSolicitadas(int qtdeChavesSolicitadas) {
        this.qtdeChavesSolicitadas = qtdeChavesSolicitadas;
    }


    /**
     * Gets the dataInicioSolicitacao value for this CriarChavesReservaIn.
     * 
     * @return dataInicioSolicitacao
     */
    public java.util.Calendar getDataInicioSolicitacao() {
        return dataInicioSolicitacao;
    }


    /**
     * Sets the dataInicioSolicitacao value for this CriarChavesReservaIn.
     * 
     * @param dataInicioSolicitacao
     */
    public void setDataInicioSolicitacao(java.util.Calendar dataInicioSolicitacao) {
        this.dataInicioSolicitacao = dataInicioSolicitacao;
    }


    /**
     * Gets the chaves value for this CriarChavesReservaIn.
     * 
     * @return chaves
     */
    public java.lang.String[] getChaves() {
        return chaves;
    }


    /**
     * Sets the chaves value for this CriarChavesReservaIn.
     * 
     * @param chaves
     */
    public void setChaves(java.lang.String[] chaves) {
        this.chaves = chaves;
    }

    public java.lang.String getChaves(int i) {
        return this.chaves[i];
    }

    public void setChaves(int i, java.lang.String _value) {
        this.chaves[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarChavesReservaIn)) return false;
        CriarChavesReservaIn other = (CriarChavesReservaIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeProduto==null && other.getNomeProduto()==null) || 
             (this.nomeProduto!=null &&
              this.nomeProduto.equals(other.getNomeProduto()))) &&
            this.qtdeChavesSolicitadas == other.getQtdeChavesSolicitadas() &&
            ((this.dataInicioSolicitacao==null && other.getDataInicioSolicitacao()==null) || 
             (this.dataInicioSolicitacao!=null &&
              this.dataInicioSolicitacao.equals(other.getDataInicioSolicitacao()))) &&
            ((this.chaves==null && other.getChaves()==null) || 
             (this.chaves!=null &&
              java.util.Arrays.equals(this.chaves, other.getChaves())));
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
        if (getNomeProduto() != null) {
            _hashCode += getNomeProduto().hashCode();
        }
        _hashCode += getQtdeChavesSolicitadas();
        if (getDataInicioSolicitacao() != null) {
            _hashCode += getDataInicioSolicitacao().hashCode();
        }
        if (getChaves() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChaves());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChaves(), i);
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
        new org.apache.axis.description.TypeDesc(CriarChavesReservaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "CriarChavesReservaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "nomeProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeChavesSolicitadas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "qtdeChavesSolicitadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicioSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "dataInicioSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaves");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarChavesReserva", "chaves"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
