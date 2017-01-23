/**
 * ConsultaSetTopBoxNaoInstaladoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.consultaSetTopBox;

public class ConsultaSetTopBoxNaoInstaladoOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private int quantidadeDeEquipamentosNaoInstalados;

    public ConsultaSetTopBoxNaoInstaladoOut() {
    }

    public ConsultaSetTopBoxNaoInstaladoOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           int quantidadeDeEquipamentosNaoInstalados) {
        super(
            codigo,
            mensagem,
            descricao);
        this.quantidadeDeEquipamentosNaoInstalados = quantidadeDeEquipamentosNaoInstalados;
    }


    /**
     * Gets the quantidadeDeEquipamentosNaoInstalados value for this ConsultaSetTopBoxNaoInstaladoOut.
     * 
     * @return quantidadeDeEquipamentosNaoInstalados
     */
    public int getQuantidadeDeEquipamentosNaoInstalados() {
        return quantidadeDeEquipamentosNaoInstalados;
    }


    /**
     * Sets the quantidadeDeEquipamentosNaoInstalados value for this ConsultaSetTopBoxNaoInstaladoOut.
     * 
     * @param quantidadeDeEquipamentosNaoInstalados
     */
    public void setQuantidadeDeEquipamentosNaoInstalados(int quantidadeDeEquipamentosNaoInstalados) {
        this.quantidadeDeEquipamentosNaoInstalados = quantidadeDeEquipamentosNaoInstalados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSetTopBoxNaoInstaladoOut)) return false;
        ConsultaSetTopBoxNaoInstaladoOut other = (ConsultaSetTopBoxNaoInstaladoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.quantidadeDeEquipamentosNaoInstalados == other.getQuantidadeDeEquipamentosNaoInstalados();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getQuantidadeDeEquipamentosNaoInstalados();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaSetTopBoxNaoInstaladoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoInstaladoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeDeEquipamentosNaoInstalados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "quantidadeDeEquipamentosNaoInstalados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
