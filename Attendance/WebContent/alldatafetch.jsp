<%@taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
    </head>
<body>
    <h1>All Students Registered List!</h1>
    </div>
<table cellpadding="0" cellspacing="2" bordercolor="red" border="5">
<tr>    
<th align="center" height="30" width="250">
Name</th>
<th align="center" height="30" width="250">
Address</th>
<th align="center" height="30" width="250">
Email</th>
<th align="center" height="30" width="250">
Phone</th>
<th align="center" height="30" width="250">
Class</th>
<th align="center" height="30" width="250">
Section</th>
<th align="center" height="30" width="250">
Gender</th>
<th align="center" height="30" width="250">
Country</th>
<th align="center" height="30" width="250">
Checkbox</th>
</tr>
<s:iterator value="userlistlist" var="userlistS">
<tr>    
<td align="center" height="30" width="250">
<s:property value="name"/></td>
<td align="center" height="30" width="250">
<s:property value="address"/></td>
<td align="center" height="30" width="250">
<s:property value="email"/></td>
<td align="center" height="30" width="250">
<s:property value="phone"/></td>
<td align="center" height="30" width="250">
<s:property value="clss"/></td>
<td align="center" height="30" width="250">
<s:property value="section"/></td>
<td align="center" height="30" width="250">
<s:property value="gender"/></td>
<td align="center" height="30" width="250">
<s:property value="country"/></td>
<td align="center" height="30" width="250">
<a href="checkbox?name=<s:property value='name'/>">
<input type="checkbox"></a></td> 
</tr>
</s:iterator>
</table>
    <br>
    <br>
   <td>
    <input type="submit" value="SAVE">
</td>
<br/><br/>
<a href="fetch.jsp" style="font-size: 18px;">Back</a>
</center>
</body>
</html>
