<%-- 
    Document   : test
    Created on : May 25, 2020, 6:04:04 PM
    Author     : suchit chawda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/html and css/online.css">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel=" stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <style>
.container {
  position: relative;
  width: 100%;
  max-width: 800px;
}

.container img {
  width: 100%;
  height: auto;
  position: relative;
  left: 50%;
}

.container .btn {
  position: relative;
  top: 50%;
  left: 100%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  background-color: #fa8231;
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
    <img src="something-went-wrong.gif" alt="Snow" style="width:100%">
    <a href="index.jsp"><button class="btn" >Go To Home</button></a>
</div>

    </body>
</html>
