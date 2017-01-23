/**
 * AtivarElementosInventarioTVIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class AtivarElementosInventarioTVIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private br.com.gvt.www.tv.configuracaoTV.ElementoInventario[] elementoInventario;

    private com.gvt.www.metaData.smarttool.Credenciais credencial;

    public AtivarElementosInventarioTVIn() {
    }

    public AtivarElementosInventarioTVIn(
           java.lang.String designadorTV,
           br.com.gvt.www.tv.configuracaoTV.ElementoInventario[] elementoInventario,
           com.gvt.www.metaData.smarttool.Credenciais credencial) {
           this.designadorTV = designadorTV;
           this.elementoInventario = elementoInventario;
           this.credencial = credencial;
    }


    /**
     * Gets the designadorTV value for this AtivarElementosInventarioTVIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this AtivarElementosInventarioTVIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the elementoInventario value for this AtivarElementosInventarioTVIn.
     * 
     * @return elementoInventario
     */
    public br.com.gvt.www.tv.configuracaoTV.ElementoInventario[] getElementoInventario() {
        return elementoInventario;
    }


    /**
     * Sets the elementoInventario value for this AtivarElementosInventarioTVIn.
     * 
     * @param elementoInventario
     */
    public void setElementoInventario(br.com.gvt.www.tv.configuracaoTV.ElementoInventario[] elementoInventario) {
        this.elementoInventario = elementoInventario;
    }

    public br.com.gvt.www.tv.configuracaoTV.ElementoInventario getElementoInventario(int i) {
        return this.elementoInventario[i];
    }

    public void setElementoInventario(int i, br.com.gvt.www.tv.configuracaoTV.ElementoInventario _value) {
        this.elementoInventario[i] = _value;
    }


    /**
     * Gets the credencial value for this AtivarElementosInventarioTVIn.
     * 
     * @return credencial
     */
    public com.gvt.www.metaData.smarttool.Credenciais getCredencial() {
        return credencial;
    }


    /**
     * Sets the credencial value for this AtivarElementosInventarioTVIn.
     * 
     * @param credencial
     */
    public void setCredencial(com.gvt.www.metaData.smarttool.Credenciais credencial) {
        this.credencial = credencial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtivarElementosInventarioTVIn)) return false;
        AtivarElementosInventarioTVIn other = (AtivarElementosInventarioTVIn) obj;
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
            ((this.elementoInventario==null && other.getElementoInventario()==null) || 
             (this.elementoInventario!=null &&
              java.util.Arrays.equals(this.elementoInventario, other.getElementoInventario()))) &&
            ((this.credencial==null && other.getCredencial()==null) || 
             (this.credencial!=null &&
              this.credencial.equals(other.getCredencial())));
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
        if (getElementoInventario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementoInventario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementoInventario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredencial() != null) {
            _hashCode += getCredencial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtivarElementosInventarioTVIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AtivarElementosInventarioTVIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementoInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "elementoInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoInventario"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "credencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/metaData/smarttool", "Credenciais"));
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
