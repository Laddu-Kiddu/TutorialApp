package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	String url="jdbc:mysql://localhost:3306/agiledata";
	String username="root";
	String pass="root";
	String sql="select * from registrationdetails where racfId=? and teamName=? and password=?";
  public boolean check(String racfId,String teamName,String password) throws Exception
  {
	  try 
	  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pass);
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, racfId);
		st.setString(2, teamName);
		st.setString(3, password);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			return true;
		}
	  } 
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	  }
	  
	  return false;
  }
}
