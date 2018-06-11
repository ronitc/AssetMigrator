package com.symantec.eloqua.assetMigrator.Campaign;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Campaign.Models.Campaign;

/**
 * Servlet implementation class FetchCampaign
 */
@WebServlet("/FetchCampaign")
public class FetchCampaign extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchCampaign() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String inputId = request.getParameter("inputId");
		// String btnFetch=request.getParameter("btnFetch");
		String btnMigrate = request.getParameter("btnMigrate");

		System.out.println("input campaign ID IS : " + inputId);

		HttpSession session = request.getSession(false);
		BulkAndRestClient restclient = (BulkAndRestClient) session.getAttribute("restClient");

		BulkAndRestClient DrestClient = (BulkAndRestClient) session.getAttribute("DrestClient");

		GetCampaign obj = new GetCampaign(restclient);

		Response response1 = obj.getResponse("/assets/campaign/" + inputId + "?depth=complete");
		System.out.println("Response1 FetchForm Body" + response1.body);
		Campaign campaign = new Campaign();

		campaign = restclient.CampaignClient().GetCampaignInfo(response1);

		System.out.println("Response1 FetchForm: " + campaign.getName());

		/*
		 * if (campaign.getCreatedBy() != null) { User user = new User(); //
		 * Response userResponse=GetUser(restclient); GetUser obj1 = new
		 * GetUser(restclient); Response response3 =
		 * obj1.getResponse("system/user/" + form.getCreatedBy() +
		 * "?depth=minimal"); System.out.println("Fetch user name"); user =
		 * restclient.GetUser().GetUserInfo(response3);
		 * request.setAttribute("user", user);
		 * 
		 * System.out.println("###" + user.getCreatedBy());
		 * 
		 * // System.out.println("Status Code: "+user.statusCode+"\n"+"USER //
		 * NAME : "+user.body); }
		 */
		/*
		 * if (btnMigrate != null)
		 * 
		 * {
		 * 
		 * FormObject.getFormClassObject().postForm(restclient,
		 * "https://secure.p03.eloqua.com", form, DrestClient);
		 * 
		 * }
		 */
		request.setAttribute("campaign", campaign);
		request.getRequestDispatcher("campaign.jsp").forward(request, response);

	}

}
