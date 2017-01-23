/**
 * DiagnosticoHPNAOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoHPNA;

public class DiagnosticoHPNAOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA[] diagnosticos;

    public DiagnosticoHPNAOut() {
    }

    public DiagnosticoHPNAOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA[] diagnosticos) {
        super(
            codigo,
            mensagem,
            descricao);
        this.diagnosticos = diagnosticos;
    }


    /**
     * Gets the diagnosticos value for this DiagnosticoHPNAOut.
     * 
     * @return diagnosticos
     */
    public br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA[] getDiagnosticos() {
        return diagnosticos;
    }


    /**
     * Sets the diagnosticos value for this DiagnosticoHPNAOut.
     * 
     * @param diagnosticos
     */
    public void setDiagnosticos(br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA[] diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA getDiagnosticos(int i) {
        return this.diagnosticos[i];
    }

    public void setDiagnosticos(int i, br.com.gvt.www.tv.diagnosticoHPNA.DiagnosticoHPNA _value) {
        this.diagnosticos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoHPNAOut)) return false;
        DiagnosticoHPNAOut other = (DiagnosticoHPNAOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diagnosticos==null && other.getDiagnosticos()==null) || 
             (this.diagnosticos!=null &&
              java.util.Arrays.equals(this.diagnosticos, other.getDiagnosticos())));
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
        if (getDiagnosticos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticos(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnosticoHPNAOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNAOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "diagnosticos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoHPNA"));
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
