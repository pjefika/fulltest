/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var loteURL = "/fulltestAPI/lote/massivo/";
var instanciaURL = "/fulltestAPI/instancia/massivo/";
new Vue({
    el: "#massivo",
    data: {
        lotes: null,
        adcLote: {
            id: null,
            status: null,
            observacao: "Teste",
            matricula: null
        },
        delLote: {
            id: null,
            status: null,
            observacao: null,
            matricula: null
        },
        instancias: "123;213;231;312;321",
        delimiter: ";"
    },
    created: function () {
        var self = this;
        self.getLotes();
    },
    methods: {
        dateFormat: function (h) {
            return moment(h).format('DD/MM/YYYY');
        },
        //LIST
        getLotes: function () {
            var self = this;
            $.get(loteURL + "ativos", function (data) {
                self.lotes = data.list;
                self.lotes = _.orderBy(self.lotes, ['dataCriacao'], ['asc'])
            });
        },
        //ADC
        createLote: function () {
            var self = this;
            $.ajax({
                type: "POST",
                url: loteURL + "cadastrar",
                data: JSON.stringify(self.adcLote),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function (data) {
                    self.fetchLotes();
                    self.createListaLinhas(data.lote);
                }
            });
        },
        createListaLinhas: function (h) {
            var self = this;
            var listI = self.instancias.split(self.delimiter);
            var lt = h;
            lt.tests = [];
            for (var i = 0; i < listI.length; i++) {
                lt.tests.push({id: null, status: null, instancia: listI[i], lote: {id: h.id}});
            }
            $.ajax({
                type: "POST",
                url: loteURL + "modificar",
                data: JSON.stringify(lt),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function () {
                    self.reset();
                    $("#adcLote").modal("hide");
                }
            });
            //console.log(lt);
        },
        //Exclui
        deleLote: function () {
            var self = this;
            $.ajax({
                type: "POST",
                url: loteURL + "excluir",
                data: JSON.stringify(self.delLote),
                dataType: "json",
                beforeSend: function (xhr) {
                    xhr.setRequestHeader("Content-Type", "application/json");
                },
                success: function () {
                    self.reset();
                    self.getLotes();
                    $("#delLote").modal("hide");
                }
            });
        },
        fetchLotes: function () {
            var self = this;
            setTimeout(function () {
                self.getLotes();
            }, 600);
        },
        fetchLoteDel: function (h) {
            var self = this;
            self.delLote = h;
        },
        //Reset Objects
        reset: function () {
            var self = this;
            self.adcLote = {
                id: null,
                status: null,
                observacao: null,
                matricula: null
            };
            delLote = {
                id: null,
                status: null,
                observacao: null,
                matricula: null
            };
            instancias: null;
            delimiter: null;
        }

    }

});