/**
 * EquipmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.ipvodinfo;

public class EquipmentInfo  implements java.io.Serializable {
    private java.lang.String ip;

    private java.lang.String userId;

    private java.lang.String authInfo;

    private java.util.Calendar lastDateConnection;

    private java.lang.String motivo;

    private br.com.gvt.www.tv.ipvodinfo.Status status;

    private br.com.gvt.www.tv.ipvodinfo.ConnectivityType connectivityType;

    public EquipmentInfo() {
    }

    public EquipmentInfo(
           java.lang.String ip,
           java.lang.String userId,
           java.lang.String authInfo,
           java.util.Calendar lastDateConnection,
           java.lang.String motivo,
           br.com.gvt.www.tv.ipvodinfo.Status status,
           br.com.gvt.www.tv.ipvodinfo.ConnectivityType connectivityType) {
           this.ip = ip;
           this.userId = userId;
           this.authInfo = authInfo;
           this.lastDateConnection = lastDateConnection;
           this.motivo = motivo;
           this.status = status;
           this.connectivityType = connectivityType;
    }


    /**
     * Gets the ip value for this EquipmentInfo.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this EquipmentInfo.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the userId value for this EquipmentInfo.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this EquipmentInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the authInfo value for this EquipmentInfo.
     * 
     * @return authInfo
     */
    public java.lang.String getAuthInfo() {
        return authInfo;
    }


    /**
     * Sets the authInfo value for this EquipmentInfo.
     * 
     * @param authInfo
     */
    public void setAuthInfo(java.lang.String authInfo) {
        this.authInfo = authInfo;
    }


    /**
     * Gets the lastDateConnection value for this EquipmentInfo.
     * 
     * @return lastDateConnection
     */
    public java.util.Calendar getLastDateConnection() {
        return lastDateConnection;
    }


    /**
     * Sets the lastDateConnection value for this EquipmentInfo.
     * 
     * @param lastDateConnection
     */
    public void setLastDateConnection(java.util.Calendar lastDateConnection) {
        this.lastDateConnection = lastDateConnection;
    }


    /**
     * Gets the motivo value for this EquipmentInfo.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this EquipmentInfo.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the status value for this EquipmentInfo.
     * 
     * @return status
     */
    public br.com.gvt.www.tv.ipvodinfo.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EquipmentInfo.
     * 
     * @param status
     */
    public void setStatus(br.com.gvt.www.tv.ipvodinfo.Status status) {
        this.status = status;
    }


    /**
     * Gets the connectivityType value for this EquipmentInfo.
     * 
     * @return connectivityType
     */
    public br.com.gvt.www.tv.ipvodinfo.ConnectivityType getConnectivityType() {
        return connectivityType;
    }


    /**
     * Sets the connectivityType value for this EquipmentInfo.
     * 
     * @param connectivityType
     */
    public void setConnectivityType(br.com.gvt.www.tv.ipvodinfo.ConnectivityType connectivityType) {
        this.connectivityType = connectivityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquipmentInfo)) return false;
        EquipmentInfo other = (EquipmentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.authInfo==null && other.getAuthInfo()==null) || 
             (this.authInfo!=null &&
              this.authInfo.equals(other.getAuthInfo()))) &&
            ((this.lastDateConnection==null && other.getLastDateConnection()==null) || 
             (this.lastDateConnection!=null &&
              this.lastDateConnection.equals(other.getLastDateConnection()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.connectivityType==null && other.getConnectivityType()==null) || 
             (this.connectivityType!=null &&
              this.connectivityType.equals(other.getConnectivityType())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getAuthInfo() != null) {
            _hashCode += getAuthInfo().hashCode();
        }
        if (getLastDateConnection() != null) {
            _hashCode += getLastDateConnection().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getConnectivityType() != null) {
            _hashCode += getConnectivityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquipmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "EquipmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "authInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDateConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "lastDateConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectivityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "connectivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "ConnectivityType"));
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
