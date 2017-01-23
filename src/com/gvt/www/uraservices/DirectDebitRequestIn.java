/**
 * DirectDebitRequestIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.uraservices;

public class DirectDebitRequestIn  implements java.io.Serializable {
    private java.lang.String rowIdUsuarioSiebel;

    private java.lang.String responsavel;

    private java.lang.String numeroBanco;

    private java.lang.String agencia;

    private java.lang.String numeroConta;

    private long bonus;

    private java.lang.String invoiceProfile;

    public DirectDebitRequestIn() {
    }

    public DirectDebitRequestIn(
           java.lang.String rowIdUsuarioSiebel,
           java.lang.String responsavel,
           java.lang.String numeroBanco,
           java.lang.String agencia,
           java.lang.String numeroConta,
           long bonus,
           java.lang.String invoiceProfile) {
           this.rowIdUsuarioSiebel = rowIdUsuarioSiebel;
           this.responsavel = responsavel;
           this.numeroBanco = numeroBanco;
           this.agencia = agencia;
           this.numeroConta = numeroConta;
           this.bonus = bonus;
           this.invoiceProfile = invoiceProfile;
    }


    /**
     * Gets the rowIdUsuarioSiebel value for this DirectDebitRequestIn.
     * 
     * @return rowIdUsuarioSiebel
     */
    public java.lang.String getRowIdUsuarioSiebel() {
        return rowIdUsuarioSiebel;
    }


    /**
     * Sets the rowIdUsuarioSiebel value for this DirectDebitRequestIn.
     * 
     * @param rowIdUsuarioSiebel
     */
    public void setRowIdUsuarioSiebel(java.lang.String rowIdUsuarioSiebel) {
        this.rowIdUsuarioSiebel = rowIdUsuarioSiebel;
    }


    /**
     * Gets the responsavel value for this DirectDebitRequestIn.
     * 
     * @return responsavel
     */
    public java.lang.String getResponsavel() {
        return responsavel;
    }


    /**
     * Sets the responsavel value for this DirectDebitRequestIn.
     * 
     * @param responsavel
     */
    public void setResponsavel(java.lang.String responsavel) {
        this.responsavel = responsavel;
    }


    /**
     * Gets the numeroBanco value for this DirectDebitRequestIn.
     * 
     * @return numeroBanco
     */
    public java.lang.String getNumeroBanco() {
        return numeroBanco;
    }


    /**
     * Sets the numeroBanco value for this DirectDebitRequestIn.
     * 
     * @param numeroBanco
     */
    public void setNumeroBanco(java.lang.String numeroBanco) {
        this.numeroBanco = numeroBanco;
    }


    /**
     * Gets the agencia value for this DirectDebitRequestIn.
     * 
     * @return agencia
     */
    public java.lang.String getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this DirectDebitRequestIn.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.String agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the numeroConta value for this DirectDebitRequestIn.
     * 
     * @return numeroConta
     */
    public java.lang.String getNumeroConta() {
        return numeroConta;
    }


    /**
     * Sets the numeroConta value for this DirectDebitRequestIn.
     * 
     * @param numeroConta
     */
    public void setNumeroConta(java.lang.String numeroConta) {
        this.numeroConta = numeroConta;
    }


    /**
     * Gets the bonus value for this DirectDebitRequestIn.
     * 
     * @return bonus
     */
    public long getBonus() {
        return bonus;
    }


    /**
     * Sets the bonus value for this DirectDebitRequestIn.
     * 
     * @param bonus
     */
    public void setBonus(long bonus) {
        this.bonus = bonus;
    }


    /**
     * Gets the invoiceProfile value for this DirectDebitRequestIn.
     * 
     * @return invoiceProfile
     */
    public java.lang.String getInvoiceProfile() {
        return invoiceProfile;
    }


    /**
     * Sets the invoiceProfile value for this DirectDebitRequestIn.
     * 
     * @param invoiceProfile
     */
    public void setInvoiceProfile(java.lang.String invoiceProfile) {
        this.invoiceProfile = invoiceProfile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DirectDebitRequestIn)) return false;
        DirectDebitRequestIn other = (DirectDebitRequestIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rowIdUsuarioSiebel==null && other.getRowIdUsuarioSiebel()==null) || 
             (this.rowIdUsuarioSiebel!=null &&
              this.rowIdUsuarioSiebel.equals(other.getRowIdUsuarioSiebel()))) &&
            ((this.responsavel==null && other.getResponsavel()==null) || 
             (this.responsavel!=null &&
              this.responsavel.equals(other.getResponsavel()))) &&
            ((this.numeroBanco==null && other.getNumeroBanco()==null) || 
             (this.numeroBanco!=null &&
              this.numeroBanco.equals(other.getNumeroBanco()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.numeroConta==null && other.getNumeroConta()==null) || 
             (this.numeroConta!=null &&
              this.numeroConta.equals(other.getNumeroConta()))) &&
            this.bonus == other.getBonus() &&
            ((this.invoiceProfile==null && other.getInvoiceProfile()==null) || 
             (this.invoiceProfile!=null &&
              this.invoiceProfile.equals(other.getInvoiceProfile())));
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
        if (getRowIdUsuarioSiebel() != null) {
            _hashCode += getRowIdUsuarioSiebel().hashCode();
        }
        if (getResponsavel() != null) {
            _hashCode += getResponsavel().hashCode();
        }
        if (getNumeroBanco() != null) {
            _hashCode += getNumeroBanco().hashCode();
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getNumeroConta() != null) {
            _hashCode += getNumeroConta().hashCode();
        }
        _hashCode += new Long(getBonus()).hashCode();
        if (getInvoiceProfile() != null) {
            _hashCode += getInvoiceProfile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DirectDebitRequestIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/uraservices", "directDebitRequestIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowIdUsuarioSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowIdUsuarioSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bonus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceProfile"));
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
