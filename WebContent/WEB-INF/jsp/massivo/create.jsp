<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="container">

    <div class="page-header">
        <h1>Teste Massivo</h1>
    </div>

    <div id="massivo">

        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#adcLote" data-backdrop="static">Cadastrar Lote</button>
        <br/>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Status</th>
                    <th>Data Criação</th>
                    <th>Matricula</th>
                    <th>Observação</th>
                    <th>Ações</th>
                </tr>                
            </thead>            
            <tbody>
                <tr v-for="lote in lotes" :key="lote.id">
                    <td>{{lote.id}}</td>
                    <td>{{lote.status}}</td>
                    <td>{{dateFormat(lote.dataCriacao)}}</td>
                    <td>{{lote.matricula}}</td>
                    <td>{{lote.observacao}}</td>
                    <td>
                        <button type="button" class="btn btn-info glyphicon glyphicon-edit btn-sm" data-toggle="modal" data-target="#editLote" data-backdrop="static"></button>
                        <button type="button" class="btn btn-danger glyphicon glyphicon-trash btn-sm" data-toggle="modal" data-target="#delLote" data-backdrop="static" @click="fetchLoteDel(lote)"></button>
                    </td>
                </tr>                
            </tbody>
        </table>


        <!-- Modal -->
        <div class="modal fade" id="adcLote" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Cadastrar Lote</h4>
                    </div>
                    <div class="modal-body">                        
                        <div class="form-group">                            
                            <label>Observação:</label>
                            <textarea class="form-control" rows="3" style="resize: none;" v-model="adcLote.observacao"></textarea>
                        </div>

                        <hr>

                        <div class="form-group">
                            <label>Delimitadores:</label>
                            <div class="radio">
                                <label>
                                    <input type="radio" value=";" name="delimit" v-model="delimiter" />Ponto e Virgula (;)
                                </label>
                                <label>
                                    <input type="radio" value="," name="delimit" v-model="delimiter" />Virgula (,)
                                </label>
                            </div>
                        </div>
                        <div class="form-group">            
                            <label>Instâncias:</label>
                            <textarea class="form-control" rows="3" style="resize: none;" v-model="instancias"></textarea>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                        <button type="button" class="btn btn-primary" @click="createLote()">Cadastrar</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="delLote" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="myModalLabel">Excluir Lote</h4>
                    </div>
                    <div class="modal-body">
                        Deseja realmete excluir o Lote {{delLote.id}}
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal" @click="reset()">Não</button>
                        <button type="button" class="btn btn-primary" @click="deleLote()">Sim</button>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <script src="${pageContext.request.contextPath}/resources/vue-components/testMassivo.js"></script>
</div>