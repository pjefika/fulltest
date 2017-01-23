/**
 * ConsultaSetTopBoxNaoRecolhidoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.consultaSetTopBox;

public class ConsultaSetTopBoxNaoRecolhidoOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.SetTopBox[] setTopBox;

    public ConsultaSetTopBoxNaoRecolhidoOut() {
    }

    public ConsultaSetTopBoxNaoRecolhidoOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.SetTopBox[] setTopBox) {
        super(
            codigo,
            mensagem,
            descricao);
        this.setTopBox = setTopBox;
    }


    /**
     * Gets the setTopBox value for this ConsultaSetTopBoxNaoRecolhidoOut.
     * 
     * @return setTopBox
     */
    public br.com.gvt.www.tv.configuracaoTV.SetTopBox[] getSetTopBox() {
        return setTopBox;
    }


    /**
     * Sets the setTopBox value for this ConsultaSetTopBoxNaoRecolhidoOut.
     * 
     * @param setTopBox
     */
    public void setSetTopBox(br.com.gvt.www.tv.configuracaoTV.SetTopBox[] setTopBox) {
        this.setTopBox = setTopBox;
    }

    public br.com.gvt.www.tv.configuracaoTV.SetTopBox getSetTopBox(int i) {
        return this.setTopBox[i];
    }

    public void setSetTopBox(int i, br.com.gvt.www.tv.configuracaoTV.SetTopBox _value) {
        this.setTopBox[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSetTopBoxNaoRecolhidoOut)) return false;
        ConsultaSetTopBoxNaoRecolhidoOut other = (ConsultaSetTopBoxNaoRecolhidoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.setTopBox==null && other.getSetTopBox()==null) || 
             (this.setTopBox!=null &&
              java.util.Arrays.equals(this.setTopBox, other.getSetTopBox())));
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
        if (getSetTopBox() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetTopBox());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSetTopBox(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultaSetTopBoxNaoRecolhidoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "ConsultaSetTopBoxNaoRecolhidoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaSetTopBox", "setTopBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "SetTopBox"));
        elemField.setMinOccurs(0);
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
