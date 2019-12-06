<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
    
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
            <h1>Students Registration Form</h1><br>
        </div>
    </div>
        
        <table cellpadding="0" cellspacing="10" bordercolor="red" border="5">
<tr><td align="center" height="30" width="250">
    <form action="insert" method="post">
        <table>
    
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <input type="text" name="name">          
                </td>
            </tr>
            <tr>
            <td>
                Address:
            </td>
            <td>
                <input type="text" name="address">
            </td>
            </tr>
             <tr>
            <td>
                Email_Id:
            </td>
            <td>
                <input type="text" name="email">
            </td>
            </tr>
            <tr>
                <td>
                   Phone:
                </td>
                <td>
                    <input type="text" name="phone">
                </td>
            </tr>
            <tr>
                <td>
                    Class:               
                </td>
                <td>
                    <select name="clss">
                        <option>...</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                    </select>
                </td>           
            </tr>
            <tr>
                <td>
                    Section:
                </td>
                <td>
                    <select name="section">
                        <option>...</option>
                        <option>A</option>
                        <option>B</option>
                        <option>C</option>
                        <option>D</option>
                        <option>E</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    Gender:
                </td>
                <td>
                    <select name="gender">
                        <option>...</option>
                        <option>male </option>
                        <option>female</option>
                         
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    Country:
                </td>
                <td>
                    <select name="country">
                        <option>...</option>
                        <option>India</option>
                        <option>Nepal</option>
                        <option>Bangladesh</option>
                        <option>japan</option>
                        <option>Canada</option>
                    </select>
                </td>
            </tr>
             
            </tr>
            <tr>
                <td><br>
                          <input type="submit" value="Save">
                </td>
                <td><br>
                           <input type="reset" value="reset">
                </td>
                <td><br>
                    <a href="index.jsp" style="font-size: 18px;">Back</a> 
                 
                </td>
            </tr><br>
            
        </table>
    </form>
</body>
</html>        
</form>
</body>
</html>
