/**
 * EventoPayPerView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class EventoPayPerView  implements java.io.Serializable {
    private java.util.Date terminoEvento;

    private java.lang.String nomeEvento;

    private java.lang.String offeringTemplateId;

    private java.lang.String programId;

    private java.lang.String oppvId;

    public EventoPayPerView() {
    }

    public EventoPayPerView(
           java.util.Date terminoEvento,
           java.lang.String nomeEvento,
           java.lang.String offeringTemplateId,
           java.lang.String programId,
           java.lang.String oppvId) {
           this.terminoEvento = terminoEvento;
           this.nomeEvento = nomeEvento;
           this.offeringTemplateId = offeringTemplateId;
           this.programId = programId;
           this.oppvId = oppvId;
    }


    /**
     * Gets the terminoEvento value for this EventoPayPerView.
     * 
     * @return terminoEvento
     */
    public java.util.Date getTerminoEvento() {
        return terminoEvento;
    }


    /**
     * Sets the terminoEvento value for this EventoPayPerView.
     * 
     * @param terminoEvento
     */
    public void setTerminoEvento(java.util.Date terminoEvento) {
        this.terminoEvento = terminoEvento;
    }


    /**
     * Gets the nomeEvento value for this EventoPayPerView.
     * 
     * @return nomeEvento
     */
    public java.lang.String getNomeEvento() {
        return nomeEvento;
    }


    /**
     * Sets the nomeEvento value for this EventoPayPerView.
     * 
     * @param nomeEvento
     */
    public void setNomeEvento(java.lang.String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }


    /**
     * Gets the offeringTemplateId value for this EventoPayPerView.
     * 
     * @return offeringTemplateId
     */
    public java.lang.String getOfferingTemplateId() {
        return offeringTemplateId;
    }


    /**
     * Sets the offeringTemplateId value for this EventoPayPerView.
     * 
     * @param offeringTemplateId
     */
    public void setOfferingTemplateId(java.lang.String offeringTemplateId) {
        this.offeringTemplateId = offeringTemplateId;
    }


    /**
     * Gets the programId value for this EventoPayPerView.
     * 
     * @return programId
     */
    public java.lang.String getProgramId() {
        return programId;
    }


    /**
     * Sets the programId value for this EventoPayPerView.
     * 
     * @param programId
     */
    public void setProgramId(java.lang.String programId) {
        this.programId = programId;
    }


    /**
     * Gets the oppvId value for this EventoPayPerView.
     * 
     * @return oppvId
     */
    public java.lang.String getOppvId() {
        return oppvId;
    }


    /**
     * Sets the oppvId value for this EventoPayPerView.
     * 
     * @param oppvId
     */
    public void setOppvId(java.lang.String oppvId) {
        this.oppvId = oppvId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventoPayPerView)) return false;
        EventoPayPerView other = (EventoPayPerView) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.terminoEvento==null && other.getTerminoEvento()==null) || 
             (this.terminoEvento!=null &&
              this.terminoEvento.equals(other.getTerminoEvento()))) &&
            ((this.nomeEvento==null && other.getNomeEvento()==null) || 
             (this.nomeEvento!=null &&
              this.nomeEvento.equals(other.getNomeEvento()))) &&
            ((this.offeringTemplateId==null && other.getOfferingTemplateId()==null) || 
             (this.offeringTemplateId!=null &&
              this.offeringTemplateId.equals(other.getOfferingTemplateId()))) &&
            ((this.programId==null && other.getProgramId()==null) || 
             (this.programId!=null &&
              this.programId.equals(other.getProgramId()))) &&
            ((this.oppvId==null && other.getOppvId()==null) || 
             (this.oppvId!=null &&
              this.oppvId.equals(other.getOppvId())));
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
        if (getTerminoEvento() != null) {
            _hashCode += getTerminoEvento().hashCode();
        }
        if (getNomeEvento() != null) {
            _hashCode += getNomeEvento().hashCode();
        }
        if (getOfferingTemplateId() != null) {
            _hashCode += getOfferingTemplateId().hashCode();
        }
        if (getProgramId() != null) {
            _hashCode += getProgramId().hashCode();
        }
        if (getOppvId() != null) {
            _hashCode += getOppvId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventoPayPerView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "EventoPayPerView"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "terminoEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nomeEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "offeringTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "programId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oppvId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "oppvId"));
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
