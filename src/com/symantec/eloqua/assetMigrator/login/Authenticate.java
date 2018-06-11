package com.symantec.eloqua.assetMigrator.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.CustomDataObject.CDO;
import com.symantec.eloqua.assetMigrator.CustomDataObject.GetCDO;
import com.symantec.eloqua.assetMigrator.Models.login.AccountInfo;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authenticate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// if wrong request is made, it should forward back to login page
		response.sendRedirect("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// accept user details
		String siteName = request.getParameter("companyName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		String DsiteName = request.getParameter("DcompanyName");
		String DuserName = request.getParameter("DuserName");
		String Dpassword = request.getParameter("Dpassword");

		HttpSession session = request.getSession();

		try {
			// authenticate user details
			AccountInfo info = BulkAndRestClient.GetAccountInfo(siteName, userName, password);
			AccountInfo info2 = BulkAndRestClient.GetAccountInfo(DsiteName, DuserName, Dpassword);
			if ((info == null) || (info2 == null)) {
				// if error in authentication, forward back login with error
				// message
				session.invalidate();
				request.setAttribute("errorMessage", "Invalid credentials");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);

			} else {

				// for replacing {version} in bulk url with 1.0
				System.out.println("INFO \t " + info);
				System.out.println("INFO \t " + info2);
				String bulkPrevUrl = info.urls.apis.rest.bulk;
				String bulkUpdatedUrl = bulkPrevUrl.replace("{version}", "1.0");
				String bulkUpdatedUrl_2 = bulkPrevUrl.replace("{version}", "2.0");

				// creating client object which can be used to access Assets
				// through Bulk api
				BulkAndRestClient bulkClient = new BulkAndRestClient(siteName, userName, password, bulkUpdatedUrl);

				// for replacing {version} in rest url with 2.0
				String restPrevUrl = info.urls.apis.rest.standard;
				String restUpdatedUrl = restPrevUrl.replace("{version}", "2.0");
				String restUpdatedUrl_2 = bulkUpdatedUrl_2.replace("{version}", "2.0");
				/// Destination uri
				String DbulkPrevUrl = info2.urls.apis.rest.bulk;
				String DbulkUpdatedUrl = DbulkPrevUrl.replace("{version}", "1.0");

				BulkAndRestClient DbulkClient = new BulkAndRestClient(siteName, userName, password, DbulkUpdatedUrl);

				// for replacing {version} in rest url with 2.0
				String DrestPrevUrl = info2.urls.apis.rest.standard;
				String DrestUpdatedUrl = DrestPrevUrl.replace("{version}", "2.0");
				String DrestUpdatedUrl_2 = bulkUpdatedUrl_2.replace("{version}", "2.0");

				System.out.println("URL \t " + bulkPrevUrl);
				System.out.println("URL \t " + bulkUpdatedUrl);
				System.out.println("URL \t " + restPrevUrl);
				System.out.println("URL \t " + restUpdatedUrl);
				System.out.println("URL \t " + DbulkUpdatedUrl);
				System.out.println("URL \t " + DrestUpdatedUrl);
				// creating client object which can be used to access Assets
				// through REST api
				BulkAndRestClient restClient = new BulkAndRestClient(siteName, userName, password, restUpdatedUrl);
				BulkAndRestClient restClient_Bulk = new BulkAndRestClient(siteName, userName, password,
						restUpdatedUrl_2);
				BulkAndRestClient DrestClient = new BulkAndRestClient(DsiteName, DuserName, Dpassword, DrestUpdatedUrl);

				// storing username and client objects in session to access
				// throughout app

				session.setAttribute("restClient", restClient);
				session.setAttribute("userName", userName);
				session.setAttribute("siteName", siteName);
				session.setAttribute("DsiteName", DsiteName);
				session.setAttribute("DrestClient", DrestClient);
				session.setAttribute("bulkUpdatedUrl", bulkUpdatedUrl);
				session.setAttribute("restUpdatedUrl", restUpdatedUrl);
				session.setAttribute("DbulkUpdatedUrl", DbulkUpdatedUrl);
				session.setAttribute("DrestUpdatedUrl", DrestUpdatedUrl);
				session.setAttribute("DrestUpdatedUrl_2", DrestUpdatedUrl_2);
				session.setAttribute("restClient_Bulk", restClient_Bulk);
				GetCDO objDest = new GetCDO(DrestClient);
				Response responseDest = objDest.getResponse("assets/customObjects");

				GetCDO objSrc = new GetCDO(restClient);
				Response responseSrc = objSrc.getResponse("assets/customObjects");

				CDO cdoInfoDest = new CDO();
				CDO cdoInfoSrc = new CDO();
				cdoInfoDest = DrestClient.GetCdoClient().GetCdoInfo(responseDest);
				cdoInfoSrc = restClient.GetCdoClient().GetCdoInfo(responseSrc);

				System.out.println("^^^^^^^^^^^^^^^^^^^^CDO^^^^^^^^^^^^^^^^^" + responseDest.body);
				System.out.println("^^^^^^^^^^^^^^^^^^^^SRC _CDO^^^^^^^^^^^^^^^^^" + responseSrc.body);
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root",
							"root");
					List<com.symantec.eloqua.assetMigrator.CustomDataObject.Elements> elementListDest = cdoInfoDest
							.getElements();
					Iterator<com.symantec.eloqua.assetMigrator.CustomDataObject.Elements> elementItaratorDest = elementListDest
							.iterator();

					List<com.symantec.eloqua.assetMigrator.CustomDataObject.Elements> elementListSrc = cdoInfoSrc
							.getElements();
					Iterator<com.symantec.eloqua.assetMigrator.CustomDataObject.Elements> elementItaratorSrc = elementListSrc
							.iterator();

					while (elementItaratorDest.hasNext()) {
						com.symantec.eloqua.assetMigrator.CustomDataObject.Elements elements = null;
						elements = elementItaratorDest.next();
						String name = elements.getName();

						// String updateType = elements.getUpdateType();
						String id = elements.getId();

						String query = "insert into Dest_CDO(id,name)" + "values(?,?)" + " ON DUPLICATE KEY UPDATE"
								+ "  id=values(id)";
						java.sql.PreparedStatement ps = conn.prepareStatement(query);
						ps.setString(1, id);
						ps.setString(2, name);

						ps.execute();

						conn.createStatement();
						// System.out.println("^^^^^^^^^^^^^^^^^^updates the
						// ContactField TABLE");
					}

					while (elementItaratorSrc.hasNext()) {
						com.symantec.eloqua.assetMigrator.CustomDataObject.Elements elements = null;
						elements = elementItaratorSrc.next();
						String name = elements.getName();

						// String updateType = elements.getUpdateType();
						String id = elements.getId();

						String query = "insert into Src_CDO(id,name)" + "values(?,?)" + " ON DUPLICATE KEY UPDATE"
								+ "  id=values(id)";
						java.sql.PreparedStatement ps = conn1.prepareStatement(query);
						ps.setString(1, id);
						ps.setString(2, name);

						ps.execute();

						conn.createStatement();
						// System.out.println("^^^^^^^^^^^^^^^^^^updates the
						// ContactField TABLE");
					}
					conn.close();
					conn1.close();
				} catch (

				Exception e) {
					System.out.println("ERRRORRRR" + e);
				}
				System.out.println("redirected to index.jsp");

				response.sendRedirect("index.jsp");

			}
		}

		catch (Exception e) {
			throw new ServletException("Authenticate Page Error " + e);

		}

	}

}
