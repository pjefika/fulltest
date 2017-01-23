/**
 * CatalogodeServicosProdCodeOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.consultaCatalogServico;

public class CatalogodeServicosProdCodeOut  implements java.io.Serializable {
    private int[] x_gvt_prod_code;

    private java.lang.String mensagem;

    private int codigoRetorno;

    public CatalogodeServicosProdCodeOut() {
    }

    public CatalogodeServicosProdCodeOut(
           int[] x_gvt_prod_code,
           java.lang.String mensagem,
           int codigoRetorno) {
           this.x_gvt_prod_code = x_gvt_prod_code;
           this.mensagem = mensagem;
           this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the x_gvt_prod_code value for this CatalogodeServicosProdCodeOut.
     * 
     * @return x_gvt_prod_code
     */
    public int[] getX_gvt_prod_code() {
        return x_gvt_prod_code;
    }


    /**
     * Sets the x_gvt_prod_code value for this CatalogodeServicosProdCodeOut.
     * 
     * @param x_gvt_prod_code
     */
    public void setX_gvt_prod_code(int[] x_gvt_prod_code) {
        this.x_gvt_prod_code = x_gvt_prod_code;
    }

    public int getX_gvt_prod_code(int i) {
        return this.x_gvt_prod_code[i];
    }

    public void setX_gvt_prod_code(int i, int _value) {
        this.x_gvt_prod_code[i] = _value;
    }


    /**
     * Gets the mensagem value for this CatalogodeServicosProdCodeOut.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this CatalogodeServicosProdCodeOut.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the codigoRetorno value for this CatalogodeServicosProdCodeOut.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this CatalogodeServicosProdCodeOut.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogodeServicosProdCodeOut)) return false;
        CatalogodeServicosProdCodeOut other = (CatalogodeServicosProdCodeOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.x_gvt_prod_code==null && other.getX_gvt_prod_code()==null) || 
             (this.x_gvt_prod_code!=null &&
              java.util.Arrays.equals(this.x_gvt_prod_code, other.getX_gvt_prod_code()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            this.codigoRetorno == other.getCodigoRetorno();
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
        if (getX_gvt_prod_code() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getX_gvt_prod_code());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getX_gvt_prod_code(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        _hashCode += getCodigoRetorno();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogodeServicosProdCodeOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "CatalogodeServicosProdCodeOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("x_gvt_prod_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "x_gvt_prod_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaCatalogServico", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
