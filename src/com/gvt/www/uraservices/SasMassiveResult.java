/**
 * SasMassiveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class SasMassiveResult  implements java.io.Serializable {
    private java.lang.String affectedResources;

    private boolean hasNetworkIncident;

    private java.lang.String idEvent;

    private java.lang.String message;

    private java.lang.String plannedDate;

    private java.lang.String startDate;

    public SasMassiveResult() {
    }

    public SasMassiveResult(
           java.lang.String affectedResources,
           boolean hasNetworkIncident,
           java.lang.String idEvent,
           java.lang.String message,
           java.lang.String plannedDate,
           java.lang.String startDate) {
           this.affectedResources = affectedResources;
           this.hasNetworkIncident = hasNetworkIncident;
           this.idEvent = idEvent;
           this.message = message;
           this.plannedDate = plannedDate;
           this.startDate = startDate;
    }


    /**
     * Gets the affectedResources value for this SasMassiveResult.
     * 
     * @return affectedResources
     */
    public java.lang.String getAffectedResources() {
        return affectedResources;
    }


    /**
     * Sets the affectedResources value for this SasMassiveResult.
     * 
     * @param affectedResources
     */
    public void setAffectedResources(java.lang.String affectedResources) {
        this.affectedResources = affectedResources;
    }


    /**
     * Gets the hasNetworkIncident value for this SasMassiveResult.
     * 
     * @return hasNetworkIncident
     */
    public boolean isHasNetworkIncident() {
        return hasNetworkIncident;
    }


    /**
     * Sets the hasNetworkIncident value for this SasMassiveResult.
     * 
     * @param hasNetworkIncident
     */
    public void setHasNetworkIncident(boolean hasNetworkIncident) {
        this.hasNetworkIncident = hasNetworkIncident;
    }


    /**
     * Gets the idEvent value for this SasMassiveResult.
     * 
     * @return idEvent
     */
    public java.lang.String getIdEvent() {
        return idEvent;
    }


    /**
     * Sets the idEvent value for this SasMassiveResult.
     * 
     * @param idEvent
     */
    public void setIdEvent(java.lang.String idEvent) {
        this.idEvent = idEvent;
    }


    /**
     * Gets the message value for this SasMassiveResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SasMassiveResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the plannedDate value for this SasMassiveResult.
     * 
     * @return plannedDate
     */
    public java.lang.String getPlannedDate() {
        return plannedDate;
    }


    /**
     * Sets the plannedDate value for this SasMassiveResult.
     * 
     * @param plannedDate
     */
    public void setPlannedDate(java.lang.String plannedDate) {
        this.plannedDate = plannedDate;
    }


    /**
     * Gets the startDate value for this SasMassiveResult.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SasMassiveResult.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SasMassiveResult)) return false;
        SasMassiveResult other = (SasMassiveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affectedResources==null && other.getAffectedResources()==null) || 
             (this.affectedResources!=null &&
              this.affectedResources.equals(other.getAffectedResources()))) &&
            this.hasNetworkIncident == other.isHasNetworkIncident() &&
            ((this.idEvent==null && other.getIdEvent()==null) || 
             (this.idEvent!=null &&
              this.idEvent.equals(other.getIdEvent()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.plannedDate==null && other.getPlannedDate()==null) || 
             (this.plannedDate!=null &&
              this.plannedDate.equals(other.getPlannedDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getAffectedResources() != null) {
            _hashCode += getAffectedResources().hashCode();
        }
        _hashCode += (isHasNetworkIncident() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIdEvent() != null) {
            _hashCode += getIdEvent().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPlannedDate() != null) {
            _hashCode += getPlannedDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SasMassiveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "sasMassiveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedResources");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedResources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNetworkIncident");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasNetworkIncident"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plannedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
