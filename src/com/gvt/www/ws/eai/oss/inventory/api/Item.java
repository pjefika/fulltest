/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.inventory.api;

public class Item  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.inventory.api.Designator designator;

    private java.lang.Integer id;

    private int specId;

    private java.lang.String specIdName;

    private java.lang.Integer status;

    private java.lang.String statusName;

    private java.util.Calendar createdDate;

    private java.util.Calendar modifiedDate;

    private com.gvt.www.ws.eai.oss.inventory.api.Item[] items;

    private com.gvt.www.ws.eai.oss.inventory.api.Param[] param;

    public Item() {
    }

    public Item(
           com.gvt.www.ws.eai.oss.inventory.api.Designator designator,
           java.lang.Integer id,
           int specId,
           java.lang.String specIdName,
           java.lang.Integer status,
           java.lang.String statusName,
           java.util.Calendar createdDate,
           java.util.Calendar modifiedDate,
           com.gvt.www.ws.eai.oss.inventory.api.Item[] items,
           com.gvt.www.ws.eai.oss.inventory.api.Param[] param) {
           this.designator = designator;
           this.id = id;
           this.specId = specId;
           this.specIdName = specIdName;
           this.status = status;
           this.statusName = statusName;
           this.createdDate = createdDate;
           this.modifiedDate = modifiedDate;
           this.items = items;
           this.param = param;
    }


    /**
     * Gets the designator value for this Item.
     * 
     * @return designator
     */
    public com.gvt.www.ws.eai.oss.inventory.api.Designator getDesignator() {
        return designator;
    }


    /**
     * Sets the designator value for this Item.
     * 
     * @param designator
     */
    public void setDesignator(com.gvt.www.ws.eai.oss.inventory.api.Designator designator) {
        this.designator = designator;
    }


    /**
     * Gets the id value for this Item.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Item.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the specId value for this Item.
     * 
     * @return specId
     */
    public int getSpecId() {
        return specId;
    }


    /**
     * Sets the specId value for this Item.
     * 
     * @param specId
     */
    public void setSpecId(int specId) {
        this.specId = specId;
    }


    /**
     * Gets the specIdName value for this Item.
     * 
     * @return specIdName
     */
    public java.lang.String getSpecIdName() {
        return specIdName;
    }


    /**
     * Sets the specIdName value for this Item.
     * 
     * @param specIdName
     */
    public void setSpecIdName(java.lang.String specIdName) {
        this.specIdName = specIdName;
    }


    /**
     * Gets the status value for this Item.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Item.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the statusName value for this Item.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this Item.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the createdDate value for this Item.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Item.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the modifiedDate value for this Item.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this Item.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the items value for this Item.
     * 
     * @return items
     */
    public com.gvt.www.ws.eai.oss.inventory.api.Item[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this Item.
     * 
     * @param items
     */
    public void setItems(com.gvt.www.ws.eai.oss.inventory.api.Item[] items) {
        this.items = items;
    }

    public com.gvt.www.ws.eai.oss.inventory.api.Item getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, com.gvt.www.ws.eai.oss.inventory.api.Item _value) {
        this.items[i] = _value;
    }


    /**
     * Gets the param value for this Item.
     * 
     * @return param
     */
    public com.gvt.www.ws.eai.oss.inventory.api.Param[] getParam() {
        return param;
    }


    /**
     * Sets the param value for this Item.
     * 
     * @param param
     */
    public void setParam(com.gvt.www.ws.eai.oss.inventory.api.Param[] param) {
        this.param = param;
    }

    public com.gvt.www.ws.eai.oss.inventory.api.Param getParam(int i) {
        return this.param[i];
    }

    public void setParam(int i, com.gvt.www.ws.eai.oss.inventory.api.Param _value) {
        this.param[i] = _value;
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
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.specId == other.getSpecId() &&
            ((this.specIdName==null && other.getSpecIdName()==null) || 
             (this.specIdName!=null &&
              this.specIdName.equals(other.getSpecIdName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              java.util.Arrays.equals(this.param, other.getParam())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getSpecId();
        if (getSpecIdName() != null) {
            _hashCode += getSpecIdName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParam(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "designator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Designator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "specId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specIdName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "specIdName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "statusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/inventory/api", "Param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
