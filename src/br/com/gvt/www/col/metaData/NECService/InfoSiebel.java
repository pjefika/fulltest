/**
 * InfoSiebel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.col.metaData.NECService;

public class InfoSiebel  implements java.io.Serializable {
    private br.com.gvt.www.col.metaData.NECService.ConfigValue[] configValues;

    private java.lang.Integer XGvtProdCod;

    private java.lang.String item;

    private java.lang.String subItem;

    private java.lang.String activityCD;

    private java.lang.String idElementoCRM;

    public InfoSiebel() {
    }

    public InfoSiebel(
           br.com.gvt.www.col.metaData.NECService.ConfigValue[] configValues,
           java.lang.Integer XGvtProdCod,
           java.lang.String item,
           java.lang.String subItem,
           java.lang.String activityCD,
           java.lang.String idElementoCRM) {
           this.configValues = configValues;
           this.XGvtProdCod = XGvtProdCod;
           this.item = item;
           this.subItem = subItem;
           this.activityCD = activityCD;
           this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the configValues value for this InfoSiebel.
     * 
     * @return configValues
     */
    public br.com.gvt.www.col.metaData.NECService.ConfigValue[] getConfigValues() {
        return configValues;
    }


    /**
     * Sets the configValues value for this InfoSiebel.
     * 
     * @param configValues
     */
    public void setConfigValues(br.com.gvt.www.col.metaData.NECService.ConfigValue[] configValues) {
        this.configValues = configValues;
    }


    /**
     * Gets the XGvtProdCod value for this InfoSiebel.
     * 
     * @return XGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return XGvtProdCod;
    }


    /**
     * Sets the XGvtProdCod value for this InfoSiebel.
     * 
     * @param XGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer XGvtProdCod) {
        this.XGvtProdCod = XGvtProdCod;
    }


    /**
     * Gets the item value for this InfoSiebel.
     * 
     * @return item
     */
    public java.lang.String getItem() {
        return item;
    }


    /**
     * Sets the item value for this InfoSiebel.
     * 
     * @param item
     */
    public void setItem(java.lang.String item) {
        this.item = item;
    }


    /**
     * Gets the subItem value for this InfoSiebel.
     * 
     * @return subItem
     */
    public java.lang.String getSubItem() {
        return subItem;
    }


    /**
     * Sets the subItem value for this InfoSiebel.
     * 
     * @param subItem
     */
    public void setSubItem(java.lang.String subItem) {
        this.subItem = subItem;
    }


    /**
     * Gets the activityCD value for this InfoSiebel.
     * 
     * @return activityCD
     */
    public java.lang.String getActivityCD() {
        return activityCD;
    }


    /**
     * Sets the activityCD value for this InfoSiebel.
     * 
     * @param activityCD
     */
    public void setActivityCD(java.lang.String activityCD) {
        this.activityCD = activityCD;
    }


    /**
     * Gets the idElementoCRM value for this InfoSiebel.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this InfoSiebel.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoSiebel)) return false;
        InfoSiebel other = (InfoSiebel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configValues==null && other.getConfigValues()==null) || 
             (this.configValues!=null &&
              java.util.Arrays.equals(this.configValues, other.getConfigValues()))) &&
            ((this.XGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.XGvtProdCod!=null &&
              this.XGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.subItem==null && other.getSubItem()==null) || 
             (this.subItem!=null &&
              this.subItem.equals(other.getSubItem()))) &&
            ((this.activityCD==null && other.getActivityCD()==null) || 
             (this.activityCD!=null &&
              this.activityCD.equals(other.getActivityCD()))) &&
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM())));
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
        if (getConfigValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getSubItem() != null) {
            _hashCode += getSubItem().hashCode();
        }
        if (getActivityCD() != null) {
            _hashCode += getActivityCD().hashCode();
        }
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoSiebel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "InfoSiebel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ConfigValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "XGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "SubItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ActivityCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "IdElementoCRM"));
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
