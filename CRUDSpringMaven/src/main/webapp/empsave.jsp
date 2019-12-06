<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<form action="./empsave.ds">
<pre>
Name:        <input type="text" name="name">
Email:         <input type="text" name="email">
Age:           <input type="text" name="age">
Address:    <textarea rows="5" cols="15" name="address"></textarea>
                  <input type="submit" value="Save"/>
</pre>
</form>
</body>
</html>