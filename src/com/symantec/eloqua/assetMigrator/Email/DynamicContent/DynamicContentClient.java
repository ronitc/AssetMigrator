package com.symantec.eloqua.assetMigrator.Email.DynamicContent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.DynamicContents;

public class DynamicContentClient {

	private Client _client;
	private Client _postClient;

	public DynamicContentClient(Client client) {

		this._client = client;
	}

	public DynamicContents GetDynamicContent(Response dynamicContent) {

		DynamicContents upDynamicContent = _client.Gson().fromJson(dynamicContent.body, DynamicContents.class);
		return upDynamicContent;

	}

	public DynamicContents PostDynamicContent(BulkAndRestClient DrestClient, DynamicContents dynamicContent,
			String srcDynamicContentID, String instanceName) {

		GetDynamicContent obj = new GetDynamicContent(DrestClient);

		Response response = obj.postResponse("assets/dynamicContent", _client.Gson().toJson(dynamicContent));
		System.out.println("\n@@@@@@@@@@@@@@@Dynamic content Status code " + response.statusCode);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@DC Response Body" + response.body);

		DynamicContents responseDC = _client.Gson().fromJson(response.body, DynamicContents.class);
		if (response.statusCode != 201) {
			System.out.println("Error While Creating DC " + dynamicContent.getId() + "\t" + dynamicContent.getName());
		} else {
			try {
				DynamicContents ForDCId = _client.Gson().fromJson(response.body, DynamicContents.class);

				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eloqua", "root", "root");

				String name = dynamicContent.getName();
				String dID = ForDCId.getId();
				// source_email(srcId,name,date_Time) values(?,?,?) ON DUPLICATE
				// KEY UPDATE(srcId,name,date_Time) values(?,?,?)";
				String query = "insert into PostDC(id,name,date_Time,dest_id) " + "values(?,?,?,?)"
						+ " ON DUPLICATE KEY UPDATE" + " id = VALUES(id), " + " name=values(name),"
						+ "date_Time=values(date_Time)";

				java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
				java.sql.PreparedStatement ps = conn.prepareStatement(query);

				ps.setString(1, srcDynamicContentID);
				ps.setString(2, dynamicContent.getName());
				ps.setTimestamp(3, date);
				ps.setString(4, ForDCId.getId());

				ps.execute();

				java.sql.Statement stmt = conn.createStatement();

				ResultSet rs = stmt.executeQuery("select * from PostDC");

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
				return responseDC;
			} catch (Exception e) {
				System.out.println("ERRRORRRR" + e);
			}
		}
		return responseDC;
	}

	public SearchDynamicContentResult GetDynamicContentInfo(Response dynamicContent) {

		SearchDynamicContentResult searchDynamicContentResult = _client.Gson().fromJson(dynamicContent.body,
				SearchDynamicContentResult.class);
		return searchDynamicContentResult;

	}

}
