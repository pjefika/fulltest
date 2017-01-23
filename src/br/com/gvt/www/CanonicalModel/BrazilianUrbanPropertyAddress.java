/**
 * BrazilianUrbanPropertyAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.CanonicalModel;

public class BrazilianUrbanPropertyAddress  implements java.io.Serializable {
    private br.com.gvt.www.CanonicalModel.Cabinet[] placePhysicalResourceAssoc;

    private java.lang.String city;

    private java.lang.String stateOrProvince;

    public BrazilianUrbanPropertyAddress() {
    }

    public BrazilianUrbanPropertyAddress(
           br.com.gvt.www.CanonicalModel.Cabinet[] placePhysicalResourceAssoc,
           java.lang.String city,
           java.lang.String stateOrProvince) {
           this.placePhysicalResourceAssoc = placePhysicalResourceAssoc;
           this.city = city;
           this.stateOrProvince = stateOrProvince;
    }


    /**
     * Gets the placePhysicalResourceAssoc value for this BrazilianUrbanPropertyAddress.
     * 
     * @return placePhysicalResourceAssoc
     */
    public br.com.gvt.www.CanonicalModel.Cabinet[] getPlacePhysicalResourceAssoc() {
        return placePhysicalResourceAssoc;
    }


    /**
     * Sets the placePhysicalResourceAssoc value for this BrazilianUrbanPropertyAddress.
     * 
     * @param placePhysicalResourceAssoc
     */
    public void setPlacePhysicalResourceAssoc(br.com.gvt.www.CanonicalModel.Cabinet[] placePhysicalResourceAssoc) {
        this.placePhysicalResourceAssoc = placePhysicalResourceAssoc;
    }


    /**
     * Gets the city value for this BrazilianUrbanPropertyAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this BrazilianUrbanPropertyAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the stateOrProvince value for this BrazilianUrbanPropertyAddress.
     * 
     * @return stateOrProvince
     */
    public java.lang.String getStateOrProvince() {
        return stateOrProvince;
    }


    /**
     * Sets the stateOrProvince value for this BrazilianUrbanPropertyAddress.
     * 
     * @param stateOrProvince
     */
    public void setStateOrProvince(java.lang.String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrazilianUrbanPropertyAddress)) return false;
        BrazilianUrbanPropertyAddress other = (BrazilianUrbanPropertyAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.placePhysicalResourceAssoc==null && other.getPlacePhysicalResourceAssoc()==null) || 
             (this.placePhysicalResourceAssoc!=null &&
              java.util.Arrays.equals(this.placePhysicalResourceAssoc, other.getPlacePhysicalResourceAssoc()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.stateOrProvince==null && other.getStateOrProvince()==null) || 
             (this.stateOrProvince!=null &&
              this.stateOrProvince.equals(other.getStateOrProvince())));
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
        if (getPlacePhysicalResourceAssoc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacePhysicalResourceAssoc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacePhysicalResourceAssoc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStateOrProvince() != null) {
            _hashCode += getStateOrProvince().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrazilianUrbanPropertyAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "BrazilianUrbanPropertyAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placePhysicalResourceAssoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "PlacePhysicalResourceAssoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Cabinet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "Cabinet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOrProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/CanonicalModel", "stateOrProvince"));
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
