/**
 * StatusCGNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.CGNAT;


/**
 * 0 - Não Migrado BRAS não foi migrado; BRAS migrado + mas
 * 				cliente não processado
 * 
 * 				1 - Elegível ao CGNAT BRAS migrado + cliente COM
 * 				PrefixDelegation + não desativado
 * 
 * 				2 - Não elegível ao CGNAT BRAS migrado + cliente SEM
 * 				Prefix Delegation + não desativado
 * 
 * 				3- Desabilitado Cliente BRAS migrado + CGNAT desativado
 */
public class StatusCGNAT  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATCodigo codigo;

    private com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATDescricao descricao;

    public StatusCGNAT() {
    }

    public StatusCGNAT(
           com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATCodigo codigo,
           com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATDescricao descricao) {
           this.codigo = codigo;
           this.descricao = descricao;
    }


    /**
     * Gets the codigo value for this StatusCGNAT.
     * 
     * @return codigo
     */
    public com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATCodigo getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this StatusCGNAT.
     * 
     * @param codigo
     */
    public void setCodigo(com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATCodigo codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descricao value for this StatusCGNAT.
     * 
     * @return descricao
     */
    public com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATDescricao getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this StatusCGNAT.
     * 
     * @param descricao
     */
    public void setDescricao(com.gvt.www.ws.eai.oss.CGNAT.EnumCGNATDescricao descricao) {
        this.descricao = descricao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusCGNAT)) return false;
        StatusCGNAT other = (StatusCGNAT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusCGNAT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "StatusCGNAT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "EnumCGNATCodigo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/CGNAT", "EnumCGNATDescricao"));
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
