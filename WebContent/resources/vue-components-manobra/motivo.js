/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global Vue, vmi */

Vue.component("motivo", {
    data: function () {
        return data;
    },
    props: {

    },
    template: "<div style='margin-top: 20px;'>\n\
                    <modal-button classe='defaultp' nomebutton='Cadastrar' titulo='Cadastrar Motivo' corpo='cadastra-motivo'></modal-button>\n\
                    <tabela-motivos></tabela-motivos>\n\
                </div>",
    created: function () {

    },
    methods: {

    }
});

Vue.component("cadastraMotivo", {
    data: function () {
        return data;
    },
    props: {

    },
    template: "<div>\n\
                    <div class='modal-body'>\n\
                        <div class='form-group'>\n\
                            <label>Nome:</label>\n\
                            <input type='text' class='form-control' placeholder='Nome do motivo' v-model='motivo.nome'/>\n\
                        </div>\n\
                        <div class='form-group'>\n\
                            <label>Ativo?:</label>\n\
                            <select class='form-control' v-model='motivo.ativo'>\n\
                                <option>Ativo</option>\n\
                                <option>Inativo</option>\n\
                            </select>\n\
                        </div>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitFechar()'>Fechar</button>\n\
                        <button type='button' class='btn btn-primary' @click='cadastrar()'>Cadastrar</button>\n\
                    </div>\n\
                </div>",
    created: function () {

    },
    methods: {
        cadastrar: function () {
            var self = this;
            console.log(self.motivo);
            $("#genericmodal").modal("hide");
        },
        hitFechar: function () {
            vmi.reset();
        }
    }
});

Vue.component("modificaMotivo", {
    data: function () {
        return data;
    },
    props: {

    },
    template: "<div>\n\
                    <div class='modal-body'>\n\
                        <div class='form-group'>\n\
                            <label>Nome:</label>\n\
                            <input type='text' class='form-control' placeholder='Nome do motivo' v-model='motivo.nome'/>\n\
                        </div>\n\
                        <div class='form-group'>\n\
                            <label>Ativo?:</label>\n\
                            <select class='form-control' v-model='motivo.ativo'>\n\
                                <option>Ativo</option>\n\
                                <option>Inativo</option>\n\
                            </select>\n\
                        </div>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitFechar()'>Fechar</button>\n\
                        <button type='button' class='btn btn-primary' @click='modificar()'>Modificar</button>\n\
                    </div>\n\
                </div>",
    created: function () {

    },
    methods: {
        modificar: function () {
            var self = this;
            console.log(self.motivo);
            $("#genericmodal").modal("hide");
        },
        hitFechar: function () {
            vmi.reset();
        }
    }

});

Vue.component("excluiMotivo", {
    data: function () {
        return data;
    },
    props: {

    },
    template: "<div>\n\
                    <div class='modal-body'>\n\
                        <div class='form-group'>\n\
                            <label>Nome:</label>\n\
                            <input type='text' class='form-control' placeholder='Nome do motivo' v-model='motivo.nome'/>\n\
                        </div>\n\
                        <div class='form-group'>\n\
                            <label>Ativo?:</label>\n\
                            <select class='form-control' v-model='motivo.ativo'>\n\
                                <option>Ativo</option>\n\
                                <option>Inativo</option>\n\
                            </select>\n\
                        </div>\n\
                    </div>\n\
                    <div class='modal-footer'>\n\
                        <button type='button' class='btn btn-default' data-dismiss='modal' @click='hitFechar()'>Fechar</button>\n\
                        <button type='button' class='btn btn-danger' @click='excluir()'>Excluir</button>\n\
                    </div>\n\
                </div>",
    created: function () {

    },
    methods: {
        excluir: function () {
            var self = this;
            console.log(self.motivo);
            $("#genericmodal").modal("hide");
        },
        hitFechar: function () {
            vmi.reset();
        }
    }

});

Vue.component("tabelaMotivos", {
    data: function () {
        return data;
    },
    props: {

    },
    template: "<div style='margin-top: 20px;'>\n\
                    <table class='table table-bordered'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th>Nome</th>\n\
                                <th>Ativo</th>\n\
                                <th>Ações</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr v-for='motivo in motivos'>\n\
                                <td>{{motivo.nome}}</td>\n\
                                <td>{{motivo.ativo}}</td>\n\
                                <td style='width: 100px;'>\n\
                                    <modal-button classe='info' titulo='Modificar Motivo' corpo='modifica-motivo' :mt='motivo'></modal-button>\n\
                                    <modal-button classe='del' titulo='Exclui Motivo' corpo='exclui-motivo' :mt='motivo'></modal-button>\n\
                                </td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    created: function () {
        var self = this;
        self.buscarMotivo();
    },
    methods: {
        buscarMotivo: function () {
            var self = this;
            var motivo = [
                {
                    nome: "Motivo1",
                    ativo: "Ativo"
                },
                {
                    nome: "Motivo2",
                    ativo: "Inativo"
                }
            ];
            self.motivos = motivo;
        }
    }
});