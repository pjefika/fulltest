/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.dslam.impl.metalico.huawei;

import br.net.gvt.efika.efika_customer.model.customer.InventarioRede;
import br.net.gvt.efika.fulltest.model.telecom.properties.EstadoDaPorta;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Modulacoes;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.VelocidadeVendor;
import br.net.gvt.efika.fulltest.model.telecom.velocidade.Velocidades;
import dao.dslam.impl.ComandoDslam;
import dao.dslam.impl.retorno.TratativaRetornoUtil;
import java.util.List;

/**
 *
 * @author G0041775
 */
public class HuaweiMA5600A extends HuaweiMA5600TDslamVivo1 {

    public HuaweiMA5600A(String ipDslam) {
        super(ipDslam);
    }

    @Override
    protected ComandoDslam getComandoGetEstadoDaPorta(InventarioRede i) {
        return new ComandoDslam("display interface adsl 0/" + i.getSlot() + "/" + i.getPorta(), 2000);
    }

    @Override
    public EstadoDaPorta tratGetEstadoDaPorta(List<String> ret) {
        EstadoDaPorta est = new EstadoDaPorta();
        String adm = TratativaRetornoUtil.tratHuawei(ret, "adsl", 2);
        String oper = TratativaRetornoUtil.tratHuawei(ret, "ADSL");
        est.setAdminState(adm.contains("up"));
        est.setOperState(oper.contains("active") || oper.contains("activated"));
        return est;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesDownVendor() {
        if (velsDown.isEmpty()) {
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_3072, "HSI_3Mb_1Mb_SUV", "ADSL2PLUS_AUTO_SUV", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_5120, "HSI_5Mb_1Mb_SUV", "ADSL2PLUS_AUTO_SUV", Modulacoes.AUTO_NEGOTIATE));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_10240, "HSI_10Mb_1Mb_SUV", "ADSL2PLUS_ONLY_SUV", Modulacoes.ADSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_15360, "HSI_15Mb_1Mb_SUV", "ADSL2PLUS_ONLY_SUV", Modulacoes.ADSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_25600, "HSI_25Mb_2Mb_SUV", "VDSL_17A_B8_12_SUV", Modulacoes.VDSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_35840, "HSI_35Mb_3Mb_SUV", "VDSL_17A_B8_12_SUV", Modulacoes.VDSL));
            velsDown.add(new VelocidadeVendor(Velocidades.VEL_51200, "HSI_50Mb_5Mb_SUV", "VDSL_17A_B8_12_SUV", Modulacoes.VDSL));
        }
        return velsDown;
    }

    @Override
    public List<VelocidadeVendor> obterVelocidadesUpVendor() {
        if (velsUp.isEmpty()) {
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_3Mb_1Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_5Mb_1Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_10Mb_1Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_1024, "HSI_15Mb_1Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_2048, "HSI_25Mb_2Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_3072, "HSI_35Mb_3Mb_SUV"));
            velsUp.add(new VelocidadeVendor(Velocidades.VEL_5120, "HSI_50Mb_5Mb_SUV"));
        }

        return velsUp;
    }

}
