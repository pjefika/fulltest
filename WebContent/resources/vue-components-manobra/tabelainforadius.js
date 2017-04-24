/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* global Vue */

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