 
 <hea>
     <h1>Up Date Information</h1>
 
 <table cellpadding="0" cellspacing="10" bordercolor="red" border="5">
<tr><td align="center" height="30" width="250">
<s:form action="update">
<s:iterator value="userlistlist" 
var="userlist">

<s:textfield name="name" label="Name"/>
<s:textfield name="address" label="Address"/>
<s:textfield name="email" label="Email"/>
<s:textfield name="phone" label="Phone"/>
<s:textfield name="clss" label="Class"/>
<s:textfield name="section" label="Section"/>
<s:textfield name="gender" label="Gender"/>
<s:textfield name="country" label="Country"/>
</s:iterator>
<s:submit value="Insert Data"/>
</s:form>
<br/><br/><br/>
<a href="nameUpdate.jsp">Back</a>
 