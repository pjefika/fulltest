/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global Vue, url */

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
        self.validaatendente();
    },
    methods: {
        pesquisar: function () {
            var self = this;
            self.validbuttondisable = false;
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
                            self.loading = true;
                            self.infosvalida = null;
                            self.motivochoose = null;
                            self.ordemdeserivo = null;
                            self.searchbuttondisable = true;
                        },
                        success: function (data) {
                            self.tudo = null;
                            if (data.cliente) {                                                               
                                self.tudo = data.cliente;                                
                                self.notifica = {
                                    menssagem: "Busca realizada com sucesso!",
                                    typenotify: "success"
                                };
                                self.listavalidlog();
                            } else {
                                self.notifica = {
                                    menssagem: "Erro ao buscar cadastro",
                                    typenotify: "danger"
                                };
                            }
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
        },
        listavalidlog: function () {
            var self = this;
            $.ajax({
                type: "POST",
                url: url + "manobra/listavalidesp",
                data: JSON.stringify(self.tudo),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function (data) {
                    if (data.list.length > 0) {
                        self.listavalidacao = data.list;
                    } else {
                        self.listavalidacao = null;
                    }

                }
            });
        },
        validaatendente: function () {
            var self = this;
            $.get(url + "manobra/veatendente", function (data) {
                self.veatendente = data.boolean;
            });
        }
    }
});