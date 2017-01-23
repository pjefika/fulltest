/**
 * OSSTurbonetShortCircuitOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetShortCircuit;

public class OSSTurbonetShortCircuitOut  implements java.io.Serializable {
    private java.lang.Integer SLOT;

    private java.lang.Integer PORT;

    private java.lang.String IP_DSLAM;

    private java.lang.String RESULT_DSLAM;

    private java.lang.Boolean SHORT_CIRCUIT;

    private java.lang.String MESSAGE;

    private java.lang.Integer STATUS;

    public OSSTurbonetShortCircuitOut() {
    }

    public OSSTurbonetShortCircuitOut(
           java.lang.Integer SLOT,
           java.lang.Integer PORT,
           java.lang.String IP_DSLAM,
           java.lang.String RESULT_DSLAM,
           java.lang.Boolean SHORT_CIRCUIT,
           java.lang.String MESSAGE,
           java.lang.Integer STATUS) {
           this.SLOT = SLOT;
           this.PORT = PORT;
           this.IP_DSLAM = IP_DSLAM;
           this.RESULT_DSLAM = RESULT_DSLAM;
           this.SHORT_CIRCUIT = SHORT_CIRCUIT;
           this.MESSAGE = MESSAGE;
           this.STATUS = STATUS;
    }


    /**
     * Gets the SLOT value for this OSSTurbonetShortCircuitOut.
     * 
     * @return SLOT
     */
    public java.lang.Integer getSLOT() {
        return SLOT;
    }


    /**
     * Sets the SLOT value for this OSSTurbonetShortCircuitOut.
     * 
     * @param SLOT
     */
    public void setSLOT(java.lang.Integer SLOT) {
        this.SLOT = SLOT;
    }


    /**
     * Gets the PORT value for this OSSTurbonetShortCircuitOut.
     * 
     * @return PORT
     */
    public java.lang.Integer getPORT() {
        return PORT;
    }


    /**
     * Sets the PORT value for this OSSTurbonetShortCircuitOut.
     * 
     * @param PORT
     */
    public void setPORT(java.lang.Integer PORT) {
        this.PORT = PORT;
    }


    /**
     * Gets the IP_DSLAM value for this OSSTurbonetShortCircuitOut.
     * 
     * @return IP_DSLAM
     */
    public java.lang.String getIP_DSLAM() {
        return IP_DSLAM;
    }


    /**
     * Sets the IP_DSLAM value for this OSSTurbonetShortCircuitOut.
     * 
     * @param IP_DSLAM
     */
    public void setIP_DSLAM(java.lang.String IP_DSLAM) {
        this.IP_DSLAM = IP_DSLAM;
    }


    /**
     * Gets the RESULT_DSLAM value for this OSSTurbonetShortCircuitOut.
     * 
     * @return RESULT_DSLAM
     */
    public java.lang.String getRESULT_DSLAM() {
        return RESULT_DSLAM;
    }


    /**
     * Sets the RESULT_DSLAM value for this OSSTurbonetShortCircuitOut.
     * 
     * @param RESULT_DSLAM
     */
    public void setRESULT_DSLAM(java.lang.String RESULT_DSLAM) {
        this.RESULT_DSLAM = RESULT_DSLAM;
    }


    /**
     * Gets the SHORT_CIRCUIT value for this OSSTurbonetShortCircuitOut.
     * 
     * @return SHORT_CIRCUIT
     */
    public java.lang.Boolean getSHORT_CIRCUIT() {
        return SHORT_CIRCUIT;
    }


    /**
     * Sets the SHORT_CIRCUIT value for this OSSTurbonetShortCircuitOut.
     * 
     * @param SHORT_CIRCUIT
     */
    public void setSHORT_CIRCUIT(java.lang.Boolean SHORT_CIRCUIT) {
        this.SHORT_CIRCUIT = SHORT_CIRCUIT;
    }


    /**
     * Gets the MESSAGE value for this OSSTurbonetShortCircuitOut.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this OSSTurbonetShortCircuitOut.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the STATUS value for this OSSTurbonetShortCircuitOut.
     * 
     * @return STATUS
     */
    public java.lang.Integer getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this OSSTurbonetShortCircuitOut.
     * 
     * @param STATUS
     */
    public void setSTATUS(java.lang.Integer STATUS) {
        this.STATUS = STATUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetShortCircuitOut)) return false;
        OSSTurbonetShortCircuitOut other = (OSSTurbonetShortCircuitOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SLOT==null && other.getSLOT()==null) || 
             (this.SLOT!=null &&
              this.SLOT.equals(other.getSLOT()))) &&
            ((this.PORT==null && other.getPORT()==null) || 
             (this.PORT!=null &&
              this.PORT.equals(other.getPORT()))) &&
            ((this.IP_DSLAM==null && other.getIP_DSLAM()==null) || 
             (this.IP_DSLAM!=null &&
              this.IP_DSLAM.equals(other.getIP_DSLAM()))) &&
            ((this.RESULT_DSLAM==null && other.getRESULT_DSLAM()==null) || 
             (this.RESULT_DSLAM!=null &&
              this.RESULT_DSLAM.equals(other.getRESULT_DSLAM()))) &&
            ((this.SHORT_CIRCUIT==null && other.getSHORT_CIRCUIT()==null) || 
             (this.SHORT_CIRCUIT!=null &&
              this.SHORT_CIRCUIT.equals(other.getSHORT_CIRCUIT()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS())));
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
        if (getSLOT() != null) {
            _hashCode += getSLOT().hashCode();
        }
        if (getPORT() != null) {
            _hashCode += getPORT().hashCode();
        }
        if (getIP_DSLAM() != null) {
            _hashCode += getIP_DSLAM().hashCode();
        }
        if (getRESULT_DSLAM() != null) {
            _hashCode += getRESULT_DSLAM().hashCode();
        }
        if (getSHORT_CIRCUIT() != null) {
            _hashCode += getSHORT_CIRCUIT().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetShortCircuitOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "OSSTurbonetShortCircuitOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLOT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "SLOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PORT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "PORT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IP_DSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "IP_DSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT_DSLAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "RESULT_DSLAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHORT_CIRCUIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "SHORT_CIRCUIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetShortCircuit", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
