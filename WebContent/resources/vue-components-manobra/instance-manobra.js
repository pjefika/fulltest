/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var data = {
    loading: null,
    loadingvalida: null,
    searchbuttondisable: false,
    validbuttondisable: false,
    motivos: null,
    ordemdeserivo: null,
    listavalidacao: null,
    veatendente: null,
    ins: {
        instancia: null
    },
    tudo: null,
    infosvalida: null,
    modal: {
        titulo: "",
        corpo: ""
    },
    notifica: {
        menssagem: null,
        typenotify: null
    },
    emconsulta: null,
    motivochoose: ''
};

var vmi = new Vue({
    el: "#instance",
    data: function() {
        return data;
    },
    created: function() {

    },
    methods: {

    },
    watch: {
        notifica: function() {
            var self = this;
            $.notify({
                message: self.notifica.menssagem
            }, {
                type: self.notifica.typenotify,
                allow_dismiss: true,
                placement: {
                    from: "top",
                    align: "right"
                }
            });
        }
    }
});
