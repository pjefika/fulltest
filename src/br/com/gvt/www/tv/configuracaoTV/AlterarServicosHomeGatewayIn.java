/**
 * AlterarServicosHomeGatewayIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class AlterarServicosHomeGatewayIn  implements java.io.Serializable {
    private java.lang.String designadorTurbonet;

    private br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementoSiebel;

    public AlterarServicosHomeGatewayIn() {
    }

    public AlterarServicosHomeGatewayIn(
           java.lang.String designadorTurbonet,
           br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementoSiebel) {
           this.designadorTurbonet = designadorTurbonet;
           this.elementoSiebel = elementoSiebel;
    }


    /**
     * Gets the designadorTurbonet value for this AlterarServicosHomeGatewayIn.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this AlterarServicosHomeGatewayIn.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the elementoSiebel value for this AlterarServicosHomeGatewayIn.
     * 
     * @return elementoSiebel
     */
    public br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] getElementoSiebel() {
        return elementoSiebel;
    }


    /**
     * Sets the elementoSiebel value for this AlterarServicosHomeGatewayIn.
     * 
     * @param elementoSiebel
     */
    public void setElementoSiebel(br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementoSiebel) {
        this.elementoSiebel = elementoSiebel;
    }

    public br.com.gvt.www.tv.configuracaoTV.ElementoSiebel getElementoSiebel(int i) {
        return this.elementoSiebel[i];
    }

    public void setElementoSiebel(int i, br.com.gvt.www.tv.configuracaoTV.ElementoSiebel _value) {
        this.elementoSiebel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarServicosHomeGatewayIn)) return false;
        AlterarServicosHomeGatewayIn other = (AlterarServicosHomeGatewayIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.elementoSiebel==null && other.getElementoSiebel()==null) || 
             (this.elementoSiebel!=null &&
              java.util.Arrays.equals(this.elementoSiebel, other.getElementoSiebel())));
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
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getElementoSiebel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementoSiebel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementoSiebel(), i);
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
        new org.apache.axis.description.TypeDesc(AlterarServicosHomeGatewayIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "AlterarServicosHomeGatewayIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementoSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "elementoSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoSiebel"));
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
