/**
 * ConsultarArvoreEquipamentosOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarArvoreEquipamentosOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.Produto[] produto;

    public ConsultarArvoreEquipamentosOut() {
    }

    public ConsultarArvoreEquipamentosOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.Produto[] produto) {
        super(
            codigo,
            mensagem,
            descricao);
        this.produto = produto;
    }


    /**
     * Gets the produto value for this ConsultarArvoreEquipamentosOut.
     * 
     * @return produto
     */
    public br.com.gvt.www.tv.configuracaoTV.Produto[] getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this ConsultarArvoreEquipamentosOut.
     * 
     * @param produto
     */
    public void setProduto(br.com.gvt.www.tv.configuracaoTV.Produto[] produto) {
        this.produto = produto;
    }

    public br.com.gvt.www.tv.configuracaoTV.Produto getProduto(int i) {
        return this.produto[i];
    }

    public void setProduto(int i, br.com.gvt.www.tv.configuracaoTV.Produto _value) {
        this.produto[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarArvoreEquipamentosOut)) return false;
        ConsultarArvoreEquipamentosOut other = (ConsultarArvoreEquipamentosOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              java.util.Arrays.equals(this.produto, other.getProduto())));
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
        if (getProduto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduto(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarArvoreEquipamentosOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarArvoreEquipamentosOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Produto"));
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
