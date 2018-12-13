/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.facade;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.Solucao;
import br.net.gvt.efika.fulltest.model.fulltest.ValidacaoResult;
import br.net.gvt.efika.fulltest.model.telecom.properties.DeviceMAC;
import dao.SolucaoDao;
import dao.dslam.factory.DslamDAOFactory;
import dao.dslam.impl.AbstractDslam;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import model.MacAddress;
import model.fulltest.operacional.FullTestAdapter;
import model.fulltest.operacional.strategy.ExecutionStrategy;
import model.fulltest.operacional.strategy.FactoryExecutionStrategy;
import model.validacao.impl.realtime.FactoryValidador;
import model.validacao.impl.realtime.Validator;
import util.DbInfo;
import util.MacAddressValidator;
import util.MySqlConnection;

/**
 *
 * @author g0042204
 */
public abstract class FullTestGenericFacade extends FulltestExecution {

    private String owner;

    protected EfikaCustomer cl;

    private List<Validator> bateria;

    protected List<Solucao> solucoes;

    protected List<ValidacaoResult> valids;

    protected Calendar dataInicio;

    protected Calendar dataFim;

    protected String mensagem;

    protected Boolean resultado;

    protected AbstractDslam dslam;

    protected ExecutionStrategy exec;

    protected String msgModemTrocado = "";

    public FullTestGenericFacade(String owner) {
        this.owner = owner;
    }

    public FullTestGenericFacade() {
    }

    @Override
    void iniciar(EfikaCustomer e) throws Exception {
        this.cl = e;
        this.exec = FactoryExecutionStrategy.condicional();
        this.dataInicio = Calendar.getInstance();
        this.dslam = DslamDAOFactory.getInstance(this.cl.getRede());
        this.valids = new ArrayList<>();
        this.solucoes = new ArrayList<>();
    }

    @Override
    void encerrar() {
        dslam.desconectar();
        dataFim = Calendar.getInstance();
        this.encerramento();
        Connection conn = null;
        try {
            MySqlConnection mySqlConnection = new MySqlConnection();
            conn = mySqlConnection.getConnection("10.200.35.66","efika", "root", "pirogue");
            //TODO: varrer o valids e verificar os erros e adicionar em solucoes em caso de erro
            for(ValidacaoResult valid : valids){
                List<Solucao> newSolucoes = new ArrayList<>();
                if((valid.getFoiCorrigido() != null && !valid.getFoiCorrigido()) ||
                        (valid.getFoiCorrigido() == null && !valid.getResultado())){
                    Solucao solucao = new SolucaoDao().findOne(valid.getNome(), conn, mySqlConnection);
                    //Definir como a informacao da solucao sera carregada do banco ou de onde sera carregada.
                    solucao.setSolucao(solucao.getSolucao());
                    newSolucoes.add(solucao);
                }
                this.solucoes = newSolucoes;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    void validar() throws Exception {
        this.exec.action(this);

        for (ValidacaoResult valid : getValids()) {
            if (!valid.getResultado() && this.mensagem == null) {
                this.setResultado(Boolean.FALSE);
                this.setMensagem(valid.getMensagem());
            }



            if(valid.getResult() instanceof DeviceMAC){
                DeviceMAC realMac = (DeviceMAC) valid.getResult();

                MacAddress macAddress = new MacAddressValidator().macChanged(this.cl.getDesignador());

                if((macAddress != null) && (!realMac.getMac().startsWith("P"))){
                    if(!macAddress.getMacAddr().replaceAll("-", ":").equals(realMac.getMac())){
                        valid.setMensagem(valid.getMensagem() + " (MODEM TROCADO) ");
                        msgModemTrocado = " (MODEM TROCADO) ";
                    }
                }

            }
        }

        if(this.mensagem != null) {
            this.setMensagem(this.getMensagem() + " " + msgModemTrocado);
        }
        //comparar macs
        //MYSQL: 10.40.197.137/macaddress table dw_20_radacct
        //designador, comparar mac address

    }

    public FullTest cast() {
        return FullTestAdapter.adapter(this);
    }

    @Override
    protected void encerramento() {

        if (mensagem == null) {
            mensagem = "Não foram identificados problemas de configuração. Se o problema/sintoma informado pelo cliente persiste, seguir o fluxo." + msgModemTrocado;
        }

        if (resultado == null) {
            resultado = true;
        }
    }

    public EfikaCustomer getCl() {
        return cl;
    }

    public void setCl(EfikaCustomer cl) {
        this.cl = cl;
    }

    public List<Validator> getBateria() {
        if (bateria == null) {
            bateria = FactoryValidador.crm(this.dslam, this.cl);
        }
        return bateria;
    }

    public void setBateria(List<Validator> bateria) {
        this.bateria = bateria;
    }

    public List<Solucao> getSolucoes() {
        if (solucoes == null) {
            solucoes = new ArrayList<>();
        }
        return solucoes;
    }

    public void setSolucoes(List<Solucao> solucoes) {
        this.solucoes = solucoes;
    }

    public List<ValidacaoResult> getValids() {
        if (valids == null) {
            valids = new ArrayList<>();
        }
        return valids;
    }

    public void setValids(List<ValidacaoResult> valids) {
        this.valids = valids;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public AbstractDslam getDslam() {
        return dslam;
    }

    public void setDslam(AbstractDslam dslam) {
        this.dslam = dslam;
    }

    public ExecutionStrategy getExec() {
        return exec;
    }

    public void setExec(ExecutionStrategy exec) {
        this.exec = exec;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
