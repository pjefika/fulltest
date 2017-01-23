/**
 * ParametroPFC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.alterarServicoPFC;

public class ParametroPFC  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String valorAntigo;

    private java.lang.String valorNovo;

    public ParametroPFC() {
    }

    public ParametroPFC(
           java.lang.String nome,
           java.lang.String valorAntigo,
           java.lang.String valorNovo) {
           this.nome = nome;
           this.valorAntigo = valorAntigo;
           this.valorNovo = valorNovo;
    }


    /**
     * Gets the nome value for this ParametroPFC.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ParametroPFC.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the valorAntigo value for this ParametroPFC.
     * 
     * @return valorAntigo
     */
    public java.lang.String getValorAntigo() {
        return valorAntigo;
    }


    /**
     * Sets the valorAntigo value for this ParametroPFC.
     * 
     * @param valorAntigo
     */
    public void setValorAntigo(java.lang.String valorAntigo) {
        this.valorAntigo = valorAntigo;
    }


    /**
     * Gets the valorNovo value for this ParametroPFC.
     * 
     * @return valorNovo
     */
    public java.lang.String getValorNovo() {
        return valorNovo;
    }


    /**
     * Sets the valorNovo value for this ParametroPFC.
     * 
     * @param valorNovo
     */
    public void setValorNovo(java.lang.String valorNovo) {
        this.valorNovo = valorNovo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroPFC)) return false;
        ParametroPFC other = (ParametroPFC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.valorAntigo==null && other.getValorAntigo()==null) || 
             (this.valorAntigo!=null &&
              this.valorAntigo.equals(other.getValorAntigo()))) &&
            ((this.valorNovo==null && other.getValorNovo()==null) || 
             (this.valorNovo!=null &&
              this.valorNovo.equals(other.getValorNovo())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getValorAntigo() != null) {
            _hashCode += getValorAntigo().hashCode();
        }
        if (getValorNovo() != null) {
            _hashCode += getValorNovo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroPFC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "ParametroPFC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAntigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "valorAntigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorNovo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/alterarServicoPFC", "valorNovo"));
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
