/**
 * ElementoSiebel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ElementoSiebel  implements java.io.Serializable {
    private java.lang.String xGvtProdCod;

    private java.lang.String nomeElemento;

    private java.lang.String activityCD;

    private java.lang.String idElemento;

    private br.com.gvt.www.tv.configuracaoTV.Parametro[] parametros;

    public ElementoSiebel() {
    }

    public ElementoSiebel(
           java.lang.String xGvtProdCod,
           java.lang.String nomeElemento,
           java.lang.String activityCD,
           java.lang.String idElemento,
           br.com.gvt.www.tv.configuracaoTV.Parametro[] parametros) {
           this.xGvtProdCod = xGvtProdCod;
           this.nomeElemento = nomeElemento;
           this.activityCD = activityCD;
           this.idElemento = idElemento;
           this.parametros = parametros;
    }


    /**
     * Gets the xGvtProdCod value for this ElementoSiebel.
     * 
     * @return xGvtProdCod
     */
    public java.lang.String getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this ElementoSiebel.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.String xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the nomeElemento value for this ElementoSiebel.
     * 
     * @return nomeElemento
     */
    public java.lang.String getNomeElemento() {
        return nomeElemento;
    }


    /**
     * Sets the nomeElemento value for this ElementoSiebel.
     * 
     * @param nomeElemento
     */
    public void setNomeElemento(java.lang.String nomeElemento) {
        this.nomeElemento = nomeElemento;
    }


    /**
     * Gets the activityCD value for this ElementoSiebel.
     * 
     * @return activityCD
     */
    public java.lang.String getActivityCD() {
        return activityCD;
    }


    /**
     * Sets the activityCD value for this ElementoSiebel.
     * 
     * @param activityCD
     */
    public void setActivityCD(java.lang.String activityCD) {
        this.activityCD = activityCD;
    }


    /**
     * Gets the idElemento value for this ElementoSiebel.
     * 
     * @return idElemento
     */
    public java.lang.String getIdElemento() {
        return idElemento;
    }


    /**
     * Sets the idElemento value for this ElementoSiebel.
     * 
     * @param idElemento
     */
    public void setIdElemento(java.lang.String idElemento) {
        this.idElemento = idElemento;
    }


    /**
     * Gets the parametros value for this ElementoSiebel.
     * 
     * @return parametros
     */
    public br.com.gvt.www.tv.configuracaoTV.Parametro[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this ElementoSiebel.
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
        if (!(obj instanceof ElementoSiebel)) return false;
        ElementoSiebel other = (ElementoSiebel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.nomeElemento==null && other.getNomeElemento()==null) || 
             (this.nomeElemento!=null &&
              this.nomeElemento.equals(other.getNomeElemento()))) &&
            ((this.activityCD==null && other.getActivityCD()==null) || 
             (this.activityCD!=null &&
              this.activityCD.equals(other.getActivityCD()))) &&
            ((this.idElemento==null && other.getIdElemento()==null) || 
             (this.idElemento!=null &&
              this.idElemento.equals(other.getIdElemento()))) &&
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
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getNomeElemento() != null) {
            _hashCode += getNomeElemento().hashCode();
        }
        if (getActivityCD() != null) {
            _hashCode += getActivityCD().hashCode();
        }
        if (getIdElemento() != null) {
            _hashCode += getIdElemento().hashCode();
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
        new org.apache.axis.description.TypeDesc(ElementoSiebel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoSiebel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nomeElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "activityCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "idElemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
