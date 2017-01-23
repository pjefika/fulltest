/**
 * Canal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class Canal  implements java.io.Serializable {
    private java.lang.String nomeCanal;

    private java.math.BigDecimal idFisicoCanal;

    private java.lang.String faixaEtaria;

    private boolean pvr;

    private boolean timeShift;

    private java.lang.Boolean regimeDegustacao;

    private java.lang.String tipo;

    private java.lang.String dvbId;

    private java.lang.String nomeCanalCRM;

    public Canal() {
    }

    public Canal(
           java.lang.String nomeCanal,
           java.math.BigDecimal idFisicoCanal,
           java.lang.String faixaEtaria,
           boolean pvr,
           boolean timeShift,
           java.lang.Boolean regimeDegustacao,
           java.lang.String tipo,
           java.lang.String dvbId,
           java.lang.String nomeCanalCRM) {
           this.nomeCanal = nomeCanal;
           this.idFisicoCanal = idFisicoCanal;
           this.faixaEtaria = faixaEtaria;
           this.pvr = pvr;
           this.timeShift = timeShift;
           this.regimeDegustacao = regimeDegustacao;
           this.tipo = tipo;
           this.dvbId = dvbId;
           this.nomeCanalCRM = nomeCanalCRM;
    }


    /**
     * Gets the nomeCanal value for this Canal.
     * 
     * @return nomeCanal
     */
    public java.lang.String getNomeCanal() {
        return nomeCanal;
    }


    /**
     * Sets the nomeCanal value for this Canal.
     * 
     * @param nomeCanal
     */
    public void setNomeCanal(java.lang.String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }


    /**
     * Gets the idFisicoCanal value for this Canal.
     * 
     * @return idFisicoCanal
     */
    public java.math.BigDecimal getIdFisicoCanal() {
        return idFisicoCanal;
    }


    /**
     * Sets the idFisicoCanal value for this Canal.
     * 
     * @param idFisicoCanal
     */
    public void setIdFisicoCanal(java.math.BigDecimal idFisicoCanal) {
        this.idFisicoCanal = idFisicoCanal;
    }


    /**
     * Gets the faixaEtaria value for this Canal.
     * 
     * @return faixaEtaria
     */
    public java.lang.String getFaixaEtaria() {
        return faixaEtaria;
    }


    /**
     * Sets the faixaEtaria value for this Canal.
     * 
     * @param faixaEtaria
     */
    public void setFaixaEtaria(java.lang.String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }


    /**
     * Gets the pvr value for this Canal.
     * 
     * @return pvr
     */
    public boolean isPvr() {
        return pvr;
    }


    /**
     * Sets the pvr value for this Canal.
     * 
     * @param pvr
     */
    public void setPvr(boolean pvr) {
        this.pvr = pvr;
    }


    /**
     * Gets the timeShift value for this Canal.
     * 
     * @return timeShift
     */
    public boolean isTimeShift() {
        return timeShift;
    }


    /**
     * Sets the timeShift value for this Canal.
     * 
     * @param timeShift
     */
    public void setTimeShift(boolean timeShift) {
        this.timeShift = timeShift;
    }


    /**
     * Gets the regimeDegustacao value for this Canal.
     * 
     * @return regimeDegustacao
     */
    public java.lang.Boolean getRegimeDegustacao() {
        return regimeDegustacao;
    }


    /**
     * Sets the regimeDegustacao value for this Canal.
     * 
     * @param regimeDegustacao
     */
    public void setRegimeDegustacao(java.lang.Boolean regimeDegustacao) {
        this.regimeDegustacao = regimeDegustacao;
    }


    /**
     * Gets the tipo value for this Canal.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Canal.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the dvbId value for this Canal.
     * 
     * @return dvbId
     */
    public java.lang.String getDvbId() {
        return dvbId;
    }


    /**
     * Sets the dvbId value for this Canal.
     * 
     * @param dvbId
     */
    public void setDvbId(java.lang.String dvbId) {
        this.dvbId = dvbId;
    }


    /**
     * Gets the nomeCanalCRM value for this Canal.
     * 
     * @return nomeCanalCRM
     */
    public java.lang.String getNomeCanalCRM() {
        return nomeCanalCRM;
    }


    /**
     * Sets the nomeCanalCRM value for this Canal.
     * 
     * @param nomeCanalCRM
     */
    public void setNomeCanalCRM(java.lang.String nomeCanalCRM) {
        this.nomeCanalCRM = nomeCanalCRM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Canal)) return false;
        Canal other = (Canal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeCanal==null && other.getNomeCanal()==null) || 
             (this.nomeCanal!=null &&
              this.nomeCanal.equals(other.getNomeCanal()))) &&
            ((this.idFisicoCanal==null && other.getIdFisicoCanal()==null) || 
             (this.idFisicoCanal!=null &&
              this.idFisicoCanal.equals(other.getIdFisicoCanal()))) &&
            ((this.faixaEtaria==null && other.getFaixaEtaria()==null) || 
             (this.faixaEtaria!=null &&
              this.faixaEtaria.equals(other.getFaixaEtaria()))) &&
            this.pvr == other.isPvr() &&
            this.timeShift == other.isTimeShift() &&
            ((this.regimeDegustacao==null && other.getRegimeDegustacao()==null) || 
             (this.regimeDegustacao!=null &&
              this.regimeDegustacao.equals(other.getRegimeDegustacao()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.dvbId==null && other.getDvbId()==null) || 
             (this.dvbId!=null &&
              this.dvbId.equals(other.getDvbId()))) &&
            ((this.nomeCanalCRM==null && other.getNomeCanalCRM()==null) || 
             (this.nomeCanalCRM!=null &&
              this.nomeCanalCRM.equals(other.getNomeCanalCRM())));
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
        if (getNomeCanal() != null) {
            _hashCode += getNomeCanal().hashCode();
        }
        if (getIdFisicoCanal() != null) {
            _hashCode += getIdFisicoCanal().hashCode();
        }
        if (getFaixaEtaria() != null) {
            _hashCode += getFaixaEtaria().hashCode();
        }
        _hashCode += (isPvr() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTimeShift() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRegimeDegustacao() != null) {
            _hashCode += getRegimeDegustacao().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getDvbId() != null) {
            _hashCode += getDvbId().hashCode();
        }
        if (getNomeCanalCRM() != null) {
            _hashCode += getNomeCanalCRM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Canal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCanal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nomeCanal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFisicoCanal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "idFisicoCanal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faixaEtaria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "faixaEtaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pvr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "pvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeShift");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "timeShift"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimeDegustacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "regimeDegustacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvbId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "dvbId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCanalCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nomeCanalCRM"));
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
