package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;
import com.login.dao.RegisterNewUsersDao;

/**
 * Servlet implementation class RegisterNewUsers
 */
@WebServlet("/RegisterNewUsers")
public class RegisterNewUsers extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			String firstname=request.getParameter("fname");
			String lastname=request.getParameter("lname");
			String racfId=request.getParameter("racfid");
			String password=request.getParameter("pass");
			String teamname=request.getParameter("team");
			System.out.println(firstname+ "first name is");
			RegisterNewUsersDao registerdao=new RegisterNewUsersDao();
			
			try {
				if(registerdao.insertData(firstname,lastname,racfId,password,teamname))
				{
					System.out.println("Entered into insert data block");
					response.sendRedirect("RegistrationSucess.jsp");
				}
				else {
					response.sendRedirect("Login.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			
			
		}
	}

}
