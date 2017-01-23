/**
 * ServicesRegionOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.coberturatv;

public class ServicesRegionOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.coberturatv.ServiceRegion[] serviceRegion;

    public ServicesRegionOut() {
    }

    public ServicesRegionOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.coberturatv.ServiceRegion[] serviceRegion) {
        super(
            codigo,
            mensagem,
            descricao);
        this.serviceRegion = serviceRegion;
    }


    /**
     * Gets the serviceRegion value for this ServicesRegionOut.
     * 
     * @return serviceRegion
     */
    public br.com.gvt.www.tv.coberturatv.ServiceRegion[] getServiceRegion() {
        return serviceRegion;
    }


    /**
     * Sets the serviceRegion value for this ServicesRegionOut.
     * 
     * @param serviceRegion
     */
    public void setServiceRegion(br.com.gvt.www.tv.coberturatv.ServiceRegion[] serviceRegion) {
        this.serviceRegion = serviceRegion;
    }

    public br.com.gvt.www.tv.coberturatv.ServiceRegion getServiceRegion(int i) {
        return this.serviceRegion[i];
    }

    public void setServiceRegion(int i, br.com.gvt.www.tv.coberturatv.ServiceRegion _value) {
        this.serviceRegion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicesRegionOut)) return false;
        ServicesRegionOut other = (ServicesRegionOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceRegion==null && other.getServiceRegion()==null) || 
             (this.serviceRegion!=null &&
              java.util.Arrays.equals(this.serviceRegion, other.getServiceRegion())));
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
        if (getServiceRegion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceRegion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceRegion(), i);
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
        new org.apache.axis.description.TypeDesc(ServicesRegionOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServicesRegionOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/coberturatv", "ServiceRegion"));
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
