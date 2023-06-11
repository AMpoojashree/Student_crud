<%@page import="mvc.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%--expression tag will work only when we write iselignored=false --%>
     <%--Jstl java server page tag can be used instead of using expression tags etc it will reduce the time --%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>

<%-- 
<%List<Student> list=(List<Student>)request.getAttribute("list"); %>
     <table border="1">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Gender</th>
    <th>DOB</th>
    <th>Age</th>
    <th>Delete</th>
     <th>Edit</th>
    </tr>

   <%for(Student student:list){ %>
<tr>
<th><%= student.getId() %></th>
<th><%= student.getName() %></th>
<th><%= student.getEmail() %></th>
<th><%= student.getMobile() %></th>
<th><%= student.getGender() %></th>
<th><%= student.getDob() %></th>
<th><%= student.getAge() %></th>
<th> <a href="delete?id=<%= student.getId() %>"><button>Delete</button> </a></th>
<th><a href="Edit.jsp?id=<%= student.getId()%>"><button>Edit</button></a></th>
</tr>
<%} %>

</table>
<br>
<a href="Home.jsp"><button>Home</button></a>

--%>
<h1 style="color: red">${success}</h1>
 <table border="1">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Gender</th>
    <th>DOB</th>
    <th>Age</th>
    <th>Delete</th>
     <th>Edit</th>
    </tr>
    
    <c:forEach var="s" items="${list }">
<%-- ${list} used to get value from front end--%>
<tr>
<th>${s.getId()}</th>
<th>${s.getName()}</th>
<th>${s.getEmail()}</th>
<th>${s.getMobile()}</th>
<th>${s.getGender()}</th>
<th>${s.getDob()}</th>
<th>${s.getAge()}</th>
 <th><a href="delete?id=${s.getId()}"> <button>Delete</button></a></th>
 <th><a href="edit?id=${s.getId()}"> <button>Edit</button></a></th>
     

   </c:forEach>
   </table>
</body>
</html>