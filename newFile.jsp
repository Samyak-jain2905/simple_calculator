<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calculator</title>
<style>
img{
height:60%;
width:40%;
}
body{
text-align:center;
background:linear-gradient(to right,#2b40ff,#07121a);
}
h1,h3{
color: white;
margin:15px;
}
input, button {
  font-size:25px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

img{
width: 40%;
height:30%;
margin-top: 20px;
}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}
</style>


</head>
<body>
<form>
<H1>joke of day  </H1>
<h1>joke=<%=request.getParameter("joke")%></h1>
</form>
<img src= "helloimage.jpeg"/>


<form action="myservletpro"> 




</form>
<form>
<h1>Ans=<%=request.getParameter("ans")%></h1>

</form>
</html>