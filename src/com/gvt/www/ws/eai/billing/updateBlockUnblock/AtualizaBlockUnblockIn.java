/**
 * AtualizaBlockUnblockIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.billing.updateBlockUnblock;

public class AtualizaBlockUnblockIn  implements java.io.Serializable {
    private int status;

    private java.lang.String instancia;

    private java.lang.String tipo;

    private java.lang.String processo;

    private java.util.Calendar data;

    private boolean adsl;

    private java.util.Calendar data_processamento;

    public AtualizaBlockUnblockIn() {
    }

    public AtualizaBlockUnblockIn(
           int status,
           java.lang.String instancia,
           java.lang.String tipo,
           java.lang.String processo,
           java.util.Calendar data,
           boolean adsl,
           java.util.Calendar data_processamento) {
           this.status = status;
           this.instancia = instancia;
           this.tipo = tipo;
           this.processo = processo;
           this.data = data;
           this.adsl = adsl;
           this.data_processamento = data_processamento;
    }


    /**
     * Gets the status value for this AtualizaBlockUnblockIn.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AtualizaBlockUnblockIn.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the instancia value for this AtualizaBlockUnblockIn.
     * 
     * @return instancia
     */
    public java.lang.String getInstancia() {
        return instancia;
    }


    /**
     * Sets the instancia value for this AtualizaBlockUnblockIn.
     * 
     * @param instancia
     */
    public void setInstancia(java.lang.String instancia) {
        this.instancia = instancia;
    }


    /**
     * Gets the tipo value for this AtualizaBlockUnblockIn.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this AtualizaBlockUnblockIn.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the processo value for this AtualizaBlockUnblockIn.
     * 
     * @return processo
     */
    public java.lang.String getProcesso() {
        return processo;
    }


    /**
     * Sets the processo value for this AtualizaBlockUnblockIn.
     * 
     * @param processo
     */
    public void setProcesso(java.lang.String processo) {
        this.processo = processo;
    }


    /**
     * Gets the data value for this AtualizaBlockUnblockIn.
     * 
     * @return data
     */
    public java.util.Calendar getData() {
        return data;
    }


    /**
     * Sets the data value for this AtualizaBlockUnblockIn.
     * 
     * @param data
     */
    public void setData(java.util.Calendar data) {
        this.data = data;
    }


    /**
     * Gets the adsl value for this AtualizaBlockUnblockIn.
     * 
     * @return adsl
     */
    public boolean isAdsl() {
        return adsl;
    }


    /**
     * Sets the adsl value for this AtualizaBlockUnblockIn.
     * 
     * @param adsl
     */
    public void setAdsl(boolean adsl) {
        this.adsl = adsl;
    }


    /**
     * Gets the data_processamento value for this AtualizaBlockUnblockIn.
     * 
     * @return data_processamento
     */
    public java.util.Calendar getData_processamento() {
        return data_processamento;
    }


    /**
     * Sets the data_processamento value for this AtualizaBlockUnblockIn.
     * 
     * @param data_processamento
     */
    public void setData_processamento(java.util.Calendar data_processamento) {
        this.data_processamento = data_processamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizaBlockUnblockIn)) return false;
        AtualizaBlockUnblockIn other = (AtualizaBlockUnblockIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.instancia==null && other.getInstancia()==null) || 
             (this.instancia!=null &&
              this.instancia.equals(other.getInstancia()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.processo==null && other.getProcesso()==null) || 
             (this.processo!=null &&
              this.processo.equals(other.getProcesso()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            this.adsl == other.isAdsl() &&
            ((this.data_processamento==null && other.getData_processamento()==null) || 
             (this.data_processamento!=null &&
              this.data_processamento.equals(other.getData_processamento())));
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
        _hashCode += getStatus();
        if (getInstancia() != null) {
            _hashCode += getInstancia().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getProcesso() != null) {
            _hashCode += getProcesso().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        _hashCode += (isAdsl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getData_processamento() != null) {
            _hashCode += getData_processamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizaBlockUnblockIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "atualizaBlockUnblockIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "instancia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "processo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adsl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "adsl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_processamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/billing/updateBlockUnblock", "data_processamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
