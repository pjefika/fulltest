/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global Vue */

Vue.component("panelinformacoes", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <div class='row'>\n\
                        <div class='col-md-6'>\n\
                            <tabela-info-tbs v-bind:infoTbs='tudo'></tabela-info-tbs>\n\
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