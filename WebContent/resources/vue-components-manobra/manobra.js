/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global datamanobra, Vue */

Vue.component("manobra", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div style='margin-top: 20px;'>\n\
                    <div class='form-group'>\n\
                        <busca-cadastro></busca-cadastro>\n\
                    </div>\n\
                    <div v-if='loading'>\n\
                        <loading></loading>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div>\n\
                            <div class='row'>\n\
                                <div class='col-md-6'>\n\
                                    <tabela-info-cliente></tabela-info-cliente>\n\
                                </div>\n\
                                <div class='col-md-6'>\n\
                                    <tabela-info-radius></tabela-info-radius>\n\
                                </div>\n\
                            </div>\n\
                            <div class='row'>\n\
                                <div class='col-md-12'>\n\
                                    <tabela-info-tbs></tabela-info-tbs>\n\
                                </div>\n\
                            </div>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});

Vue.component("buscaCadastro", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <label>Motivo maobra:</label>\n\
                    <select class='form-control'>\n\
                        <option>Selecione</option>\n\
                        <option>op1</option>\n\
                        <option>op2</option>\n\
                        <option>op3</option>\n\
                    </select>\n\
                    <label>Instancia?Designador?:</label>\n\
                    <div class='input-group'>\n\
                        <input class='form-control' placeholder='Informe a Instância? ou Designador?'/>\n\
                        <span class='input-group-btn'>\n\
                            <button type='button' class='btn btn-primary' @click='pesquisar()'>Pesquisar</button>\n\
                        </span>\n\
                    </div>\n\
                </div>",
    created: function () {

    },
    methods: {
        pesquisar: function () {
            var self = this;
            self.loading = true;
            setTimeout(function () {
                self.loading = false;
                self.notifica = {
                    menssagem: "Busca realizada com sucesso!",
                    typenotify: "success"
                };
            }, 1500);
        }
    }
});


Vue.component("tabelaInfoCliente", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <table class='table table-bordered small'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th colspan='2' style='text-align: center;'> Informações do Cliente</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>Nome do Cliente</td>\n\
                                <td>FABIO HENRIQUE CLEM DA SILVA</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Instância</td>\n\
                                <td>4131543457</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Designador ADSL</td>\n\
                                <td>CTA-81E2J3HSS-013</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Velocidade Contratada</td>\n\
                                <td>51200/ 5120</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Designador TV</td>\n\
                                <td>TV-CTA-81E2J3HST-050</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Tecnologia de Voz</td>\n\
                                <td>TDM/H248</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Tecnologia de Acesso</td>\n\
                                <td>METALICO</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Rede Acesso</td>\n\
                                <td>VIVO2</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Tipo Central</td>\n\
                                <td>TDM</td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});

Vue.component("tabelaInfoTbs", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <table class='table table-bordered small'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th colspan='2' style='text-align: center;'>Informações TBS</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>Modelo DSLAM</td>\n\
                                <td>KEYMILE - SUVD11</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Slot</td>\n\
                                <td>3</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>RIN</td>\n\
                                <td>074</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Shelf</td>\n\
                                <td>6</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Ender. Seq. da Porta</td>\n\
                                <td>1085</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>VLAN VOD</td>\n\
                                <td>3074</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>VLAN Multicast</td>\n\
                                <td>4000</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Status</td>\n\
                                <td>ATIVO</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>N° da Porta</td>\n\
                                <td>37</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>IP BRAs</td>\n\
                                <td>179.184.126.103-2804:7F4:2000:1::1-179.184.126.104-2804:7F4:2000:1::F5</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Ip do Armário</td>\n\
                                <td>10.200.30.177</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>CVLAN</td>\n\
                                <td>0</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>VLAN Internet</td>\n\
                                <td>074</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>VLAN VOIP</td>\n\
                                <td>1074</td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});

Vue.component("tabelaInfoRadius", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <table class='table table-bordered small'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th colspan='2' style='text-align: center;'>Informações Radius</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>Nome do Armário</td>\n\
                                <td>PRCTA_O1C50</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Turbonet Profissional</td>\n\
                                <td>NÃO</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Serviço de Autenticação</td>\n\
                                <td>NAO</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Indicador de Perfil</td>\n\
                                <td>r5120b51200</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Nome do BRAS</td>\n\
                                <td>CTA4093</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>Status Radius</td>\n\
                                <td>ATIVO</td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});