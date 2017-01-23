/**
 * ConsultarEquipamentosSAPOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarEquipamentosSAPOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.ProdutoSAP[] equipamentoSAP;

    public ConsultarEquipamentosSAPOut() {
    }

    public ConsultarEquipamentosSAPOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.ProdutoSAP[] equipamentoSAP) {
        super(
            codigo,
            mensagem,
            descricao);
        this.equipamentoSAP = equipamentoSAP;
    }


    /**
     * Gets the equipamentoSAP value for this ConsultarEquipamentosSAPOut.
     * 
     * @return equipamentoSAP
     */
    public br.com.gvt.www.tv.configuracaoTV.ProdutoSAP[] getEquipamentoSAP() {
        return equipamentoSAP;
    }


    /**
     * Sets the equipamentoSAP value for this ConsultarEquipamentosSAPOut.
     * 
     * @param equipamentoSAP
     */
    public void setEquipamentoSAP(br.com.gvt.www.tv.configuracaoTV.ProdutoSAP[] equipamentoSAP) {
        this.equipamentoSAP = equipamentoSAP;
    }

    public br.com.gvt.www.tv.configuracaoTV.ProdutoSAP getEquipamentoSAP(int i) {
        return this.equipamentoSAP[i];
    }

    public void setEquipamentoSAP(int i, br.com.gvt.www.tv.configuracaoTV.ProdutoSAP _value) {
        this.equipamentoSAP[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarEquipamentosSAPOut)) return false;
        ConsultarEquipamentosSAPOut other = (ConsultarEquipamentosSAPOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.equipamentoSAP==null && other.getEquipamentoSAP()==null) || 
             (this.equipamentoSAP!=null &&
              java.util.Arrays.equals(this.equipamentoSAP, other.getEquipamentoSAP())));
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
        if (getEquipamentoSAP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipamentoSAP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipamentoSAP(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarEquipamentosSAPOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarEquipamentosSAPOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamentoSAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EquipamentoSAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ProdutoSAP"));
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
