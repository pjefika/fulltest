/**
 * Portados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class Portados  implements java.io.Serializable {
    private java.lang.String instancia;

    private java.lang.String tipoPortabilidade;

    private java.lang.String statusPortabilidade;

    public Portados() {
    }

    public Portados(
           java.lang.String instancia,
           java.lang.String tipoPortabilidade,
           java.lang.String statusPortabilidade) {
           this.instancia = instancia;
           this.tipoPortabilidade = tipoPortabilidade;
           this.statusPortabilidade = statusPortabilidade;
    }


    /**
     * Gets the instancia value for this Portados.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this Portados.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the tipoPortabilidade value for this Portados.
     * 
     * @return tipoPortabilidade
     */
    public java.lang.String getTipoPortabilidade() {
        return tipoPortabilidade;
    }


    /**
     * Sets the tipoPortabilidade value for this Portados.
     * 
     * @param tipoPortabilidade
     */
    public void setTipoPortabilidade(java.lang.String tipoPortabilidade) {
        this.tipoPortabilidade = tipoPortabilidade;
    }


    /**
     * Gets the statusPortabilidade value for this Portados.
     * 
     * @return statusPortabilidade
     */
    public java.lang.String getStatusPortabilidade() {
        return statusPortabilidade;
    }


    /**
     * Sets the statusPortabilidade value for this Portados.
     * 
     * @param statusPortabilidade
     */
    public void setStatusPortabilidade(java.lang.String statusPortabilidade) {
        this.statusPortabilidade = statusPortabilidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Portados)) return false;
        Portados other = (Portados) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.tipoPortabilidade==null && other.getTipoPortabilidade()==null) || 
             (this.tipoPortabilidade!=null &&
              this.tipoPortabilidade.equals(other.getTipoPortabilidade()))) &&
            ((this.statusPortabilidade==null && other.getStatusPortabilidade()==null) || 
             (this.statusPortabilidade!=null &&
              this.statusPortabilidade.equals(other.getStatusPortabilidade())));
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
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getTipoPortabilidade() != null) {
            _hashCode += getTipoPortabilidade().hashCode();
        }
        if (getStatusPortabilidade() != null) {
            _hashCode += getStatusPortabilidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Portados.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "portados"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPortabilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPortabilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPortabilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusPortabilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
