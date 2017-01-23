/**
 * InfoEquipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bean.ossturbonet.oss.gvt.com;

public class InfoEquipment  implements java.io.Serializable {
    private int codErro;

    private java.lang.String excecao;

    private java.lang.String statusUplink;

    private java.lang.String statusPorta;

    private java.lang.String velocidadeSincronismo;

    private java.lang.String velocidadeProfile;

    private java.lang.String modulation;

    private java.lang.String[] availableModulation;

    private java.lang.String SNR;

    private java.lang.String attenuation;

    private java.lang.String attainableRate;

    private java.lang.String snrInsideRange;

    private java.lang.String attenuationInsideRange;

    private java.lang.String velSyncInsideRange;

    private java.lang.String snrRange;

    private java.lang.String attenuationRage;

    private java.lang.String velSyncRange;

    private boolean annexMAvailable;

    private java.lang.String snrRangeMax;

    private java.lang.String attenuationRageMin;

    private java.lang.String serial;

    private float potenciaONT;

    private float potenciaOLT;

    private int velocidadeProfileDownload;

    private int velocidadeProfileUpload;

    private java.lang.String modulationValue;

    public InfoEquipment() {
    }

    public InfoEquipment(
           int codErro,
           java.lang.String excecao,
           java.lang.String statusUplink,
           java.lang.String statusPorta,
           java.lang.String velocidadeSincronismo,
           java.lang.String velocidadeProfile,
           java.lang.String modulation,
           java.lang.String[] availableModulation,
           java.lang.String SNR,
           java.lang.String attenuation,
           java.lang.String attainableRate,
           java.lang.String snrInsideRange,
           java.lang.String attenuationInsideRange,
           java.lang.String velSyncInsideRange,
           java.lang.String snrRange,
           java.lang.String attenuationRage,
           java.lang.String velSyncRange,
           boolean annexMAvailable,
           java.lang.String snrRangeMax,
           java.lang.String attenuationRageMin,
           java.lang.String serial,
           float potenciaONT,
           float potenciaOLT,
           int velocidadeProfileDownload,
           int velocidadeProfileUpload,
           java.lang.String modulationValue) {
           this.codErro = codErro;
           this.excecao = excecao;
           this.statusUplink = statusUplink;
           this.statusPorta = statusPorta;
           this.velocidadeSincronismo = velocidadeSincronismo;
           this.velocidadeProfile = velocidadeProfile;
           this.modulation = modulation;
           this.availableModulation = availableModulation;
           this.SNR = SNR;
           this.attenuation = attenuation;
           this.attainableRate = attainableRate;
           this.snrInsideRange = snrInsideRange;
           this.attenuationInsideRange = attenuationInsideRange;
           this.velSyncInsideRange = velSyncInsideRange;
           this.snrRange = snrRange;
           this.attenuationRage = attenuationRage;
           this.velSyncRange = velSyncRange;
           this.annexMAvailable = annexMAvailable;
           this.snrRangeMax = snrRangeMax;
           this.attenuationRageMin = attenuationRageMin;
           this.serial = serial;
           this.potenciaONT = potenciaONT;
           this.potenciaOLT = potenciaOLT;
           this.velocidadeProfileDownload = velocidadeProfileDownload;
           this.velocidadeProfileUpload = velocidadeProfileUpload;
           this.modulationValue = modulationValue;
    }


    /**
     * Gets the codErro value for this InfoEquipment.
     * 
     * @return codErro
     */
    public int getCodErro() {
        return codErro;
    }


    /**
     * Sets the codErro value for this InfoEquipment.
     * 
     * @param codErro
     */
    public void setCodErro(int codErro) {
        this.codErro = codErro;
    }


    /**
     * Gets the excecao value for this InfoEquipment.
     * 
     * @return excecao
     */
    public java.lang.String getExcecao() {
        return excecao;
    }


    /**
     * Sets the excecao value for this InfoEquipment.
     * 
     * @param excecao
     */
    public void setExcecao(java.lang.String excecao) {
        this.excecao = excecao;
    }


    /**
     * Gets the statusUplink value for this InfoEquipment.
     * 
     * @return statusUplink
     */
    public java.lang.String getStatusUplink() {
        return statusUplink;
    }


    /**
     * Sets the statusUplink value for this InfoEquipment.
     * 
     * @param statusUplink
     */
    public void setStatusUplink(java.lang.String statusUplink) {
        this.statusUplink = statusUplink;
    }


    /**
     * Gets the statusPorta value for this InfoEquipment.
     * 
     * @return statusPorta
     */
    public java.lang.String getStatusPorta() {
        return statusPorta;
    }


    /**
     * Sets the statusPorta value for this InfoEquipment.
     * 
     * @param statusPorta
     */
    public void setStatusPorta(java.lang.String statusPorta) {
        this.statusPorta = statusPorta;
    }


    /**
     * Gets the velocidadeSincronismo value for this InfoEquipment.
     * 
     * @return velocidadeSincronismo
     */
    public java.lang.String getVelocidadeSincronismo() {
        return velocidadeSincronismo;
    }


    /**
     * Sets the velocidadeSincronismo value for this InfoEquipment.
     * 
     * @param velocidadeSincronismo
     */
    public void setVelocidadeSincronismo(java.lang.String velocidadeSincronismo) {
        this.velocidadeSincronismo = velocidadeSincronismo;
    }


    /**
     * Gets the velocidadeProfile value for this InfoEquipment.
     * 
     * @return velocidadeProfile
     */
    public java.lang.String getVelocidadeProfile() {
        return velocidadeProfile;
    }


    /**
     * Sets the velocidadeProfile value for this InfoEquipment.
     * 
     * @param velocidadeProfile
     */
    public void setVelocidadeProfile(java.lang.String velocidadeProfile) {
        this.velocidadeProfile = velocidadeProfile;
    }


    /**
     * Gets the modulation value for this InfoEquipment.
     * 
     * @return modulation
     */
    public java.lang.String getModulation() {
        return modulation;
    }


    /**
     * Sets the modulation value for this InfoEquipment.
     * 
     * @param modulation
     */
    public void setModulation(java.lang.String modulation) {
        this.modulation = modulation;
    }


    /**
     * Gets the availableModulation value for this InfoEquipment.
     * 
     * @return availableModulation
     */
    public java.lang.String[] getAvailableModulation() {
        return availableModulation;
    }


    /**
     * Sets the availableModulation value for this InfoEquipment.
     * 
     * @param availableModulation
     */
    public void setAvailableModulation(java.lang.String[] availableModulation) {
        this.availableModulation = availableModulation;
    }

    public java.lang.String getAvailableModulation(int i) {
        return this.availableModulation[i];
    }

    public void setAvailableModulation(int i, java.lang.String _value) {
        this.availableModulation[i] = _value;
    }


    /**
     * Gets the SNR value for this InfoEquipment.
     * 
     * @return SNR
     */
    public java.lang.String getSNR() {
        return SNR;
    }


    /**
     * Sets the SNR value for this InfoEquipment.
     * 
     * @param SNR
     */
    public void setSNR(java.lang.String SNR) {
        this.SNR = SNR;
    }


    /**
     * Gets the attenuation value for this InfoEquipment.
     * 
     * @return attenuation
     */
    public java.lang.String getAttenuation() {
        return attenuation;
    }


    /**
     * Sets the attenuation value for this InfoEquipment.
     * 
     * @param attenuation
     */
    public void setAttenuation(java.lang.String attenuation) {
        this.attenuation = attenuation;
    }


    /**
     * Gets the attainableRate value for this InfoEquipment.
     * 
     * @return attainableRate
     */
    public java.lang.String getAttainableRate() {
        return attainableRate;
    }


    /**
     * Sets the attainableRate value for this InfoEquipment.
     * 
     * @param attainableRate
     */
    public void setAttainableRate(java.lang.String attainableRate) {
        this.attainableRate = attainableRate;
    }


    /**
     * Gets the snrInsideRange value for this InfoEquipment.
     * 
     * @return snrInsideRange
     */
    public java.lang.String getSnrInsideRange() {
        return snrInsideRange;
    }


    /**
     * Sets the snrInsideRange value for this InfoEquipment.
     * 
     * @param snrInsideRange
     */
    public void setSnrInsideRange(java.lang.String snrInsideRange) {
        this.snrInsideRange = snrInsideRange;
    }


    /**
     * Gets the attenuationInsideRange value for this InfoEquipment.
     * 
     * @return attenuationInsideRange
     */
    public java.lang.String getAttenuationInsideRange() {
        return attenuationInsideRange;
    }


    /**
     * Sets the attenuationInsideRange value for this InfoEquipment.
     * 
     * @param attenuationInsideRange
     */
    public void setAttenuationInsideRange(java.lang.String attenuationInsideRange) {
        this.attenuationInsideRange = attenuationInsideRange;
    }


    /**
     * Gets the velSyncInsideRange value for this InfoEquipment.
     * 
     * @return velSyncInsideRange
     */
    public java.lang.String getVelSyncInsideRange() {
        return velSyncInsideRange;
    }


    /**
     * Sets the velSyncInsideRange value for this InfoEquipment.
     * 
     * @param velSyncInsideRange
     */
    public void setVelSyncInsideRange(java.lang.String velSyncInsideRange) {
        this.velSyncInsideRange = velSyncInsideRange;
    }


    /**
     * Gets the snrRange value for this InfoEquipment.
     * 
     * @return snrRange
     */
    public java.lang.String getSnrRange() {
        return snrRange;
    }


    /**
     * Sets the snrRange value for this InfoEquipment.
     * 
     * @param snrRange
     */
    public void setSnrRange(java.lang.String snrRange) {
        this.snrRange = snrRange;
    }


    /**
     * Gets the attenuationRage value for this InfoEquipment.
     * 
     * @return attenuationRage
     */
    public java.lang.String getAttenuationRage() {
        return attenuationRage;
    }


    /**
     * Sets the attenuationRage value for this InfoEquipment.
     * 
     * @param attenuationRage
     */
    public void setAttenuationRage(java.lang.String attenuationRage) {
        this.attenuationRage = attenuationRage;
    }


    /**
     * Gets the velSyncRange value for this InfoEquipment.
     * 
     * @return velSyncRange
     */
    public java.lang.String getVelSyncRange() {
        return velSyncRange;
    }


    /**
     * Sets the velSyncRange value for this InfoEquipment.
     * 
     * @param velSyncRange
     */
    public void setVelSyncRange(java.lang.String velSyncRange) {
        this.velSyncRange = velSyncRange;
    }


    /**
     * Gets the annexMAvailable value for this InfoEquipment.
     * 
     * @return annexMAvailable
     */
    public boolean isAnnexMAvailable() {
        return annexMAvailable;
    }


    /**
     * Sets the annexMAvailable value for this InfoEquipment.
     * 
     * @param annexMAvailable
     */
    public void setAnnexMAvailable(boolean annexMAvailable) {
        this.annexMAvailable = annexMAvailable;
    }


    /**
     * Gets the snrRangeMax value for this InfoEquipment.
     * 
     * @return snrRangeMax
     */
    public java.lang.String getSnrRangeMax() {
        return snrRangeMax;
    }


    /**
     * Sets the snrRangeMax value for this InfoEquipment.
     * 
     * @param snrRangeMax
     */
    public void setSnrRangeMax(java.lang.String snrRangeMax) {
        this.snrRangeMax = snrRangeMax;
    }


    /**
     * Gets the attenuationRageMin value for this InfoEquipment.
     * 
     * @return attenuationRageMin
     */
    public java.lang.String getAttenuationRageMin() {
        return attenuationRageMin;
    }


    /**
     * Sets the attenuationRageMin value for this InfoEquipment.
     * 
     * @param attenuationRageMin
     */
    public void setAttenuationRageMin(java.lang.String attenuationRageMin) {
        this.attenuationRageMin = attenuationRageMin;
    }


    /**
     * Gets the serial value for this InfoEquipment.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this InfoEquipment.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the potenciaONT value for this InfoEquipment.
     * 
     * @return potenciaONT
     */
    public float getPotenciaONT() {
        return potenciaONT;
    }


    /**
     * Sets the potenciaONT value for this InfoEquipment.
     * 
     * @param potenciaONT
     */
    public void setPotenciaONT(float potenciaONT) {
        this.potenciaONT = potenciaONT;
    }


    /**
     * Gets the potenciaOLT value for this InfoEquipment.
     * 
     * @return potenciaOLT
     */
    public float getPotenciaOLT() {
        return potenciaOLT;
    }


    /**
     * Sets the potenciaOLT value for this InfoEquipment.
     * 
     * @param potenciaOLT
     */
    public void setPotenciaOLT(float potenciaOLT) {
        this.potenciaOLT = potenciaOLT;
    }


    /**
     * Gets the velocidadeProfileDownload value for this InfoEquipment.
     * 
     * @return velocidadeProfileDownload
     */
    public int getVelocidadeProfileDownload() {
        return velocidadeProfileDownload;
    }


    /**
     * Sets the velocidadeProfileDownload value for this InfoEquipment.
     * 
     * @param velocidadeProfileDownload
     */
    public void setVelocidadeProfileDownload(int velocidadeProfileDownload) {
        this.velocidadeProfileDownload = velocidadeProfileDownload;
    }


    /**
     * Gets the velocidadeProfileUpload value for this InfoEquipment.
     * 
     * @return velocidadeProfileUpload
     */
    public int getVelocidadeProfileUpload() {
        return velocidadeProfileUpload;
    }


    /**
     * Sets the velocidadeProfileUpload value for this InfoEquipment.
     * 
     * @param velocidadeProfileUpload
     */
    public void setVelocidadeProfileUpload(int velocidadeProfileUpload) {
        this.velocidadeProfileUpload = velocidadeProfileUpload;
    }


    /**
     * Gets the modulationValue value for this InfoEquipment.
     * 
     * @return modulationValue
     */
    public java.lang.String getModulationValue() {
        return modulationValue;
    }


    /**
     * Sets the modulationValue value for this InfoEquipment.
     * 
     * @param modulationValue
     */
    public void setModulationValue(java.lang.String modulationValue) {
        this.modulationValue = modulationValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoEquipment)) return false;
        InfoEquipment other = (InfoEquipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codErro == other.getCodErro() &&
            ((this.excecao==null && other.getExcecao()==null) || 
             (this.excecao!=null &&
              this.excecao.equals(other.getExcecao()))) &&
            ((this.statusUplink==null && other.getStatusUplink()==null) || 
             (this.statusUplink!=null &&
              this.statusUplink.equals(other.getStatusUplink()))) &&
            ((this.statusPorta==null && other.getStatusPorta()==null) || 
             (this.statusPorta!=null &&
              this.statusPorta.equals(other.getStatusPorta()))) &&
            ((this.velocidadeSincronismo==null && other.getVelocidadeSincronismo()==null) || 
             (this.velocidadeSincronismo!=null &&
              this.velocidadeSincronismo.equals(other.getVelocidadeSincronismo()))) &&
            ((this.velocidadeProfile==null && other.getVelocidadeProfile()==null) || 
             (this.velocidadeProfile!=null &&
              this.velocidadeProfile.equals(other.getVelocidadeProfile()))) &&
            ((this.modulation==null && other.getModulation()==null) || 
             (this.modulation!=null &&
              this.modulation.equals(other.getModulation()))) &&
            ((this.availableModulation==null && other.getAvailableModulation()==null) || 
             (this.availableModulation!=null &&
              java.util.Arrays.equals(this.availableModulation, other.getAvailableModulation()))) &&
            ((this.SNR==null && other.getSNR()==null) || 
             (this.SNR!=null &&
              this.SNR.equals(other.getSNR()))) &&
            ((this.attenuation==null && other.getAttenuation()==null) || 
             (this.attenuation!=null &&
              this.attenuation.equals(other.getAttenuation()))) &&
            ((this.attainableRate==null && other.getAttainableRate()==null) || 
             (this.attainableRate!=null &&
              this.attainableRate.equals(other.getAttainableRate()))) &&
            ((this.snrInsideRange==null && other.getSnrInsideRange()==null) || 
             (this.snrInsideRange!=null &&
              this.snrInsideRange.equals(other.getSnrInsideRange()))) &&
            ((this.attenuationInsideRange==null && other.getAttenuationInsideRange()==null) || 
             (this.attenuationInsideRange!=null &&
              this.attenuationInsideRange.equals(other.getAttenuationInsideRange()))) &&
            ((this.velSyncInsideRange==null && other.getVelSyncInsideRange()==null) || 
             (this.velSyncInsideRange!=null &&
              this.velSyncInsideRange.equals(other.getVelSyncInsideRange()))) &&
            ((this.snrRange==null && other.getSnrRange()==null) || 
             (this.snrRange!=null &&
              this.snrRange.equals(other.getSnrRange()))) &&
            ((this.attenuationRage==null && other.getAttenuationRage()==null) || 
             (this.attenuationRage!=null &&
              this.attenuationRage.equals(other.getAttenuationRage()))) &&
            ((this.velSyncRange==null && other.getVelSyncRange()==null) || 
             (this.velSyncRange!=null &&
              this.velSyncRange.equals(other.getVelSyncRange()))) &&
            this.annexMAvailable == other.isAnnexMAvailable() &&
            ((this.snrRangeMax==null && other.getSnrRangeMax()==null) || 
             (this.snrRangeMax!=null &&
              this.snrRangeMax.equals(other.getSnrRangeMax()))) &&
            ((this.attenuationRageMin==null && other.getAttenuationRageMin()==null) || 
             (this.attenuationRageMin!=null &&
              this.attenuationRageMin.equals(other.getAttenuationRageMin()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            this.potenciaONT == other.getPotenciaONT() &&
            this.potenciaOLT == other.getPotenciaOLT() &&
            this.velocidadeProfileDownload == other.getVelocidadeProfileDownload() &&
            this.velocidadeProfileUpload == other.getVelocidadeProfileUpload() &&
            ((this.modulationValue==null && other.getModulationValue()==null) || 
             (this.modulationValue!=null &&
              this.modulationValue.equals(other.getModulationValue())));
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
        _hashCode += getCodErro();
        if (getExcecao() != null) {
            _hashCode += getExcecao().hashCode();
        }
        if (getStatusUplink() != null) {
            _hashCode += getStatusUplink().hashCode();
        }
        if (getStatusPorta() != null) {
            _hashCode += getStatusPorta().hashCode();
        }
        if (getVelocidadeSincronismo() != null) {
            _hashCode += getVelocidadeSincronismo().hashCode();
        }
        if (getVelocidadeProfile() != null) {
            _hashCode += getVelocidadeProfile().hashCode();
        }
        if (getModulation() != null) {
            _hashCode += getModulation().hashCode();
        }
        if (getAvailableModulation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableModulation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableModulation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSNR() != null) {
            _hashCode += getSNR().hashCode();
        }
        if (getAttenuation() != null) {
            _hashCode += getAttenuation().hashCode();
        }
        if (getAttainableRate() != null) {
            _hashCode += getAttainableRate().hashCode();
        }
        if (getSnrInsideRange() != null) {
            _hashCode += getSnrInsideRange().hashCode();
        }
        if (getAttenuationInsideRange() != null) {
            _hashCode += getAttenuationInsideRange().hashCode();
        }
        if (getVelSyncInsideRange() != null) {
            _hashCode += getVelSyncInsideRange().hashCode();
        }
        if (getSnrRange() != null) {
            _hashCode += getSnrRange().hashCode();
        }
        if (getAttenuationRage() != null) {
            _hashCode += getAttenuationRage().hashCode();
        }
        if (getVelSyncRange() != null) {
            _hashCode += getVelSyncRange().hashCode();
        }
        _hashCode += (isAnnexMAvailable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSnrRangeMax() != null) {
            _hashCode += getSnrRangeMax().hashCode();
        }
        if (getAttenuationRageMin() != null) {
            _hashCode += getAttenuationRageMin().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        _hashCode += new Float(getPotenciaONT()).hashCode();
        _hashCode += new Float(getPotenciaOLT()).hashCode();
        _hashCode += getVelocidadeProfileDownload();
        _hashCode += getVelocidadeProfileUpload();
        if (getModulationValue() != null) {
            _hashCode += getModulationValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoEquipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "InfoEquipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codErro");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "CodErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excecao");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Excecao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusUplink");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "StatusUplink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusPorta");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "StatusPorta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeSincronismo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelocidadeSincronismo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelocidadeProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulation");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Modulation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableModulation");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AvailableModulation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNR");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attenuation");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Attenuation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attainableRate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AttainableRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snrInsideRange");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SnrInsideRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attenuationInsideRange");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AttenuationInsideRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velSyncInsideRange");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelSyncInsideRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snrRange");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SnrRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attenuationRage");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AttenuationRage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velSyncRange");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelSyncRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annexMAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AnnexMAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snrRangeMax");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "SnrRangeMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attenuationRageMin");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "AttenuationRageMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "Serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaONT");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "PotenciaONT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaOLT");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "PotenciaOLT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeProfileDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelocidadeProfileDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeProfileUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "VelocidadeProfileUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.gvt.oss.ossturbonet.bean", "ModulationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
