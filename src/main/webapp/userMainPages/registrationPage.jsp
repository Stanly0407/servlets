<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
   <jsp:include page="/commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body>

<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="#">
        <img src="/images/lion.png" width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
        SerialsHere Forum
    </a>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/userMainPages/loginPage.jsp">Log in</a>
                </li>
            </ul>
        </div>
    </nav>
</nav>

<form style="margin-left: 500px; margin-top: 15px; margin-right: 500px ">
    <div class="form-group" class="shadow p-3 mb-5 bg-white rounded">
        <label for="formGroupExampleInput">Email</label>
        <input type="email" class="form-control" id="formGroupExampleInput" placeholder="sevsnape123@gmail.com">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Firstname</label>
        <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Severus">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Lastname</label>
        <input type="text" class="form-control" id="formGroupExampleInput3" placeholder="Snape">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Username</label>
        <input type="text" class="form-control" id="formGroupExampleInput4" placeholder="Wizard123">
    </div>
    <div class="form-group">
        <label for="formGroupExampleInput2">Age</label>
        <input type="date" class="form-control" id="formGroupExampleInput5">
    </div>
    <button type="submit" class="btn btn-primary">Send</button>
</form>

</body>
