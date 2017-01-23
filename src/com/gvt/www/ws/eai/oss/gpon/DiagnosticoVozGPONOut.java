/**
 * DiagnosticoVozGPONOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class DiagnosticoVozGPONOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz;

    private com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros;

    private com.gvt.www.ws.eai.oss.gpon.StatusIMS statusIMS;

    private com.gvt.www.ws.eai.oss.gpon.StatusACS statusACS;

    public DiagnosticoVozGPONOut() {
    }

    public DiagnosticoVozGPONOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz,
           com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros,
           com.gvt.www.ws.eai.oss.gpon.StatusIMS statusIMS,
           com.gvt.www.ws.eai.oss.gpon.StatusACS statusACS) {
           this.mensagem = mensagem;
           this.bridgeVoz = bridgeVoz;
           this.bridgeVozParametros = bridgeVozParametros;
           this.statusIMS = statusIMS;
           this.statusACS = statusACS;
    }


    /**
     * Gets the mensagem value for this DiagnosticoVozGPONOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this DiagnosticoVozGPONOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the bridgeVoz value for this DiagnosticoVozGPONOut.
     * 
     * @return bridgeVoz
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeVoz getBridgeVoz() {
        return bridgeVoz;
    }


    /**
     * Sets the bridgeVoz value for this DiagnosticoVozGPONOut.
     * 
     * @param bridgeVoz
     */
    public void setBridgeVoz(com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz) {
        this.bridgeVoz = bridgeVoz;
    }


    /**
     * Gets the bridgeVozParametros value for this DiagnosticoVozGPONOut.
     * 
     * @return bridgeVozParametros
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros getBridgeVozParametros() {
        return bridgeVozParametros;
    }


    /**
     * Sets the bridgeVozParametros value for this DiagnosticoVozGPONOut.
     * 
     * @param bridgeVozParametros
     */
    public void setBridgeVozParametros(com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros) {
        this.bridgeVozParametros = bridgeVozParametros;
    }


    /**
     * Gets the statusIMS value for this DiagnosticoVozGPONOut.
     * 
     * @return statusIMS
     */
    public com.gvt.www.ws.eai.oss.gpon.StatusIMS getStatusIMS() {
        return statusIMS;
    }


    /**
     * Sets the statusIMS value for this DiagnosticoVozGPONOut.
     * 
     * @param statusIMS
     */
    public void setStatusIMS(com.gvt.www.ws.eai.oss.gpon.StatusIMS statusIMS) {
        this.statusIMS = statusIMS;
    }


    /**
     * Gets the statusACS value for this DiagnosticoVozGPONOut.
     * 
     * @return statusACS
     */
    public com.gvt.www.ws.eai.oss.gpon.StatusACS getStatusACS() {
        return statusACS;
    }


    /**
     * Sets the statusACS value for this DiagnosticoVozGPONOut.
     * 
     * @param statusACS
     */
    public void setStatusACS(com.gvt.www.ws.eai.oss.gpon.StatusACS statusACS) {
        this.statusACS = statusACS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoVozGPONOut)) return false;
        DiagnosticoVozGPONOut other = (DiagnosticoVozGPONOut) obj;
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
            ((this.bridgeVoz==null && other.getBridgeVoz()==null) || 
             (this.bridgeVoz!=null &&
              this.bridgeVoz.equals(other.getBridgeVoz()))) &&
            ((this.bridgeVozParametros==null && other.getBridgeVozParametros()==null) || 
             (this.bridgeVozParametros!=null &&
              this.bridgeVozParametros.equals(other.getBridgeVozParametros()))) &&
            ((this.statusIMS==null && other.getStatusIMS()==null) || 
             (this.statusIMS!=null &&
              this.statusIMS.equals(other.getStatusIMS()))) &&
            ((this.statusACS==null && other.getStatusACS()==null) || 
             (this.statusACS!=null &&
              this.statusACS.equals(other.getStatusACS())));
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
        if (getBridgeVoz() != null) {
            _hashCode += getBridgeVoz().hashCode();
        }
        if (getBridgeVozParametros() != null) {
            _hashCode += getBridgeVozParametros().hashCode();
        }
        if (getStatusIMS() != null) {
            _hashCode += getStatusIMS().hashCode();
        }
        if (getStatusACS() != null) {
            _hashCode += getStatusACS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoVozGPONOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoVozGPONOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeVoz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeVoz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVoz"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeVozParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeVozParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVozParametros"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusIMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusIMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusIMS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusACS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusACS"));
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
