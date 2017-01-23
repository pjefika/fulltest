/**
 * HistoricoDiagnosticoHPNAOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoHPNA;

public class HistoricoDiagnosticoHPNAOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA[] execucoes;

    public HistoricoDiagnosticoHPNAOut() {
    }

    public HistoricoDiagnosticoHPNAOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA[] execucoes) {
        super(
            codigo,
            mensagem,
            descricao);
        this.execucoes = execucoes;
    }


    /**
     * Gets the execucoes value for this HistoricoDiagnosticoHPNAOut.
     * 
     * @return execucoes
     */
    public br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA[] getExecucoes() {
        return execucoes;
    }


    /**
     * Sets the execucoes value for this HistoricoDiagnosticoHPNAOut.
     * 
     * @param execucoes
     */
    public void setExecucoes(br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA[] execucoes) {
        this.execucoes = execucoes;
    }

    public br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA getExecucoes(int i) {
        return this.execucoes[i];
    }

    public void setExecucoes(int i, br.com.gvt.www.tv.diagnosticoCPE.ExecucaoTesteHPNA _value) {
        this.execucoes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoricoDiagnosticoHPNAOut)) return false;
        HistoricoDiagnosticoHPNAOut other = (HistoricoDiagnosticoHPNAOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.execucoes==null && other.getExecucoes()==null) || 
             (this.execucoes!=null &&
              java.util.Arrays.equals(this.execucoes, other.getExecucoes())));
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
        if (getExecucoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecucoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecucoes(), i);
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
        new org.apache.axis.description.TypeDesc(HistoricoDiagnosticoHPNAOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "HistoricoDiagnosticoHPNAOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execucoes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "execucoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ExecucaoTesteHPNA"));
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
