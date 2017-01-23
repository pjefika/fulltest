/**
 * RemoverSetTopBoxIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class RemoverSetTopBoxIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private java.lang.String codOrdemServico;

    private br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao[] equipamentoDeTV;

    public RemoverSetTopBoxIn() {
    }

    public RemoverSetTopBoxIn(
           java.lang.String designadorTV,
           java.lang.String codOrdemServico,
           br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao[] equipamentoDeTV) {
           this.designadorTV = designadorTV;
           this.codOrdemServico = codOrdemServico;
           this.equipamentoDeTV = equipamentoDeTV;
    }


    /**
     * Gets the designadorTV value for this RemoverSetTopBoxIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this RemoverSetTopBoxIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the codOrdemServico value for this RemoverSetTopBoxIn.
     * 
     * @return codOrdemServico
     */
    public java.lang.String getCodOrdemServico() {
        return codOrdemServico;
    }


    /**
     * Sets the codOrdemServico value for this RemoverSetTopBoxIn.
     * 
     * @param codOrdemServico
     */
    public void setCodOrdemServico(java.lang.String codOrdemServico) {
        this.codOrdemServico = codOrdemServico;
    }


    /**
     * Gets the equipamentoDeTV value for this RemoverSetTopBoxIn.
     * 
     * @return equipamentoDeTV
     */
    public br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao[] getEquipamentoDeTV() {
        return equipamentoDeTV;
    }


    /**
     * Sets the equipamentoDeTV value for this RemoverSetTopBoxIn.
     * 
     * @param equipamentoDeTV
     */
    public void setEquipamentoDeTV(br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao[] equipamentoDeTV) {
        this.equipamentoDeTV = equipamentoDeTV;
    }

    public br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao getEquipamentoDeTV(int i) {
        return this.equipamentoDeTV[i];
    }

    public void setEquipamentoDeTV(int i, br.com.gvt.www.tv.configuracaoTV.EquipamentoParaRemocao _value) {
        this.equipamentoDeTV[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoverSetTopBoxIn)) return false;
        RemoverSetTopBoxIn other = (RemoverSetTopBoxIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.codOrdemServico==null && other.getCodOrdemServico()==null) || 
             (this.codOrdemServico!=null &&
              this.codOrdemServico.equals(other.getCodOrdemServico()))) &&
            ((this.equipamentoDeTV==null && other.getEquipamentoDeTV()==null) || 
             (this.equipamentoDeTV!=null &&
              java.util.Arrays.equals(this.equipamentoDeTV, other.getEquipamentoDeTV())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getCodOrdemServico() != null) {
            _hashCode += getCodOrdemServico().hashCode();
        }
        if (getEquipamentoDeTV() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEquipamentoDeTV());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEquipamentoDeTV(), i);
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
        new org.apache.axis.description.TypeDesc(RemoverSetTopBoxIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "RemoverSetTopBoxIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOrdemServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "codOrdemServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipamentoDeTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "equipamentoDeTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EquipamentoParaRemocao"));
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
