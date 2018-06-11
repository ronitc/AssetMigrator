package com.symantec.eloqua.assetMigrator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.symantec.eloqua.assetMigrator.Email.Models.Images;

public class BaseClient {
	private String _authToken;
	private String _baseUrl;
	private String _postBaseUrl;

	public BaseClient(String site, String user, String password, String url) {
		_baseUrl = url;

		String authString = site + "\\" + user + ":" + password;
		_authToken = "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(authString.getBytes());
		System.out.println("SiteName " + site);
		System.out.println("BASE CLIENT CLASS auth toekn : " + _authToken);
		System.out.println("BaseClient URL " + url);
	}

	public Response get(String uri) {
		System.out.println("Get method " + uri);
		return this.execute(uri, Method.GET, null);
	}

	public Response imagePost(String uri, Images body) throws FileNotFoundException {
		System.out.println("imgPost ");
		return this.imageExecute(uri, Method.POST, body);
	}

	public Response post(String uri, String body) {
		System.out.println("Post method ");
		return this.execute(uri, Method.POST, body);

	}

	public Response put(String uri, String body) {
		return this.execute(uri, Method.PUT, body);
	}

	public void delete(String uri) {
		this.execute(uri, Method.DELETE, null);
	}

	public Response execute(String uri, Method method, String body) {
		Response response = new Response();

		System.out.println(" execute method\n " + uri);
		try {
			URL url = new URL(_baseUrl + uri);

			// Proxy proxy = new Proxy(Proxy.Type.HTTP, new
			// InetSocketAddress("127.0.0.1", 8888));
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setInstanceFollowRedirects(false);
			conn.setRequestMethod(method.toString());

			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			// System.out.println("conn.setRequestProperty application/json");

			conn.setRequestProperty("Authorization", _authToken);

			if (method == Method.POST || method == Method.PUT) {
				conn.setDoOutput(true);
				final OutputStream os = conn.getOutputStream();

				os.write(body.getBytes());

				os.flush();
				os.close();
			}

			InputStream is = conn.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));

			String line;
			while ((line = rd.readLine()) != null) {
				response.body += line;
			}

			rd.close();

			response.statusCode = conn.getResponseCode();
			System.out.println("Status Code " + response.statusCode);
			conn.disconnect();
		} catch (Exception e) {
			response.exception = e.getMessage();
		}
		return response;
	}

	private Response imageExecute(String uri, Method method, Images body) throws FileNotFoundException {
		Response response = new Response();
		String imgName = body.getName();
		String imgFullUrl = "https://secure.p03.eloqua.com/" + body.getFullImageUrl();

		System.out.println("Details: " + imgName + "$$$$ " + imgFullUrl);
		System.out.println("FullURL" + imgFullUrl);
		try {

			String LINE_FEED = "\r\n";
			String boundary = "********";

			URL imageURL = new URL(imgFullUrl);
			System.out.println("Line NO 112");
			HttpURLConnection con1 = (HttpURLConnection) imageURL.openConnection();
			System.out.println("Line NO 114");
			con1.setAllowUserInteraction(true);
			System.out.println("Line NO 115");
			con1.setRequestMethod("GET");
			// con1.setDoOutput(true);
			con1.setRequestProperty("Connection", "Keep-Alive");
			con1.setRequestProperty("Cache-Control", "no-cache");
			con1.connect();
			System.out.println("IMG URL STATUS CODE" + con1.getResponseCode());
			System.out.println("Line NO 138");
			InputStream is = con1.getInputStream();

			System.out.println("Line NO 141");
			URL url = new URL(_baseUrl + uri);
			String charset = "UTF-8";

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setInstanceFollowRedirects(false);
			conn.setRequestMethod(method.toString());
			conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
			// conn.setRequestProperty("Accept", "multipart/form-data");
			conn.setRequestProperty("Authorization", _authToken);
			System.out.println("Line NO 153");
			if (method == Method.POST || method == Method.PUT) {
				conn.setDoOutput(true);
				final OutputStream os = conn.getOutputStream();
				PrintWriter writer = new PrintWriter(new OutputStreamWriter(os, charset), true);
				System.out.println("Line NO 158");
				writer.append("--" + boundary).append(LINE_FEED);
				writer.append("Content-Disposition: form-data; name=\"file\"; fileName=\"" + imgName + "\"");
				writer.append(LINE_FEED);
				writer.append("Content-Type: image/png");
				writer.append(LINE_FEED);
				writer.append(LINE_FEED);
				writer.flush();
				System.out.println("Line NO 166");

				byte[] buffer = new byte[4096];
				int bytesRead = -1;
				System.out.println("Line NO 172");
				while ((bytesRead = is.read(buffer)) != -1) {
					os.write(buffer, 0, bytesRead);
				}

				System.out.println("Line NO 180");
				os.flush();
				// is.close();
				writer.append(LINE_FEED);
				writer.flush();
				System.out.println("Line NO 185");
				// writer.append(LINE_FEED).flush();
				writer.append("--" + boundary + "--").append(LINE_FEED);
				writer.flush();
				// writer.close();
				System.out.println("Line NO 190");
			}

			InputStream connectionIS = con1.getInputStream();

			System.out.println("Line NO 195");
			BufferedReader rd = new BufferedReader(new InputStreamReader(connectionIS));
			System.out.println("Line NO 197");
			String line;

			while ((line = rd.readLine()) != null) {
				response.body += line;
			}
			System.out.println("Line NO 204");
			rd.close();

			System.out.println(response.exception);
			response.statusCode = con1.getResponseCode();
			System.out.println("Line NO 208");

			System.out.println("=======code:  \n" + response.statusCode);
			System.out.println("=======body" + response.body);
			// conn.disconnect();+++++++++
			con1.disconnect();

			return response;

		} catch (Exception e) {
			System.out.println("Error Occured: " + e.getMessage());
			System.out.println("" + e.getLocalizedMessage());
			System.out.println(e.getStackTrace());
		}

		return response;
	}
}
