/*** package com.symantec.eloqua.assetMigrator.Email;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Email.Folder.FolderObject;
import com.symantec.eloqua.assetMigrator.Email.Folder.GetFolder;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.Models.login.AccountInfo;



@WebServlet("/MigrateEmail")
public class MigrateEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MigrateEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String inputId=request.getParameter("inputId");
		
		HttpSession session=request.getSession(false);
		BulkAndRestClient restclient=(BulkAndRestClient)session.getAttribute("restClient");
		//BulkAndRestClient migrate_client= new BulkAndRestClient("SymantecSandbox1", "Ronit.chougule", "Ronit@271213", "https://secure.p03.eloqua.com");
		
		AccountInfo info2=BulkAndRestClient.GetAccountInfo("SymantecSandbox1", "Ronit.chougule", "Ronit@271213");
		
		System.out.println("$$$$$$$$"+info2);
		
		
		
		if(info2 == null) {
			// if error in authentication, forward back login with error message
			session.invalidate();
			request.setAttribute("errorMessage", "Invalid credentials OF TARGET INSTANCE");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

		}
		else
		{

			
			String restPrevUrl = info2.urls.apis.rest.standard;			
			String restUpdatedUrl = restPrevUrl.replace("{version}", "2.0");
			BulkAndRestClient restClient1 = new BulkAndRestClient("SymantecSandbox1","Ronit.chougule","Ronit@271213", restUpdatedUrl);
			System.out.println("@@@@@@@@@@@@@ REST CLIENT:"+restClient1+"\n");
			
			
			request.getAttribute("email");
			request.getParameter("email");
			
			
			Email email=(Email) request.getSession().getAttribute("email");
			System.out.println("@@@@@@@@@@@@@ EMAIL TO MIGRATE"+ email.getUpdatedBy());
			
			boolean MigrateEmail=EmailObject.getEmailClassObject().postEmail(restclient, "https://secure.p03.eloqua.com",email);
			
			System.out.println("Status "+ MigrateEmail);
			
			
			boolean status=FolderObject.getFolderClassobject().createFolder(restclient, "https://secure.p03.eloqua.com");
		    System.out.println("Status "+ status);
			response.sendRedirect("index.jsp");
			
			response.sendRedirect("index.jsp");
	}
	}
	
	
	
	

}
*/