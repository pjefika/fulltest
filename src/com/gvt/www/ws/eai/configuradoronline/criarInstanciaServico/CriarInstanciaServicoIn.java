/**
 * CriarInstanciaServicoIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico;

public class CriarInstanciaServicoIn  implements java.io.Serializable {
    private int idInstanciaProduto;

    private java.lang.String idElementoCRM;

    private java.lang.Integer idCatalogoServico;

    private java.lang.String nomeCatalogoServico;

    private java.lang.String tipo;

    private java.lang.String nomeStatus;

    private java.lang.Integer idStatus;

    private java.lang.Integer idProdutoPai;

    private com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param[] params;

    private com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource[] resources;

    public CriarInstanciaServicoIn() {
    }

    public CriarInstanciaServicoIn(
           int idInstanciaProduto,
           java.lang.String idElementoCRM,
           java.lang.Integer idCatalogoServico,
           java.lang.String nomeCatalogoServico,
           java.lang.String tipo,
           java.lang.String nomeStatus,
           java.lang.Integer idStatus,
           java.lang.Integer idProdutoPai,
           com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param[] params,
           com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource[] resources) {
           this.idInstanciaProduto = idInstanciaProduto;
           this.idElementoCRM = idElementoCRM;
           this.idCatalogoServico = idCatalogoServico;
           this.nomeCatalogoServico = nomeCatalogoServico;
           this.tipo = tipo;
           this.nomeStatus = nomeStatus;
           this.idStatus = idStatus;
           this.idProdutoPai = idProdutoPai;
           this.params = params;
           this.resources = resources;
    }


    /**
     * Gets the idInstanciaProduto value for this CriarInstanciaServicoIn.
     * 
     * @return idInstanciaProduto
     */
    public int getIdInstanciaProduto() {
        return idInstanciaProduto;
    }


    /**
     * Sets the idInstanciaProduto value for this CriarInstanciaServicoIn.
     * 
     * @param idInstanciaProduto
     */
    public void setIdInstanciaProduto(int idInstanciaProduto) {
        this.idInstanciaProduto = idInstanciaProduto;
    }


    /**
     * Gets the idElementoCRM value for this CriarInstanciaServicoIn.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this CriarInstanciaServicoIn.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the idCatalogoServico value for this CriarInstanciaServicoIn.
     * 
     * @return idCatalogoServico
     */
    public java.lang.Integer getIdCatalogoServico() {
        return idCatalogoServico;
    }


    /**
     * Sets the idCatalogoServico value for this CriarInstanciaServicoIn.
     * 
     * @param idCatalogoServico
     */
    public void setIdCatalogoServico(java.lang.Integer idCatalogoServico) {
        this.idCatalogoServico = idCatalogoServico;
    }


    /**
     * Gets the nomeCatalogoServico value for this CriarInstanciaServicoIn.
     * 
     * @return nomeCatalogoServico
     */
    public java.lang.String getNomeCatalogoServico() {
        return nomeCatalogoServico;
    }


    /**
     * Sets the nomeCatalogoServico value for this CriarInstanciaServicoIn.
     * 
     * @param nomeCatalogoServico
     */
    public void setNomeCatalogoServico(java.lang.String nomeCatalogoServico) {
        this.nomeCatalogoServico = nomeCatalogoServico;
    }


    /**
     * Gets the tipo value for this CriarInstanciaServicoIn.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this CriarInstanciaServicoIn.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the nomeStatus value for this CriarInstanciaServicoIn.
     * 
     * @return nomeStatus
     */
    public java.lang.String getNomeStatus() {
        return nomeStatus;
    }


    /**
     * Sets the nomeStatus value for this CriarInstanciaServicoIn.
     * 
     * @param nomeStatus
     */
    public void setNomeStatus(java.lang.String nomeStatus) {
        this.nomeStatus = nomeStatus;
    }


    /**
     * Gets the idStatus value for this CriarInstanciaServicoIn.
     * 
     * @return idStatus
     */
    public java.lang.Integer getIdStatus() {
        return idStatus;
    }


    /**
     * Sets the idStatus value for this CriarInstanciaServicoIn.
     * 
     * @param idStatus
     */
    public void setIdStatus(java.lang.Integer idStatus) {
        this.idStatus = idStatus;
    }


    /**
     * Gets the idProdutoPai value for this CriarInstanciaServicoIn.
     * 
     * @return idProdutoPai
     */
    public java.lang.Integer getIdProdutoPai() {
        return idProdutoPai;
    }


    /**
     * Sets the idProdutoPai value for this CriarInstanciaServicoIn.
     * 
     * @param idProdutoPai
     */
    public void setIdProdutoPai(java.lang.Integer idProdutoPai) {
        this.idProdutoPai = idProdutoPai;
    }


    /**
     * Gets the params value for this CriarInstanciaServicoIn.
     * 
     * @return params
     */
    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this CriarInstanciaServicoIn.
     * 
     * @param params
     */
    public void setParams(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param[] params) {
        this.params = params;
    }

    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Param _value) {
        this.params[i] = _value;
    }


    /**
     * Gets the resources value for this CriarInstanciaServicoIn.
     * 
     * @return resources
     */
    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource[] getResources() {
        return resources;
    }


    /**
     * Sets the resources value for this CriarInstanciaServicoIn.
     * 
     * @param resources
     */
    public void setResources(com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource[] resources) {
        this.resources = resources;
    }

    public com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource getResources(int i) {
        return this.resources[i];
    }

    public void setResources(int i, com.gvt.www.ws.eai.configuradoronline.criarInstanciaServico.Resource _value) {
        this.resources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriarInstanciaServicoIn)) return false;
        CriarInstanciaServicoIn other = (CriarInstanciaServicoIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idInstanciaProduto == other.getIdInstanciaProduto() &&
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
            ((this.idCatalogoServico==null && other.getIdCatalogoServico()==null) || 
             (this.idCatalogoServico!=null &&
              this.idCatalogoServico.equals(other.getIdCatalogoServico()))) &&
            ((this.nomeCatalogoServico==null && other.getNomeCatalogoServico()==null) || 
             (this.nomeCatalogoServico!=null &&
              this.nomeCatalogoServico.equals(other.getNomeCatalogoServico()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.nomeStatus==null && other.getNomeStatus()==null) || 
             (this.nomeStatus!=null &&
              this.nomeStatus.equals(other.getNomeStatus()))) &&
            ((this.idStatus==null && other.getIdStatus()==null) || 
             (this.idStatus!=null &&
              this.idStatus.equals(other.getIdStatus()))) &&
            ((this.idProdutoPai==null && other.getIdProdutoPai()==null) || 
             (this.idProdutoPai!=null &&
              this.idProdutoPai.equals(other.getIdProdutoPai()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams()))) &&
            ((this.resources==null && other.getResources()==null) || 
             (this.resources!=null &&
              java.util.Arrays.equals(this.resources, other.getResources())));
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
        _hashCode += getIdInstanciaProduto();
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
        }
        if (getIdCatalogoServico() != null) {
            _hashCode += getIdCatalogoServico().hashCode();
        }
        if (getNomeCatalogoServico() != null) {
            _hashCode += getNomeCatalogoServico().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getNomeStatus() != null) {
            _hashCode += getNomeStatus().hashCode();
        }
        if (getIdStatus() != null) {
            _hashCode += getIdStatus().hashCode();
        }
        if (getIdProdutoPai() != null) {
            _hashCode += getIdProdutoPai().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResources(), i);
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
        new org.apache.axis.description.TypeDesc(CriarInstanciaServicoIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "criarInstanciaServicoIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idInstanciaProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idInstanciaProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCatalogoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idCatalogoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCatalogoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "nomeCatalogoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "nomeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProdutoPai");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "idProdutoPai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "resources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/criarInstanciaServico", "resource"));
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
