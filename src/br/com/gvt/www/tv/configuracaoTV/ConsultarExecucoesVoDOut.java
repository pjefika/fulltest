/**
 * ConsultarExecucoesVoDOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarExecucoesVoDOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD[] execucoesVoD;

    public ConsultarExecucoesVoDOut() {
    }

    public ConsultarExecucoesVoDOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD[] execucoesVoD) {
        super(
            codigo,
            mensagem,
            descricao);
        this.execucoesVoD = execucoesVoD;
    }


    /**
     * Gets the execucoesVoD value for this ConsultarExecucoesVoDOut.
     * 
     * @return execucoesVoD
     */
    public br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD[] getExecucoesVoD() {
        return execucoesVoD;
    }


    /**
     * Sets the execucoesVoD value for this ConsultarExecucoesVoDOut.
     * 
     * @param execucoesVoD
     */
    public void setExecucoesVoD(br.com.gvt.www.tv.configuracaoTV.ExecucaoVoD[] execucoesVoD) {
        this.execucoesVoD = execucoesVoD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarExecucoesVoDOut)) return false;
        ConsultarExecucoesVoDOut other = (ConsultarExecucoesVoDOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.execucoesVoD==null && other.getExecucoesVoD()==null) || 
             (this.execucoesVoD!=null &&
              java.util.Arrays.equals(this.execucoesVoD, other.getExecucoesVoD())));
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
        if (getExecucoesVoD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecucoesVoD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecucoesVoD(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarExecucoesVoDOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarExecucoesVoDOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execucoesVoD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "execucoesVoD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ExecucaoVoD"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "execucaoVoD"));
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
