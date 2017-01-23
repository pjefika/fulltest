/**
 * ConsultarServicosHomeGatewayOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConsultarServicosHomeGatewayOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway;

    private br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] servicoHomeGateway;

    public ConsultarServicosHomeGatewayOut() {
    }

    public ConsultarServicosHomeGatewayOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway,
           br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] servicoHomeGateway) {
        super(
            codigo,
            mensagem,
            descricao);
        this.homeGateway = homeGateway;
        this.servicoHomeGateway = servicoHomeGateway;
    }


    /**
     * Gets the homeGateway value for this ConsultarServicosHomeGatewayOut.
     * 
     * @return homeGateway
     */
    public br.com.gvt.www.tv.configuracaoTV.HomeGateway getHomeGateway() {
        return homeGateway;
    }


    /**
     * Sets the homeGateway value for this ConsultarServicosHomeGatewayOut.
     * 
     * @param homeGateway
     */
    public void setHomeGateway(br.com.gvt.www.tv.configuracaoTV.HomeGateway homeGateway) {
        this.homeGateway = homeGateway;
    }


    /**
     * Gets the servicoHomeGateway value for this ConsultarServicosHomeGatewayOut.
     * 
     * @return servicoHomeGateway
     */
    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] getServicoHomeGateway() {
        return servicoHomeGateway;
    }


    /**
     * Sets the servicoHomeGateway value for this ConsultarServicosHomeGatewayOut.
     * 
     * @param servicoHomeGateway
     */
    public void setServicoHomeGateway(br.com.gvt.www.tv.configuracaoTV.InstanciaServicos[] servicoHomeGateway) {
        this.servicoHomeGateway = servicoHomeGateway;
    }

    public br.com.gvt.www.tv.configuracaoTV.InstanciaServicos getServicoHomeGateway(int i) {
        return this.servicoHomeGateway[i];
    }

    public void setServicoHomeGateway(int i, br.com.gvt.www.tv.configuracaoTV.InstanciaServicos _value) {
        this.servicoHomeGateway[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarServicosHomeGatewayOut)) return false;
        ConsultarServicosHomeGatewayOut other = (ConsultarServicosHomeGatewayOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.homeGateway==null && other.getHomeGateway()==null) || 
             (this.homeGateway!=null &&
              this.homeGateway.equals(other.getHomeGateway()))) &&
            ((this.servicoHomeGateway==null && other.getServicoHomeGateway()==null) || 
             (this.servicoHomeGateway!=null &&
              java.util.Arrays.equals(this.servicoHomeGateway, other.getServicoHomeGateway())));
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
        if (getHomeGateway() != null) {
            _hashCode += getHomeGateway().hashCode();
        }
        if (getServicoHomeGateway() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicoHomeGateway());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicoHomeGateway(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultarServicosHomeGatewayOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConsultarServicosHomeGatewayOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "homeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "HomeGateway"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicoHomeGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "servicoHomeGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InstanciaServicos"));
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
