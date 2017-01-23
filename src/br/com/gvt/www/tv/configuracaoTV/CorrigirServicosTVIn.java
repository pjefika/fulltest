/**
 * CorrigirServicosTVIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class CorrigirServicosTVIn  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private br.com.gvt.www.tv.configuracaoTV.Passport passport;

    private java.lang.String velocidadeDownload;

    private br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementosSiebel;

    private java.lang.String cep;

    public CorrigirServicosTVIn() {
    }

    public CorrigirServicosTVIn(
           java.lang.String designadorTV,
           br.com.gvt.www.tv.configuracaoTV.Passport passport,
           java.lang.String velocidadeDownload,
           br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementosSiebel,
           java.lang.String cep) {
           this.designadorTV = designadorTV;
           this.passport = passport;
           this.velocidadeDownload = velocidadeDownload;
           this.elementosSiebel = elementosSiebel;
           this.cep = cep;
    }


    /**
     * Gets the designadorTV value for this CorrigirServicosTVIn.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this CorrigirServicosTVIn.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the passport value for this CorrigirServicosTVIn.
     * 
     * @return passport
     */
    public br.com.gvt.www.tv.configuracaoTV.Passport getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this CorrigirServicosTVIn.
     * 
     * @param passport
     */
    public void setPassport(br.com.gvt.www.tv.configuracaoTV.Passport passport) {
        this.passport = passport;
    }


    /**
     * Gets the velocidadeDownload value for this CorrigirServicosTVIn.
     * 
     * @return velocidadeDownload
     */
    public java.lang.String getVelocidadeDownload() {
        return velocidadeDownload;
    }


    /**
     * Sets the velocidadeDownload value for this CorrigirServicosTVIn.
     * 
     * @param velocidadeDownload
     */
    public void setVelocidadeDownload(java.lang.String velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }


    /**
     * Gets the elementosSiebel value for this CorrigirServicosTVIn.
     * 
     * @return elementosSiebel
     */
    public br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] getElementosSiebel() {
        return elementosSiebel;
    }


    /**
     * Sets the elementosSiebel value for this CorrigirServicosTVIn.
     * 
     * @param elementosSiebel
     */
    public void setElementosSiebel(br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementosSiebel) {
        this.elementosSiebel = elementosSiebel;
    }

    public br.com.gvt.www.tv.configuracaoTV.ElementoSiebel getElementosSiebel(int i) {
        return this.elementosSiebel[i];
    }

    public void setElementosSiebel(int i, br.com.gvt.www.tv.configuracaoTV.ElementoSiebel _value) {
        this.elementosSiebel[i] = _value;
    }


    /**
     * Gets the cep value for this CorrigirServicosTVIn.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this CorrigirServicosTVIn.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrigirServicosTVIn)) return false;
        CorrigirServicosTVIn other = (CorrigirServicosTVIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.velocidadeDownload==null && other.getVelocidadeDownload()==null) || 
             (this.velocidadeDownload!=null &&
              this.velocidadeDownload.equals(other.getVelocidadeDownload()))) &&
            ((this.elementosSiebel==null && other.getElementosSiebel()==null) || 
             (this.elementosSiebel!=null &&
              java.util.Arrays.equals(this.elementosSiebel, other.getElementosSiebel()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep())));
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
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getVelocidadeDownload() != null) {
            _hashCode += getVelocidadeDownload().hashCode();
        }
        if (getElementosSiebel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElementosSiebel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElementosSiebel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrigirServicosTVIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CorrigirServicosTVIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "Passport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "velocidadeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementosSiebel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "elementosSiebel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ElementoSiebel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "cep"));
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
