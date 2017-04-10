/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global Vue, Lote, vmi */

Vue.component("modalButton", {
    props: {
        classe: {
            type: String,
            default: ''
        },
        nomebutton: {
            type: String,
            default: ''
        },
        titulo: {
            type: String,
            required: true,
            default: function () {
                return "Ação";
            }
        },
        corpo: {
            type: String,
            required: true
        },
        mt: null
    },
    template: "<button type='button' :class='classebutton' @click='hitthatbutton()'>{{nomebutton}}</button>",
    created: function () {

    },
    computed: {
        classebutton: function () {
            var self = this;
            if (self.classe === "defaultp") {
                return "btn btn-primary";
            } else if (self.classe === "info") {
                return "btn btn-info glyphicon glyphicon-zoom-in btn-sm";
            } else if (self.classe === "del") {
                return "btn btn-danger glyphicon glyphicon-trash btn-sm";
            }
        }
    },
    methods: {
        hitthatbutton: function () {
            var self = this;
            vmi.modal = {
                titulo: "",
                corpo: ""
            };
            Vue.nextTick(function () {
                if (self.mt) {
                    vmi.motivo = self.mt;
                }
                vmi.modal = {
                    titulo: self.titulo,
                    corpo: self.corpo
                };
                $("#genericmodal").modal({
                    backdrop: 'static'
                });
            });
        }
    }
});