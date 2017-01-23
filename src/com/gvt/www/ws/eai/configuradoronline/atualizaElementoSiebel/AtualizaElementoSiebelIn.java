/**
 * AtualizaElementoSiebelIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.atualizaElementoSiebel;

public class AtualizaElementoSiebelIn  implements java.io.Serializable {
    private java.lang.String idElemento;

    private java.lang.String nomeParametro;

    private java.lang.String valorParametro;

    private java.lang.String valorParametroListaValores;

    public AtualizaElementoSiebelIn() {
    }

    public AtualizaElementoSiebelIn(
           java.lang.String idElemento,
           java.lang.String nomeParametro,
           java.lang.String valorParametro,
           java.lang.String valorParametroListaValores) {
           this.idElemento = idElemento;
           this.nomeParametro = nomeParametro;
           this.valorParametro = valorParametro;
           this.valorParametroListaValores = valorParametroListaValores;
    }


    /**
     * Gets the idElemento value for this AtualizaElementoSiebelIn.
     * 
     * @return idElemento
     */
    public java.lang.String getIdElemento() {
        return idElemento;
    }


    /**
     * Sets the idElemento value for this AtualizaElementoSiebelIn.
     * 
     * @param idElemento
     */
    public void setIdElemento(java.lang.String idElemento) {
        this.idElemento = idElemento;
    }


    /**
     * Gets the nomeParametro value for this AtualizaElementoSiebelIn.
     * 
     * @return nomeParametro
     */
    public java.lang.String getNomeParametro() {
        return nomeParametro;
    }


    /**
     * Sets the nomeParametro value for this AtualizaElementoSiebelIn.
     * 
     * @param nomeParametro
     */
    public void setNomeParametro(java.lang.String nomeParametro) {
        this.nomeParametro = nomeParametro;
    }


    /**
     * Gets the valorParametro value for this AtualizaElementoSiebelIn.
     * 
     * @return valorParametro
     */
    public java.lang.String getValorParametro() {
        return valorParametro;
    }


    /**
     * Sets the valorParametro value for this AtualizaElementoSiebelIn.
     * 
     * @param valorParametro
     */
    public void setValorParametro(java.lang.String valorParametro) {
        this.valorParametro = valorParametro;
    }


    /**
     * Gets the valorParametroListaValores value for this AtualizaElementoSiebelIn.
     * 
     * @return valorParametroListaValores
     */
    public java.lang.String getValorParametroListaValores() {
        return valorParametroListaValores;
    }


    /**
     * Sets the valorParametroListaValores value for this AtualizaElementoSiebelIn.
     * 
     * @param valorParametroListaValores
     */
    public void setValorParametroListaValores(java.lang.String valorParametroListaValores) {
        this.valorParametroListaValores = valorParametroListaValores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaElementoSiebelIn)) return false;
        AtualizaElementoSiebelIn other = (AtualizaElementoSiebelIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idElemento==null && other.getIdElemento()==null) || 
             (this.idElemento!=null &&
              this.idElemento.equals(other.getIdElemento()))) &&
            ((this.nomeParametro==null && other.getNomeParametro()==null) || 
             (this.nomeParametro!=null &&
              this.nomeParametro.equals(other.getNomeParametro()))) &&
            ((this.valorParametro==null && other.getValorParametro()==null) || 
             (this.valorParametro!=null &&
              this.valorParametro.equals(other.getValorParametro()))) &&
            ((this.valorParametroListaValores==null && other.getValorParametroListaValores()==null) || 
             (this.valorParametroListaValores!=null &&
              this.valorParametroListaValores.equals(other.getValorParametroListaValores())));
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
        if (getIdElemento() != null) {
            _hashCode += getIdElemento().hashCode();
        }
        if (getNomeParametro() != null) {
            _hashCode += getNomeParametro().hashCode();
        }
        if (getValorParametro() != null) {
            _hashCode += getValorParametro().hashCode();
        }
        if (getValorParametroListaValores() != null) {
            _hashCode += getValorParametroListaValores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizaElementoSiebelIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "AtualizaElementoSiebelIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "idElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "nomeParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "valorParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParametroListaValores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/atualizaElementoSiebel", "valorParametroListaValores"));
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
