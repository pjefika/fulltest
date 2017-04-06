/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var url = "/fulltestAPI/";

var data = {
    modal: {
        titulo: "",
        corpo: ""
    },
    lote: {
        id: null,
        status: null,
        observacao: null,
        matricula: null
    },
    countInfo: {
        ativo: 0,
        execucao: 0,
        concluido: 0,
        excluido: 0
    },
    tests: null,
    instancias: null,
    lotes: null,
    check: []
};

var vm = new Vue({
    el: "#instance",
    data: function () {
        return data;
    },
    methods: {
        reset: function () {
            var self = this;
            self.lote = {
                id: null,
                status: null,
                observacao: null,
                matricula: null
            };
            self.countInfo = {
                ativo: 0,
                execucao: 0,
                concluido: 0,
                excluido: 0
            };
            self.tests = null;
            self.instancias = null;
            self.check = [];
        },
        getLotes: function () {
            var self = this;
            $.get(url + "lote/ativos", function (data) {
                self.lotes = data.list;
                self.lotes = _.orderBy(self.lotes, ['dataCriacao'], ['asc']);
            });
        }
    }
});

