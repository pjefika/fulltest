/**
 * ProdutoSAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ProdutoSAP  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.ParametroTV[] parametroSAP;

    private java.lang.String descricao;

    public ProdutoSAP() {
    }

    public ProdutoSAP(
           br.com.gvt.www.tv.configuracaoTV.ParametroTV[] parametroSAP,
           java.lang.String descricao) {
           this.parametroSAP = parametroSAP;
           this.descricao = descricao;
    }


    /**
     * Gets the parametroSAP value for this ProdutoSAP.
     * 
     * @return parametroSAP
     */
    public br.com.gvt.www.tv.configuracaoTV.ParametroTV[] getParametroSAP() {
        return parametroSAP;
    }


    /**
     * Sets the parametroSAP value for this ProdutoSAP.
     * 
     * @param parametroSAP
     */
    public void setParametroSAP(br.com.gvt.www.tv.configuracaoTV.ParametroTV[] parametroSAP) {
        this.parametroSAP = parametroSAP;
    }

    public br.com.gvt.www.tv.configuracaoTV.ParametroTV getParametroSAP(int i) {
        return this.parametroSAP[i];
    }

    public void setParametroSAP(int i, br.com.gvt.www.tv.configuracaoTV.ParametroTV _value) {
        this.parametroSAP[i] = _value;
    }


    /**
     * Gets the descricao value for this ProdutoSAP.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ProdutoSAP.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProdutoSAP)) return false;
        ProdutoSAP other = (ProdutoSAP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parametroSAP==null && other.getParametroSAP()==null) || 
             (this.parametroSAP!=null &&
              java.util.Arrays.equals(this.parametroSAP, other.getParametroSAP()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao())));
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
        if (getParametroSAP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametroSAP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametroSAP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProdutoSAP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ProdutoSAP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametroSAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "parametroSAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ParametroTV"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
