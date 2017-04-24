/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global Vue */

Vue.component("tabelaInfoTbs", {
    props: {
        infoTbs: {
            type: Object,
            required: true
        }
    },
    data: function () {
        return data;
    },
    template: "<div>\n\
                    <table class='table table-bordered small'>\n\
                        <thead>\n\
                            <tr>\n\
                                <th colspan='2' style='text-align: center;'> Informações TBS</th>\n\
                            </tr>\n\
                        </thead>\n\
                        <tbody>\n\
                            <tr>\n\
                                <td>brasName</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.brasName}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>cvlan</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.cvlan}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>dslamModel</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.dslamModel}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>dslamVendor</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.dslamVendor}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>ipGerenciaBRAS</td>\n\
                                <td>{{infoTbs.cadastro.infoCricket.ipGerenciaBRAS}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>ipDslam</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.ipDslam}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portAddrSeq</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.portAddrSeq}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portAddrSequence</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.portAddrSequence}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>portNumber</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.portNumber}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>rin</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.rin}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>shelf</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.shelf}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>slot</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.slot}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>status</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.status}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanMcast</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.vlanMcast}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanVoD</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.vlanVoD}}</td>\n\
                            </tr>\n\
                            <tr>\n\
                                <td>vlanVoIP</td>\n\
                                <td>{{infoTbs.cadastro.infoTBS.vlanVoIP}}</td>\n\
                            </tr>\n\
                        </tbody>\n\
                    </table>\n\
                </div>",
    create: function () {

    },
    methods: {

    }
});
