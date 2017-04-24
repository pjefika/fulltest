/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global Vue */

Vue.component("listlogvalid", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <label>Já houve validação de porta para este cliente hoje</label>\n\
                    <table class='table table-bordered small'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th>Motivo</th>\n\
                                <th>Mensagem</th>\n\
                                <th>Resultado</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr v-for='list in listavalidacao'>\n\
                                <td>{{list.motivo}}</td>\n\
                                <td>{{list.mensagem}}</td>\n\
                                <td>\n\
                                    <span class='glyphicon glyphicon-ok' style='color: green;' v-if='list.resultado'></span>\n\
                                    <span class='glyphicon glyphicon-remove' style='color: red;' v-else></span>\n\
                                </td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});