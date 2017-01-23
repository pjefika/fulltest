/**
 * OSSTurbonetStatusConexaoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao;

public class OSSTurbonetStatusConexaoOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private java.lang.String status;

    private java.util.Calendar data;

    private java.lang.String ip_address_v4;

    private java.lang.String ip_address_v6;

    private java.lang.String ipv6_network;

    private java.lang.String rin;

    private java.lang.String bras;

    private java.lang.String porta;

    private java.lang.String userName;

    private java.lang.String profile;

    private java.lang.String cabinet;

    private java.lang.String designador;

    private com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.CGNAT cgnat;

    public OSSTurbonetStatusConexaoOut() {
    }

    public OSSTurbonetStatusConexaoOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           java.lang.String status,
           java.util.Calendar data,
           java.lang.String ip_address_v4,
           java.lang.String ip_address_v6,
           java.lang.String ipv6_network,
           java.lang.String rin,
           java.lang.String bras,
           java.lang.String porta,
           java.lang.String userName,
           java.lang.String profile,
           java.lang.String cabinet,
           java.lang.String designador,
           com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.CGNAT cgnat) {
           this.mensagem = mensagem;
           this.status = status;
           this.data = data;
           this.ip_address_v4 = ip_address_v4;
           this.ip_address_v6 = ip_address_v6;
           this.ipv6_network = ipv6_network;
           this.rin = rin;
           this.bras = bras;
           this.porta = porta;
           this.userName = userName;
           this.profile = profile;
           this.cabinet = cabinet;
           this.designador = designador;
           this.cgnat = cgnat;
    }


    /**
     * Gets the mensagem value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the status value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the data value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the ip_address_v4 value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return ip_address_v4
     */
    public java.lang.String getIp_address_v4() {
        return ip_address_v4;
    }


    /**
     * Sets the ip_address_v4 value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param ip_address_v4
     */
    public void setIp_address_v4(java.lang.String ip_address_v4) {
        this.ip_address_v4 = ip_address_v4;
    }


    /**
     * Gets the ip_address_v6 value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return ip_address_v6
     */
    public java.lang.String getIp_address_v6() {
        return ip_address_v6;
    }


    /**
     * Sets the ip_address_v6 value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param ip_address_v6
     */
    public void setIp_address_v6(java.lang.String ip_address_v6) {
        this.ip_address_v6 = ip_address_v6;
    }


    /**
     * Gets the ipv6_network value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return ipv6_network
     */
    public java.lang.String getIpv6_network() {
        return ipv6_network;
    }


    /**
     * Sets the ipv6_network value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param ipv6_network
     */
    public void setIpv6_network(java.lang.String ipv6_network) {
        this.ipv6_network = ipv6_network;
    }


    /**
     * Gets the rin value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return rin
     */
    public java.lang.String getRin() {
        return rin;
    }


    /**
     * Sets the rin value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param rin
     */
    public void setRin(java.lang.String rin) {
        this.rin = rin;
    }


    /**
     * Gets the bras value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return bras
     */
    public java.lang.String getBras() {
        return bras;
    }


    /**
     * Sets the bras value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param bras
     */
    public void setBras(java.lang.String bras) {
        this.bras = bras;
    }


    /**
     * Gets the porta value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return porta
     */
    public java.lang.String getPorta() {
        return porta;
    }


    /**
     * Sets the porta value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param porta
     */
    public void setPorta(java.lang.String porta) {
        this.porta = porta;
    }


    /**
     * Gets the userName value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the profile value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return profile
     */
    public java.lang.String getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param profile
     */
    public void setProfile(java.lang.String profile) {
        this.profile = profile;
    }


    /**
     * Gets the cabinet value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return cabinet
     */
    public java.lang.String getCabinet() {
        return cabinet;
    }


    /**
     * Sets the cabinet value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param cabinet
     */
    public void setCabinet(java.lang.String cabinet) {
        this.cabinet = cabinet;
    }


    /**
     * Gets the designador value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return designador
     */
    public java.lang.String getDesignador() {
        return designador;
    }


    /**
     * Sets the designador value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param designador
     */
    public void setDesignador(java.lang.String designador) {
        this.designador = designador;
    }


    /**
     * Gets the cgnat value for this OSSTurbonetStatusConexaoOut.
     * 
     * @return cgnat
     */
    public com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.CGNAT getCgnat() {
        return cgnat;
    }


    /**
     * Sets the cgnat value for this OSSTurbonetStatusConexaoOut.
     * 
     * @param cgnat
     */
    public void setCgnat(com.gvt.www.ws.eai.oss.OSSTurbonetStatusConexao.CGNAT cgnat) {
        this.cgnat = cgnat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetStatusConexaoOut)) return false;
        OSSTurbonetStatusConexaoOut other = (OSSTurbonetStatusConexaoOut) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.ip_address_v4==null && other.getIp_address_v4()==null) || 
             (this.ip_address_v4!=null &&
              this.ip_address_v4.equals(other.getIp_address_v4()))) &&
            ((this.ip_address_v6==null && other.getIp_address_v6()==null) || 
             (this.ip_address_v6!=null &&
              this.ip_address_v6.equals(other.getIp_address_v6()))) &&
            ((this.ipv6_network==null && other.getIpv6_network()==null) || 
             (this.ipv6_network!=null &&
              this.ipv6_network.equals(other.getIpv6_network()))) &&
            ((this.rin==null && other.getRin()==null) || 
             (this.rin!=null &&
              this.rin.equals(other.getRin()))) &&
            ((this.bras==null && other.getBras()==null) || 
             (this.bras!=null &&
              this.bras.equals(other.getBras()))) &&
            ((this.porta==null && other.getPorta()==null) || 
             (this.porta!=null &&
              this.porta.equals(other.getPorta()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.cabinet==null && other.getCabinet()==null) || 
             (this.cabinet!=null &&
              this.cabinet.equals(other.getCabinet()))) &&
            ((this.designador==null && other.getDesignador()==null) || 
             (this.designador!=null &&
              this.designador.equals(other.getDesignador()))) &&
            ((this.cgnat==null && other.getCgnat()==null) || 
             (this.cgnat!=null &&
              this.cgnat.equals(other.getCgnat())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
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
        if (getRin() != null) {
            _hashCode += getRin().hashCode();
        }
        if (getBras() != null) {
            _hashCode += getBras().hashCode();
        }
        if (getPorta() != null) {
            _hashCode += getPorta().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getCabinet() != null) {
            _hashCode += getCabinet().hashCode();
        }
        if (getDesignador() != null) {
            _hashCode += getDesignador().hashCode();
        }
        if (getCgnat() != null) {
            _hashCode += getCgnat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetStatusConexaoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "OSSTurbonetStatusConexaoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address_v4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "ip_address_v4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address_v6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "ip_address_v6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6_network");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "ipv6_network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "rin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "bras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "porta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabinet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "cabinet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "designador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgnat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "cgnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetStatusConexao", "CGNAT"));
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
