/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global datamanobra, Vue, Auth */

Vue.config.productionTip = false;

var url = "/fulltestAPI/";

Vue.component("manobra", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div style='margin-top: 20px;'>\n\
                    <busca-cadastro></busca-cadastro>\n\
                    <div v-if='loading' style='margin-top: 20px;'>\n\
                        <loading></loading>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div v-if='tudo' style='margin-top: 20px;'>\n\
                            <div class='row'>\n\
                                <div class='col-md-3'>\n\
                                    <ul class='nav nav-tabs tabs-left'>\n\
                                        <li class='active'><a href='#info' data-toggle='tab'>Informações</a></li>\n\
                                        <li><a href='#valid' data-toggle='tab'>Valida Manobra</a></li>\n\
                                    </ul>\n\
                                </div>\n\
                                <div class='col-md-9'>\n\
                                    <div class='tab-content'>\n\
                                        <div class='tab-pane active animated slideInRight' id='info'>\n\
                                            <panelinformacoes></panelinformacoes>\n\
                                        </div>\n\
                                        <div class='tab-pane animated slideInRight' id='valid'>\n\
                                            <panelvalida></panelvalida>\n\
                                        </div>\n\
                                    </div>\n\
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
                    <div class='row'>\n\
                        <div class='col-md-3'>\n\
                            <h1>Efika</h1>\n\
                        </div>\n\
                        <div class='col-md-9'>\n\
                            <label>Instância/Designador:</label>\n\
                            <div class='input-group'>\n\
                                <input class='form-control' placeholder='Informe a Instância ou Designador' v-model='ins.instancia' @keyup.enter='pesquisar()' autofocus/>\n\
                                <span class='input-group-btn'>\n\
                                    <button type='button' class='btn btn-primary' @click='pesquisar()' :disabled='searchbuttondisable' style='width: 100px;'>Pesquisar</button>\n\
                                </span>\n\
                            </div>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    created: function () {
        var self = this;
        self.buscamotivos();
    },
    methods: {
        pesquisar: function () {
            var self = this;

            if (self.ins.instancia) {
                if (!self.emconsulta) {
                    self.emconsulta = true;
                    $.ajax({
                        type: "POST",
                        url: url + "manobra/busca",
                        data: JSON.stringify(self.ins),
                        dataType: "json",
                        beforeSend: function (xhr) {
                            xhr.setRequestHeader("Content-Type", "application/json");
                            self.todo = null;
                            self.infosvalida = null;
                            self.motivochoose = null;
                            self.loading = true;
                            self.searchbuttondisable = true;
                        },
                        success: function (data) {
                            self.tudo = data.cliente;
                            self.notifica = {
                                menssagem: "Busca realizada com sucesso!",
                                typenotify: "success"
                            };
                        },
                        complete: function () {
                            self.loading = false;
                            self.searchbuttondisable = false;
                            self.emconsulta = false;
                        }
                    });
                }
            } else {
                self.notifica = {
                    menssagem: "Preencha a Instância ou o Designador!",
                    typenotify: "danger"
                };
            }
        },
        buscamotivos: function () {
            var self = this;
            $.get(url + "manobra/motivos", function (data) {
                self.motivos = data.motivosList;
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
                    <div class='row'>\n\
                        <div class='col-md-12'>\n\
                            <div class='form-group'>\n\
                                <label>Motivos:</label>\n\
                                <div class='input-group'>\n\
                                    <select class='form-control' v-model='motivochoose'>\n\
                                        <option v-for='motivo in motivos' v-bind:value='motivo'>{{motivo.motivo}}</option>\n\
                                    </select>\n\
                                    <span class='input-group-btn'>\n\
                                        <button type='button' class='btn btn-primary pull-right' @click='valida()' :disabled='validbuttondisable' style='width: 100px;'>Validar</button>\n\
                                    </span>\n\
                                </div>\n\
                            <div>\n\
                        </div>\n\
                    </div>\n\
                    <div class='row' style='margin-top: 20px;' v-if='infosvalida'>\n\
                        <div class='col-md-12'>\n\
                            <ul class='list-group'>\n\
                                <li class='list-group-item' style='text-align: center;'>\n\
                                    <label>Validação</label>\n\
                                </li>\n\
                                <li class='list-group-item' v-for='valida in infosvalida.valids'>\n\
                                    <label>{{valida.nome}}</label>\n\
                                    <div class='row'>\n\
                                        <div class='col-md-9'>\n\
                                            <p>{{valida.mensagem}}</p>\n\
                                        </div>\n\
                                        <div class='col-md-3'>\n\
                                            <span class='glyphicon glyphicon-ok pull-right' style='color: green;' v-if='valida.resultado'></span>\n\
                                            <span class='glyphicon glyphicon-remove pull-right' style='color: red;' v-else></span>\n\
                                        </div>\n\
                                    </div>\n\
                                </li>\n\
                                <li class='list-group-item' style='text-align: center;'>\n\
                                    <label>Conclusão</label>\n\
                                </li>\n\
                                <li class='list-group-item'>\n\
                                    <label>{{infosvalida.conclusao.fraseologia}}</label>\n\
                                    <div class='row'>\n\
                                        <div class='col-md-9'>\n\
                                            <p v-if='infosvalida.conclusao.conclusao'>Manobra Permitida</p>\n\
                                            <p v-else>Manobra não permitida</p>\n\
                                        </div>\n\
                                        <div class='col-md-3'>\n\
                                            <span class='glyphicon glyphicon-ok pull-right' style='color: green;' v-if='infosvalida.conclusao.conclusao'></span>\n\
                                            <span class='glyphicon glyphicon-remove pull-right' style='color: red;' v-else></span>\n\
                                        </div>\n\
                                    </div>\n\
                                </li>\n\
                            </ul>\n\
                        </div>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div v-if='loadingvalida' style='text-align: center;'>\n\
                            <loading></loading>\n\
                        </div>\n\
                        <div v-else>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    create: function () {

    },
    methods: {
        valida: function () {
            var self = this;
            if (self.motivochoose) {
                var _data = {};
                _data.cliente = self.tudo;
                _data.motivo = self.motivochoose.nome;
                $.ajax({
                    type: "POST",
                    url: url + "manobra/valida",
                    data: JSON.stringify(_data),
                    dataType: "json",
                    beforeSend: function (xhr) {
                        xhr.setRequestHeader("Content-Type", "application/json");
                        self.infosvalida = null;
                        self.loadingvalida = true;
                        self.validbuttondisable = true;
                        self.searchbuttondisable = true;
                        self.emconsulta = true;
                    },
                    success: function (data) {
                        self.infosvalida = data.validaClienteManobraFacade;
                        //console.log(data);
                    },
                    complete: function () {
                        self.loadingvalida = false;
                        self.validbuttondisable = false;
                        self.searchbuttondisable = false;
                        self.notifica = {
                            menssagem: "Validação completa, verifique a tabela!",
                            typenotify: "info"
                        };
                        self.emconsulta = false;
                    }
                });
            } else {
                self.notifica = {
                    menssagem: "Selecione o motivo!",
                    typenotify: "danger"
                };
            }
        }
    }
});

Vue.component("panelinformacoes", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <div class='row'>\n\
                        <div class='col-md-6'>\n\
                            <tabela-info-tbs></tabela-info-tbs>\n\
                        </div>\n\
                        <div class='col-md-6'>\n\
                            <tabela-info-radius></tabela-info-radius>\n\
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
                                <td>ipGerenciaBRAS</td>\n\
                                <td>{{tudo.cadastro.infoCricket.ipGerenciaBRAS}}</td>\n\
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