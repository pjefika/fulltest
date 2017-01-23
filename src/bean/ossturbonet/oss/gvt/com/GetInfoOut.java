/**
 * GetInfoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;

public class GetInfoOut  implements java.io.Serializable {
    private java.lang.String designator;

    private java.lang.String accessDesignator;

    private bean.ossturbonet.oss.gvt.com.InfoTBS infoTBS;

    private bean.ossturbonet.oss.gvt.com.InfoRadius infoRadius;

    private bean.ossturbonet.oss.gvt.com.InfoEquipment infoEquipment;

    private bean.ossturbonet.oss.gvt.com.InfoCricket infoCricket;

    private java.lang.String technology;

    public GetInfoOut() {
    }

    public GetInfoOut(
           java.lang.String designator,
           java.lang.String accessDesignator,
           bean.ossturbonet.oss.gvt.com.InfoTBS infoTBS,
           bean.ossturbonet.oss.gvt.com.InfoRadius infoRadius,
           bean.ossturbonet.oss.gvt.com.InfoEquipment infoEquipment,
           bean.ossturbonet.oss.gvt.com.InfoCricket infoCricket,
           java.lang.String technology) {
           this.designator = designator;
           this.accessDesignator = accessDesignator;
           this.infoTBS = infoTBS;
           this.infoRadius = infoRadius;
           this.infoEquipment = infoEquipment;
           this.infoCricket = infoCricket;
           this.technology = technology;
    }


    /**
     * Gets the designator value for this GetInfoOut.
     * 
     * @return designator
     */
    public java.lang.String getDesignator() {
        return designator;
    }


    /**
     * Sets the designator value for this GetInfoOut.
     * 
     * @param designator
     */
    public void setDesignator(java.lang.String designator) {
        this.designator = designator;
    }


    /**
     * Gets the accessDesignator value for this GetInfoOut.
     * 
     * @return accessDesignator
     */
    public java.lang.String getAccessDesignator() {
        return accessDesignator;
    }


    /**
     * Sets the accessDesignator value for this GetInfoOut.
     * 
     * @param accessDesignator
     */
    public void setAccessDesignator(java.lang.String accessDesignator) {
        this.accessDesignator = accessDesignator;
    }


    /**
     * Gets the infoTBS value for this GetInfoOut.
     * 
     * @return infoTBS
     */
    public bean.ossturbonet.oss.gvt.com.InfoTBS getInfoTBS() {
        return infoTBS;
    }


    /**
     * Sets the infoTBS value for this GetInfoOut.
     * 
     * @param infoTBS
     */
    public void setInfoTBS(bean.ossturbonet.oss.gvt.com.InfoTBS infoTBS) {
        this.infoTBS = infoTBS;
    }


    /**
     * Gets the infoRadius value for this GetInfoOut.
     * 
     * @return infoRadius
     */
    public bean.ossturbonet.oss.gvt.com.InfoRadius getInfoRadius() {
        return infoRadius;
    }


    /**
     * Sets the infoRadius value for this GetInfoOut.
     * 
     * @param infoRadius
     */
    public void setInfoRadius(bean.ossturbonet.oss.gvt.com.InfoRadius infoRadius) {
        this.infoRadius = infoRadius;
    }


    /**
     * Gets the infoEquipment value for this GetInfoOut.
     * 
     * @return infoEquipment
     */
    public bean.ossturbonet.oss.gvt.com.InfoEquipment getInfoEquipment() {
        return infoEquipment;
    }


    /**
     * Sets the infoEquipment value for this GetInfoOut.
     * 
     * @param infoEquipment
     */
    public void setInfoEquipment(bean.ossturbonet.oss.gvt.com.InfoEquipment infoEquipment) {
        this.infoEquipment = infoEquipment;
    }


    /**
     * Gets the infoCricket value for this GetInfoOut.
     * 
     * @return infoCricket
     */
    public bean.ossturbonet.oss.gvt.com.InfoCricket getInfoCricket() {
        return infoCricket;
    }


    /**
     * Sets the infoCricket value for this GetInfoOut.
     * 
     * @param infoCricket
     */
    public void setInfoCricket(bean.ossturbonet.oss.gvt.com.InfoCricket infoCricket) {
        this.infoCricket = infoCricket;
    }


    /**
     * Gets the technology value for this GetInfoOut.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this GetInfoOut.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoOut)) return false;
        GetInfoOut other = (GetInfoOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.accessDesignator==null && other.getAccessDesignator()==null) || 
             (this.accessDesignator!=null &&
              this.accessDesignator.equals(other.getAccessDesignator()))) &&
            ((this.infoTBS==null && other.getInfoTBS()==null) || 
             (this.infoTBS!=null &&
              this.infoTBS.equals(other.getInfoTBS()))) &&
            ((this.infoRadius==null && other.getInfoRadius()==null) || 
             (this.infoRadius!=null &&
              this.infoRadius.equals(other.getInfoRadius()))) &&
            ((this.infoEquipment==null && other.getInfoEquipment()==null) || 
             (this.infoEquipment!=null &&
              this.infoEquipment.equals(other.getInfoEquipment()))) &&
            ((this.infoCricket==null && other.getInfoCricket()==null) || 
             (this.infoCricket!=null &&
              this.infoCricket.equals(other.getInfoCricket()))) &&
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology())));
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
        if (getDesignator() != null) {
            _hashCode += getDesignator().hashCode();
        }
        if (getAccessDesignator() != null) {
            _hashCode += getAccessDesignator().hashCode();
        }
        if (getInfoTBS() != null) {
            _hashCode += getInfoTBS().hashCode();
        }
        if (getInfoRadius() != null) {
            _hashCode += getInfoRadius().hashCode();
        }
        if (getInfoEquipment() != null) {
            _hashCode += getInfoEquipment().hashCode();
        }
        if (getInfoCricket() != null) {
            _hashCode += getInfoCricket().hashCode();
        }
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "GetInfoOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designator");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Designator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AccessDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoTBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoTBS"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoRadius");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoRadius"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoRadius"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoEquipment");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoEquipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoEquipment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoCricket");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCricket"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoCricket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Technology"));
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
