/**
 * ConsultarPayPerViewOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarPayPerViewOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.EventoPayPerView[] eventoPayPerView;

    public ConsultarPayPerViewOut() {
    }

    public ConsultarPayPerViewOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.EventoPayPerView[] eventoPayPerView) {
        super(
            codigo,
            mensagem,
            descricao);
        this.eventoPayPerView = eventoPayPerView;
    }


    /**
     * Gets the eventoPayPerView value for this ConsultarPayPerViewOut.
     * 
     * @return eventoPayPerView
     */
    public br.com.gvt.www.tv.configuracaoTV.EventoPayPerView[] getEventoPayPerView() {
        return eventoPayPerView;
    }


    /**
     * Sets the eventoPayPerView value for this ConsultarPayPerViewOut.
     * 
     * @param eventoPayPerView
     */
    public void setEventoPayPerView(br.com.gvt.www.tv.configuracaoTV.EventoPayPerView[] eventoPayPerView) {
        this.eventoPayPerView = eventoPayPerView;
    }

    public br.com.gvt.www.tv.configuracaoTV.EventoPayPerView getEventoPayPerView(int i) {
        return this.eventoPayPerView[i];
    }

    public void setEventoPayPerView(int i, br.com.gvt.www.tv.configuracaoTV.EventoPayPerView _value) {
        this.eventoPayPerView[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarPayPerViewOut)) return false;
        ConsultarPayPerViewOut other = (ConsultarPayPerViewOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventoPayPerView==null && other.getEventoPayPerView()==null) || 
             (this.eventoPayPerView!=null &&
              java.util.Arrays.equals(this.eventoPayPerView, other.getEventoPayPerView())));
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
        if (getEventoPayPerView() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventoPayPerView());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventoPayPerView(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarPayPerViewOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarPayPerViewOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventoPayPerView");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "eventoPayPerView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerView"));
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
