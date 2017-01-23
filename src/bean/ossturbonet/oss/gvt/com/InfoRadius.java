/**
 * InfoRadius.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;

public class InfoRadius  implements java.io.Serializable {
    private java.lang.String status;

    /* Gets the cabinet value for this InfoRadius. */
    private java.lang.String cabinet;

    private java.lang.String rin;

    /* Gets the downUp value for this InfoRadius. */
    private java.lang.String downUp;

    /* Gets the profissional value for this InfoRadius. */
    private boolean profissional;

    private java.lang.String ipProfissional;

    /* Gets the authService value for this InfoRadius. */
    private java.lang.String authService;

    /* Gets the accelerator value for this InfoRadius. */
    private boolean accelerator;

    /* Gets the megaflex value for this InfoRadius. */
    private boolean megaflex;

    private java.lang.String radiusProfile;

    private java.lang.String radiusPort;

    public InfoRadius() {
    }

    public InfoRadius(
           java.lang.String status,
           java.lang.String cabinet,
           java.lang.String rin,
           java.lang.String downUp,
           boolean profissional,
           java.lang.String ipProfissional,
           java.lang.String authService,
           boolean accelerator,
           boolean megaflex,
           java.lang.String radiusProfile,
           java.lang.String radiusPort) {
           this.status = status;
           this.cabinet = cabinet;
           this.rin = rin;
           this.downUp = downUp;
           this.profissional = profissional;
           this.ipProfissional = ipProfissional;
           this.authService = authService;
           this.accelerator = accelerator;
           this.megaflex = megaflex;
           this.radiusProfile = radiusProfile;
           this.radiusPort = radiusPort;
    }


    /**
     * Gets the status value for this InfoRadius.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InfoRadius.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the cabinet value for this InfoRadius.
     * 
     * @return cabinet   * Gets the cabinet value for this InfoRadius.
     */
    public java.lang.String getCabinet() {
        return cabinet;
    }


    /**
     * Sets the cabinet value for this InfoRadius.
     * 
     * @param cabinet   * Gets the cabinet value for this InfoRadius.
     */
    public void setCabinet(java.lang.String cabinet) {
        this.cabinet = cabinet;
    }


    /**
     * Gets the rin value for this InfoRadius.
     * 
     * @return rin
     */
    public java.lang.String getRin() {
        return rin;
    }


    /**
     * Sets the rin value for this InfoRadius.
     * 
     * @param rin
     */
    public void setRin(java.lang.String rin) {
        this.rin = rin;
    }


    /**
     * Gets the downUp value for this InfoRadius.
     * 
     * @return downUp   * Gets the downUp value for this InfoRadius.
     */
    public java.lang.String getDownUp() {
        return downUp;
    }


    /**
     * Sets the downUp value for this InfoRadius.
     * 
     * @param downUp   * Gets the downUp value for this InfoRadius.
     */
    public void setDownUp(java.lang.String downUp) {
        this.downUp = downUp;
    }


    /**
     * Gets the profissional value for this InfoRadius.
     * 
     * @return profissional   * Gets the profissional value for this InfoRadius.
     */
    public boolean isProfissional() {
        return profissional;
    }


    /**
     * Sets the profissional value for this InfoRadius.
     * 
     * @param profissional   * Gets the profissional value for this InfoRadius.
     */
    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }


    /**
     * Gets the ipProfissional value for this InfoRadius.
     * 
     * @return ipProfissional
     */
    public java.lang.String getIpProfissional() {
        return ipProfissional;
    }


    /**
     * Sets the ipProfissional value for this InfoRadius.
     * 
     * @param ipProfissional
     */
    public void setIpProfissional(java.lang.String ipProfissional) {
        this.ipProfissional = ipProfissional;
    }


    /**
     * Gets the authService value for this InfoRadius.
     * 
     * @return authService   * Gets the authService value for this InfoRadius.
     */
    public java.lang.String getAuthService() {
        return authService;
    }


    /**
     * Sets the authService value for this InfoRadius.
     * 
     * @param authService   * Gets the authService value for this InfoRadius.
     */
    public void setAuthService(java.lang.String authService) {
        this.authService = authService;
    }


    /**
     * Gets the accelerator value for this InfoRadius.
     * 
     * @return accelerator   * Gets the accelerator value for this InfoRadius.
     */
    public boolean isAccelerator() {
        return accelerator;
    }


    /**
     * Sets the accelerator value for this InfoRadius.
     * 
     * @param accelerator   * Gets the accelerator value for this InfoRadius.
     */
    public void setAccelerator(boolean accelerator) {
        this.accelerator = accelerator;
    }


    /**
     * Gets the megaflex value for this InfoRadius.
     * 
     * @return megaflex   * Gets the megaflex value for this InfoRadius.
     */
    public boolean isMegaflex() {
        return megaflex;
    }


    /**
     * Sets the megaflex value for this InfoRadius.
     * 
     * @param megaflex   * Gets the megaflex value for this InfoRadius.
     */
    public void setMegaflex(boolean megaflex) {
        this.megaflex = megaflex;
    }


    /**
     * Gets the radiusProfile value for this InfoRadius.
     * 
     * @return radiusProfile
     */
    public java.lang.String getRadiusProfile() {
        return radiusProfile;
    }


    /**
     * Sets the radiusProfile value for this InfoRadius.
     * 
     * @param radiusProfile
     */
    public void setRadiusProfile(java.lang.String radiusProfile) {
        this.radiusProfile = radiusProfile;
    }


    /**
     * Gets the radiusPort value for this InfoRadius.
     * 
     * @return radiusPort
     */
    public java.lang.String getRadiusPort() {
        return radiusPort;
    }


    /**
     * Sets the radiusPort value for this InfoRadius.
     * 
     * @param radiusPort
     */
    public void setRadiusPort(java.lang.String radiusPort) {
        this.radiusPort = radiusPort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoRadius)) return false;
        InfoRadius other = (InfoRadius) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cabinet==null && other.getCabinet()==null) || 
             (this.cabinet!=null &&
              this.cabinet.equals(other.getCabinet()))) &&
            ((this.rin==null && other.getRin()==null) || 
             (this.rin!=null &&
              this.rin.equals(other.getRin()))) &&
            ((this.downUp==null && other.getDownUp()==null) || 
             (this.downUp!=null &&
              this.downUp.equals(other.getDownUp()))) &&
            this.profissional == other.isProfissional() &&
            ((this.ipProfissional==null && other.getIpProfissional()==null) || 
             (this.ipProfissional!=null &&
              this.ipProfissional.equals(other.getIpProfissional()))) &&
            ((this.authService==null && other.getAuthService()==null) || 
             (this.authService!=null &&
              this.authService.equals(other.getAuthService()))) &&
            this.accelerator == other.isAccelerator() &&
            this.megaflex == other.isMegaflex() &&
            ((this.radiusProfile==null && other.getRadiusProfile()==null) || 
             (this.radiusProfile!=null &&
              this.radiusProfile.equals(other.getRadiusProfile()))) &&
            ((this.radiusPort==null && other.getRadiusPort()==null) || 
             (this.radiusPort!=null &&
              this.radiusPort.equals(other.getRadiusPort())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCabinet() != null) {
            _hashCode += getCabinet().hashCode();
        }
        if (getRin() != null) {
            _hashCode += getRin().hashCode();
        }
        if (getDownUp() != null) {
            _hashCode += getDownUp().hashCode();
        }
        _hashCode += (isProfissional() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpProfissional() != null) {
            _hashCode += getIpProfissional().hashCode();
        }
        if (getAuthService() != null) {
            _hashCode += getAuthService().hashCode();
        }
        _hashCode += (isAccelerator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMegaflex() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRadiusProfile() != null) {
            _hashCode += getRadiusProfile().hashCode();
        }
        if (getRadiusPort() != null) {
            _hashCode += getRadiusPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoRadius.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoRadius"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabinet");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Cabinet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rin");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Rin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downUp");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "DownUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profissional");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Profissional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipProfissional");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "IpProfissional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authService");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AuthService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accelerator");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Accelerator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("megaflex");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Megaflex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "RadiusProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusPort");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "RadiusPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
