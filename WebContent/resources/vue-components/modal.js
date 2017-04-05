/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global Vue, vm */

Vue.component("mgeneric", {
    props: {

    },
    data: function () {
        return data;
    },
    template: "<div class='modal fade' id='genericmodal' tabindex='-1' role='dialog' aria-labelledby='myModalLabel'>\n\
                    <div class='modal-dialog' role='document'>\n\
                      <div class='modal-content'>\n\
                            <div class='modal-header'>\n\
                                <button type='button' class='close' data-dismiss='modal' aria-label='Close' @click='hitfechar()'><span aria-hidden='true'>&times;</span></button>\n\
                                <h4 class='modal-title' v-text='modal.titulo'></h4>\n\
                            </div>\n\
                            <component :is='modal.corpo'></component>\n\
                        </div>\n\
                    </div>\n\
                </div>",
    created: function () {

    },
    methods: {
        hitfechar: function () {
            vm.reset();
        }
    }
});