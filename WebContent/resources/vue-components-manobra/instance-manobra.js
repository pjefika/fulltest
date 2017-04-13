/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var data = {
    loading: null,
    searchbuttondisable: false,
    motivos: null,
    ins: {
        instancia: "4131543457"
    },
    tudo: null,
    modal: {
        titulo: "",
        corpo: ""
    },
    notifica: {
        menssagem: null,
        typenotify: null
    },
    emconsulta: null
    
};

var vmi = new Vue({
    el: "#instance",
    data: function () {
        return data;
    },
    created: function () {

    },
    methods: {
        
    },
    watch: {
        notifica: function () {
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

//vmi.$on("notifythismsg", function (o) {
//    this.notifica = {
//        menssagem: o.msg,
//        typenotify: o.type
//    };
//});
