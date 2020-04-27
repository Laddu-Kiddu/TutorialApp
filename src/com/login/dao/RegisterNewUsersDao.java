package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterNewUsersDao {
	
	String url="jdbc:mysql://localhost:3306/agiledata";
	String username="root";
	String pass="root";
	String sql="insert into registrationdetails(firstName, lastName, racfId, password, teamName) values (?,?,?,?,?)";
  public boolean insertData(String firstname,String lastname, String racfId, String password, String teamname) throws Exception
  {
	  try 
	  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pass);
		PreparedStatement st=con.prepareStatement(sql);
		System.out.println("entered into dao");
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, racfId);
		st.setString(4, password);
		st.setString(5, teamname);
		
//		int i=stmt.executeUpdate();  
		  
		// execute the preparedstatement
		int i=st.executeUpdate();
		System.out.println(i+" records inserted"); 
	      con.close();
	      System.out.println("Connection closed");
		/*int rs=st.executeUpdate();
		if()
		{
			return true;
		}*/
	  } 
	  catch (ClassNotFoundException e) 
	  {
		e.printStackTrace();
	  }
	return true;
	
	  
//	  return false;
  }

}
