/**
 * DiagnosticoCPEsOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoCPE;

public class DiagnosticoCPEsOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private java.lang.String designadorTV;

    private br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico homegateway;

    private br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico[] stbs;

    public DiagnosticoCPEsOut() {
    }

    public DiagnosticoCPEsOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String designadorTV,
           br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico homegateway,
           br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico[] stbs) {
        super(
            codigo,
            mensagem,
            descricao);
        this.designadorTV = designadorTV;
        this.homegateway = homegateway;
        this.stbs = stbs;
    }


    /**
     * Gets the designadorTV value for this DiagnosticoCPEsOut.
     * 
     * @return designadorTV
     */
    public java.lang.String getDesignadorTV() {
        return designadorTV;
    }


    /**
     * Sets the designadorTV value for this DiagnosticoCPEsOut.
     * 
     * @param designadorTV
     */
    public void setDesignadorTV(java.lang.String designadorTV) {
        this.designadorTV = designadorTV;
    }


    /**
     * Gets the homegateway value for this DiagnosticoCPEsOut.
     * 
     * @return homegateway
     */
    public br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico getHomegateway() {
        return homegateway;
    }


    /**
     * Sets the homegateway value for this DiagnosticoCPEsOut.
     * 
     * @param homegateway
     */
    public void setHomegateway(br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico homegateway) {
        this.homegateway = homegateway;
    }


    /**
     * Gets the stbs value for this DiagnosticoCPEsOut.
     * 
     * @return stbs
     */
    public br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico[] getStbs() {
        return stbs;
    }


    /**
     * Sets the stbs value for this DiagnosticoCPEsOut.
     * 
     * @param stbs
     */
    public void setStbs(br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico[] stbs) {
        this.stbs = stbs;
    }

    public br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico getStbs(int i) {
        return this.stbs[i];
    }

    public void setStbs(int i, br.com.gvt.www.tv.diagnosticoCPE.ElementoDiagnostico _value) {
        this.stbs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoCPEsOut)) return false;
        DiagnosticoCPEsOut other = (DiagnosticoCPEsOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.designadorTV==null && other.getDesignadorTV()==null) || 
             (this.designadorTV!=null &&
              this.designadorTV.equals(other.getDesignadorTV()))) &&
            ((this.homegateway==null && other.getHomegateway()==null) || 
             (this.homegateway!=null &&
              this.homegateway.equals(other.getHomegateway()))) &&
            ((this.stbs==null && other.getStbs()==null) || 
             (this.stbs!=null &&
              java.util.Arrays.equals(this.stbs, other.getStbs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDesignadorTV() != null) {
            _hashCode += getDesignadorTV().hashCode();
        }
        if (getHomegateway() != null) {
            _hashCode += getHomegateway().hashCode();
        }
        if (getStbs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStbs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStbs(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnosticoCPEsOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoCPEsOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "designadorTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homegateway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "homegateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ElementoDiagnostico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stbs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "stbs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "ElementoDiagnostico"));
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
