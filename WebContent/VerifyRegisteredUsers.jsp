<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    String firstname = request.getParameter("fname");    
    String lastname = request.getParameter("lname");
    String racfid = request.getParameter("racfid");
    String password = request.getParameter("pass");
    String teamname = request.getParameter("team");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agiledata",
            "root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into registrationdetails(firstName, lastName, racfId, password, teamName) values ('" + fname + "','" + lname + "','" + racfid + "','" + pass + "','" + team + "');
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='login.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("login.jsp");
    }
</body>
</html>