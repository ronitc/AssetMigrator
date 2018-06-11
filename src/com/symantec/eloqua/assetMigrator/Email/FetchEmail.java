package com.symantec.eloqua.assetMigrator.Email;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import com.symantec.eloqua.assetMigrator.BaseClient;*/
import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Folder.FolderObject;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.emailFolder.EmailFolder;
import com.symantec.eloqua.assetMigrator.emailFolder.GetEmailFolder;
import com.symantec.eloqua.assetMigrator.emailGroup.EmailGroup;
import com.symantec.eloqua.assetMigrator.emailGroup.GetEmailGroup;
import com.symantec.eloqua.assetMigrator.user.GetUser;
import com.symantec.eloqua.assetMigrator.user.User;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * x Servlet implementation class FetchEmail
 */
@WebServlet("/Fetchemail")
public class FetchEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FetchEmail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub ,
		// doGet(request, response);

		String inputId = request.getParameter("inputId");
		// String btnFetch=request.getParameter("btnFetch");
		String btnMigrate = request.getParameter("btnMigrate");
		String email_name = request.getParameter("email_name");
		String emailGroupId = request.getParameter("dropdown");
		String subject = request.getParameter("subject");
		// if (request.getParameterValues("dropdown") != null) {
		// emailGroupId = request.getParameterValues("dropdown");
		// System.out.println("########Dropdown Id is :::" +
		// request.getParameter("dropdown"));
		// }

		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$input Name IS In Fetch
		// Email : " + email_name);
		// System.out.println("input ID IS : " + inputId);

		HttpSession session = request.getSession(false);
		BulkAndRestClient restclient = (BulkAndRestClient) session.getAttribute("restClient");

		BulkAndRestClient DrestClient = (BulkAndRestClient) session.getAttribute("DrestClient");
		String podUrl = (String) session.getAttribute("DrestUpdatedUrl");

		BulkAndRestClient restClient_Bulk = (BulkAndRestClient) session.getAttribute("restClient_Bulk");

		System.out.println("POD RESST URL" + podUrl);
		String instanceName = (String) session.getAttribute("DsiteName");
		Email email = (Email) session.getAttribute("email");
		// String podSiteS=session.getAttribute(arg0)
		// System.out.println("emailName :" + email.getName());

		System.out.println("emailID IS " + email.getCreatedBy());

		if (email.getCreatedBy() != null) {
			User user = new User();
			// Response userResponse=GetUser(restclient);
			GetUser obj1 = new GetUser(restclient);
			Response response3 = obj1.getResponse("system/user/" + email.getCreatedBy() + "?depth=minimal");
			// System.out.println("Fetch user name");
			user = restclient.GetUser().GetUserInfo(response3);
			request.setAttribute("user", user);

			// System.out.println("###" + user.getCreatedBy());

			// System.out.println("Status Code: "+user.statusCode+"\n"+"USER
			// NAME : "+user.body);
		}

		if (email.getFolderId() != null) {
			EmailFolder emailFolder = new EmailFolder();
			// Response userResponse=GetUser(restclient);
			GetEmailFolder obj1 = new GetEmailFolder(restclient);
			Response response4 = obj1.getResponse("/assets/email/folder/" + email.getFolderId() + "?depth=complete");
			// System.out.println("Fetch user name");
			emailFolder = restclient.GetEmailFolder().GetEmailFolderInfo(response4);
			request.setAttribute("emailFolder", emailFolder);

			// System.out.println("###" + emailFolder.getName());

			// System.out .println("^^^^Status Code: " + response4.statusCode +
			// "\n" + "^^^^^USER NAME : " + response4.body);

		}
		if (email.getEmailGroupId() != null) {
			EmailGroup emailGroup = new EmailGroup();
			// Response userResponse=GetUser(restclient);
			GetEmailGroup obj1 = new GetEmailGroup(restclient);
			Response response5 = obj1.getResponse("/assets/email/group/" + email.getEmailGroupId() + "?depth=complete");
			// System.out.println("Fetch user name");
			emailGroup = restclient.GetEmailGroup().GetEmailGroupInfo(response5);
			request.setAttribute("emailGroup", emailGroup);

			// System.out.println("###"+emailGroup.getName());

			// System.out.println("^^^^EmailGroup Status Code: " +
			// response5.statusCode + "\n" + "^^^^^EmailGroup NAME : " +
			// response5.body);

		}
		// request.getRequestDispatcher("index.jsp").forward(request, response);
		// System.out.println("Output Response IS "+response2.getCreatedBy());

		// GetEmail obj2=new GetEmail(restclient);
		// Response response2 =obj2.CreateEmail(response1.body);
		// Email email=null;
		//
		// ObjectMapper mapper =new ObjectMapper();
		//
		// email=mapper.readValue(response1.body,Email.class);
		// System.out.println(email.getName());
		//

		// boolean
		// MigrateImages=ImageObject.getImageClassObject().postImage(restclient,
		// "https://secure.p03.eloqua.com", email);

		// BaseClient migrate_client=new BaseClient("SymantecSandbox1",
		// "Ronit.chougule", "Ronit@271213","https://secure.p03.eloqua.com");

		System.out.println("@@@@@@@@@@@@@ EMAIL TO MIGRATE" + email.getUpdatedBy());

		if (btnMigrate != null)

		{

			boolean responseFolder = FolderObject.getFolderClassobject().getFolder(restclient, podUrl, "13553");

			if (responseFolder != false) {

				boolean CreateFolder = FolderObject.getFolderClassobject().createFolder(restclient, podUrl);
				System.out.println("FetchEmail CreateFolder" + CreateFolder);
			}

			Email result = EmailObject.getEmailClassObject().postEmail(restclient, podUrl, email, DrestClient, email_name, subject, emailGroupId, instanceName, restClient_Bulk);

			System.out.println("EmailID while POSTING" + result.getId());
			System.out.println("EmailName while POSTING" + result.getName());

			if (result.getCreatedBy() != null) {
				User newuser = new User();
				// Response userResponse=GetUser(restclient);
				GetUser obj1 = new GetUser(restclient);
				Response response3 = obj1.getResponse("system/user/" + result.getCreatedBy() + "?depth=minimal");
				// System.out.println("Fetch user name");
				newuser = restclient.GetUser().GetUserInfo(response3);
				request.setAttribute("newuser", newuser);

				// System.out.println("###" + newuser.getCreatedBy());

				// System.out.println("Status Code: "+user.statusCode+"\n"+"USER
				// NAME : "+user.body);
			}
			request.setAttribute("result", result);
		}
		request.getRequestDispatcher("MigrateMail.jsp").forward(request, response);

	}

}
