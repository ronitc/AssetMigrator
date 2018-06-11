package com.symantec.eloqua.assetMigrator.Email;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;

/**
 * Servlet implementation class ChkDbEmail
 */
@WebServlet("/ChkDbEmail")
public class ChkDbEmail extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChkDbEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
			
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("In Check DB Servlet ");
		HttpSession session =request.getSession(true);
		BulkAndRestClient restclient=(BulkAndRestClient)session.getAttribute("restClient");		
		
		
		BulkAndRestClient DrestClient=(BulkAndRestClient)session.getAttribute("DrestClient");
		Email email=(Email)session.getAttribute("email");
		
		
		//
		
		String data= "",line;
			
		
		request.setCharacterEncoding("UTF-8");
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
		while ((line = br.readLine()) != null) {
		data += line;
		}
		session.setAttribute("data", data);
		System.out.println("input id is in check DB "+data);
		
		
		
		  int count = 0;
		 String res = "";
		try
		 {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua","root","root");
			
			
			String query= "SELECT count(*) from  source_email WHERE srcId = ? ";
			
			
			
			java.sql.PreparedStatement ps=conn.prepareStatement(query);
			
			//ps.setString(1,email.getId());
			ps.setString(1, data);
			
			
				
			ResultSet rs=ps.executeQuery();
			
			System.out.println("Result Set "+ rs);
			
			if(rs.next()) 
			{
			     count = rs.getInt(1);
			    System.out.println("count "+count);
			}
			conn.close();
		}
		catch(Exception e)
		{ 
			System.out.println("ERRRORRRR in check email class"+e);
		}  
		
			
			if (count !=0)
			{
				res = "Email was found";
				
			}
			else
			{
				
				res="email not found";
			}
			
		
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(res);
			
	}

}
