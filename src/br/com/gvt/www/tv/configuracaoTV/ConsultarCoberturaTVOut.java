/**
 * ConsultarCoberturaTVOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarCoberturaTVOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.Pacote[] pacotes;

    public ConsultarCoberturaTVOut() {
    }

    public ConsultarCoberturaTVOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.Pacote[] pacotes) {
        super(
            codigo,
            mensagem,
            descricao);
        this.pacotes = pacotes;
    }


    /**
     * Gets the pacotes value for this ConsultarCoberturaTVOut.
     * 
     * @return pacotes
     */
    public br.com.gvt.www.tv.configuracaoTV.Pacote[] getPacotes() {
        return pacotes;
    }


    /**
     * Sets the pacotes value for this ConsultarCoberturaTVOut.
     * 
     * @param pacotes
     */
    public void setPacotes(br.com.gvt.www.tv.configuracaoTV.Pacote[] pacotes) {
        this.pacotes = pacotes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCoberturaTVOut)) return false;
        ConsultarCoberturaTVOut other = (ConsultarCoberturaTVOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pacotes==null && other.getPacotes()==null) || 
             (this.pacotes!=null &&
              java.util.Arrays.equals(this.pacotes, other.getPacotes())));
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
        if (getPacotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPacotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPacotes(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarCoberturaTVOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCoberturaTVOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pacotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pacotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Pacote"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pacote"));
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
