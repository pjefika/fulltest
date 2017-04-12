/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global datamanobra, Vue, Auth */

var url = "/fulltestAPI/";

Vue.component("manobra", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div style='margin-top: 20px;'>\n\
                    <busca-cadastro></busca-cadastro>\n\
                    <div v-if='loading'>\n\
                        <loading></loading>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div v-if='tudo' style='margin-top: 10px;'>\n\
                            <panelvalida></panelvalida>\n\
                            <panelinformacoes></panelinformacoes>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    create: function () {

    },
    methods: {
        clickinfo: function () {
            var self = this;
            self.navvalid = false;
        },
        clickvalida: function () {
            var self = this;
            self.navvalid = true;
        }

    }
});

Vue.component("buscaCadastro", {
    props: {
    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <label>Instancia?Designador?:</label>\n\
                    <div class='input-group'>\n\
                        <input class='form-control' placeholder='Informe a Instância? ou Designador?' v-model='ins.instancia' @keyup.enter='pesquisar()' autofocus/>\n\
                        <span class='input-group-btn'>\n\
                            <button type='button' class='btn btn-primary' @click='pesquisar()' :disabled='searchbuttondisable'>Pesquisar</button>\n\
                        </span>\n\
                    </div>\n\
                </div>",
    created: function () {
        var self = this;
        self.buscamotivos();
    },
    methods: {
        pesquisar: function () {
            var self = this;
            self.loading = true;
            self.searchbuttondisable = true;            
            $.ajax({
                type: "POST",
                url: url + "manobra/busca",
                data: JSON.stringify(self.ins),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                    self.todo = null;
                },
                success: function (data) {
                    self.tudo = data.cliente;
                    console.log(data);
                    self.notifica = {
                        menssagem: "Busca realizada com sucesso!",
                        typenotify: "success"
                    };
                },
                complete: function () {
                    self.loading = false;
                    self.searchbuttondisable = false;
                }
            });
        },
        buscamotivos: function () {
            var self = this;
            $.get(url + "manobra/motivos", function (data) {
                self.motivos = data.list;
            });
        }
    }
});

Vue.component("panelvalida", {
    props: {
        
    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <div class='panel panel-default'>\n\
                        <div class='panel-heading' data-toggle='collapse' data-target='#panelvalid'>\n\
                            Valida manobra\n\
                        </div>\n\
                        <div class='panel-body collapse' id='panelvalid'>\n\
                            <label>Motivos:</label>\n\
                            <select class='form-control'>\n\
                                    <option v-for='motivo in motivos' v-bind:value='motivo'>{{motivo}}</option>\n\
                            </select>\n\
                            <br/>\n\
                            <button type='button' class='btn btn-primary pull-right'>Validar</button>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    create: function () {

    },
    methods: {
        
    }
});

Vue.component("panelinformacoes", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <div class='panel panel-default'>\n\
                        <div class='panel-heading' data-toggle='collapse' data-target='#panelinfo'>\n\
                            Informações\n\
                        </div>\n\
                        <div class='panel-body' id='panelinfo'>\n\
                        <div class='row'>\n\
                            <div class='col-md-6'>\n\
                                <tabela-info-tbs></tabela-info-tbs>\n\
                            </div>\n\
                            <div class='col-md-6'>\n\
                                <tabela-info-radius></tabela-info-radius>\n\
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
                                <th colspan='2' style='text-align: center;'> Informações TBS</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>brasName</td>\n\
                                <td>{{tudo.cadastro.infoTBS.brasName}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>cvlan</td>\n\
                                <td>{{tudo.cadastro.infoTBS.cvlan}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>dslamModel</td>\n\
                                <td>{{tudo.cadastro.infoTBS.dslamModel}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>dslamVendor</td>\n\
                                <td>{{tudo.cadastro.infoTBS.dslamVendor}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>ipBras</td>\n\
                                <td>{{tudo.cadastro.infoTBS.ipBras}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>ipDslam</td>\n\
                                <td>{{tudo.cadastro.infoTBS.ipDslam}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portAddrSeq</td>\n\
                                <td>{{tudo.cadastro.infoTBS.portAddrSeq}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portAddrSequence</td>\n\
                                <td>{{tudo.cadastro.infoTBS.portAddrSequence}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portNumber</td>\n\
                                <td>{{tudo.cadastro.infoTBS.portNumber}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>rin</td>\n\
                                <td>{{tudo.cadastro.infoTBS.rin}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>shelf</td>\n\
                                <td>{{tudo.cadastro.infoTBS.shelf}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>slot</td>\n\
                                <td>{{tudo.cadastro.infoTBS.slot}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>status</td>\n\
                                <td>{{tudo.cadastro.infoTBS.status}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanMcast</td>\n\
                                <td>{{tudo.cadastro.infoTBS.vlanMcast}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanVoD</td>\n\
                                <td>{{tudo.cadastro.infoTBS.vlanVoD}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanVoIP</td>\n\
                                <td>{{tudo.cadastro.infoTBS.vlanVoIP}}</td>\n\
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
                                <th colspan='2' style='text-align: center;'> Informações Radius</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>authService</td>\n\
                                <td>{{tudo.cadastro.infoRadius.authService}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>cabinet</td>\n\
                                <td>{{tudo.cadastro.infoRadius.cabinet}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>downUp</td>\n\
                                <td>{{tudo.cadastro.infoRadius.downUp}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>ipProfissional</td>\n\
                                <td>{{tudo.cadastro.infoRadius.ipProfissional}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>profissional</td>\n\
                                <td>{{tudo.cadastro.infoRadius.profissional}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>radiusPort</td>\n\
                                <td>{{tudo.cadastro.infoRadius.radiusPort}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>radiusProfile</td>\n\
                                <td>{{tudo.cadastro.infoRadius.radiusProfile}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>status</td>\n\
                                <td>{{tudo.cadastro.infoRadius.status}}</td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});