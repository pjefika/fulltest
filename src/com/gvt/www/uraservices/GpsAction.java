/**
 * GpsAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class GpsAction  implements java.io.Serializable {
    private boolean isActive;

    private boolean isAutomatic;

    private boolean executionOk;

    private java.lang.String lastUpdateBy;

    private java.lang.String actionBean;

    private java.lang.String createdBy;

    private java.lang.String description;

    private java.lang.String name;

    private java.lang.String observation;

    private java.lang.String updateDate;

    private java.lang.String createdDate;

    private int resultAction;

    private int rowId;

    private long idRelResultadoAtendimento;

    public GpsAction() {
    }

    public GpsAction(
           boolean isActive,
           boolean isAutomatic,
           boolean executionOk,
           java.lang.String lastUpdateBy,
           java.lang.String actionBean,
           java.lang.String createdBy,
           java.lang.String description,
           java.lang.String name,
           java.lang.String observation,
           java.lang.String updateDate,
           java.lang.String createdDate,
           int resultAction,
           int rowId,
           long idRelResultadoAtendimento) {
           this.isActive = isActive;
           this.isAutomatic = isAutomatic;
           this.executionOk = executionOk;
           this.lastUpdateBy = lastUpdateBy;
           this.actionBean = actionBean;
           this.createdBy = createdBy;
           this.description = description;
           this.name = name;
           this.observation = observation;
           this.updateDate = updateDate;
           this.createdDate = createdDate;
           this.resultAction = resultAction;
           this.rowId = rowId;
           this.idRelResultadoAtendimento = idRelResultadoAtendimento;
    }


    /**
     * Gets the isActive value for this GpsAction.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this GpsAction.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isAutomatic value for this GpsAction.
     * 
     * @return isAutomatic
     */
    public boolean isIsAutomatic() {
        return isAutomatic;
    }


    /**
     * Sets the isAutomatic value for this GpsAction.
     * 
     * @param isAutomatic
     */
    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }


    /**
     * Gets the executionOk value for this GpsAction.
     * 
     * @return executionOk
     */
    public boolean isExecutionOk() {
        return executionOk;
    }


    /**
     * Sets the executionOk value for this GpsAction.
     * 
     * @param executionOk
     */
    public void setExecutionOk(boolean executionOk) {
        this.executionOk = executionOk;
    }


    /**
     * Gets the lastUpdateBy value for this GpsAction.
     * 
     * @return lastUpdateBy
     */
    public java.lang.String getLastUpdateBy() {
        return lastUpdateBy;
    }


    /**
     * Sets the lastUpdateBy value for this GpsAction.
     * 
     * @param lastUpdateBy
     */
    public void setLastUpdateBy(java.lang.String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }


    /**
     * Gets the actionBean value for this GpsAction.
     * 
     * @return actionBean
     */
    public java.lang.String getActionBean() {
        return actionBean;
    }


    /**
     * Sets the actionBean value for this GpsAction.
     * 
     * @param actionBean
     */
    public void setActionBean(java.lang.String actionBean) {
        this.actionBean = actionBean;
    }


    /**
     * Gets the createdBy value for this GpsAction.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this GpsAction.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the description value for this GpsAction.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GpsAction.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this GpsAction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GpsAction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the observation value for this GpsAction.
     * 
     * @return observation
     */
    public java.lang.String getObservation() {
        return observation;
    }


    /**
     * Sets the observation value for this GpsAction.
     * 
     * @param observation
     */
    public void setObservation(java.lang.String observation) {
        this.observation = observation;
    }


    /**
     * Gets the updateDate value for this GpsAction.
     * 
     * @return updateDate
     */
    public java.lang.String getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this GpsAction.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.lang.String updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the createdDate value for this GpsAction.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GpsAction.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the resultAction value for this GpsAction.
     * 
     * @return resultAction
     */
    public int getResultAction() {
        return resultAction;
    }


    /**
     * Sets the resultAction value for this GpsAction.
     * 
     * @param resultAction
     */
    public void setResultAction(int resultAction) {
        this.resultAction = resultAction;
    }


    /**
     * Gets the rowId value for this GpsAction.
     * 
     * @return rowId
     */
    public int getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this GpsAction.
     * 
     * @param rowId
     */
    public void setRowId(int rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the idRelResultadoAtendimento value for this GpsAction.
     * 
     * @return idRelResultadoAtendimento
     */
    public long getIdRelResultadoAtendimento() {
        return idRelResultadoAtendimento;
    }


    /**
     * Sets the idRelResultadoAtendimento value for this GpsAction.
     * 
     * @param idRelResultadoAtendimento
     */
    public void setIdRelResultadoAtendimento(long idRelResultadoAtendimento) {
        this.idRelResultadoAtendimento = idRelResultadoAtendimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GpsAction)) return false;
        GpsAction other = (GpsAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isActive == other.isIsActive() &&
            this.isAutomatic == other.isIsAutomatic() &&
            this.executionOk == other.isExecutionOk() &&
            ((this.lastUpdateBy==null && other.getLastUpdateBy()==null) || 
             (this.lastUpdateBy!=null &&
              this.lastUpdateBy.equals(other.getLastUpdateBy()))) &&
            ((this.actionBean==null && other.getActionBean()==null) || 
             (this.actionBean!=null &&
              this.actionBean.equals(other.getActionBean()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.observation==null && other.getObservation()==null) || 
             (this.observation!=null &&
              this.observation.equals(other.getObservation()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            this.resultAction == other.getResultAction() &&
            this.rowId == other.getRowId() &&
            this.idRelResultadoAtendimento == other.getIdRelResultadoAtendimento();
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
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAutomatic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExecutionOk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastUpdateBy() != null) {
            _hashCode += getLastUpdateBy().hashCode();
        }
        if (getActionBean() != null) {
            _hashCode += getActionBean().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getObservation() != null) {
            _hashCode += getObservation().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        _hashCode += getResultAction();
        _hashCode += getRowId();
        _hashCode += new Long(getIdRelResultadoAtendimento()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GpsAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "gpsAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAutomatic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAutomatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionOk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executionOk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "observation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRelResultadoAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRelResultadoAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
