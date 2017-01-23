/**
 * NECRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.col.metaData.NECService;

public class NECRequest  implements java.io.Serializable {
    private java.util.Calendar date;

    private java.lang.String custAcctNbr;

    private java.lang.String pon;

    private java.lang.String eventCode;

    private java.lang.String orderType;

    private java.lang.String lineNumber;

    private int netProgramCode;

    private java.lang.String flagPilot;

    private java.lang.String tipoOrdem;

    private java.lang.String clliCode;

    private br.com.gvt.www.col.metaData.NECService.Item[] itens;

    private com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso;

    public NECRequest() {
    }

    public NECRequest(
           java.util.Calendar date,
           java.lang.String custAcctNbr,
           java.lang.String pon,
           java.lang.String eventCode,
           java.lang.String orderType,
           java.lang.String lineNumber,
           int netProgramCode,
           java.lang.String flagPilot,
           java.lang.String tipoOrdem,
           java.lang.String clliCode,
           br.com.gvt.www.col.metaData.NECService.Item[] itens,
           com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso) {
           this.date = date;
           this.custAcctNbr = custAcctNbr;
           this.pon = pon;
           this.eventCode = eventCode;
           this.orderType = orderType;
           this.lineNumber = lineNumber;
           this.netProgramCode = netProgramCode;
           this.flagPilot = flagPilot;
           this.tipoOrdem = tipoOrdem;
           this.clliCode = clliCode;
           this.itens = itens;
           this.acesso = acesso;
    }


    /**
     * Gets the date value for this NECRequest.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this NECRequest.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the custAcctNbr value for this NECRequest.
     * 
     * @return custAcctNbr
     */
    public java.lang.String getCustAcctNbr() {
        return custAcctNbr;
    }


    /**
     * Sets the custAcctNbr value for this NECRequest.
     * 
     * @param custAcctNbr
     */
    public void setCustAcctNbr(java.lang.String custAcctNbr) {
        this.custAcctNbr = custAcctNbr;
    }


    /**
     * Gets the pon value for this NECRequest.
     * 
     * @return pon
     */
    public java.lang.String getPon() {
        return pon;
    }


    /**
     * Sets the pon value for this NECRequest.
     * 
     * @param pon
     */
    public void setPon(java.lang.String pon) {
        this.pon = pon;
    }


    /**
     * Gets the eventCode value for this NECRequest.
     * 
     * @return eventCode
     */
    public java.lang.String getEventCode() {
        return eventCode;
    }


    /**
     * Sets the eventCode value for this NECRequest.
     * 
     * @param eventCode
     */
    public void setEventCode(java.lang.String eventCode) {
        this.eventCode = eventCode;
    }


    /**
     * Gets the orderType value for this NECRequest.
     * 
     * @return orderType
     */
    public java.lang.String getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this NECRequest.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.String orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the lineNumber value for this NECRequest.
     * 
     * @return lineNumber
     */
    public java.lang.String getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this NECRequest.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.lang.String lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the netProgramCode value for this NECRequest.
     * 
     * @return netProgramCode
     */
    public int getNetProgramCode() {
        return netProgramCode;
    }


    /**
     * Sets the netProgramCode value for this NECRequest.
     * 
     * @param netProgramCode
     */
    public void setNetProgramCode(int netProgramCode) {
        this.netProgramCode = netProgramCode;
    }


    /**
     * Gets the flagPilot value for this NECRequest.
     * 
     * @return flagPilot
     */
    public java.lang.String getFlagPilot() {
        return flagPilot;
    }


    /**
     * Sets the flagPilot value for this NECRequest.
     * 
     * @param flagPilot
     */
    public void setFlagPilot(java.lang.String flagPilot) {
        this.flagPilot = flagPilot;
    }


    /**
     * Gets the tipoOrdem value for this NECRequest.
     * 
     * @return tipoOrdem
     */
    public java.lang.String getTipoOrdem() {
        return tipoOrdem;
    }


    /**
     * Sets the tipoOrdem value for this NECRequest.
     * 
     * @param tipoOrdem
     */
    public void setTipoOrdem(java.lang.String tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }


    /**
     * Gets the clliCode value for this NECRequest.
     * 
     * @return clliCode
     */
    public java.lang.String getClliCode() {
        return clliCode;
    }


    /**
     * Sets the clliCode value for this NECRequest.
     * 
     * @param clliCode
     */
    public void setClliCode(java.lang.String clliCode) {
        this.clliCode = clliCode;
    }


    /**
     * Gets the itens value for this NECRequest.
     * 
     * @return itens
     */
    public br.com.gvt.www.col.metaData.NECService.Item[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this NECRequest.
     * 
     * @param itens
     */
    public void setItens(br.com.gvt.www.col.metaData.NECService.Item[] itens) {
        this.itens = itens;
    }


    /**
     * Gets the acesso value for this NECRequest.
     * 
     * @return acesso
     */
    public com.gvt.www.ws.eai.configuradoronline.acesso.Acesso getAcesso() {
        return acesso;
    }


    /**
     * Sets the acesso value for this NECRequest.
     * 
     * @param acesso
     */
    public void setAcesso(com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso) {
        this.acesso = acesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NECRequest)) return false;
        NECRequest other = (NECRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.custAcctNbr==null && other.getCustAcctNbr()==null) || 
             (this.custAcctNbr!=null &&
              this.custAcctNbr.equals(other.getCustAcctNbr()))) &&
            ((this.pon==null && other.getPon()==null) || 
             (this.pon!=null &&
              this.pon.equals(other.getPon()))) &&
            ((this.eventCode==null && other.getEventCode()==null) || 
             (this.eventCode!=null &&
              this.eventCode.equals(other.getEventCode()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            this.netProgramCode == other.getNetProgramCode() &&
            ((this.flagPilot==null && other.getFlagPilot()==null) || 
             (this.flagPilot!=null &&
              this.flagPilot.equals(other.getFlagPilot()))) &&
            ((this.tipoOrdem==null && other.getTipoOrdem()==null) || 
             (this.tipoOrdem!=null &&
              this.tipoOrdem.equals(other.getTipoOrdem()))) &&
            ((this.clliCode==null && other.getClliCode()==null) || 
             (this.clliCode!=null &&
              this.clliCode.equals(other.getClliCode()))) &&
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              java.util.Arrays.equals(this.itens, other.getItens()))) &&
            ((this.acesso==null && other.getAcesso()==null) || 
             (this.acesso!=null &&
              this.acesso.equals(other.getAcesso())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCustAcctNbr() != null) {
            _hashCode += getCustAcctNbr().hashCode();
        }
        if (getPon() != null) {
            _hashCode += getPon().hashCode();
        }
        if (getEventCode() != null) {
            _hashCode += getEventCode().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        _hashCode += getNetProgramCode();
        if (getFlagPilot() != null) {
            _hashCode += getFlagPilot().hashCode();
        }
        if (getTipoOrdem() != null) {
            _hashCode += getTipoOrdem().hashCode();
        }
        if (getClliCode() != null) {
            _hashCode += getClliCode().hashCode();
        }
        if (getItens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcesso() != null) {
            _hashCode += getAcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NECRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NECRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custAcctNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "CustAcctNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Pon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "EventCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "OrderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netProgramCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "NetProgramCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagPilot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "FlagPilot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "TipoOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clliCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "ClliCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/col/metaData/NECService", "Acesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/acesso", "Acesso"));
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
