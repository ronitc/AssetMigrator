package com.symantec.eloqua.assetMigrator.Email;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.Email;

public class EmailClient {

	private Client _client;

	public EmailClient(Client client) {

		_client = client;
	}

	public Email GetEmailInfo(Response email) {
		// com.symantec.eloqua.assetMigrator.Response response =
		// _client.post("/assets/email/304?depth=complete",
		// _client.Gson().toJson(email));
		Email upEmail = _client.Gson().fromJson(email.body, Email.class);

		// System.out.println("upEmail :" + upEmail.getDepth());

		/// System.out.println("Email Info:" + upEmail.getCreatedBy());
		return upEmail;
	}

	public Email PostEmail(BulkAndRestClient DrestClient, Email email, String srcEmailID) {

		// AccountInfo
		// info2=BulkAndRestClient.GetAccountInfo("SymantecSandbox1",
		// "Ronit.chougule", "Ronit@271213");

		// for replacing {version} in bulk url with 1.0
		// String bulkPrevUrl = info2.urls.apis.rest.bulk;
		// xString bulkUpdatedUrl = bulkPrevUrl.replace("{version}", "1.0");

		// creating client object which can be used to access contacts through
		// Bulk api
		// BulkAndRestClient bulkClient = new
		// BulkAndRestClient("SymantecSandbox1","Ronit.chougule","Ronit@271213",
		// bulkUpdatedUrl);

		// for replacing {version} in rest url with 2.0
		// String restPrevUrl = info2.urls.apis.rest.standard;
		// String restUpdatedUrl = restPrevUrl.replace("{version}", "2.0");

		/*
		 * BulkAndRestClient restClient = new
		 * BulkAndRestClient("SymantecSandbox1","Ronit.chougule","Ronit@271213",
		 * restUpdatedUrl);
		 * 
		 * System.out.println("@@@@@@@@@@@@@ REST CLIENT:"+restClient+"\n");
		 */

		GetEmail obj = new GetEmail(DrestClient);
		// System.out.println("EMAIL REQUEST BODY" + email);

		String emailRequestBody = _client.Gson().toJson(email);
		System.out.println("EMAIL REQUEST BODY" + emailRequestBody);
		Response response = obj.postResponse("/assets/email", _client.Gson().toJson(email));

		System.out.println("!!!!!!!!posting response EmailClient Class response statusCode" + response.statusCode);
		System.out.println("Error Massage " + response.exception);
		System.out.println("Response Body" + response.body);
		if (response.statusCode != 201) {

			System.out.println("ERROOR IN POSTING EMAIL emailClient Class");

		}

		else {
			try {
				Email ForEmailId = _client.Gson().fromJson(response.body, Email.class);
				System.out
						.println("posting response EmailClient Class response ID OF POSTED Email" + ForEmailId.getId());
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");

				String name = email.getName();
				String dID = ForEmailId.getId();
				// source_email(srcId,name,date_Time) values(?,?,?) ON DUPLICATE
				// KEY UPDATE(srcId,name,date_Time) values(?,?,?)";
				String query = "insert into source_email(srcId,name,date_Time,destId) " + "values(?,?,?,?)"
						+ " ON DUPLICATE KEY UPDATE" + " srcId = VALUES(srcId), " + " name=values(name),"
						+ "date_Time=values(date_Time)";

				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				java.sql.PreparedStatement ps = conn.prepareStatement(query);

				ps.setString(1, srcEmailID);
				ps.setString(2, email.getName());
				ps.setTimestamp(3, date);
				ps.setString(4, ForEmailId.getId());

				ps.execute();

				java.sql.Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery("select * from source_email");

				/*
				 * while(rs.next()) { System.out.println("DB\n");
				 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)); INSERT
				 * INTO subs (subs_name, subs_email, subs_birthday) VALUES (?,
				 * ?, ?) ON DUPLICATE KEY UPDATE subs_name = VALUES(subs_name),
				 * subs_birthday = VALUES(subs_birthday)
				 * 
				 * }
				 */
				conn.close();

				return email;
			} catch (Exception e) {
				System.out.println("ERRRORRRR" + e);
			}

		}
		return email;

	}
}
