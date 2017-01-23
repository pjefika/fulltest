/**
 * ConfigurarElementoTVIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gvt.www.tv.configuracaoTV;

public class ConfigurarElementoTVIn  extends br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTV  implements java.io.Serializable {
    /* E o nome completo do Cliente. */
    private java.lang.String nomeCliente;

    private br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVInCategoriaServico categoriaServico;

    /* E um BA do SAVVION que por ele E
     * 								calculado, agrupando todas as instancias
     * 								da ativacao. */
    private java.lang.String rpon;

    /* Pode ser o CPF ou o CNPJ. */
    private java.lang.String documento;

    /* A.K.A (PON) da tabela S_DOC_QUOTE. */
    private java.lang.String codOrdemServico;

    /* ROWID, ID Cliente Siebel. */
    private java.lang.String identificadorUsuario;

    /* CEP do assinante sem formatacao. */
    private java.lang.String CEP;

    private br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementosSiebel;

    private java.lang.String velocidadeDownload;

    private java.lang.String velocidadeUpload;

    private java.lang.Boolean suplementarAlteracao;

    private java.lang.Boolean suplementarCancelamento;

    private java.lang.Boolean mudancaTitularidade;

    private com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso;

    private java.lang.Boolean trocaTecnologia;

    public ConfigurarElementoTVIn() {
    }

    public ConfigurarElementoTVIn(
           java.lang.String designadorTV,
           java.lang.String designadorTurbonet,
           java.lang.String linhaAssinante,
           java.lang.String tecnologiaVoz,
           java.lang.String cidade,
           br.com.gvt.www.tv.configuracaoTV.Passport passport,
           br.com.gvt.www.tv.configuracaoTV.HeaderExecucaoTVTecnologiaTV tecnologiaTV,
           java.lang.String nomeCliente,
           br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVInCategoriaServico categoriaServico,
           java.lang.String rpon,
           java.lang.String documento,
           java.lang.String codOrdemServico,
           java.lang.String identificadorUsuario,
           java.lang.String CEP,
           br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] elementosSiebel,
           java.lang.String velocidadeDownload,
           java.lang.String velocidadeUpload,
           java.lang.Boolean suplementarAlteracao,
           java.lang.Boolean suplementarCancelamento,
           java.lang.Boolean mudancaTitularidade,
           com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso,
           java.lang.Boolean trocaTecnologia) {
        super(
            designadorTV,
            designadorTurbonet,
            linhaAssinante,
            tecnologiaVoz,
            cidade,
            passport,
            tecnologiaTV);
        this.nomeCliente = nomeCliente;
        this.categoriaServico = categoriaServico;
        this.rpon = rpon;
        this.documento = documento;
        this.codOrdemServico = codOrdemServico;
        this.identificadorUsuario = identificadorUsuario;
        this.CEP = CEP;
        this.elementosSiebel = elementosSiebel;
        this.velocidadeDownload = velocidadeDownload;
        this.velocidadeUpload = velocidadeUpload;
        this.suplementarAlteracao = suplementarAlteracao;
        this.suplementarCancelamento = suplementarCancelamento;
        this.mudancaTitularidade = mudancaTitularidade;
        this.acesso = acesso;
        this.trocaTecnologia = trocaTecnologia;
    }


    /**
     * Gets the nomeCliente value for this ConfigurarElementoTVIn.
     * 
     * @return nomeCliente   * E o nome completo do Cliente.
     */
    public java.lang.String getNomeCliente() {
        return nomeCliente;
    }


    /**
     * Sets the nomeCliente value for this ConfigurarElementoTVIn.
     * 
     * @param nomeCliente   * E o nome completo do Cliente.
     */
    public void setNomeCliente(java.lang.String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    /**
     * Gets the categoriaServico value for this ConfigurarElementoTVIn.
     * 
     * @return categoriaServico
     */
    public br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVInCategoriaServico getCategoriaServico() {
        return categoriaServico;
    }


    /**
     * Sets the categoriaServico value for this ConfigurarElementoTVIn.
     * 
     * @param categoriaServico
     */
    public void setCategoriaServico(br.com.gvt.www.tv.configuracaoTV.ConfigurarElementoTVInCategoriaServico categoriaServico) {
        this.categoriaServico = categoriaServico;
    }


    /**
     * Gets the rpon value for this ConfigurarElementoTVIn.
     * 
     * @return rpon   * E um BA do SAVVION que por ele E
     * 								calculado, agrupando todas as instancias
     * 								da ativacao.
     */
    public java.lang.String getRpon() {
        return rpon;
    }


    /**
     * Sets the rpon value for this ConfigurarElementoTVIn.
     * 
     * @param rpon   * E um BA do SAVVION que por ele E
     * 								calculado, agrupando todas as instancias
     * 								da ativacao.
     */
    public void setRpon(java.lang.String rpon) {
        this.rpon = rpon;
    }


    /**
     * Gets the documento value for this ConfigurarElementoTVIn.
     * 
     * @return documento   * Pode ser o CPF ou o CNPJ.
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this ConfigurarElementoTVIn.
     * 
     * @param documento   * Pode ser o CPF ou o CNPJ.
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the codOrdemServico value for this ConfigurarElementoTVIn.
     * 
     * @return codOrdemServico   * A.K.A (PON) da tabela S_DOC_QUOTE.
     */
    public java.lang.String getCodOrdemServico() {
        return codOrdemServico;
    }


    /**
     * Sets the codOrdemServico value for this ConfigurarElementoTVIn.
     * 
     * @param codOrdemServico   * A.K.A (PON) da tabela S_DOC_QUOTE.
     */
    public void setCodOrdemServico(java.lang.String codOrdemServico) {
        this.codOrdemServico = codOrdemServico;
    }


    /**
     * Gets the identificadorUsuario value for this ConfigurarElementoTVIn.
     * 
     * @return identificadorUsuario   * ROWID, ID Cliente Siebel.
     */
    public java.lang.String getIdentificadorUsuario() {
        return identificadorUsuario;
    }


    /**
     * Sets the identificadorUsuario value for this ConfigurarElementoTVIn.
     * 
     * @param identificadorUsuario   * ROWID, ID Cliente Siebel.
     */
    public void setIdentificadorUsuario(java.lang.String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }


    /**
     * Gets the CEP value for this ConfigurarElementoTVIn.
     * 
     * @return CEP   * CEP do assinante sem formatacao.
     */
    public java.lang.String getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this ConfigurarElementoTVIn.
     * 
     * @param CEP   * CEP do assinante sem formatacao.
     */
    public void setCEP(java.lang.String CEP) {
        this.CEP = CEP;
    }


    /**
     * Gets the elementosSiebel value for this ConfigurarElementoTVIn.
     * 
     * @return elementosSiebel
     */
    public br.com.gvt.www.tv.configuracaoTV.ElementoSiebel[] getElementosSiebel() {
        return elementosSiebel;
    }


    /**
     * Sets the elementosSiebel value for this ConfigurarElementoTVIn.
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
     * Gets the velocidadeDownload value for this ConfigurarElementoTVIn.
     * 
     * @return velocidadeDownload
     */
    public java.lang.String getVelocidadeDownload() {
        return velocidadeDownload;
    }


    /**
     * Sets the velocidadeDownload value for this ConfigurarElementoTVIn.
     * 
     * @param velocidadeDownload
     */
    public void setVelocidadeDownload(java.lang.String velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }


    /**
     * Gets the velocidadeUpload value for this ConfigurarElementoTVIn.
     * 
     * @return velocidadeUpload
     */
    public java.lang.String getVelocidadeUpload() {
        return velocidadeUpload;
    }


    /**
     * Sets the velocidadeUpload value for this ConfigurarElementoTVIn.
     * 
     * @param velocidadeUpload
     */
    public void setVelocidadeUpload(java.lang.String velocidadeUpload) {
        this.velocidadeUpload = velocidadeUpload;
    }


    /**
     * Gets the suplementarAlteracao value for this ConfigurarElementoTVIn.
     * 
     * @return suplementarAlteracao
     */
    public java.lang.Boolean getSuplementarAlteracao() {
        return suplementarAlteracao;
    }


    /**
     * Sets the suplementarAlteracao value for this ConfigurarElementoTVIn.
     * 
     * @param suplementarAlteracao
     */
    public void setSuplementarAlteracao(java.lang.Boolean suplementarAlteracao) {
        this.suplementarAlteracao = suplementarAlteracao;
    }


    /**
     * Gets the suplementarCancelamento value for this ConfigurarElementoTVIn.
     * 
     * @return suplementarCancelamento
     */
    public java.lang.Boolean getSuplementarCancelamento() {
        return suplementarCancelamento;
    }


    /**
     * Sets the suplementarCancelamento value for this ConfigurarElementoTVIn.
     * 
     * @param suplementarCancelamento
     */
    public void setSuplementarCancelamento(java.lang.Boolean suplementarCancelamento) {
        this.suplementarCancelamento = suplementarCancelamento;
    }


    /**
     * Gets the mudancaTitularidade value for this ConfigurarElementoTVIn.
     * 
     * @return mudancaTitularidade
     */
    public java.lang.Boolean getMudancaTitularidade() {
        return mudancaTitularidade;
    }


    /**
     * Sets the mudancaTitularidade value for this ConfigurarElementoTVIn.
     * 
     * @param mudancaTitularidade
     */
    public void setMudancaTitularidade(java.lang.Boolean mudancaTitularidade) {
        this.mudancaTitularidade = mudancaTitularidade;
    }


    /**
     * Gets the acesso value for this ConfigurarElementoTVIn.
     * 
     * @return acesso
     */
    public com.gvt.www.ws.eai.configuradoronline.acesso.Acesso getAcesso() {
        return acesso;
    }


    /**
     * Sets the acesso value for this ConfigurarElementoTVIn.
     * 
     * @param acesso
     */
    public void setAcesso(com.gvt.www.ws.eai.configuradoronline.acesso.Acesso acesso) {
        this.acesso = acesso;
    }


    /**
     * Gets the trocaTecnologia value for this ConfigurarElementoTVIn.
     * 
     * @return trocaTecnologia
     */
    public java.lang.Boolean getTrocaTecnologia() {
        return trocaTecnologia;
    }


    /**
     * Sets the trocaTecnologia value for this ConfigurarElementoTVIn.
     * 
     * @param trocaTecnologia
     */
    public void setTrocaTecnologia(java.lang.Boolean trocaTecnologia) {
        this.trocaTecnologia = trocaTecnologia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurarElementoTVIn)) return false;
        ConfigurarElementoTVIn other = (ConfigurarElementoTVIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nomeCliente==null && other.getNomeCliente()==null) || 
             (this.nomeCliente!=null &&
              this.nomeCliente.equals(other.getNomeCliente()))) &&
            ((this.categoriaServico==null && other.getCategoriaServico()==null) || 
             (this.categoriaServico!=null &&
              this.categoriaServico.equals(other.getCategoriaServico()))) &&
            ((this.rpon==null && other.getRpon()==null) || 
             (this.rpon!=null &&
              this.rpon.equals(other.getRpon()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.codOrdemServico==null && other.getCodOrdemServico()==null) || 
             (this.codOrdemServico!=null &&
              this.codOrdemServico.equals(other.getCodOrdemServico()))) &&
            ((this.identificadorUsuario==null && other.getIdentificadorUsuario()==null) || 
             (this.identificadorUsuario!=null &&
              this.identificadorUsuario.equals(other.getIdentificadorUsuario()))) &&
            ((this.CEP==null && other.getCEP()==null) || 
             (this.CEP!=null &&
              this.CEP.equals(other.getCEP()))) &&
            ((this.elementosSiebel==null && other.getElementosSiebel()==null) || 
             (this.elementosSiebel!=null &&
              java.util.Arrays.equals(this.elementosSiebel, other.getElementosSiebel()))) &&
            ((this.velocidadeDownload==null && other.getVelocidadeDownload()==null) || 
             (this.velocidadeDownload!=null &&
              this.velocidadeDownload.equals(other.getVelocidadeDownload()))) &&
            ((this.velocidadeUpload==null && other.getVelocidadeUpload()==null) || 
             (this.velocidadeUpload!=null &&
              this.velocidadeUpload.equals(other.getVelocidadeUpload()))) &&
            ((this.suplementarAlteracao==null && other.getSuplementarAlteracao()==null) || 
             (this.suplementarAlteracao!=null &&
              this.suplementarAlteracao.equals(other.getSuplementarAlteracao()))) &&
            ((this.suplementarCancelamento==null && other.getSuplementarCancelamento()==null) || 
             (this.suplementarCancelamento!=null &&
              this.suplementarCancelamento.equals(other.getSuplementarCancelamento()))) &&
            ((this.mudancaTitularidade==null && other.getMudancaTitularidade()==null) || 
             (this.mudancaTitularidade!=null &&
              this.mudancaTitularidade.equals(other.getMudancaTitularidade()))) &&
            ((this.acesso==null && other.getAcesso()==null) || 
             (this.acesso!=null &&
              this.acesso.equals(other.getAcesso()))) &&
            ((this.trocaTecnologia==null && other.getTrocaTecnologia()==null) || 
             (this.trocaTecnologia!=null &&
              this.trocaTecnologia.equals(other.getTrocaTecnologia())));
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
        if (getNomeCliente() != null) {
            _hashCode += getNomeCliente().hashCode();
        }
        if (getCategoriaServico() != null) {
            _hashCode += getCategoriaServico().hashCode();
        }
        if (getRpon() != null) {
            _hashCode += getRpon().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getCodOrdemServico() != null) {
            _hashCode += getCodOrdemServico().hashCode();
        }
        if (getIdentificadorUsuario() != null) {
            _hashCode += getIdentificadorUsuario().hashCode();
        }
        if (getCEP() != null) {
            _hashCode += getCEP().hashCode();
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
        if (getVelocidadeDownload() != null) {
            _hashCode += getVelocidadeDownload().hashCode();
        }
        if (getVelocidadeUpload() != null) {
            _hashCode += getVelocidadeUpload().hashCode();
        }
        if (getSuplementarAlteracao() != null) {
            _hashCode += getSuplementarAlteracao().hashCode();
        }
        if (getSuplementarCancelamento() != null) {
            _hashCode += getSuplementarCancelamento().hashCode();
        }
        if (getMudancaTitularidade() != null) {
            _hashCode += getMudancaTitularidade().hashCode();
        }
        if (getAcesso() != null) {
            _hashCode += getAcesso().hashCode();
        }
        if (getTrocaTecnologia() != null) {
            _hashCode += getTrocaTecnologia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurarElementoTVIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "ConfigurarElementoTVIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "nomeCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoriaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "categoriaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", ">ConfigurarElementoTVIn>categoriaServico"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "rpon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOrdemServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "codOrdemServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "identificadorUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "CEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("velocidadeDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "velocidadeDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velocidadeUpload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "velocidadeUpload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suplementarAlteracao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "suplementarAlteracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suplementarCancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "suplementarCancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mudancaTitularidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "mudancaTitularidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "acesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gvt.com/ws/eai/configuradoronline/acesso", "Acesso"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trocaTecnologia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gvt.com.br/tv/configuracaoTV", "trocaTecnologia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
