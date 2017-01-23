/**
 * OSSTurbonetAdslUseReportOutEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetAdslUseReport;

public class OSSTurbonetAdslUseReportOutEvento  implements java.io.Serializable {
    private java.util.Calendar dataHora;

    private java.lang.String usuario;

    private java.lang.Long tempoConexao;

    private java.lang.String ip_address_v4;

    private java.lang.String ip_address_v6;

    private java.lang.String ipv6_network;

    private java.lang.String tipoEvento;

    private java.lang.String motivoDesconexao;

    private java.lang.Boolean motivoGVT;

    public OSSTurbonetAdslUseReportOutEvento() {
    }

    public OSSTurbonetAdslUseReportOutEvento(
           java.util.Calendar dataHora,
           java.lang.String usuario,
           java.lang.Long tempoConexao,
           java.lang.String ip_address_v4,
           java.lang.String ip_address_v6,
           java.lang.String ipv6_network,
           java.lang.String tipoEvento,
           java.lang.String motivoDesconexao,
           java.lang.Boolean motivoGVT) {
           this.dataHora = dataHora;
           this.usuario = usuario;
           this.tempoConexao = tempoConexao;
           this.ip_address_v4 = ip_address_v4;
           this.ip_address_v6 = ip_address_v6;
           this.ipv6_network = ipv6_network;
           this.tipoEvento = tipoEvento;
           this.motivoDesconexao = motivoDesconexao;
           this.motivoGVT = motivoGVT;
    }


    /**
     * Gets the dataHora value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return dataHora
     */
    public java.util.Calendar getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param dataHora
     */
    public void setDataHora(java.util.Calendar dataHora) {
        this.dataHora = dataHora;
    }


    /**
     * Gets the usuario value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the tempoConexao value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return tempoConexao
     */
    public java.lang.Long getTempoConexao() {
        return tempoConexao;
    }


    /**
     * Sets the tempoConexao value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param tempoConexao
     */
    public void setTempoConexao(java.lang.Long tempoConexao) {
        this.tempoConexao = tempoConexao;
    }


    /**
     * Gets the ip_address_v4 value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return ip_address_v4
     */
    public java.lang.String getIp_address_v4() {
        return ip_address_v4;
    }


    /**
     * Sets the ip_address_v4 value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param ip_address_v4
     */
    public void setIp_address_v4(java.lang.String ip_address_v4) {
        this.ip_address_v4 = ip_address_v4;
    }


    /**
     * Gets the ip_address_v6 value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return ip_address_v6
     */
    public java.lang.String getIp_address_v6() {
        return ip_address_v6;
    }


    /**
     * Sets the ip_address_v6 value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param ip_address_v6
     */
    public void setIp_address_v6(java.lang.String ip_address_v6) {
        this.ip_address_v6 = ip_address_v6;
    }


    /**
     * Gets the ipv6_network value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return ipv6_network
     */
    public java.lang.String getIpv6_network() {
        return ipv6_network;
    }


    /**
     * Sets the ipv6_network value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param ipv6_network
     */
    public void setIpv6_network(java.lang.String ipv6_network) {
        this.ipv6_network = ipv6_network;
    }


    /**
     * Gets the tipoEvento value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return tipoEvento
     */
    public java.lang.String getTipoEvento() {
        return tipoEvento;
    }


    /**
     * Sets the tipoEvento value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param tipoEvento
     */
    public void setTipoEvento(java.lang.String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }


    /**
     * Gets the motivoDesconexao value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return motivoDesconexao
     */
    public java.lang.String getMotivoDesconexao() {
        return motivoDesconexao;
    }


    /**
     * Sets the motivoDesconexao value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param motivoDesconexao
     */
    public void setMotivoDesconexao(java.lang.String motivoDesconexao) {
        this.motivoDesconexao = motivoDesconexao;
    }


    /**
     * Gets the motivoGVT value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @return motivoGVT
     */
    public java.lang.Boolean getMotivoGVT() {
        return motivoGVT;
    }


    /**
     * Sets the motivoGVT value for this OSSTurbonetAdslUseReportOutEvento.
     * 
     * @param motivoGVT
     */
    public void setMotivoGVT(java.lang.Boolean motivoGVT) {
        this.motivoGVT = motivoGVT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetAdslUseReportOutEvento)) return false;
        OSSTurbonetAdslUseReportOutEvento other = (OSSTurbonetAdslUseReportOutEvento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.tempoConexao==null && other.getTempoConexao()==null) || 
             (this.tempoConexao!=null &&
              this.tempoConexao.equals(other.getTempoConexao()))) &&
            ((this.ip_address_v4==null && other.getIp_address_v4()==null) || 
             (this.ip_address_v4!=null &&
              this.ip_address_v4.equals(other.getIp_address_v4()))) &&
            ((this.ip_address_v6==null && other.getIp_address_v6()==null) || 
             (this.ip_address_v6!=null &&
              this.ip_address_v6.equals(other.getIp_address_v6()))) &&
            ((this.ipv6_network==null && other.getIpv6_network()==null) || 
             (this.ipv6_network!=null &&
              this.ipv6_network.equals(other.getIpv6_network()))) &&
            ((this.tipoEvento==null && other.getTipoEvento()==null) || 
             (this.tipoEvento!=null &&
              this.tipoEvento.equals(other.getTipoEvento()))) &&
            ((this.motivoDesconexao==null && other.getMotivoDesconexao()==null) || 
             (this.motivoDesconexao!=null &&
              this.motivoDesconexao.equals(other.getMotivoDesconexao()))) &&
            ((this.motivoGVT==null && other.getMotivoGVT()==null) || 
             (this.motivoGVT!=null &&
              this.motivoGVT.equals(other.getMotivoGVT())));
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
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getTempoConexao() != null) {
            _hashCode += getTempoConexao().hashCode();
        }
        if (getIp_address_v4() != null) {
            _hashCode += getIp_address_v4().hashCode();
        }
        if (getIp_address_v6() != null) {
            _hashCode += getIp_address_v6().hashCode();
        }
        if (getIpv6_network() != null) {
            _hashCode += getIpv6_network().hashCode();
        }
        if (getTipoEvento() != null) {
            _hashCode += getTipoEvento().hashCode();
        }
        if (getMotivoDesconexao() != null) {
            _hashCode += getMotivoDesconexao().hashCode();
        }
        if (getMotivoGVT() != null) {
            _hashCode += getMotivoGVT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetAdslUseReportOutEvento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", ">OSSTurbonetAdslUseReportOut>evento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "dataHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempoConexao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "tempoConexao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address_v4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "ip_address_v4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address_v6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "ip_address_v6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6_network");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "ipv6_network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "tipoEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoDesconexao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "motivoDesconexao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetAdslUseReport", "motivoGVT"));
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
