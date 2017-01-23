/**
 * Pacote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class Pacote  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.Integer xGvtProdCod;

    private br.com.gvt.www.tv.configuracaoTV.Canal[] canais;

    public Pacote() {
    }

    public Pacote(
           java.lang.String nome,
           java.lang.Integer xGvtProdCod,
           br.com.gvt.www.tv.configuracaoTV.Canal[] canais) {
           this.nome = nome;
           this.xGvtProdCod = xGvtProdCod;
           this.canais = canais;
    }


    /**
     * Gets the nome value for this Pacote.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Pacote.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the xGvtProdCod value for this Pacote.
     * 
     * @return xGvtProdCod
     */
    public java.lang.Integer getXGvtProdCod() {
        return xGvtProdCod;
    }


    /**
     * Sets the xGvtProdCod value for this Pacote.
     * 
     * @param xGvtProdCod
     */
    public void setXGvtProdCod(java.lang.Integer xGvtProdCod) {
        this.xGvtProdCod = xGvtProdCod;
    }


    /**
     * Gets the canais value for this Pacote.
     * 
     * @return canais
     */
    public br.com.gvt.www.tv.configuracaoTV.Canal[] getCanais() {
        return canais;
    }


    /**
     * Sets the canais value for this Pacote.
     * 
     * @param canais
     */
    public void setCanais(br.com.gvt.www.tv.configuracaoTV.Canal[] canais) {
        this.canais = canais;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pacote)) return false;
        Pacote other = (Pacote) obj;
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
            ((this.xGvtProdCod==null && other.getXGvtProdCod()==null) || 
             (this.xGvtProdCod!=null &&
              this.xGvtProdCod.equals(other.getXGvtProdCod()))) &&
            ((this.canais==null && other.getCanais()==null) || 
             (this.canais!=null &&
              java.util.Arrays.equals(this.canais, other.getCanais())));
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
        if (getXGvtProdCod() != null) {
            _hashCode += getXGvtProdCod().hashCode();
        }
        if (getCanais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCanais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCanais(), i);
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
        new org.apache.axis.description.TypeDesc(Pacote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Pacote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("canais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "canais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Canal"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "canal"));
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
