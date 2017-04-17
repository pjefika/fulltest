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
                            <label>Instancia?Designador?:</label>\n\
                            <div class='input-group'>\n\
                                <input class='form-control' placeholder='Informe a Instância? ou Designador?' v-model='ins.instancia' @keyup.enter='pesquisar()' autofocus/>\n\
                                <span class='input-group-btn'>\n\
                                    <button type='button' class='btn btn-primary' @click='pesquisar()' :disabled='searchbuttondisable'>Pesquisar</button>\n\
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
            self.loading = true;
            self.searchbuttondisable = true;

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
                    },
                    success: function (data) {
                        //console.log(data);
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
                    <div class='row'>\n\
                        <div class='col-md-12'>\n\
                            <div class='form-group'>\n\
                                <label>Motivos:</label>\n\
                                <select class='form-control' v-model='motivochoose'>\n\
                                    <option v-for='motivo in motivos' v-bind:value='motivo'>{{motivo}}</option>\n\
                                </select>\n\
                            <div>\n\
                        </div>\n\
                    </div>\n\
                    <div class='row' style='margin-top: 20px;'>\n\
                        <div class='col-md-12'>\n\
                            <button type='button' class='btn btn-primary pull-right' @click='valida()' :disabled='validbuttondisable'>Validar</button>\n\
                        </div>\n\
                    </div>\n\
                    <div class='row' style='margin-top: 20px;' v-if='infosvalida'>\n\
                        <div class='col-md-7'>\n\
                            <ul class='list-group'>\n\
                                <li class='list-group-item' style='text-align: center;'>\n\
                                    <label>Validações</label>\n\
                                </li>\n\
                                <li class='list-group-item'>\n\
                                    <div v-for='info in infosvalida'>\n\
                                        <label>{{info.nome}}</label>\n\
                                        <div class='row'>\n\
                                            <div class='col-md-9'>\n\
                                                <p>{{info.msg}}</p>\n\
                                            </div>\n\
                                            <div class='col-md-3'>\n\
                                                <span class='glyphicon glyphicon-ok pull-right' style='color: green;' v-if='info.bol'></span>\n\
                                                <span class='glyphicon glyphicon-remove pull-right' style='color: red;' v-else></span>\n\
                                            </div>\n\
                                        </div>\n\
                                    </div>\n\
                                </li>\n\
                            </ul>\n\
                        </div>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div v-if='loadingvalida' style='text-align: center;'>\n\
                            <loading></loading>\n\
                            Aguarde\n\
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
                //reseta informações da variavel
                self.infosvalida = null;
                //mostra o loading para a consulta
                self.loadingvalida = true;
                //desabilita botão para não realizar mais de uma consulta ao mesmo tempo
                self.validbuttondisable = true;
                
                //Time out para fazer demonstração
                setTimeout(function () {
                    
                    //esconde o loading 
                    self.loadingvalida = false;

                    // demonstração de lista de validações
                    var dv = [
                        {
                            nome: "Lorem ipsum dolor sit amet",
                            msg: "Lorem ipsum dolor sit amet.",
                            bol: false
                        }, {
                            nome: "Lorem ipsum dolor sit amet",
                            msg: "Lorem ipsum dolor sit amet.",
                            bol: false
                        }, {
                            nome: "Lorem ipsum dolor sit amet",
                            msg: "Lorem ipsum dolor sit amet.",
                            bol: true
                        }
                    ];
                    //seta lista em infovalida \/
                    self.infosvalida = dv;
                    
                    //habilita botão para não realizar mais de uma consulta ao mesmo tempo
                    self.validbuttondisable = false;
                    
                    //Mostrar notificação conforme resultado da consulta
                    self.notifica = {
                        menssagem: "Validação completa, verifique a tabela!",
                        typenotify: "info"
                    };                    
                    
                }, 1500);
            } else {
                //notifica que está vazio a lista de motivos
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