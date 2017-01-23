/**
 * DiagnosticoCPEsOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.diagnosticoHPNA;

public class DiagnosticoCPEsOut  extends br.com.gvt.www.tv.configuracaoTV.MensagemRetorno  implements java.io.Serializable {
    private java.lang.String designadorTurbonet;

    private java.util.Calendar dataExecucao;

    private br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] diagnosticos;

    public DiagnosticoCPEsOut() {
    }

    public DiagnosticoCPEsOut(
           int codigo,
           java.lang.String mensagem,
           java.lang.String descricao,
           java.lang.String designadorTurbonet,
           java.util.Calendar dataExecucao,
           br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] diagnosticos) {
        super(
            codigo,
            mensagem,
            descricao);
        this.designadorTurbonet = designadorTurbonet;
        this.dataExecucao = dataExecucao;
        this.diagnosticos = diagnosticos;
    }


    /**
     * Gets the designadorTurbonet value for this DiagnosticoCPEsOut.
     * 
     * @return designadorTurbonet
     */
    public java.lang.String getDesignadorTurbonet() {
        return designadorTurbonet;
    }


    /**
     * Sets the designadorTurbonet value for this DiagnosticoCPEsOut.
     * 
     * @param designadorTurbonet
     */
    public void setDesignadorTurbonet(java.lang.String designadorTurbonet) {
        this.designadorTurbonet = designadorTurbonet;
    }


    /**
     * Gets the dataExecucao value for this DiagnosticoCPEsOut.
     * 
     * @return dataExecucao
     */
    public java.util.Calendar getDataExecucao() {
        return dataExecucao;
    }


    /**
     * Sets the dataExecucao value for this DiagnosticoCPEsOut.
     * 
     * @param dataExecucao
     */
    public void setDataExecucao(java.util.Calendar dataExecucao) {
        this.dataExecucao = dataExecucao;
    }


    /**
     * Gets the diagnosticos value for this DiagnosticoCPEsOut.
     * 
     * @return diagnosticos
     */
    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] getDiagnosticos() {
        return diagnosticos;
    }


    /**
     * Sets the diagnosticos value for this DiagnosticoCPEsOut.
     * 
     * @param diagnosticos
     */
    public void setDiagnosticos(br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam[] diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam getDiagnosticos(int i) {
        return this.diagnosticos[i];
    }

    public void setDiagnosticos(int i, br.com.gvt.www.tv.diagnosticoCPE.DiagnosticoParam _value) {
        this.diagnosticos[i] = _value;
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
            ((this.designadorTurbonet==null && other.getDesignadorTurbonet()==null) || 
             (this.designadorTurbonet!=null &&
              this.designadorTurbonet.equals(other.getDesignadorTurbonet()))) &&
            ((this.dataExecucao==null && other.getDataExecucao()==null) || 
             (this.dataExecucao!=null &&
              this.dataExecucao.equals(other.getDataExecucao()))) &&
            ((this.diagnosticos==null && other.getDiagnosticos()==null) || 
             (this.diagnosticos!=null &&
              java.util.Arrays.equals(this.diagnosticos, other.getDiagnosticos())));
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
        if (getDesignadorTurbonet() != null) {
            _hashCode += getDesignadorTurbonet().hashCode();
        }
        if (getDataExecucao() != null) {
            _hashCode += getDataExecucao().hashCode();
        }
        if (getDiagnosticos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticos(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "DiagnosticoCPEsOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designadorTurbonet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "designadorTurbonet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataExecucao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "dataExecucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoHPNA", "diagnosticos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/diagnosticoCPE", "DiagnosticoParam"));
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
