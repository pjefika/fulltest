/**
 * ConsultarCanaisAssinanteOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarCanaisAssinanteOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private java.lang.String cep;

    private br.com.gvt.www.tv.configuracaoTV.Canal[] canais;

    public ConsultarCanaisAssinanteOut() {
    }

    public ConsultarCanaisAssinanteOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String cep,
           br.com.gvt.www.tv.configuracaoTV.Canal[] canais) {
        super(
            codigo,
            mensagem,
            descricao);
        this.cep = cep;
        this.canais = canais;
    }


    /**
     * Gets the cep value for this ConsultarCanaisAssinanteOut.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this ConsultarCanaisAssinanteOut.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the canais value for this ConsultarCanaisAssinanteOut.
     * 
     * @return canais
     */
    public br.com.gvt.www.tv.configuracaoTV.Canal[] getCanais() {
        return canais;
    }


    /**
     * Sets the canais value for this ConsultarCanaisAssinanteOut.
     * 
     * @param canais
     */
    public void setCanais(br.com.gvt.www.tv.configuracaoTV.Canal[] canais) {
        this.canais = canais;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarCanaisAssinanteOut)) return false;
        ConsultarCanaisAssinanteOut other = (ConsultarCanaisAssinanteOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.canais==null && other.getCanais()==null) || 
             (this.canais!=null &&
              java.util.Arrays.equals(this.canais, other.getCanais())));
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
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getCanais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCanais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCanais(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarCanaisAssinanteOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarCanaisAssinanteOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "canais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canal"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "canal"));
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
