<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/29/2020
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>discount</h1>
<form action="/discount" method="post">
    <label>Product Description</label> <br>
    <input type="text" name="description" placeholder="enter description "><br>
    <label>list Price</label> <br>
    <input type="text" name="price" placeholder="enter price "><br>
    <label>discount</label> <br>
    <input type="text" name="discount percent" placeholder="enter discount ">

    <input type="submit" value="cast">
</form>
</body>
</html>
