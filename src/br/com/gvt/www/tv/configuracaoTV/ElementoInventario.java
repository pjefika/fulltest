/**
 * ElementoInventario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ElementoInventario  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String idElemento;

    private java.lang.String xGvtProdCod;

    private br.com.gvt.www.tv.configuracaoTV.Parametro[] parametro;

    public ElementoInventario() {
    }

    public ElementoInventario(
           java.lang.String nome,
           java.lang.String idElemento,
           java.lang.String xGvtProdCod,
           br.com.gvt.www.tv.configuracaoTV.Parametro[] parametro) {
           this.nome = nome;
           this.idElemento = idElemento;
           this.xGvtProdCod = xGvtProdCod;
           this.parametro = parametro;
    }


    /**
     * Gets the nome value for this ElementoInventario.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ElementoInventario.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the idElemento value for this ElementoInventario.
     * 
     * @return idElemento
     */
    public java.lang.String getIdElemento() {
        return idElemento;
    }


    /**
     * Sets the idElemento value for this ElementoInventario.
     * 
     * @param idElemento
     */
    public void setIdElemento(java.lang.String idElemento) {
        this.idElemento = idElemento;
    }


    /**
     * Gets the xGvtProdCod value for this ElementoInventario.
     * 
     * @return xGvtProdCod
     */
    public java.lang.String getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this ElementoInventario.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.String xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the parametro value for this ElementoInventario.
     * 
     * @return parametro
     */
    public br.com.gvt.www.tv.configuracaoTV.Parametro[] getParametro() {
        return parametro;
    }


    /**
     * Sets the parametro value for this ElementoInventario.
     * 
     * @param parametro
     */
    public void setParametro(br.com.gvt.www.tv.configuracaoTV.Parametro[] parametro) {
        this.parametro = parametro;
    }

    public br.com.gvt.www.tv.configuracaoTV.Parametro getParametro(int i) {
        return this.parametro[i];
    }

    public void setParametro(int i, br.com.gvt.www.tv.configuracaoTV.Parametro _value) {
        this.parametro[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ElementoInventario)) return false;
        ElementoInventario other = (ElementoInventario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.idElemento==null && other.getIdElemento()==null) || 
             (this.idElemento!=null &&
              this.idElemento.equals(other.getIdElemento()))) &&
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.parametro==null && other.getParametro()==null) || 
             (this.parametro!=null &&
              java.util.Arrays.equals(this.parametro, other.getParametro())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getIdElemento() != null) {
            _hashCode += getIdElemento().hashCode();
        }
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getParametro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametro(), i);
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
        new org.apache.axis.description.TypeDesc(ElementoInventario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoInventario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nome"));
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
        elemField.setFieldName("XGvtProdCod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "xGvtProdCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "parametro"));
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
