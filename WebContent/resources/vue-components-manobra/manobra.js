/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global datamanobra, Vue, Auth */

Vue.config.productionTip = false;

var url = "/ftManobra/";

Vue.component("manobra", {
    props: {

    },
    data: function() {
        return data;
    },
    template: "<div style='margin-top: 20px;'>\n\
                    <busca-cadastro></busca-cadastro>\n\
                    <hr/>\n\
                    <div v-if='loading' style='margin-top: 20px;'>\n\
                        <loading></loading>\n\
                    </div>\n\
                    <div v-else>\n\
                        <div v-if='tudo' style='margin-top: 20px;'>\n\
                            <div class='row'>\n\
                                <div class='col-md-3'>\n\
                                    <ul class='nav nav-pills nav-stacked'>\n\
                                        <li class='active'><a href='#info' data-toggle='tab'>Informações</a></li>\n\
                                        <li><a href='#valid' data-toggle='tab'>Validador Manobra</a></li>\n\
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
    create: function() {

    },
    methods: {

    }
});