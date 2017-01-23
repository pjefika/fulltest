/**
 * ConfigurarLinhaIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.oss.necservice;

public class ConfigurarLinhaIn  implements java.io.Serializable {
    private br.com.gvt.www.oss.necservice.LinhaInfo linhaInfo;

    private java.lang.String clliCode;

    private br.com.gvt.www.oss.necservice.Service[] services;

    private long identificadorSolicitacao;

    public ConfigurarLinhaIn() {
    }

    public ConfigurarLinhaIn(
           br.com.gvt.www.oss.necservice.LinhaInfo linhaInfo,
           java.lang.String clliCode,
           br.com.gvt.www.oss.necservice.Service[] services,
           long identificadorSolicitacao) {
           this.linhaInfo = linhaInfo;
           this.clliCode = clliCode;
           this.services = services;
           this.identificadorSolicitacao = identificadorSolicitacao;
    }


    /**
     * Gets the linhaInfo value for this ConfigurarLinhaIn.
     * 
     * @return linhaInfo
     */
    public br.com.gvt.www.oss.necservice.LinhaInfo getLinhaInfo() {
        return linhaInfo;
    }


    /**
     * Sets the linhaInfo value for this ConfigurarLinhaIn.
     * 
     * @param linhaInfo
     */
    public void setLinhaInfo(br.com.gvt.www.oss.necservice.LinhaInfo linhaInfo) {
        this.linhaInfo = linhaInfo;
    }


    /**
     * Gets the clliCode value for this ConfigurarLinhaIn.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this ConfigurarLinhaIn.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the services value for this ConfigurarLinhaIn.
     * 
     * @return services
     */
    public br.com.gvt.www.oss.necservice.Service[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this ConfigurarLinhaIn.
     * 
     * @param services
     */
    public void setServices(br.com.gvt.www.oss.necservice.Service[] services) {
        this.services = services;
    }

    public br.com.gvt.www.oss.necservice.Service getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, br.com.gvt.www.oss.necservice.Service _value) {
        this.services[i] = _value;
    }


    /**
     * Gets the identificadorSolicitacao value for this ConfigurarLinhaIn.
     * 
     * @return identificadorSolicitacao
     */
    public long getIdentificadorSolicitacao() {
        return identificadorSolicitacao;
    }


    /**
     * Sets the identificadorSolicitacao value for this ConfigurarLinhaIn.
     * 
     * @param identificadorSolicitacao
     */
    public void setIdentificadorSolicitacao(long identificadorSolicitacao) {
        this.identificadorSolicitacao = identificadorSolicitacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarLinhaIn)) return false;
        ConfigurarLinhaIn other = (ConfigurarLinhaIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linhaInfo==null && other.getLinhaInfo()==null) || 
             (this.linhaInfo!=null &&
              this.linhaInfo.equals(other.getLinhaInfo()))) &&
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            this.identificadorSolicitacao == other.getIdentificadorSolicitacao();
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
        if (getLinhaInfo() != null) {
            _hashCode += getLinhaInfo().hashCode();
        }
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getIdentificadorSolicitacao()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarLinhaIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ConfigurarLinhaIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linhaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "LinhaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "LinhaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "ClliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "Service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorSolicitacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/oss/necservice", "IdentificadorSolicitacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
