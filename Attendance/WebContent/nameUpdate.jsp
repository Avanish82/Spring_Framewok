 

<%@taglib uri="/struts-tags" prefix="s"%>
<s:actionerror/>
<head>
    
</head>
<body>
     
<h1>Name Wish Search & Update Information!</h1>
   
<table cellpadding="0" cellspacing="10" bordercolor="red" border="5">
<tr><td align="center" height="30" width="250">
<s:form action="fetch">
<s:textfield name="name" label="Name"/>
<s:submit value="Submit"/>
</s:form>
<br/><br/><br/>
<a href="index.jsp">Back</a>
