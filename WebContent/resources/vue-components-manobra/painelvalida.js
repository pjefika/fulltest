/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global Vue */

Vue.component("panelvalida", {
    props: ['escolha'],
    data: function() {
        return data;
    },
    template: "<div>\n\
                    <div class='row'>\n\
                        <div class='col-md-12'>\n\
                            <h3>Validador Manobra</h3>\n\
                            <hr/>\n\
                        </div>\n\
                    </div>\n\
                    <div class='row'>\n\
                        <div class='col-md-12'>\n\
                            <div v-if='!listavalidacao'>\n\
                                <div class='form-group'>\n\
                                    <label>Motivos:</label>\n\
                                    <select class='form-control' v-model='motivochoose'>\n\
                                        <option value='' disabled>Selecione</option>\n\
                                        <option v-for='motivo in motivos' :value='motivo'>{{motivo.motivo}}</option>\n\
                                    </select>\n\
                                </div>\n\
                                <div class='form-group'>\n\
                                    <label>Ordem de Serviço (PON/SS):</label>\n\
                                    <div class='input-group'>\n\
                                        <input class='form-control' type='text' placeholder='Insira a ordem de serviço' v-model='ordemdeserivo'/>\n\
                                        <span class='input-group-btn'>\n\
                                            <button type='button' class='btn btn-primary pull-right' @click='valida()' :disabled='validbuttondisable' style='width: 100px;'>Validar</button>\n\
                                        </span>\n\
                                    </div>\n\
                                </div>\n\
                            <div>\n\
                        </div>\n\
                    </div>\n\
                    <br/>\n\
                    <div v-if='listavalidacao' class='row'>\n\
                        <div class='col-md-12'>\n\
                            <listlogvalid></listlogvalid>\n\
                        </div>\n\
                    </div>\n\
                    <div class='row' style='margin-top: 20px;' v-if='infosvalida'>\n\
                        <div class='col-md-12'>\n\
                            <ul class='list-group'>\n\
                                <div v-if='veatendente'>\n\
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
                                </div>\n\
                                <li class='list-group-item' style='text-align: center;'>\n\
                                    <label>Conclusão</label>\n\
                                </li>\n\
                                <li class='list-group-item' :class=\"{'list-group-item-danger': !infosvalida.conclusao.conclusao, 'list-group-item-success': infosvalida.conclusao.conclusao}\">\n\
                                    <label v-if='infosvalida.conclusao.conclusao'>Manobra Permitida</label>\n\
                                    <label v-else>Manobra não permitida</label>\n\
                                    <div class='row' v-if='infosvalida.conclusao.fraseologia !== \"Motivo não implementado.\" '>\n\
                                        <div class='col-md-9'>\n\
                                            <p>{{infosvalida.conclusao.fraseologia}}</p>\n\
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
                    </div>\n\
                </div>",
    create: function() {

    },
    methods: {
        valida: function() {
            var self = this;
            if (self.motivochoose && self.ordemdeserivo) {
                var _data = {};
                _data.cliente = self.tudo;
                _data.motivo = self.motivochoose.nome;
                _data.atividade = self.ordemdeserivo;
                $.ajax({
                    type: "POST",
                    url: url + "manobra/valida",
                    data: JSON.stringify(_data),
                    dataType: "json",
                    beforeSend: function(xhr) {
                        xhr.setRequestHeader("Content-Type", "application/json");
                        self.infosvalida = null;
                        self.loadingvalida = true;
                        self.validbuttondisable = true;
                        self.searchbuttondisable = true;
                        self.emconsulta = true;
                    },
                    success: function(data) {
                        console.log(data);
                        if (data.conclusao) {
                            self.infosvalida = data;
                            self.notifica = {
                                menssagem: "Validação completa, verifique a tabela!",
                                typenotify: "info"
                            };
                        } else {
                            if (data.funcIndisponivelDslamException) {
                                self.notifica = {
                                    menssagem: data.funcIndisponivelDslamException.detailMessage,
                                    typenotify: "danger"
                                };
                            } else if (data.dslamNaoImplException) {
                                self.notifica = {
                                    menssagem: data.dslamNaoImplException.detailMessage,
                                    typenotify: "danger"
                                };
                            } else if (data.remoteException) {
                                self.notifica = {
                                    menssagem: data.remoteException.detailMessage,
                                    typenotify: "danger"
                                };
                            } else if (data.workOrderInexException) {
                                self.validbuttondisable = false;
                                self.notifica = {
                                    menssagem: data.workOrderInexException.detailMessage,
                                    typenotify: "danger"
                                };
                            } else {
                                self.validbuttondisable = false;
                                self.notifica = {
                                    menssagem: "Erro ao realizar validações.",
                                    typenotify: "danger"
                                };
                            }
                        }
                    },
                    complete: function() {
                        self.loadingvalida = false;
                        self.searchbuttondisable = false;
                        self.emconsulta = false;
                    }
                });
            } else {
                self.notifica = {
                    menssagem: "Selecione o motivo e insira a ordem de serviço!",
                    typenotify: "danger"
                };
            }
        }
    }
});