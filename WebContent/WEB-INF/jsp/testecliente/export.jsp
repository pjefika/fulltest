<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>
<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "inline; filename=" + "excel.xls");
%>
<table border="1">
    <thead>
        <tr>
            <th>id</th>
            <th>status</th>
            <th>instancia</th>
            <th>id lote</th>
            <th>status lote</th>
            <th>observacao lote</th>
            <th>dataCriacao lote</th>
            <th>matricula lote</th>
            <th>implementacao</th>
            <th>consulta</th>
            <th>cadastro</th>
            <th>semAlarme</th>
            <th>parametros</th>
            <th>admState</th>
            <th>vlanBanda</th>
            <th>vlanVoip</th>
            <th>vlanVod</th>
            <th>vlanMulticast</th>
            <th>profile</th>
            <th>potOnt</th>
            <th>potOlt</th>
            <th>listaAlarmes</th>
        </tr>
    </thead>
    <tbody>
        <tr v-for="lista in listaMassivo" :key="lista.id">
            <td>{{lista.status}}</td>
            <td>{{lista.instancia}}</td>
            <td>{{lista.lote.id}}</td>
            <td>{{lista.lote.status}}</td>
            <td>{{lista.lote.observacao}}</td>
            <td>{{lista.lote.dataCriacao}}</td>
            <td>{{lista.lote.matricula}}</td>
            <td>{{lista.valid.implementacao}}</td>
            <td>{{lista.valid.consulta}}</td>
            <td>{{lista.valid.cadastro}}</td>
            <td>{{lista.valid.semAlarme}}</td>
            <td>{{lista.valid.parametros}}</td>
            <td>{{lista.valid.admState}}</td>
            <td>{{lista.valid.vlanBanda}}</td>
            <td>{{lista.valid.vlanVoip}}</td>
            <td>{{lista.valid.vlanVod}}</td>
            <td>{{lista.valid.vlanMulticast}}</td>
            <td>{{lista.valid.profile}}</td>
            <td>{{lista.valid.potOnt}}</td>
            <td>{{lista.valid.potOlt}}</td>
            <td>{{lista.valid.listaAlarmes}}</td>
        </tr>
    </tbody>
</table>