package com.symantec.eloqua.assetMigrator.Email.Images;

import java.io.FileNotFoundException;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Client;
import com.symantec.eloqua.assetMigrator.Response;
import com.symantec.eloqua.assetMigrator.Email.Models.Images;

public class ImageClient {

	private Client _client;

	public ImageClient(Client client) {

		_client = client;
	}

	public Images GetImageInfo(Response image) {
		Images img = _client.Gson().fromJson(image.body, Images.class);

		System.out.println("Images Client Class  FUll IMAGES URLS \n" + img.getFullImageUrl());

		return img;

	}

	public Images PostImage(BulkAndRestClient DrestClient, Images img) {

		/*
		 * AccountInfo info=BulkAndRestClient.GetAccountInfo("SymantecSandbox1",
		 * "Ronit.chougule", "Ronit@271213"); String bulkPrevUrl =
		 * info.urls.apis.rest.bulk; String restPrevUrl =
		 * info.urls.apis.rest.standard; String restUpdatedUrl =
		 * restPrevUrl.replace("{version}", "2.0");
		 * 
		 * BulkAndRestClient restClient = new
		 * BulkAndRestClient("SymantecSandbox1","Ronit.chougule","Ronit@271213",
		 * restUpdatedUrl);
		 * 
		 * 
		 * GetImage obj=new GetImage(restClient);
		 * 
		 * Response
		 * response=obj.postResponse("/assets/image",_client.Gson().toJson(img))
		 * ;
		 */

		GetImage obj = new GetImage(DrestClient);

		// System.out.println("&&&&&&&& Img obj "+img.getImageByte());
		System.out.println("&&&&&&&& Img obj Full Url " + img.getFullImageUrl());
		System.out.println("&&&&&&&&& Img Obj NAme " + img.getName());

		Response response;
		try {
			response = obj.postResponse("/assets/image/content", img);

			System.out.println("response.statusCode oF AN IMAGE" + response.statusCode);
			System.out.println("response Name oF AN IMAGE" + response.body);
			System.out.println("response Name oF AN IMAGE" + response.body.lastIndexOf("."));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return img;

	}

}
