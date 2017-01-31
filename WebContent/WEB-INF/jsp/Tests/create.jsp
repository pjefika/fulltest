<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator"%>

<div class="container">

    <div class="page-header">
        <h1>Teste Massivo</h1>
    </div>

    <div id="massivo">

        <div class="form-group">
            <label>Delimitadores:</label>
            <div class="radio">
                <label>
                    <input type="radio" value=";" name="delimit" checked />Ponto e Virgula (;)
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" value="," name="delimit" />Virgula (,)
                </label>
            </div>
        </div>
        
        <div class="form-group">            
            <label>Instâncias:</label>
            <textarea class="form-control" rows="3" style="resize: none;"></textarea>
        </div>

    </div>
    
    <script src="${pageContext.request.contextPath}/resources/vue-components/testMassivo.js"></script>

</div>