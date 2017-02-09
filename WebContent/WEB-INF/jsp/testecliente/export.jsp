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

                    <c:choose>
                        <c:when test="${not empty instancia.valid.implementacao}">
                            <td>${instancia.valid.implementacao}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>



                    <c:choose>
                        <c:when test="${not empty instancia.valid.consulta}">
                            <td>${instancia.valid.consulta}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${not empty instancia.valid.cadastro}">
                            <td>${instancia.valid.cadastro}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${not empty instancia.valid.semAlarme}">
                            <td>${instancia.valid.semAlarme}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${not empty instancia.valid.parametros}">
                            <td>${instancia.valid.parametros}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${not empty instancia.valid.admState}">
                            <td>${instancia.valid.admState}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                    <c:choose>
                        <c:when test="${not empty instancia.valid.vlanBanda}">
                            <td>${instancia.valid.vlanBanda}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.vlanVoip}">
                            <td>${instancia.valid.vlanVoip}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.vlanVod}">
                            <td>${instancia.valid.vlanVod}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.vlanMulticast}">
                            <td>${instancia.valid.vlanMulticast}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.profile}">
                            <td>${instancia.valid.profile}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.potOnt}">
                            <td>${instancia.valid.potOnt}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.potOlt}">
                            <td>${instancia.valid.potOlt}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>


                    <c:choose>
                        <c:when test="${not empty instancia.valid.listaAlarmes}">
                            <td>${instancia.valid.listaAlarmes}</td>
                        </c:when>
                        <c:otherwise>
                            <td></td>
                        </c:otherwise>
                    </c:choose>

                </c:if>
            </tr>
        </c:forEach>
    </tbody>
</table>