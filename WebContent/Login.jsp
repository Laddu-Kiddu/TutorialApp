<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/CSS/Login.css" />
</head>
<body>
  <div class="login">
    <h1>Login</h1>
   <form action="Login" method="post">
   <p><input type="text" name="racfid" value="" placeholder="racfid" required="required"></p>
   <p><input type="text" name="team" value="" placeholder="TeamName" required="required"></p>
   <p><input type="password" name="pass" value="" placeholder="Password" required="required"></p>
     
   <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
      <a href="Registration.jsp">No Account? Create one</a>
   </form>
   </div>    
</body>
</html>
