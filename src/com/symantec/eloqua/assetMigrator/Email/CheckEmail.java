package com.symantec.eloqua.assetMigrator.Email;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Contact.Contact;
import com.symantec.eloqua.assetMigrator.Contact.Elements;
import com.symantec.eloqua.assetMigrator.Contact.GetContactFields;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;
import com.symantec.eloqua.assetMigrator.emailFolder.EmailFolder;
import com.symantec.eloqua.assetMigrator.emailFolder.GetEmailFolder;
import com.symantec.eloqua.assetMigrator.emailGroup.EmailGroup;
import com.symantec.eloqua.assetMigrator.emailGroup.GetEmailGroup;
import com.symantec.eloqua.assetMigrator.user.GetUser;
import com.symantec.eloqua.assetMigrator.user.User;

/**
 * Servlet implementation class CheckEmail which fetch email asset by taking its
 * ID and display details of email
 * 
 */
@WebServlet("/CheckEmail")
public class CheckEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckEmail() {
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
		// JsonObject emailGroupJson = new JsonObject();

		// String inputId = request.getParameter("inputId");
		// String btnFetch=request.getParameter("btnFetch");
		// String btnMigrate = request.getParameter("btnMigrate");

		HttpSession session = request.getSession(true);
		BulkAndRestClient restclient = (BulkAndRestClient) session.getAttribute("restClient");
		// String instanceName = (String) session.getAttribute("DsiteName");
		BulkAndRestClient DrestClient = (BulkAndRestClient) session.getAttribute("DrestClient");
		String inputID = (String) session.getAttribute("data");
		// System.out.println("input ID IS in CheckEmail: " + inputID);

		GetContactFields obj2 = new GetContactFields(DrestClient);
		Response response2 = obj2.getResponse("/assets/contact/fields?depth=partial");

		GetContactFields objSrc = new GetContactFields(restclient);
		Response responseScr = objSrc.getResponse("/assets/contact/fields?depth=partial");

		GetEmail obj = new GetEmail(restclient);
		Response response1 = obj.getResponse("/assets/email/" + inputID + "?depth=complete");

		System.out.println("\n__Src__EMAIL__ Body " + response1.body);

		Contact contactFieldDest = new Contact();
		contactFieldDest = DrestClient.ContactFieldClient().GetContactFieldInfo(response2);

		Contact contactFieldSrc = new Contact();
		contactFieldSrc = restclient.ContactFieldClient().GetContactFieldInfo(responseScr);

		System.out.println("status Code " + response2.statusCode + "\nContactFields " + response2.body);

		// Logic for if email id is not found

		if (response2.statusCode != 200) {

		}

		Email email = new Email();

		email = restclient.EmailClient().GetEmailInfo(response1);

		session.setAttribute("email", email);
		// this.getServletConfig().getServletContext().setAttribute("email",
		// email);
		/*
		 * EmailGroup emailGroupList = new EmailGroup(); GetEmailGroup obj6 =
		 * new GetEmailGroup(DrestClient); Response response6 =
		 * obj6.getResponse("/assets/email/groups?count=100&depth=minimal");
		 * 
		 * emailGroupList =
		 * DrestClient.GetEmailGroup().GetEmailGroupInfo(response6);
		 * System.out.println("emailGroupList Body^^^^^^" + response6.body);
		 * System.out.println("emailGroupList Body^^^^^^" + emailGroupList);
		 * request.setAttribute("emailGroupList", emailGroupList);
		 * request.setAttribute("response6", response6); EmailGroup newEmailGrp
		 * = new EmailGroup(); String emailGrpList = newEmailGrp.getName();
		 */
		// System.out.println("emailID IS " + email.getCreatedBy());

		if (email.getCreatedBy() != null) {
			User user = new User();
			// Response userResponse=GetUser(restclient);
			GetUser obj1 = new GetUser(restclient);
			Response response3 = obj1.getResponse("system/user/" + email.getCreatedBy() + "?depth=minimal");
			System.out.println("Fetch user name");
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
			// response5.statusCode + "\n" + "^^^^^EmailGroup NAME : "
			// + response5.body);

		}

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");

