<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>
<jsp:include page="/commonForPages/footerGuests.jsp"></jsp:include>

<div style="margin-left: 20px">
    <form method="POST">


        <select name="name[]">
            <option disabled selected>Genre</option>
            <option value="Detective">Detective</option>
            <option value="Drama">Drama</option>
            <option value="Family">Family</option>
            <option value="Sitcom">Sitcom</option>
            <option value="Fantasy">Fantasy</option>
        </select>
        <input type="submit" value="Search">


    </form>
</div>


</body>

