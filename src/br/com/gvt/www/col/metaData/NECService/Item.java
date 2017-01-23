/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.col.metaData.NECService;

public class Item  implements java.io.Serializable {
    private br.com.gvt.www.col.metaData.NECService.LinhaInfo linhaInfo;

    private br.com.gvt.www.col.metaData.NECService.InfoSiebel[] infosSiebel;

    public Item() {
    }

    public Item(
           br.com.gvt.www.col.metaData.NECService.LinhaInfo linhaInfo,
           br.com.gvt.www.col.metaData.NECService.InfoSiebel[] infosSiebel) {
           this.linhaInfo = linhaInfo;
           this.infosSiebel = infosSiebel;
    }


    /**
     * Gets the linhaInfo value for this Item.
     * 
     * @return linhaInfo
     */
    public br.com.gvt.www.col.metaData.NECService.LinhaInfo getLinhaInfo() {
        return linhaInfo;
    }


    /**
     * Sets the linhaInfo value for this Item.
     * 
     * @param linhaInfo
     */
    public void setLinhaInfo(br.com.gvt.www.col.metaData.NECService.LinhaInfo linhaInfo) {
        this.linhaInfo = linhaInfo;
    }


    /**
     * Gets the infosSiebel value for this Item.
     * 
     * @return infosSiebel
     */
    public br.com.gvt.www.col.metaData.NECService.InfoSiebel[] getInfosSiebel() {
        return infosSiebel;
    }


    /**
     * Sets the infosSiebel value for this Item.
     * 
     * @param infosSiebel
     */
    public void setInfosSiebel(br.com.gvt.www.col.metaData.NECService.InfoSiebel[] infosSiebel) {
        this.infosSiebel = infosSiebel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linhaInfo==null && other.getLinhaInfo()==null) || 
             (this.linhaInfo!=null &&
              this.linhaInfo.equals(other.getLinhaInfo()))) &&
            ((this.infosSiebel==null && other.getInfosSiebel()==null) || 
             (this.infosSiebel!=null &&
              java.util.Arrays.equals(this.infosSiebel, other.getInfosSiebel())));
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
        if (getLinhaInfo() != null) {
            _hashCode += getLinhaInfo().hashCode();
        }
        if (getInfosSiebel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfosSiebel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfosSiebel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linhaInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "LinhaInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "LinhaInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infosSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfosSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel"));
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
