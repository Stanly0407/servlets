<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--&lt;%&ndash;<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>&ndash;%&gt;--%>
<%--<param name="FlashVars" value="${fn:escapeXml(flashVars)}" />--%>
<%@ page contentType="text/html;charset=utf-8" %>

<html>
<head>
<%--    <style><%@include file="/WEB-INF/css/style.css"%></style>--%>
    <title>Сериалы тут!</title>
<%--    <link rel="shortcut icon"  type="ico/png" href="../images/favicon.ico">--%>
</head>
<body>
<p style="text-align: right">
<%--    <button><a href="registration"> Регистрация </a></button>--%>
<%--    <button> <a href="authentication_button"> Вход </a>  </button>  </p>--%>
</p>
</body>



<p style="text-align: right">
    <input name="s" placeholder="Искать здесь..." type="search" >
    <button type="submit"><img src="../WEB-INF/images/loupe.png"
                               style="vertical-align: middle"></button>


<p style="horiz-align: center">
<%--    <img src="<spring:url value="../images/lion.png"/>">--%>



<body style="background-color: cadetblue; text-align: center">
<h1>СЕРИАЛЫ ТУТ!</h1>
</body>


<body>
<p style="text-align: center">
    <button>ТОП сериалов!
        <img src="../WEB-INF/images/fire.png"
             style="vertical-align: middle"></button>
    <button>ТОП обсуждений!
        <img src="../WEB-INF/images/fire.png"
             style="vertical-align: middle"></button></p>
</body>

</html>
