/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var data = {
    loading: null,
    motivos: null,
    modal: {
        titulo: "",
        corpo: ""
    },
    motivo: {
        nome: null,
        ativo: null
    }
};

var vmi = new Vue({
    el: "#instance",
    data: function () {
        return data;
    },
    created: function () {

    },
    methods: {        
        reset: function () {
            var self = this;
            self.motivo = {
                nome: null,
                ativo: null
            };
        }
    }
});