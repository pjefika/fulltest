/**
 * OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.OSSTurbonetMotivosDesconexao;

public class OSSTurbonetMotivosDesconexaoOutMotivosDesconexao  implements java.io.Serializable {
    private java.util.Calendar dataHora;

    private java.lang.Integer codigoMotivo;

    private java.lang.String nomeTecnico;

    private java.lang.String nome;

    private java.lang.String descricaoTecnica;

    private java.lang.Boolean motivoGVT;

    public OSSTurbonetMotivosDesconexaoOutMotivosDesconexao() {
    }

    public OSSTurbonetMotivosDesconexaoOutMotivosDesconexao(
           java.util.Calendar dataHora,
           java.lang.Integer codigoMotivo,
           java.lang.String nomeTecnico,
           java.lang.String nome,
           java.lang.String descricaoTecnica,
           java.lang.Boolean motivoGVT) {
           this.dataHora = dataHora;
           this.codigoMotivo = codigoMotivo;
           this.nomeTecnico = nomeTecnico;
           this.nome = nome;
           this.descricaoTecnica = descricaoTecnica;
           this.motivoGVT = motivoGVT;
    }


    /**
     * Gets the dataHora value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return dataHora
     */
    public java.util.Calendar getDataHora() {
        return dataHora;
    }


    /**
     * Sets the dataHora value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param dataHora
     */
    public void setDataHora(java.util.Calendar dataHora) {
        this.dataHora = dataHora;
    }


    /**
     * Gets the codigoMotivo value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return codigoMotivo
     */
    public java.lang.Integer getCodigoMotivo() {
        return codigoMotivo;
    }


    /**
     * Sets the codigoMotivo value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param codigoMotivo
     */
    public void setCodigoMotivo(java.lang.Integer codigoMotivo) {
        this.codigoMotivo = codigoMotivo;
    }


    /**
     * Gets the nomeTecnico value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return nomeTecnico
     */
    public java.lang.String getNomeTecnico() {
        return nomeTecnico;
    }


    /**
     * Sets the nomeTecnico value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param nomeTecnico
     */
    public void setNomeTecnico(java.lang.String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }


    /**
     * Gets the nome value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the descricaoTecnica value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return descricaoTecnica
     */
    public java.lang.String getDescricaoTecnica() {
        return descricaoTecnica;
    }


    /**
     * Sets the descricaoTecnica value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param descricaoTecnica
     */
    public void setDescricaoTecnica(java.lang.String descricaoTecnica) {
        this.descricaoTecnica = descricaoTecnica;
    }


    /**
     * Gets the motivoGVT value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @return motivoGVT
     */
    public java.lang.Boolean getMotivoGVT() {
        return motivoGVT;
    }


    /**
     * Sets the motivoGVT value for this OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.
     * 
     * @param motivoGVT
     */
    public void setMotivoGVT(java.lang.Boolean motivoGVT) {
        this.motivoGVT = motivoGVT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OSSTurbonetMotivosDesconexaoOutMotivosDesconexao)) return false;
        OSSTurbonetMotivosDesconexaoOutMotivosDesconexao other = (OSSTurbonetMotivosDesconexaoOutMotivosDesconexao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataHora==null && other.getDataHora()==null) || 
             (this.dataHora!=null &&
              this.dataHora.equals(other.getDataHora()))) &&
            ((this.codigoMotivo==null && other.getCodigoMotivo()==null) || 
             (this.codigoMotivo!=null &&
              this.codigoMotivo.equals(other.getCodigoMotivo()))) &&
            ((this.nomeTecnico==null && other.getNomeTecnico()==null) || 
             (this.nomeTecnico!=null &&
              this.nomeTecnico.equals(other.getNomeTecnico()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.descricaoTecnica==null && other.getDescricaoTecnica()==null) || 
             (this.descricaoTecnica!=null &&
              this.descricaoTecnica.equals(other.getDescricaoTecnica()))) &&
            ((this.motivoGVT==null && other.getMotivoGVT()==null) || 
             (this.motivoGVT!=null &&
              this.motivoGVT.equals(other.getMotivoGVT())));
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
        if (getDataHora() != null) {
            _hashCode += getDataHora().hashCode();
        }
        if (getCodigoMotivo() != null) {
            _hashCode += getCodigoMotivo().hashCode();
        }
        if (getNomeTecnico() != null) {
            _hashCode += getNomeTecnico().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getDescricaoTecnica() != null) {
            _hashCode += getDescricaoTecnica().hashCode();
        }
        if (getMotivoGVT() != null) {
            _hashCode += getMotivoGVT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSSTurbonetMotivosDesconexaoOutMotivosDesconexao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", ">OSSTurbonetMotivosDesconexaoOut>motivosDesconexao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "dataHora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMotivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "codigoMotivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeTecnico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "nomeTecnico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "descricaoTecnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoGVT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/OSSTurbonetMotivosDesconexao", "motivoGVT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
