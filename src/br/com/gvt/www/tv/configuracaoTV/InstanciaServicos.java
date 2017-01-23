/**
 * InstanciaServicos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class InstanciaServicos  implements java.io.Serializable {
    private java.lang.String idElementoCRM;

    private java.lang.Integer xGvtProdCod;

    private java.lang.String nome;

    private br.com.gvt.www.tv.configuracaoTV.StatusProvisioning status;

    private br.com.gvt.www.tv.configuracaoTV.Parametro[] parametros;

    public InstanciaServicos() {
    }

    public InstanciaServicos(
           java.lang.String idElementoCRM,
           java.lang.Integer xGvtProdCod,
           java.lang.String nome,
           br.com.gvt.www.tv.configuracaoTV.StatusProvisioning status,
           br.com.gvt.www.tv.configuracaoTV.Parametro[] parametros) {
           this.idElementoCRM = idElementoCRM;
           this.xGvtProdCod = xGvtProdCod;
           this.nome = nome;
           this.status = status;
           this.parametros = parametros;
    }


    /**
     * Gets the idElementoCRM value for this InstanciaServicos.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this InstanciaServicos.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the xGvtProdCod value for this InstanciaServicos.
     * 
     * @return xGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this InstanciaServicos.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the nome value for this InstanciaServicos.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this InstanciaServicos.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the status value for this InstanciaServicos.
     * 
     * @return status
     */
    public br.com.gvt.www.tv.configuracaoTV.StatusProvisioning getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InstanciaServicos.
     * 
     * @param status
     */
    public void setStatus(br.com.gvt.www.tv.configuracaoTV.StatusProvisioning status) {
        this.status = status;
    }


    /**
     * Gets the parametros value for this InstanciaServicos.
     * 
     * @return parametros
     */
    public br.com.gvt.www.tv.configuracaoTV.Parametro[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this InstanciaServicos.
     * 
     * @param parametros
     */
    public void setParametros(br.com.gvt.www.tv.configuracaoTV.Parametro[] parametros) {
        this.parametros = parametros;
    }

    public br.com.gvt.www.tv.configuracaoTV.Parametro getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, br.com.gvt.www.tv.configuracaoTV.Parametro _value) {
        this.parametros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstanciaServicos)) return false;
        InstanciaServicos other = (InstanciaServicos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros())));
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
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
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
        new org.apache.axis.description.TypeDesc(InstanciaServicos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "InstanciaServicos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "StatusProvisioning"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Parametro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
