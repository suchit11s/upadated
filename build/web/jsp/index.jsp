<%-- 
    Document   : online
    Created on : 5 Jan, 2020, 3:51:52 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="signup.css">
        <link rel="stylesheet" href="online.css">
         <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel=" stylesheet">
      <link rel=" stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap.css">
        <script src="jquery.js"></script>
        <script src="popper.js"></script>
        <script src="bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home page</title>
    </head>
    <body>
             <nav class="navbar navbar-expand-sm navbar-light s2 fixed-top">
     <a style="color: #7f8c8d;padding-left: 5%;" class="navbar-brand" href=""><b>HungerSaver</b></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
   <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <ul  class="navbar-nav ml-auto">
            <li class="nav-item">
                <a style="color:#7f8c8d;" class="nav-link" href="/html and css/signin.html"><b>Sign In</b></a>
            </li>
            <li class="nav-item">
                <a style="color:#7f8c8d;" class="nav-link" href="/html and css/signup.html"><b>Create an account</b></a>
            </li>
          </ul>
        </div>
      
    </nav>
        
        <div id="d" class="carousel slide" data-ride="carousel">
            <ul class="carousel-indicators">
                <li data-target="#d" data-slide-to="0" class="active"></li>
                <li data-target="#d" data-slide-to="1"></li>
                <li data-target="#d" data-slide-to="2"></li>
                <li data-target="#d" data-slide-to="3"></li>
                <li data-target="#d" data-slide-to="4"></li>
                <li data-target="#d" data-slide-to="5"></li>
                <li data-target="#d" data-slide-to="6"></li>
                <li data-target="#d" data-slide-to="7"></li>
                 
                </ul>
                    <div class="carousel-inner">
    <div class="carousel-item active">
                    <img src="/images/re3.jpg" alt="first" >
                </div>
                <div class="carousel-item">
                    <img src="/images/indian.jpg" alt="second" width="1920" height="481" >
                </div>
                <div class="carousel-item">
                    <img src="/images/pizza.jpg" alt="third" width="1920" height="481">
                </div>
                <div class="carousel-item">
                    <img src="/images/re4.jpg "alt="fourth" >
                </div>
                <div class="carousel-item">
                    <img src="/images/re5.jpg" alt="5" >
                </div>
                <div class="carousel-item">
                    <img src="/images/re6.jpg" alt="6">
                </div>
                <div class="carousel-item">
                    <img src="/images/re7.jpg" alt="7" >
                </div>
               
                <div class="carousel-item">
                    <img src="/images/re9.jpg" alt="9">
                </div>
               </div>
           <a class="carousel-control-prev" href="#d" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#d" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
            </div>
        <%@include file="footer1.jsp"  %>
</body>
</html>
