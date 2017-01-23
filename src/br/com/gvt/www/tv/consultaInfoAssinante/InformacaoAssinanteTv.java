/**
 * InformacaoAssinanteTv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.consultaInfoAssinante;

public class InformacaoAssinanteTv  implements java.io.Serializable {
    private java.lang.String userIdIap;

    private java.lang.String mensagem;

    private int codigoRetorno;

    private br.com.gvt.www.tv.ipvodinfo.SubscriberInfo ipvodInfo;

    public InformacaoAssinanteTv() {
    }

    public InformacaoAssinanteTv(
           java.lang.String userIdIap,
           java.lang.String mensagem,
           int codigoRetorno,
           br.com.gvt.www.tv.ipvodinfo.SubscriberInfo ipvodInfo) {
           this.userIdIap = userIdIap;
           this.mensagem = mensagem;
           this.codigoRetorno = codigoRetorno;
           this.ipvodInfo = ipvodInfo;
    }


    /**
     * Gets the userIdIap value for this InformacaoAssinanteTv.
     * 
     * @return userIdIap
     */
    public java.lang.String getUserIdIap() {
        return userIdIap;
    }


    /**
     * Sets the userIdIap value for this InformacaoAssinanteTv.
     * 
     * @param userIdIap
     */
    public void setUserIdIap(java.lang.String userIdIap) {
        this.userIdIap = userIdIap;
    }


    /**
     * Gets the mensagem value for this InformacaoAssinanteTv.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this InformacaoAssinanteTv.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the codigoRetorno value for this InformacaoAssinanteTv.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this InformacaoAssinanteTv.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the ipvodInfo value for this InformacaoAssinanteTv.
     * 
     * @return ipvodInfo
     */
    public br.com.gvt.www.tv.ipvodinfo.SubscriberInfo getIpvodInfo() {
        return ipvodInfo;
    }


    /**
     * Sets the ipvodInfo value for this InformacaoAssinanteTv.
     * 
     * @param ipvodInfo
     */
    public void setIpvodInfo(br.com.gvt.www.tv.ipvodinfo.SubscriberInfo ipvodInfo) {
        this.ipvodInfo = ipvodInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacaoAssinanteTv)) return false;
        InformacaoAssinanteTv other = (InformacaoAssinanteTv) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userIdIap==null && other.getUserIdIap()==null) || 
             (this.userIdIap!=null &&
              this.userIdIap.equals(other.getUserIdIap()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            this.codigoRetorno == other.getCodigoRetorno() &&
            ((this.ipvodInfo==null && other.getIpvodInfo()==null) || 
             (this.ipvodInfo!=null &&
              this.ipvodInfo.equals(other.getIpvodInfo())));
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
        if (getUserIdIap() != null) {
            _hashCode += getUserIdIap().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        _hashCode += getCodigoRetorno();
        if (getIpvodInfo() != null) {
            _hashCode += getIpvodInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacaoAssinanteTv.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "InformacaoAssinanteTv"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdIap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "userIdIap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipvodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/consultaInfoAssinante", "ipvodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/ipvodinfo", "SubscriberInfo"));
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
