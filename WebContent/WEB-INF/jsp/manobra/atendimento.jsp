<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<div class="container">  
    <div id="instance">        
        <manobra></manobra>
        <script src="${pageContext.request.contextPath}/resources/vue-components-manobra/loading.js"></script>
        <script src="${pageContext.request.contextPath}/resources/vue-components-manobra/manobra.js"></script>
    </div>
    <script src="${pageContext.request.contextPath}/resources/vue-components-manobra/instance-manobra.js"></script>
</div>