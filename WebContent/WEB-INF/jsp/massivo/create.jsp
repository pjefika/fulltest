<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<div class="container"> 

    <div id="instance">

        <script src="${pageContext.request.contextPath}/resources/vue-viewmodel/lote.js"></script>

        <massivo></massivo>

        <script src="${pageContext.request.contextPath}/resources/vue-components/loading.js"></script>
        <script src="${pageContext.request.contextPath}/resources/vue-components/modal.js"></script>
        <script src="${pageContext.request.contextPath}/resources/vue-components/modalbutton.js"></script>
        <script src="${pageContext.request.contextPath}/resources/vue-components/massivo.js"></script>

    </div>

    <script src="${pageContext.request.contextPath}/resources/vue-components/instance.js"></script>  

</div>