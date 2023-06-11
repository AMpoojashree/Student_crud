<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Data</title>
</head>
<body>
<form action="save" method="post">
Name:<input type="text" name="name"><br><br>

Email:<input type="email" name="email"><br><br>

Password:<input type="password" name="password"><br><br>

Mobile:<input type="number" name="mobile" pattern="[0-9]{10}" ><br><br>

Gender:<input type="radio" name="gender" value="male" > Male
<input type="radio" name="gender" value="female"> Female<br><br>

DOB:<input type="date" name="date"><br><br>

<button>Save</button> <button type="reset">Cancel</button>
</form>
<a href="Home.jsp"><button>Home</button></a>

</body>
</html>