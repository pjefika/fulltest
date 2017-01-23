/**
 * ADSLRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;


/**
 * Classe responsável por conter os dados do ADSLRate.
 *  ADSLRate.java
 */
public class ADSLRate  implements java.io.Serializable {
    /* Getter id. */
    private java.lang.Integer id;

    /* Getter downStreamProfile. */
    private int downStreamProfile;

    /* Getter upStreamProfile. */
    private int upStreamProfile;

    /* Getter upStreamCRM. */
    private int upStreamCRM;

    /* Getter downStreamCRM. */
    private int downStreamCRM;

    /* Getter profileMilegate. */
    private java.lang.String profileMilegate;

    /* Getter transModeDefault. */
    private java.lang.String transModeDefault;

    private java.lang.String[] modulations;

    private java.lang.String firstModulationDay;

    private java.lang.String firstModulationDayIsAnnexM;

    public ADSLRate() {
    }

    public ADSLRate(
           java.lang.Integer id,
           int downStreamProfile,
           int upStreamProfile,
           int upStreamCRM,
           int downStreamCRM,
           java.lang.String profileMilegate,
           java.lang.String transModeDefault,
           java.lang.String[] modulations,
           java.lang.String firstModulationDay,
           java.lang.String firstModulationDayIsAnnexM) {
           this.id = id;
           this.downStreamProfile = downStreamProfile;
           this.upStreamProfile = upStreamProfile;
           this.upStreamCRM = upStreamCRM;
           this.downStreamCRM = downStreamCRM;
           this.profileMilegate = profileMilegate;
           this.transModeDefault = transModeDefault;
           this.modulations = modulations;
           this.firstModulationDay = firstModulationDay;
           this.firstModulationDayIsAnnexM = firstModulationDayIsAnnexM;
    }


    /**
     * Gets the id value for this ADSLRate.
     * 
     * @return id   * Getter id.
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ADSLRate.
     * 
     * @param id   * Getter id.
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the downStreamProfile value for this ADSLRate.
     * 
     * @return downStreamProfile   * Getter downStreamProfile.
     */
    public int getDownStreamProfile() {
        return downStreamProfile;
    }


    /**
     * Sets the downStreamProfile value for this ADSLRate.
     * 
     * @param downStreamProfile   * Getter downStreamProfile.
     */
    public void setDownStreamProfile(int downStreamProfile) {
        this.downStreamProfile = downStreamProfile;
    }


    /**
     * Gets the upStreamProfile value for this ADSLRate.
     * 
     * @return upStreamProfile   * Getter upStreamProfile.
     */
    public int getUpStreamProfile() {
        return upStreamProfile;
    }


    /**
     * Sets the upStreamProfile value for this ADSLRate.
     * 
     * @param upStreamProfile   * Getter upStreamProfile.
     */
    public void setUpStreamProfile(int upStreamProfile) {
        this.upStreamProfile = upStreamProfile;
    }


    /**
     * Gets the upStreamCRM value for this ADSLRate.
     * 
     * @return upStreamCRM   * Getter upStreamCRM.
     */
    public int getUpStreamCRM() {
        return upStreamCRM;
    }


    /**
     * Sets the upStreamCRM value for this ADSLRate.
     * 
     * @param upStreamCRM   * Getter upStreamCRM.
     */
    public void setUpStreamCRM(int upStreamCRM) {
        this.upStreamCRM = upStreamCRM;
    }


    /**
     * Gets the downStreamCRM value for this ADSLRate.
     * 
     * @return downStreamCRM   * Getter downStreamCRM.
     */
    public int getDownStreamCRM() {
        return downStreamCRM;
    }


    /**
     * Sets the downStreamCRM value for this ADSLRate.
     * 
     * @param downStreamCRM   * Getter downStreamCRM.
     */
    public void setDownStreamCRM(int downStreamCRM) {
        this.downStreamCRM = downStreamCRM;
    }


    /**
     * Gets the profileMilegate value for this ADSLRate.
     * 
     * @return profileMilegate   * Getter profileMilegate.
     */
    public java.lang.String getProfileMilegate() {
        return profileMilegate;
    }


    /**
     * Sets the profileMilegate value for this ADSLRate.
     * 
     * @param profileMilegate   * Getter profileMilegate.
     */
    public void setProfileMilegate(java.lang.String profileMilegate) {
        this.profileMilegate = profileMilegate;
    }


