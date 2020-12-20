<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
   <jsp:include page="../../commonForPages/commonSettings.jsp"></jsp:include>
</head>

<body style="margin: 20px" >
<nav class="navbar navbar-light bg-light">
    <a class="navbar-brand" href="/templates/userMainPages/mainPageGuests.jsp">
        <img src="/images/lion.png" width="30" height="30" class="d-inline-block align-top" alt="" loading="lazy">
        SerialsHere Forum
    </a>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="/templates/userMainPages/mainPageGuests.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/templates/userMainPages/registrationPage.jsp">Registration</a>
                </li>
            </ul>
        </div>
    </nav>
</nav>

<div align="center" style="margin-top: 20px">
<form style="width: 400px" >
    <div class="form-group"  >
        <label for="exampleInputEmail1">Email address</label>
        <input  type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                required oninvalid="this.setCustomValidity('The field must be filled')">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="form-group form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1"
               required oninvalid="this.setCustomValidity('The field must be filled')">
        <label class="form-check-label" for="exampleCheck1">Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</div>
</body>

