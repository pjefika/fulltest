<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>
<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-Disposition", "inline; filename=" + "excel.xls");
%>
<table>
    <thead>
        <tr>
            <td>ID</td>
            <td>Status</td>
            <td>Instância</td>
            <td>Lote</td>            
            <td>Implementacao</td>
            <td>Consulta</td>
            <td>Cadastro</td>
            <td>SemAlarme</td>
            <td>Parametros</td>
            <td>AdmState</td>
            <td>VlanBanda</td>
            <td>VlanVoip</td>
            <td>VlanVod</td>
            <td>VlanMulticast</td>
            <td>Profile</td>
            <td>PotOnt</td>
            <td>PotOlt</td>
            <td>ListaAlarmes</td>

        </tr>
    </thead>
    <tbody>        
        <c:forEach items="${instancias}" var="instancia">            
            <tr>
                <td>${instancia.id}</td>
                <td>${instancia.status.nome}</td>
                <td>${instancia.instancia}</td>
                <td>${instancia.lote.id}</td>
                <c:if test="${not empty instancia.valid}">
                    <td>${instancia.valid.implementacao}</td>
                    <td>${instancia.valid.consulta}</td>
                    <td>${instancia.valid.cadastro}</td>
                    <td>${instancia.valid.semAlarme}</td>
                    <td>${instancia.valid.parametros}</td>
                    <td>${instancia.valid.admState}</td>
                    <td>${instancia.valid.vlanBanda}</td>
                    <td>${instancia.valid.vlanVoip}</td>
                    <td>${instancia.valid.vlanVod}</td>
                    <td>${instancia.valid.vlanMulticast}</td>
                    <td>${instancia.valid.profile}</td>
                    <td>${instancia.valid.potOnt}</td>
                    <td>${instancia.valid.potOlt}</td>
                    <td>${instancia.valid.listaAlarmes}</td>
                </c:if>
            </tr>            
        </c:forEach>
    </tbody>
</table>