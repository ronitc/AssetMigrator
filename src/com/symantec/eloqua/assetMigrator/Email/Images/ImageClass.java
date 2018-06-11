package com.symantec.eloqua.assetMigrator.Email.Images;

import java.io.IOException;

import com.symantec.eloqua.assetMigrator.BulkAndRestClient;
import com.symantec.eloqua.assetMigrator.Email.Models.Images;

public class ImageClass {

	/*
	 * public boolean createImages(BulkAndRestClient restClient,String siteName)
	 * {
	 * 
	 * Images images=new Images();
	 * 
	 * 
	 * Images createImg=restClient.ImageClient.CreateImage(images); }
	 */

	@SuppressWarnings("deprecation")
	public boolean postImage(BulkAndRestClient restclient, String site, String imgName, String imgFullUrl,
			BulkAndRestClient DrestClient) throws IOException {
		Images image = new Images();
		/*
		 * //File imgPath = new File(imgFullUrl); URL imgPath = new
		 * URL(imgFullUrl); BufferedImage bufferedImage = ImageIO.read(imgPath);
		 * 
		 * // get DataBufferBytes from Raster WritableRaster raster =
		 * bufferedImage .getRaster(); DataBufferByte data = (DataBufferByte)
		 * raster.getDataBuffer(); int i=0;
		 * 
		 * byte [] bytes = data.getData(); Byte[] imageByte = new
		 * Byte[bytes.length];
		 * 
		 * for(byte b: bytes) imageByte[i++] = b;
		 * System.out.println("BINARY - --->"+imageByte);
		 */

		/**
		 * 17 may 2017
		 * 
		 * 
		 * 
		 * URL u=new URL(imgFullUrl); ByteArrayOutputStream baos = new
		 * ByteArrayOutputStream(); InputStream is = null; try { is =
		 * u.openStream (); byte[] byteChunk = new byte[4096]; // Or whatever
		 * size you want to read in at a time. int n;
		 * 
		 * while ( (n = is.read(byteChunk)) > 0 ) { baos.write(byteChunk, 0, n);
		 * } } catch (IOException e) { System.err.printf ("Failed while reading
		 * bytes from %s: %s", u.toExternalForm(), e.getMessage());
		 * e.printStackTrace ();
		 * 
		 * } finally { if (is != null) { is.close(); } }
		 * 
		 * 
		 * 
		 * /* CloseableHttpClient httpClient=HttpClients.createDefault();
		 * HttpPost uploadFile= new HttpPost(); MultipartEntityBuilder
		 * builder=MultipartEntityBuilder.create();
		 * builder.addBinaryBody(imgName, bytes);
		 */

		/*
		 * URL u = new URL(imgFullUrl); URLConnection uc = u.openConnection();
		 * BufferedImage origunalImg=ImageIO.read(u);
		 * 
		 * String contentType = uc.getContentType(); int contentLength =
		 * uc.getContentLength();
		 * 
		 * if (contentType.startsWith("text/") || contentLength == -1) { throw
		 * new IOException("This is not a binary file."); } InputStream raw =
		 * uc.getInputStream(); InputStream in = new BufferedInputStream(raw);
		 * byte[] data = new byte[contentLength]; int bytesRead = 0; int offset
		 * = 0;
		 * 
		 * while (offset < contentLength) { bytesRead = in.read(data, offset,
		 * data.length - offset); if (bytesRead == -1) break; offset +=
		 * bytesRead; } in.close();
		 * 
		 * if (offset != contentLength) { throw new IOException("Only read " +
		 * offset + " bytes; Expected " + contentLength + " bytes"); }
		 */

		/*
		 * 
		 * URL imageURL = new URL(profileImgUrl); BufferedImage
		 * originalImage=ImageIO.read(imageURL); ByteArrayOutputStream baos=new
		 * ByteArrayOutputStream(); ImageIO.write(originalImage, "jpg", baos );
		 * 
		 * //Persist - in this case to a file
		 * 
		 * FileOutputStream fos = new FileOutputStream("outputImageName.jpg");
		 * baos.writeTo(fos); fos.close() //byte[] data=null;
		 * ByteArrayOutputStream BAS=new ByteArrayOutputStream(); InputStream
		 * is=null;
		 * 
		 * URL url=new URL(imgFullUrl); //BufferedImage
		 * imgUrl=ImageIO.read(url); try { is=url.openStream();
		 * 
		 * byte[] imageBytes = IOUtils.toByteArray(is); byte[] byteChunk=new
		 * byte[4096]; int n;
		 * 
		 * while((n=is.read(byteChunk))>0) {
		 * 
		 * BAS.write(byteChunk,0,n); }
		 * 
		 * } catch(IOException e) {
		 * System.err.printf("Failed while reading Bytes from %s : %s ",url.
		 * toExternalForm(),e.getMessage());
		 * 
		 * } finally { if (is != null) { is.close(); }
		 * 
		 * }
		 * 
		 * ByteArrayOutputStream BAOS=new ByteArrayOutputStream();
		 * ImageIO.write(imgUrl, "jpg", BAOS);
		 * 
		 * //String encodedImg=Base64.encode(BAOS.toByteArray());
		 * 
		 * // InputStream oUrl=url.openStream(); // byte[]
		 * imageBytes=IOUtils.toByteArray(oUrl); //
		 * System.out.println("BINARY OF AN IMAGE --->"+BAS.toByteArray());
		 * System.out.println("BINARY - --->"+Integer.toBinaryString(bytesRead))
		 * ;
		 * 
		 * //InputStream in=new InputStream(url.openStream()); //BufferedReader
		 * br=ImageIO.read((ImageInputStream) url.openConnection());
		 * 
		 * /*String UrlBin=
		 * ("01101000 01110100 01110100 01110000 00111010 00101111 00101111 01100011 01100100 01101110 00110010 00101110 01101011 01101001 01100100 01110011 01100100 01101001 01110011 01100011 01101111 01110110 01100101 01110010 00101110 01100011 01101111 01101101 00101111 01110111 01110000 00101101 01100011 01101111 01101110 01110100 01100101 01101110 01110100 00101111 01110101 01110000 01101100 01101111 01100001 01100100 01110011 00101111 00110010 00110000 00110001 00110010 00101111 00110001 00110001 00101111 00110100 00101110 01101010 01110000 01100111 "
		 * );
		 */

		/*
		 * * 18 MAy 2017
		 */

		/*
		 * HttpClient httpclient = new DefaultHttpClient();
		 * httpclient.getParams().setParameter(CoreProtocolPNames.
		 * PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
		 * 
		 * HttpPost httppost = new HttpPost(); File file = new
		 * File("C:\\Users\\joao\\Pictures\\bla.jpg");
		 * 
		 * MultipartEntity mpEntity = new MultipartEntity();
		 * 
		 * ContentBody cbFile = new FileBody(file, "image/jpeg");
		 * mpEntity.addPart("userfile", cbFile);
		 */
		image.setFullImageUrl(imgFullUrl);
		image.setName(imgName);

		System.out.println("----=----------------Before [post]----------------------");
		restclient.ImageClient().PostImage(DrestClient, image);
		System.out.println("------------------After Image Post------------------------- ");
		return false;
	}

}
