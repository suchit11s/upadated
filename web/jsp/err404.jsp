<%-- 
    Document   : err404
    Created on : May 26, 2020, 5:24:32 PM
    Author     : suchit chawda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
.container {
  position: relative;
  width: 100%;
  max-width: 650px;
}

.container img {
  width: 100%;
  height: auto;
  position: relative;
  left: 50%;
}

.container .btn {
  position: relative;
  top: 52%;
  left: 100%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  background-color: #1dd1a1;
  color: white;
  font-size: 16px;
  padding: 16px 30px;
  border: none;
  cursor: pointer;
  border-radius: 5px;
  text-align: center;
}

.container .btn:hover {
  background-color: #38ada9;
  color: white;
}
</style>



<div class="container">
    <img src="DancingChip.gif" alt="Snow" style="width:100%">
</div>
   <h1 style="padding: 1%;left: 31%;position: relative;">!!! Page Not Found 404 !!!</h1>
   <div class="container">
    
       <a href="index.jsp"><button class="btn" >Go To Home</button></a>
</div>
    </body>
</html>
