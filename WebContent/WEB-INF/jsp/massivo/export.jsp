<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        </tr>
    </thead>
    <tbody>        
        <c:forEach items="${lotes}" var="lote">            
            <tr>
                <td>${lote.id}</td>
                <td>${lote.status}</td>
                <td>${lote.instancia}</td>
                <td>${lote.lote.id}</td>
            </tr>            
        </c:forEach>
    </tbody>
</table>