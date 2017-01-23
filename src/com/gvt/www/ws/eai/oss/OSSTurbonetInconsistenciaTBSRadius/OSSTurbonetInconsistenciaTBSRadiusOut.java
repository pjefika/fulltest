/**
 * OSSTurbonetInconsistenciaTBSRadiusOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetInconsistenciaTBSRadius;

public class OSSTurbonetInconsistenciaTBSRadiusOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.Integer portaTBS;

    private java.lang.Integer portaRadius;

    private java.lang.Integer rinTBS;

    private java.lang.Integer rinRadius;

    private java.lang.String brasTBS;

    private java.lang.String brasRadius;

    private java.lang.Boolean ehInconsistente;

    public OSSTurbonetInconsistenciaTBSRadiusOut() {
    }

    public OSSTurbonetInconsistenciaTBSRadiusOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.Integer portaTBS,
           java.lang.Integer portaRadius,
           java.lang.Integer rinTBS,
           java.lang.Integer rinRadius,
           java.lang.String brasTBS,
           java.lang.String brasRadius,
           java.lang.Boolean ehInconsistente) {
           this.mensagem = mensagem;
           this.portaTBS = portaTBS;
           this.portaRadius = portaRadius;
           this.rinTBS = rinTBS;
           this.rinRadius = rinRadius;
           this.brasTBS = brasTBS;
           this.brasRadius = brasRadius;
           this.ehInconsistente = ehInconsistente;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the portaTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return portaTBS
     */
    public java.lang.Integer getPortaTBS() {
        return portaTBS;
    }


    /**
     * Sets the portaTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param portaTBS
     */
    public void setPortaTBS(java.lang.Integer portaTBS) {
        this.portaTBS = portaTBS;
    }


    /**
     * Gets the portaRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return portaRadius
     */
    public java.lang.Integer getPortaRadius() {
        return portaRadius;
    }


    /**
     * Sets the portaRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param portaRadius
     */
    public void setPortaRadius(java.lang.Integer portaRadius) {
        this.portaRadius = portaRadius;
    }


    /**
     * Gets the rinTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return rinTBS
     */
    public java.lang.Integer getRinTBS() {
        return rinTBS;
    }


    /**
     * Sets the rinTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param rinTBS
     */
    public void setRinTBS(java.lang.Integer rinTBS) {
        this.rinTBS = rinTBS;
    }


    /**
     * Gets the rinRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return rinRadius
     */
    public java.lang.Integer getRinRadius() {
        return rinRadius;
    }


    /**
     * Sets the rinRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param rinRadius
     */
    public void setRinRadius(java.lang.Integer rinRadius) {
        this.rinRadius = rinRadius;
    }


    /**
     * Gets the brasTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return brasTBS
     */
    public java.lang.String getBrasTBS() {
        return brasTBS;
    }


    /**
     * Sets the brasTBS value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param brasTBS
     */
    public void setBrasTBS(java.lang.String brasTBS) {
        this.brasTBS = brasTBS;
    }


    /**
     * Gets the brasRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return brasRadius
     */
    public java.lang.String getBrasRadius() {
        return brasRadius;
    }


    /**
     * Sets the brasRadius value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param brasRadius
     */
    public void setBrasRadius(java.lang.String brasRadius) {
        this.brasRadius = brasRadius;
    }


    /**
     * Gets the ehInconsistente value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @return ehInconsistente
     */
    public java.lang.Boolean getEhInconsistente() {
        return ehInconsistente;
    }


    /**
     * Sets the ehInconsistente value for this OSSTurbonetInconsistenciaTBSRadiusOut.
     * 
     * @param ehInconsistente
     */
    public void setEhInconsistente(java.lang.Boolean ehInconsistente) {
        this.ehInconsistente = ehInconsistente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetInconsistenciaTBSRadiusOut)) return false;
        OSSTurbonetInconsistenciaTBSRadiusOut other = (OSSTurbonetInconsistenciaTBSRadiusOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.portaTBS==null && other.getPortaTBS()==null) || 
             (this.portaTBS!=null &&
              this.portaTBS.equals(other.getPortaTBS()))) &&
            ((this.portaRadius==null && other.getPortaRadius()==null) || 
             (this.portaRadius!=null &&
              this.portaRadius.equals(other.getPortaRadius()))) &&
            ((this.rinTBS==null && other.getRinTBS()==null) || 
             (this.rinTBS!=null &&
              this.rinTBS.equals(other.getRinTBS()))) &&
            ((this.rinRadius==null && other.getRinRadius()==null) || 
             (this.rinRadius!=null &&
              this.rinRadius.equals(other.getRinRadius()))) &&
            ((this.brasTBS==null && other.getBrasTBS()==null) || 
             (this.brasTBS!=null &&
              this.brasTBS.equals(other.getBrasTBS()))) &&
            ((this.brasRadius==null && other.getBrasRadius()==null) || 
             (this.brasRadius!=null &&
              this.brasRadius.equals(other.getBrasRadius()))) &&
            ((this.ehInconsistente==null && other.getEhInconsistente()==null) || 
             (this.ehInconsistente!=null &&
              this.ehInconsistente.equals(other.getEhInconsistente())));
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getPortaTBS() != null) {
            _hashCode += getPortaTBS().hashCode();
        }
        if (getPortaRadius() != null) {
            _hashCode += getPortaRadius().hashCode();
        }
        if (getRinTBS() != null) {
            _hashCode += getRinTBS().hashCode();
        }
        if (getRinRadius() != null) {
            _hashCode += getRinRadius().hashCode();
        }
        if (getBrasTBS() != null) {
            _hashCode += getBrasTBS().hashCode();
        }
        if (getBrasRadius() != null) {
            _hashCode += getBrasRadius().hashCode();
        }
        if (getEhInconsistente() != null) {
            _hashCode += getEhInconsistente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetInconsistenciaTBSRadiusOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "OSSTurbonetInconsistenciaTBSRadiusOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "portaTBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portaRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "portaRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rinTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "rinTBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rinRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "rinRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brasTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "brasTBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brasRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "brasRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ehInconsistente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetInconsistenciaTBSRadius", "ehInconsistente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
