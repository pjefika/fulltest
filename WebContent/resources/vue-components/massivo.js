/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global Vue, moment, _, vm */

var url = "/fulltestAPI/";

Vue.component("massivo", {
    props: {

    },
    template: "<div style='margin-top: 20px;'>\n\
                    \n\
                    <modal-button classe='defaultp' titulo='Cadastrar Lote' corpo='cadastro-lote' nomebutton='Cadastrar Lote'></modal-button>\n\
                    <mgeneric></mgeneric>\n\
                    <tabela-lote></tabela-lote>\n\
                </div>",
    created: function () {

    },
    methods: {

    }
});

Vue.component("cadastroLote", {
    props: {
    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                <div class='modal-body'>\n\
                    <div class='form-group'>\n\
                        <label>Observação:</label>\n\
                        <textarea class='form-control' rows='3' style='resize: none;' v-model='lote.observacao'></textarea>\n\
                    </div>\n\
                    <hr>\n\
                    <div>\n\
                        Delimitadores: Virgula, Ponto e Virgula, Quebra de linha\n\
                    </div>\n\
                    <div class='form-group'>\n\
                        <label>Instâncias:</label>\n\
                        <textarea class='form-control' rows='3' style='resize: none;' v-model='instancias'></textarea>\n\
                    </div>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitfechar()'>Fechar</button>\n\
                        <button type='button' class='btn btn-primary' @click='cadastraLote()'>Cadastrar</button>\n\
                    </div>\n\
                </div>\n\
            </div>",
    created: function () {

    },
    methods: {
        cadastraLote: function () {
            var self = this;
            $.ajax({
                type: "POST",
                url: url + "lote/cadastrar",
                data: JSON.stringify(self.lote),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function (data) {
                    self.linhasTeste(data.lote);
                }
            });
        },
        linhasTeste: function (h) {
            var self = this;
            var listI = self.instancias.split(/[\r\n]+|[,;]/g);
            var lt = h;
            lt.tests = [];
            for (var i = 0; i < listI.length; i++) {
                if (listI[i].length > 4) {
                    lt.tests.push({id: null, status: "ATIVO", instancia: listI[i], lote: {id: h.id}});
                }
            }
            $.ajax({
                type: "POST",
                url: url + "lote/modificar",
                data: JSON.stringify(lt),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function () {
                    $("#genericmodal").modal("hide");
                    vm.reset();
                    vm.getLotes();
                }
            });
        },
        hitfechar: function () {
            vm.reset();
        }
    }
});

Vue.component("tabelaLote", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div style='margin-top: 20px;'>\n\
                    <table class='table table-bordered' style='text-align: center;'>\n\
                        <thead>\n\
                            <tr>\n\
                                <td>Selecionar</td>\n\
                                <th>ID</th>\n\
                                <th>Status</th>\n\
                                <th>Data Criação</th>\n\
                                <th>Matricula</th>\n\
                                <th>Observação</th>\n\
                                <th>Ações</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr v-for='lote in lotes' :key='lote.id'>\n\
                                <td><input type='checkbox' v-bind:value='lote.id' v-model='check' @change='exportMassivoChange()'/></td>\n\
                                <td>{{lote.id}}</td>\n\
                                <td>{{lote.status}}</td>\n\
                                <td>{{dateFormat(lote.dataCriacao)}}</td>\n\
                                <td>{{lote.matricula}}</td>\n\
                                <td>{{lote.observacao}}</td>\n\
                                <td>\n\
                                    <button class='btn btn-primary glyphicon glyphicon-download-alt btn-sm' type='button' @click='exporty(lote)' data-toggle='tooltip' data-placement='right' title='Exportar.'></button>\n\
                                    <modal-button classe='info' titulo='Informações do lote' corpo='info-lote' :lt='lote'></modal-button>\n\
                                    <modal-button classe='del' titulo='Excluir Lote' corpo='deleta-lote' :lt='lote'></modal-button>\n\
                            </td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    created: function () {
        var self = this;
        Vue.nextTick(function () {
            vm.getLotes();
        });
    },
    methods: {
        dateFormat: function (h) {
            return moment(h).format('DD/MM/YYYY HH:mm:ss');
        },
        exporty: function (h) {
            //var self = this;
            window.location.href = url + "testecliente/exportSelect/" + h.id;
        },
        exportMassivoChange: function () {
            var self = this;
            if (self.check.length > 0) {
                $("#exportaMassivo").removeAttr("disabled");
            } else {
                $("#exportaMassivo").attr("disabled", "disabled");
            }
        },
        exportSelect: function () {
            var self = this;
            var concat = "";
            for (var i = 0; i < self.check.length; i++) {
                if (i + 1 === self.check.length) {
                    concat += self.check[i];
                } else {
                    concat += self.check[i] + ";";
                }
            }
            window.location.href = url + "testecliente/exportSelect/" + concat;
        }
    }
});

Vue.component("deletaLote", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                <div class='modal-body'>\n\
                    Deseja realmete excluir o Lote {{lote.id}}\n\
                </div>\n\
                <div class='modal-footer'>\n\
                    <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitfechar()'>Não</button>\n\
                    <button type='button' class='btn btn-primary' @click='modificaLoteEx()'>Sim</button>\n\
                </div>\n\
            </div>",
    created: function () {

    },
    methods: {
        modificaLoteEx: function () {
            var self = this;
            self.lote.status = "EXCLUIDO";
            $.ajax({
                type: "POST",
                url: url + "lote/modificar",
                data: JSON.stringify(self.lote),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function () {
                    $("#genericmodal").modal("hide");
                    vm.getLotes();
                    vm.reset();
                }
            });
        },
        hitfechar: function () {
            vm.reset();
        }
    }
});

Vue.component("infoLote", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <div class='modal-body'>\n\
                        <div class='list-group'>\n\
                                    <div class='list-group-item'>\n\
                                        <p class='list-group-item-text'>ID: {{lote.id}}</p>\n\
                                    </div>\n\
                                    <div class='list-group-item'>\n\
                                        <p class='list-group-item-text'>Data de Criação: {{dateFormat(lote.dataCriacao)}}</p>\n\
                                    </div>\n\
                                    <div class='list-group-item'>\n\
                                        <p class='list-group-item-text'>Matricula: {{lote.matricula}}</p>\n\
                                    </div>\n\
                                    <div class='list-group-item'>\n\
                                        <p class='list-group-item-text'>Observação: {{lote.observacao}}</p>\n\
                                    </div>\n\
                                    <div class='list-group-item'>\n\
                                        <p class='list-group-item-text'>Status: {{lote.status}}</p>\n\
                                    </div>\n\
                                </div>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitfechar()'>Fechar</button>\n\
                    </div>\n\
                </div>",
    created: function () {
        var self = this;
        self.getInfoLote();
    },
    methods: {
        getInfoLote: function () {
            var self = this;
            $.ajax({
                type: "POST",
                url: url + "teste/listaporlote",
                data: JSON.stringify(self.lote),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function (data) {
                    self.tests = data.list;
                    console.log(data);
                }
            });
        },
        dateFormat: function (h) {
            return moment(h).format('DD/MM/YYYY HH:mm:ss');
        },
        hitfechar: function () {
            vm.reset();
        }
    }
});