    /**
     * Gets the transModeDefault value for this ADSLRate.
     * 
     * @return transModeDefault   * Getter transModeDefault.
     */
    public java.lang.String getTransModeDefault() {
        return transModeDefault;
    }


    /**
     * Sets the transModeDefault value for this ADSLRate.
     * 
     * @param transModeDefault   * Getter transModeDefault.
     */
    public void setTransModeDefault(java.lang.String transModeDefault) {
        this.transModeDefault = transModeDefault;
    }


    /**
     * Gets the modulations value for this ADSLRate.
     * 
     * @return modulations
     */
    public java.lang.String[] getModulations() {
        return modulations;
    }


    /**
     * Sets the modulations value for this ADSLRate.
     * 
     * @param modulations
     */
    public void setModulations(java.lang.String[] modulations) {
        this.modulations = modulations;
    }

    public java.lang.String getModulations(int i) {
        return this.modulations[i];
    }

    public void setModulations(int i, java.lang.String _value) {
        this.modulations[i] = _value;
    }


    /**
     * Gets the firstModulationDay value for this ADSLRate.
     * 
     * @return firstModulationDay
     */
    public java.lang.String getFirstModulationDay() {
        return firstModulationDay;
    }


    /**
     * Sets the firstModulationDay value for this ADSLRate.
     * 
     * @param firstModulationDay
     */
    public void setFirstModulationDay(java.lang.String firstModulationDay) {
        this.firstModulationDay = firstModulationDay;
    }


    /**
     * Gets the firstModulationDayIsAnnexM value for this ADSLRate.
     * 
     * @return firstModulationDayIsAnnexM
     */
    public java.lang.String getFirstModulationDayIsAnnexM() {
        return firstModulationDayIsAnnexM;
    }


    /**
     * Sets the firstModulationDayIsAnnexM value for this ADSLRate.
     * 
     * @param firstModulationDayIsAnnexM
     */
    public void setFirstModulationDayIsAnnexM(java.lang.String firstModulationDayIsAnnexM) {
        this.firstModulationDayIsAnnexM = firstModulationDayIsAnnexM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ADSLRate)) return false;
        ADSLRate other = (ADSLRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.downStreamProfile == other.getDownStreamProfile() &&
            this.upStreamProfile == other.getUpStreamProfile() &&
            this.upStreamCRM == other.getUpStreamCRM() &&
            this.downStreamCRM == other.getDownStreamCRM() &&
            ((this.profileMilegate==null && other.getProfileMilegate()==null) || 
             (this.profileMilegate!=null &&
              this.profileMilegate.equals(other.getProfileMilegate()))) &&
            ((this.transModeDefault==null && other.getTransModeDefault()==null) || 
             (this.transModeDefault!=null &&
              this.transModeDefault.equals(other.getTransModeDefault()))) &&
            ((this.modulations==null && other.getModulations()==null) || 
             (this.modulations!=null &&
              java.util.Arrays.equals(this.modulations, other.getModulations()))) &&
            ((this.firstModulationDay==null && other.getFirstModulationDay()==null) || 
             (this.firstModulationDay!=null &&
              this.firstModulationDay.equals(other.getFirstModulationDay()))) &&
            ((this.firstModulationDayIsAnnexM==null && other.getFirstModulationDayIsAnnexM()==null) || 
             (this.firstModulationDayIsAnnexM!=null &&
              this.firstModulationDayIsAnnexM.equals(other.getFirstModulationDayIsAnnexM())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getDownStreamProfile();
        _hashCode += getUpStreamProfile();
        _hashCode += getUpStreamCRM();
        _hashCode += getDownStreamCRM();
        if (getProfileMilegate() != null) {
            _hashCode += getProfileMilegate().hashCode();
        }
        if (getTransModeDefault() != null) {
            _hashCode += getTransModeDefault().hashCode();
        }
        if (getModulations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModulations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModulations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstModulationDay() != null) {
            _hashCode += getFirstModulationDay().hashCode();
        }
        if (getFirstModulationDayIsAnnexM() != null) {
            _hashCode += getFirstModulationDayIsAnnexM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ADSLRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "ADSLRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downStreamProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "DownStreamProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upStreamProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "UpStreamProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upStreamCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "UpStreamCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downStreamCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "DownStreamCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileMilegate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "ProfileMilegate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transModeDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "TransModeDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulations");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Modulations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstModulationDay");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "FirstModulationDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstModulationDayIsAnnexM");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "FirstModulationDayIsAnnexM"));
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
