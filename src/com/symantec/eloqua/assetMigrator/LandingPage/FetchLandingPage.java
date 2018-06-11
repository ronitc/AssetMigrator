package com.symantec.eloqua.assetMigrator.LandingPage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;

import com.symantec.eloqua.assetMigrator.Email.Folder.FolderObject;
import com.symantec.eloqua.assetMigrator.LandingPage.Models.LandingPage;

/**
 * Servlet implementation class FetchLandingPage
 */
@WebServlet("/FetchLandingPage")
public class FetchLandingPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchLandingPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String inputId=request.getParameter("inputId");
		//String btnFetch=request.getParameter("btnFetch");
		String btnMigrate=request.getParameter("btnMigrate");
		String dropDown=request.getParameter("dropDown");
		
		
		
		System.out.println("input ID IS : "+inputId);
		
		HttpSession session =request.getSession(false);
		BulkAndRestClient restclient=(BulkAndRestClient)session.getAttribute("restClient");		
		
		
		BulkAndRestClient DrestClient=(BulkAndRestClient)session.getAttribute("DrestClient");
		
		
		
		GetLandingPage obj=new GetLandingPage(restclient);
		
		Response response1=obj.getResponse("/assets/landingPage/"+inputId+"?depth=complete");
		
		LandingPage landingPage=new LandingPage();
		
		landingPage=restclient.LandingPageClient().GetLandingPageInfo(response1);
		
		
		
		
		
		
		
		
if( btnMigrate!=null)
			
		{	
		 
			/* boolean responseFolder =FolderObject.getFolderClassobject().getFolder(restclient,"https://secure.p03.eloqua.com","13553");
		
			if(responseFolder!=false)
			{
				
				boolean CreateFolder = FolderObject.getFolderClassobject().createFolder(restclient, "https://secure.p03.eloqua.com");
			}
		*/	
			LandingPageObject.getLandingPageClassObject().postLandingPage(restclient, "https://secure.p03.eloqua.com", landingPage, DrestClient);
		
		}
		request.setAttribute("landingPage",landingPage);
		request.getRequestDispatcher("LandingPage.jsp").forward(request, response);
		
	}

		
		
		
		
		
		
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
