/**
 * ChangeSwichByRangeIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.eai.NumberInventoryServicesWS;

public class ChangeSwichByRangeIn  implements java.io.Serializable {
    private java.lang.String rangeInicio;

    private java.lang.String rangeFim;

    private java.lang.String swich;

    public ChangeSwichByRangeIn() {
    }

    public ChangeSwichByRangeIn(
           java.lang.String rangeInicio,
           java.lang.String rangeFim,
           java.lang.String swich) {
           this.rangeInicio = rangeInicio;
           this.rangeFim = rangeFim;
           this.swich = swich;
    }


    /**
     * Gets the rangeInicio value for this ChangeSwichByRangeIn.
     * 
     * @return rangeInicio
     */
    public java.lang.String getRangeInicio() {
        return rangeInicio;
    }


    /**
     * Sets the rangeInicio value for this ChangeSwichByRangeIn.
     * 
     * @param rangeInicio
     */
    public void setRangeInicio(java.lang.String rangeInicio) {
        this.rangeInicio = rangeInicio;
    }


    /**
     * Gets the rangeFim value for this ChangeSwichByRangeIn.
     * 
     * @return rangeFim
     */
    public java.lang.String getRangeFim() {
        return rangeFim;
    }


    /**
     * Sets the rangeFim value for this ChangeSwichByRangeIn.
     * 
     * @param rangeFim
     */
    public void setRangeFim(java.lang.String rangeFim) {
        this.rangeFim = rangeFim;
    }


    /**
     * Gets the swich value for this ChangeSwichByRangeIn.
     * 
     * @return swich
     */
    public java.lang.String getSwich() {
        return swich;
    }


    /**
     * Sets the swich value for this ChangeSwichByRangeIn.
     * 
     * @param swich
     */
    public void setSwich(java.lang.String swich) {
        this.swich = swich;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSwichByRangeIn)) return false;
        ChangeSwichByRangeIn other = (ChangeSwichByRangeIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rangeInicio==null && other.getRangeInicio()==null) || 
             (this.rangeInicio!=null &&
              this.rangeInicio.equals(other.getRangeInicio()))) &&
            ((this.rangeFim==null && other.getRangeFim()==null) || 
             (this.rangeFim!=null &&
              this.rangeFim.equals(other.getRangeFim()))) &&
            ((this.swich==null && other.getSwich()==null) || 
             (this.swich!=null &&
              this.swich.equals(other.getSwich())));
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
        if (getRangeInicio() != null) {
            _hashCode += getRangeInicio().hashCode();
        }
        if (getRangeFim() != null) {
            _hashCode += getRangeFim().hashCode();
        }
        if (getSwich() != null) {
            _hashCode += getSwich().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSwichByRangeIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/eai/NumberInventoryServicesWS", "changeSwichByRangeIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangeInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangeFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
