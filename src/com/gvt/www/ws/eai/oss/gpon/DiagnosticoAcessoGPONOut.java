/**
 * DiagnosticoAcessoGPONOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gvt.www.ws.eai.oss.gpon;

public class DiagnosticoAcessoGPONOut  implements java.io.Serializable {
    private com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem;

    private com.gvt.www.ws.eai.oss.gpon.BridgeDados bridgeDados;

    private com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz;

    private com.gvt.www.ws.eai.oss.gpon.BridgeTV bridgeTV;

    private com.gvt.www.ws.eai.oss.gpon.BridgeMulticast bridgMulticast;

    private com.gvt.www.ws.eai.oss.gpon.BridgeDadosParametros bridgeDadosParametros;

    private com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros;

    private com.gvt.www.ws.eai.oss.gpon.BridgeTVParametros bridgeTVParametros;

    private com.gvt.www.ws.eai.oss.gpon.BridgeMulticastParametros bridgMulticastParametros;

    private com.gvt.www.ws.eai.oss.gpon.PotenciaOptica potenciaOptica;

    private com.gvt.www.ws.eai.oss.gpon.VelocidadeDownloadUpload velocidadeDownloadUpload;

    private com.gvt.www.ws.eai.oss.gpon.StatusPorta statusPorta;

    private com.gvt.www.ws.eai.oss.gpon.StatusSincronismo statusSincronismo;

    private com.gvt.www.ws.eai.oss.gpon.SerialONT serialONT;

    public DiagnosticoAcessoGPONOut() {
    }

    public DiagnosticoAcessoGPONOut(
           com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem,
           com.gvt.www.ws.eai.oss.gpon.BridgeDados bridgeDados,
           com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz,
           com.gvt.www.ws.eai.oss.gpon.BridgeTV bridgeTV,
           com.gvt.www.ws.eai.oss.gpon.BridgeMulticast bridgMulticast,
           com.gvt.www.ws.eai.oss.gpon.BridgeDadosParametros bridgeDadosParametros,
           com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros,
           com.gvt.www.ws.eai.oss.gpon.BridgeTVParametros bridgeTVParametros,
           com.gvt.www.ws.eai.oss.gpon.BridgeMulticastParametros bridgMulticastParametros,
           com.gvt.www.ws.eai.oss.gpon.PotenciaOptica potenciaOptica,
           com.gvt.www.ws.eai.oss.gpon.VelocidadeDownloadUpload velocidadeDownloadUpload,
           com.gvt.www.ws.eai.oss.gpon.StatusPorta statusPorta,
           com.gvt.www.ws.eai.oss.gpon.StatusSincronismo statusSincronismo,
           com.gvt.www.ws.eai.oss.gpon.SerialONT serialONT) {
           this.mensagem = mensagem;
           this.bridgeDados = bridgeDados;
           this.bridgeVoz = bridgeVoz;
           this.bridgeTV = bridgeTV;
           this.bridgMulticast = bridgMulticast;
           this.bridgeDadosParametros = bridgeDadosParametros;
           this.bridgeVozParametros = bridgeVozParametros;
           this.bridgeTVParametros = bridgeTVParametros;
           this.bridgMulticastParametros = bridgMulticastParametros;
           this.potenciaOptica = potenciaOptica;
           this.velocidadeDownloadUpload = velocidadeDownloadUpload;
           this.statusPorta = statusPorta;
           this.statusSincronismo = statusSincronismo;
           this.serialONT = serialONT;
    }


    /**
     * Gets the mensagem value for this DiagnosticoAcessoGPONOut.
     * 
     * @return mensagem
     */
    public com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this DiagnosticoAcessoGPONOut.
     * 
     * @param mensagem
     */
    public void setMensagem(com.gvt.www.ws.eai.oss.ossturbonet.OSSTurbonetOut mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the bridgeDados value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeDados
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeDados getBridgeDados() {
        return bridgeDados;
    }


    /**
     * Sets the bridgeDados value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeDados
     */
    public void setBridgeDados(com.gvt.www.ws.eai.oss.gpon.BridgeDados bridgeDados) {
        this.bridgeDados = bridgeDados;
    }


    /**
     * Gets the bridgeVoz value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeVoz
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeVoz getBridgeVoz() {
        return bridgeVoz;
    }


    /**
     * Sets the bridgeVoz value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeVoz
     */
    public void setBridgeVoz(com.gvt.www.ws.eai.oss.gpon.BridgeVoz bridgeVoz) {
        this.bridgeVoz = bridgeVoz;
    }


    /**
     * Gets the bridgeTV value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeTV
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeTV getBridgeTV() {
        return bridgeTV;
    }


    /**
     * Sets the bridgeTV value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeTV
     */
    public void setBridgeTV(com.gvt.www.ws.eai.oss.gpon.BridgeTV bridgeTV) {
        this.bridgeTV = bridgeTV;
    }


    /**
     * Gets the bridgMulticast value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgMulticast
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeMulticast getBridgMulticast() {
        return bridgMulticast;
    }


    /**
     * Sets the bridgMulticast value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgMulticast
     */
    public void setBridgMulticast(com.gvt.www.ws.eai.oss.gpon.BridgeMulticast bridgMulticast) {
        this.bridgMulticast = bridgMulticast;
    }


    /**
     * Gets the bridgeDadosParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeDadosParametros
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeDadosParametros getBridgeDadosParametros() {
        return bridgeDadosParametros;
    }


    /**
     * Sets the bridgeDadosParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeDadosParametros
     */
    public void setBridgeDadosParametros(com.gvt.www.ws.eai.oss.gpon.BridgeDadosParametros bridgeDadosParametros) {
        this.bridgeDadosParametros = bridgeDadosParametros;
    }


    /**
     * Gets the bridgeVozParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeVozParametros
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros getBridgeVozParametros() {
        return bridgeVozParametros;
    }


    /**
     * Sets the bridgeVozParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeVozParametros
     */
    public void setBridgeVozParametros(com.gvt.www.ws.eai.oss.gpon.BridgeVozParametros bridgeVozParametros) {
        this.bridgeVozParametros = bridgeVozParametros;
    }


    /**
     * Gets the bridgeTVParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgeTVParametros
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeTVParametros getBridgeTVParametros() {
        return bridgeTVParametros;
    }


    /**
     * Sets the bridgeTVParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgeTVParametros
     */
    public void setBridgeTVParametros(com.gvt.www.ws.eai.oss.gpon.BridgeTVParametros bridgeTVParametros) {
        this.bridgeTVParametros = bridgeTVParametros;
    }


    /**
     * Gets the bridgMulticastParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @return bridgMulticastParametros
     */
    public com.gvt.www.ws.eai.oss.gpon.BridgeMulticastParametros getBridgMulticastParametros() {
        return bridgMulticastParametros;
    }


    /**
     * Sets the bridgMulticastParametros value for this DiagnosticoAcessoGPONOut.
     * 
     * @param bridgMulticastParametros
     */
    public void setBridgMulticastParametros(com.gvt.www.ws.eai.oss.gpon.BridgeMulticastParametros bridgMulticastParametros) {
        this.bridgMulticastParametros = bridgMulticastParametros;
    }


    /**
     * Gets the potenciaOptica value for this DiagnosticoAcessoGPONOut.
     * 
     * @return potenciaOptica
     */
    public com.gvt.www.ws.eai.oss.gpon.PotenciaOptica getPotenciaOptica() {
        return potenciaOptica;
    }


    /**
     * Sets the potenciaOptica value for this DiagnosticoAcessoGPONOut.
     * 
     * @param potenciaOptica
     */
    public void setPotenciaOptica(com.gvt.www.ws.eai.oss.gpon.PotenciaOptica potenciaOptica) {
        this.potenciaOptica = potenciaOptica;
    }


    /**
     * Gets the velocidadeDownloadUpload value for this DiagnosticoAcessoGPONOut.
     * 
     * @return velocidadeDownloadUpload
     */
    public com.gvt.www.ws.eai.oss.gpon.VelocidadeDownloadUpload getVelocidadeDownloadUpload() {
        return velocidadeDownloadUpload;
    }


    /**
     * Sets the velocidadeDownloadUpload value for this DiagnosticoAcessoGPONOut.
     * 
     * @param velocidadeDownloadUpload
     */
    public void setVelocidadeDownloadUpload(com.gvt.www.ws.eai.oss.gpon.VelocidadeDownloadUpload velocidadeDownloadUpload) {
        this.velocidadeDownloadUpload = velocidadeDownloadUpload;
    }


    /**
     * Gets the statusPorta value for this DiagnosticoAcessoGPONOut.
     * 
     * @return statusPorta
     */
    public com.gvt.www.ws.eai.oss.gpon.StatusPorta getStatusPorta() {
        return statusPorta;
    }


    /**
     * Sets the statusPorta value for this DiagnosticoAcessoGPONOut.
     * 
     * @param statusPorta
     */
    public void setStatusPorta(com.gvt.www.ws.eai.oss.gpon.StatusPorta statusPorta) {
        this.statusPorta = statusPorta;
    }


    /**
     * Gets the statusSincronismo value for this DiagnosticoAcessoGPONOut.
     * 
     * @return statusSincronismo
     */
    public com.gvt.www.ws.eai.oss.gpon.StatusSincronismo getStatusSincronismo() {
        return statusSincronismo;
    }


    /**
     * Sets the statusSincronismo value for this DiagnosticoAcessoGPONOut.
     * 
     * @param statusSincronismo
     */
    public void setStatusSincronismo(com.gvt.www.ws.eai.oss.gpon.StatusSincronismo statusSincronismo) {
        this.statusSincronismo = statusSincronismo;
    }


    /**
     * Gets the serialONT value for this DiagnosticoAcessoGPONOut.
     * 
     * @return serialONT
     */
    public com.gvt.www.ws.eai.oss.gpon.SerialONT getSerialONT() {
        return serialONT;
    }


    /**
     * Sets the serialONT value for this DiagnosticoAcessoGPONOut.
     * 
     * @param serialONT
     */
    public void setSerialONT(com.gvt.www.ws.eai.oss.gpon.SerialONT serialONT) {
        this.serialONT = serialONT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnosticoAcessoGPONOut)) return false;
        DiagnosticoAcessoGPONOut other = (DiagnosticoAcessoGPONOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.bridgeDados==null && other.getBridgeDados()==null) || 
             (this.bridgeDados!=null &&
              this.bridgeDados.equals(other.getBridgeDados()))) &&
            ((this.bridgeVoz==null && other.getBridgeVoz()==null) || 
             (this.bridgeVoz!=null &&
              this.bridgeVoz.equals(other.getBridgeVoz()))) &&
            ((this.bridgeTV==null && other.getBridgeTV()==null) || 
             (this.bridgeTV!=null &&
              this.bridgeTV.equals(other.getBridgeTV()))) &&
            ((this.bridgMulticast==null && other.getBridgMulticast()==null) || 
             (this.bridgMulticast!=null &&
              this.bridgMulticast.equals(other.getBridgMulticast()))) &&
            ((this.bridgeDadosParametros==null && other.getBridgeDadosParametros()==null) || 
             (this.bridgeDadosParametros!=null &&
              this.bridgeDadosParametros.equals(other.getBridgeDadosParametros()))) &&
            ((this.bridgeVozParametros==null && other.getBridgeVozParametros()==null) || 
             (this.bridgeVozParametros!=null &&
              this.bridgeVozParametros.equals(other.getBridgeVozParametros()))) &&
            ((this.bridgeTVParametros==null && other.getBridgeTVParametros()==null) || 
             (this.bridgeTVParametros!=null &&
              this.bridgeTVParametros.equals(other.getBridgeTVParametros()))) &&
            ((this.bridgMulticastParametros==null && other.getBridgMulticastParametros()==null) || 
             (this.bridgMulticastParametros!=null &&
              this.bridgMulticastParametros.equals(other.getBridgMulticastParametros()))) &&
            ((this.potenciaOptica==null && other.getPotenciaOptica()==null) || 
             (this.potenciaOptica!=null &&
              this.potenciaOptica.equals(other.getPotenciaOptica()))) &&
            ((this.velocidadeDownloadUpload==null && other.getVelocidadeDownloadUpload()==null) || 
             (this.velocidadeDownloadUpload!=null &&
              this.velocidadeDownloadUpload.equals(other.getVelocidadeDownloadUpload()))) &&
            ((this.statusPorta==null && other.getStatusPorta()==null) || 
             (this.statusPorta!=null &&
              this.statusPorta.equals(other.getStatusPorta()))) &&
            ((this.statusSincronismo==null && other.getStatusSincronismo()==null) || 
             (this.statusSincronismo!=null &&
              this.statusSincronismo.equals(other.getStatusSincronismo()))) &&
            ((this.serialONT==null && other.getSerialONT()==null) || 
             (this.serialONT!=null &&
              this.serialONT.equals(other.getSerialONT())));
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
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getBridgeDados() != null) {
            _hashCode += getBridgeDados().hashCode();
        }
        if (getBridgeVoz() != null) {
            _hashCode += getBridgeVoz().hashCode();
        }
        if (getBridgeTV() != null) {
            _hashCode += getBridgeTV().hashCode();
        }
        if (getBridgMulticast() != null) {
            _hashCode += getBridgMulticast().hashCode();
        }
        if (getBridgeDadosParametros() != null) {
            _hashCode += getBridgeDadosParametros().hashCode();
        }
        if (getBridgeVozParametros() != null) {
            _hashCode += getBridgeVozParametros().hashCode();
        }
        if (getBridgeTVParametros() != null) {
            _hashCode += getBridgeTVParametros().hashCode();
        }
        if (getBridgMulticastParametros() != null) {
            _hashCode += getBridgMulticastParametros().hashCode();
        }
        if (getPotenciaOptica() != null) {
            _hashCode += getPotenciaOptica().hashCode();
        }
        if (getVelocidadeDownloadUpload() != null) {
            _hashCode += getVelocidadeDownloadUpload().hashCode();
        }
        if (getStatusPorta() != null) {
            _hashCode += getStatusPorta().hashCode();
        }
        if (getStatusSincronismo() != null) {
            _hashCode += getStatusSincronismo().hashCode();
        }
        if (getSerialONT() != null) {
            _hashCode += getSerialONT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnosticoAcessoGPONOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "DiagnosticoAcessoGPONOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/ossturbonet", "OSSTurbonetOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeDados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeDados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeDados"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeVoz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeVoz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVoz"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeTV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeTV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeTV"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgMulticast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgMulticast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeMulticast"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeDadosParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeDadosParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeDadosParametros"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeVozParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeVozParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeVozParametros"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeTVParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgeTVParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeTVParametros"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgMulticastParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "bridgMulticastParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "BridgeMulticastParametros"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOptica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "potenciaOptica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "PotenciaOptica"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeDownloadUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "velocidadeDownloadUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "VelocidadeDownloadUpload"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusPorta"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusSincronismo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "statusSincronismo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "StatusSincronismo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialONT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "serialONT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/oss/gpon", "SerialONT"));
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