			String query = "SELECT count(*) from  source_email WHERE srcId = ? ";

			java.sql.PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, email.getId());

			ResultSet rs = ps.executeQuery();

			// System.out.println("Result Set " + rs);

			if (rs.next()) {
				final int count = rs.getInt(1);
				System.out.println("count " + count);
			}
			conn.close();
		} catch (Exception e) {
			System.out.println("ERRRORRRR" + e);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");
			List<Elements> elementListSrc = contactFieldSrc.getElements();
			Iterator<Elements> elementItaratorSrc = elementListSrc.iterator();

			while (elementItaratorSrc.hasNext()) {
				Elements elements = null;
				elements = elementItaratorSrc.next();
				String name = elements.getName();
				String dataType = elements.getDataType();

				String displayType = elements.getDisplayType();

				String updateType = elements.getUpdateType();
				String id = elements.getId();
				String internalName = elements.getInternalName();

				String query = "insert into src_contactField(name,dataType,displayType,updateType,id,internalName)"
						+ "values(?,?,?,?,?,?)" + " ON DUPLICATE KEY UPDATE" + "  id=values(id),"
						+ " internalName=values(internalName)";
				java.sql.PreparedStatement ps = conn.prepareStatement(query);

				ps.setString(1, name);
				ps.setString(2, dataType);
				ps.setString(3, displayType);
				ps.setString(4, updateType);
				ps.setString(5, id);
				ps.setString(6, internalName);
				ps.execute();

				conn.createStatement();
				// System.out.println("^^^^^^^^^^^^^^^^^^updates the
				// ContactField TABLE");
			}

			conn.close();

		} catch (Exception e) {
			System.out.println("ERRRORRRR" + e);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");
			List<Elements> elementListDest = contactFieldDest.getElements();
			Iterator<Elements> elementItaratorDest = elementListDest.iterator();

			while (elementItaratorDest.hasNext()) {
				Elements elements = null;
				elements = elementItaratorDest.next();
				String name = elements.getName();
				String dataType = elements.getDataType();

				String displayType = elements.getDisplayType();

				String updateType = elements.getUpdateType();
				String id = elements.getId();
				String internalName = elements.getInternalName();

				String query = "insert into dest_contactField(name,dataType,displayType,updateType,id,internalName)"
						+ "values(?,?,?,?,?,?)" + " ON DUPLICATE KEY UPDATE" + "  id=values(id),"
						+ " internalName=values(internalName)";
				java.sql.PreparedStatement ps = conn.prepareStatement(query);

				ps.setString(1, name);
				ps.setString(2, dataType);
				ps.setString(3, displayType);
				ps.setString(4, updateType);
				ps.setString(5, id);
				ps.setString(6, internalName);
				ps.execute();

				conn.createStatement();
				// System.out.println("^^^^^^^^^^^^^^^^^^updates the
				// ContactField TABLE");
			}

			conn.close();

		} catch (

		Exception e) {
			System.out.println("ERRRORRRR" + e);
		}

		request.getRequestDispatcher("MigrateMail.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		/*
		 * String inputId=request.getParameter("inputId"); //String
		 * btnFetch=request.getParameter("btnFetch"); String
		 * btnMigrate=request.getParameter("btnMigrate");
		 * 
		 * 
		 * 
		 * 
		 * HttpSession session =request.getSession(true); BulkAndRestClient
		 * restclient=(BulkAndRestClient)session.getAttribute("restClient");
		 * 
		 * 
		 * BulkAndRestClient
		 * DrestClient=(BulkAndRestClient)session.getAttribute("DrestClient");
		 * String inputID=(String) session.getAttribute("inputId");
		 * System.out.println("input ID IS in CheckEmail: "+inputId);
		 * 
		 * GetEmail obj=new GetEmail(restclient); Response
		 * response1=obj.getResponse("/assets/email/"+inputID+"?depth=complete")
		 * ;
		 * 
		 * 
		 * System.out.println("status Code "+response1.statusCode+"\nBody "
		 * +response1.body); Email email=new Email();
		 * 
		 * email=restclient.EmailClient().GetEmailInfo(response1);
		 * 
		 * session.setAttribute("email", email);
		 * //this.getServletConfig().getServletContext().setAttribute("email",
		 * email);
		 * 
		 * 
		 * 
		 * System.out.println("emailID IS "+ email.getCreatedBy());
		 * 
		 * if(email.getCreatedBy()!= null) { User user=new User(); //Response
		 * userResponse=GetUser(restclient); GetUser obj1=new
		 * GetUser(restclient); Response
		 * response3=obj1.getResponse("system/user/"+email.getCreatedBy()
		 * +"?depth=minimal"); System.out.println("Fetch user name");
		 * user=restclient.GetUser().GetUserInfo(response3);
		 * request.setAttribute("user",user);
		 * 
		 * System.out.println("###"+user.getCreatedBy());
		 * 
		 * //System.out.println("Status Code: "+user.statusCode+
		 * "\n"+"USER NAME : "+user.body); }
		 * 
		 * if(email.getFolderId()!= null) { EmailFolder emailFolder=new
		 * EmailFolder(); //Response userResponse=GetUser(restclient);
		 * GetEmailFolder obj1=new GetEmailFolder(restclient); Response
		 * response4=obj1.getResponse("/assets/email/folder/"+email.getFolderId(
		 * ) +"?depth=complete"); System.out.println("Fetch user name");
		 * emailFolder=restclient.GetEmailFolder().GetEmailFolderInfo(response4)
		 * ; request.setAttribute("emailFolder",emailFolder);
		 * 
		 * System.out.println("###"+emailFolder.getName());
		 * 
		 * System.out.println("^^^^Status Code: "+response4.statusCode+
		 * "\n"+"^^^^^USER NAME : "+response4.body);
		 * 
		 * 
		 * 
		 * } if(email.getEmailGroupId()!= null) { EmailGroup emailGroup=new
		 * EmailGroup(); //Response userResponse=GetUser(restclient);
		 * GetEmailGroup obj1=new GetEmailGroup(restclient); Response
		 * response5=obj1.getResponse("/assets/email/group/"+email.
		 * getEmailGroupId() +"?depth=complete");
		 * System.out.println("Fetch user name");
		 * emailGroup=restclient.GetEmailGroup().GetEmailGroupInfo(response5);
		 * request.setAttribute("emailGroup",emailGroup);
		 * 
		 * // System.out.println("###"+emailGroup.getName());
		 * 
		 * System.out.println("^^^^EmailGroup  Status Code: "+response5.
		 * statusCode+"\n"+"^^^^^EmailGroup NAME : "+response5.body);
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * try {
		 * 
		 * Class.forName("com.mysql.jdbc.Driver"); Connection conn
		 * =DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua",
		 * "root","root");
		 * 
		 * 
		 * String query= "SELECT count(*) from  source_email WHERE srcId = ? ";
		 * 
		 * 
		 * 
		 * java.sql.PreparedStatement ps=conn.prepareStatement(query);
		 * 
		 * ps.setString(1,email.getId());
		 * 
		 * 
		 * 
		 * 
		 * ResultSet rs=ps.executeQuery();
		 * 
		 * System.out.println("Result Set "+ rs);
		 * 
		 * if(rs.next()) { final int count = rs.getInt(1);
		 * System.out.println("count "+count); } conn.close(); } catch(Exception
		 * e) { System.out.println("ERRRORRRR"+e); }
		 * 
		 * 
		 * 
		 * request.getRequestDispatcher("index.jsp").forward(request, response);
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	}
}
