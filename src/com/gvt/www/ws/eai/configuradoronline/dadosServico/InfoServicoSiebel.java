/**
 * InfoServicoSiebel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.configuradoronline.dadosServico;

public class InfoServicoSiebel  implements java.io.Serializable {
    private java.lang.Integer idCatalogoCol;

    private java.lang.Integer xGvtProdCod;

    private java.lang.String nomeElemento;

    private java.lang.String activityCD;

    private java.lang.String idElementoCRM;

    private com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] parametros;

    public InfoServicoSiebel() {
    }

    public InfoServicoSiebel(
           java.lang.Integer idCatalogoCol,
           java.lang.Integer xGvtProdCod,
           java.lang.String nomeElemento,
           java.lang.String activityCD,
           java.lang.String idElementoCRM,
           com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] parametros) {
           this.idCatalogoCol = idCatalogoCol;
           this.xGvtProdCod = xGvtProdCod;
           this.nomeElemento = nomeElemento;
           this.activityCD = activityCD;
           this.idElementoCRM = idElementoCRM;
           this.parametros = parametros;
    }


    /**
     * Gets the idCatalogoCol value for this InfoServicoSiebel.
     * 
     * @return idCatalogoCol
     */
    public java.lang.Integer getIdCatalogoCol() {
        return idCatalogoCol;
    }


    /**
     * Sets the idCatalogoCol value for this InfoServicoSiebel.
     * 
     * @param idCatalogoCol
     */
    public void setIdCatalogoCol(java.lang.Integer idCatalogoCol) {
        this.idCatalogoCol = idCatalogoCol;
    }


    /**
     * Gets the xGvtProdCod value for this InfoServicoSiebel.
     * 
     * @return xGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this InfoServicoSiebel.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the nomeElemento value for this InfoServicoSiebel.
     * 
     * @return nomeElemento
     */
    public java.lang.String getNomeElemento() {
        return nomeElemento;
    }


    /**
     * Sets the nomeElemento value for this InfoServicoSiebel.
     * 
     * @param nomeElemento
     */
    public void setNomeElemento(java.lang.String nomeElemento) {
        this.nomeElemento = nomeElemento;
    }


    /**
     * Gets the activityCD value for this InfoServicoSiebel.
     * 
     * @return activityCD
     */
    public java.lang.String getActivityCD() {
        return activityCD;
    }


    /**
     * Sets the activityCD value for this InfoServicoSiebel.
     * 
     * @param activityCD
     */
    public void setActivityCD(java.lang.String activityCD) {
        this.activityCD = activityCD;
    }


    /**
     * Gets the idElementoCRM value for this InfoServicoSiebel.
     * 
     * @return idElementoCRM
     */
    public java.lang.String getIdElementoCRM() {
        return idElementoCRM;
    }


    /**
     * Sets the idElementoCRM value for this InfoServicoSiebel.
     * 
     * @param idElementoCRM
     */
    public void setIdElementoCRM(java.lang.String idElementoCRM) {
        this.idElementoCRM = idElementoCRM;
    }


    /**
     * Gets the parametros value for this InfoServicoSiebel.
     * 
     * @return parametros
     */
    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this InfoServicoSiebel.
     * 
     * @param parametros
     */
    public void setParametros(com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico[] parametros) {
        this.parametros = parametros;
    }

    public com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, com.gvt.www.ws.eai.configuradoronline.dadosServico.ParamInstServico _value) {
        this.parametros[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoServicoSiebel)) return false;
        InfoServicoSiebel other = (InfoServicoSiebel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCatalogoCol==null && other.getIdCatalogoCol()==null) || 
             (this.idCatalogoCol!=null &&
              this.idCatalogoCol.equals(other.getIdCatalogoCol()))) &&
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.nomeElemento==null && other.getNomeElemento()==null) || 
             (this.nomeElemento!=null &&
              this.nomeElemento.equals(other.getNomeElemento()))) &&
            ((this.activityCD==null && other.getActivityCD()==null) || 
             (this.activityCD!=null &&
              this.activityCD.equals(other.getActivityCD()))) &&
            ((this.idElementoCRM==null && other.getIdElementoCRM()==null) || 
             (this.idElementoCRM!=null &&
              this.idElementoCRM.equals(other.getIdElementoCRM()))) &&
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
        if (getIdCatalogoCol() != null) {
            _hashCode += getIdCatalogoCol().hashCode();
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getNomeElemento() != null) {
            _hashCode += getNomeElemento().hashCode();
        }
        if (getActivityCD() != null) {
            _hashCode += getActivityCD().hashCode();
        }
        if (getIdElementoCRM() != null) {
            _hashCode += getIdElementoCRM().hashCode();
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
        new org.apache.axis.description.TypeDesc(InfoServicoSiebel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "InfoServicoSiebel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCatalogoCol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "idCatalogoCol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "nomeElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "activityCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElementoCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "idElementoCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/dadosServico", "ParamInstServico"));
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
