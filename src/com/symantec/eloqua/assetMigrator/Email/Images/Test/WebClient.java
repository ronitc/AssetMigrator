/*package com.symantec.eloqua.assetMigrator.Email.Images.Test;

public class WebClient {



public bool AllowWriteStreamBuffering;
public Encoding Encoding; 
public string BaseAddress; 
public ICredentials Credentials ; 
public bool UseDefaultCredentials;
public WebHeaderCollection Headers;
public NameValueCollection QueryString;
public WebHeaderCollection ResponseHeaders; 
public IWebProxy Proxy;
public RequestCachePolicy CachePolicy;
public bool IsBusy; 

public bool AllowReadStreamBuffering;



public event WriteStreamClosedEventHandler WriteStreamClosed;
public event OpenReadCompletedEventHandler OpenReadCompleted;
public event OpenWriteCompletedEventHandler OpenWriteCompleted;
public event DownloadStringCompletedEventHandler DownloadStringCompleted;
public event DownloadDataCompletedEventHandler DownloadDataCompleted;
public event AsyncCompletedEventHandler DownloadFileCompleted;
public event UploadStringCompletedEventHandler UploadStringCompleted;
public event UploadDataCompletedEventHandler UploadDataCompleted;
public event UploadFileCompletedEventHandler UploadFileCompleted;
public event UploadValuesCompletedEventHandler UploadValuesCompleted;
public event DownloadProgressChangedEventHandler DownloadProgressChanged;
public event UploadProgressChangedEventHandler UploadProgressChanged;

public void CancelAsync();
public byte[] DownloadData(string address);
public byte[] DownloadData(Uri address);
public void DownloadDataAsync(Uri address, object userToken);
public void DownloadDataAsync(Uri address);

public Task<byte[]> DownloadDataTaskAsync(string address);

public Task<byte[]> DownloadDataTaskAsync(Uri address);
public void DownloadFile(string address, string fileName);
public void DownloadFile(Uri address, string fileName);
public void DownloadFileAsync(Uri address, string fileName, object userToken);
public void DownloadFileAsync(Uri address, string fileName);

public Task DownloadFileTaskAsync(string address, string fileName);

public Task DownloadFileTaskAsync(Uri address, string fileName);
public string DownloadString(Uri address);
public string DownloadString(string address);
public void DownloadStringAsync(Uri address);
public void DownloadStringAsync(Uri address, object userToken);

public Task<string> DownloadStringTaskAsync(string address);

public Task<string> DownloadStringTaskAsync(Uri address);
public Stream OpenRead(Uri address);
public Stream OpenRead(string address);
public void OpenReadAsync(Uri address, object userToken);
public void OpenReadAsync(Uri address);

public Task<Stream> OpenReadTaskAsync(string address);

public Task<Stream> OpenReadTaskAsync(Uri address);
public Stream OpenWrite(string address);
public Stream OpenWrite(string address, string method);
public Stream OpenWrite(Uri address, string method);
public Stream OpenWrite(Uri address);
public void OpenWriteAsync(Uri address, string method, object userToken);
public void OpenWriteAsync(Uri address);
public void OpenWriteAsync(Uri address, string method);

public Task<Stream> OpenWriteTaskAsync(Uri address);

public Task<Stream> OpenWriteTaskAsync(Uri address, string method);

public Task<Stream> OpenWriteTaskAsync(string address);

public Task<Stream> OpenWriteTaskAsync(string address, string method);
public byte[] UploadData(Uri address, string method, byte[] data);
public byte[] UploadData(string address, string method, byte[] data);
public byte[] UploadData(string address, byte[] data);
public byte[] UploadData(Uri address, byte[] data);
public void UploadDataAsync(Uri address, string method, byte[] data, object userToken);
public void UploadDataAsync(Uri address, string method, byte[] data);
public void UploadDataAsync(Uri address, byte[] data);

public Task<byte[]> UploadDataTaskAsync(string address, string method, byte[] data);

public Task<byte[]> UploadDataTaskAsync(Uri address, byte[] data);

public Task<byte[]> UploadDataTaskAsync(string address, byte[] data);

public Task<byte[]> UploadDataTaskAsync(Uri address, string method, byte[] data);
public byte[] UploadFile(Uri address, string method, string fileName);
public byte[] UploadFile(string address, string method, string fileName);
public byte[] UploadFile(Uri address, string fileName);
public byte[] UploadFile(string address, string fileName);
public void UploadFileAsync(Uri address, string method, string fileName);
public void UploadFileAsync(Uri address, string method, string fileName, object userToken);
public void UploadFileAsync(Uri address, string fileName);

public Task<byte[]> UploadFileTaskAsync(string address, string fileName);
public Task<byte[]> UploadFileTaskAsync(Uri address, string fileName);

public Task<byte[]> UploadFileTaskAsync(string address, string method, string fileName);

public Task<byte[]> UploadFileTaskAsync(Uri address, string method, string fileName);
public string UploadString(string address, string data);
public string UploadString(Uri address, string data);
public string UploadString(string address, string method, string data);
public string UploadString(Uri address, string method, string data);
public void UploadStringAsync(Uri address, string method, string data, object userToken);
public void UploadStringAsync(Uri address, string method, string data);
public void UploadStringAsync(Uri address, string data);

public Task<string> UploadStringTaskAsync(string address, string method, string data);

public Task<string> UploadStringTaskAsync(Uri address, string method, string data);
public Task<string> UploadStringTaskAsync(string address, string data);

public Task<string> UploadStringTaskAsync(Uri address, string data);
public byte[] UploadValues(Uri address, string method, NameValueCollection data);
public byte[] UploadValues(string address, NameValueCollection data);
public byte[] UploadValues(string address, string method, NameValueCollection data);
public byte[] UploadValues(Uri address, NameValueCollection data);
public void UploadValuesAsync(Uri address, string method, NameValueCollection data, object userToken);
public void UploadValuesAsync(Uri address, NameValueCollection data);
public void UploadValuesAsync(Uri address, string method, NameValueCollection data);

public Task<byte[]> UploadValuesTaskAsync(Uri address, string method, NameValueCollection data);

public Task<byte[]> UploadValuesTaskAsync(Uri address, NameValueCollection data);

public Task<byte[]> UploadValuesTaskAsync(string address, string method, NameValueCollection data);

public Task<byte[]> UploadValuesTaskAsync(string address, NameValueCollection data);
public bool getAllowWriteStreamBuffering() {
	return AllowWriteStreamBuffering;
}
public void setAllowWriteStreamBuffering(bool allowWriteStreamBuffering) {
	AllowWriteStreamBuffering = allowWriteStreamBuffering;
}
public Encoding getEncoding() {
	return Encoding;
}
public void setEncoding(Encoding encoding) {
	Encoding = encoding;
}
public string getBaseAddress() {
	return BaseAddress;
}
public void setBaseAddress(string baseAddress) {
	BaseAddress = baseAddress;
}
public ICredentials getCredentials() {
	return Credentials;
}
public void setCredentials(ICredentials credentials) {
	Credentials = credentials;
}
public bool getUseDefaultCredentials() {
	return UseDefaultCredentials;
}
public void setUseDefaultCredentials(bool useDefaultCredentials) {
	UseDefaultCredentials = useDefaultCredentials;
}
public WebHeaderCollection getHeaders() {
	return Headers;
}
public void setHeaders(WebHeaderCollection headers) {
	Headers = headers;
}
public NameValueCollection getQueryString() {
	return QueryString;
}
public void setQueryString(NameValueCollection queryString) {
	QueryString = queryString;
}
public WebHeaderCollection getResponseHeaders() {
	return ResponseHeaders;
}
public void setResponseHeaders(WebHeaderCollection responseHeaders) {
	ResponseHeaders = responseHeaders;
}
public IWebProxy getProxy() {
	return Proxy;
}
public void setProxy(IWebProxy proxy) {
	Proxy = proxy;
}
public RequestCachePolicy getCachePolicy() {
	return CachePolicy;
}
public void setCachePolicy(RequestCachePolicy cachePolicy) {
	CachePolicy = cachePolicy;
}
public bool getIsBusy() {
	return IsBusy;
}
public void setIsBusy(bool isBusy) {
	IsBusy = isBusy;
}
public bool getAllowReadStreamBuffering() {
	return AllowReadStreamBuffering;
}
public void setAllowReadStreamBuffering(bool allowReadStreamBuffering) {
	AllowReadStreamBuffering = allowReadStreamBuffering;
}
public event getWriteStreamClosedEventHandler() {
	return WriteStreamClosedEventHandler;
}
public void setWriteStreamClosedEventHandler(event writeStreamClosedEventHandler) {
	WriteStreamClosedEventHandler = writeStreamClosedEventHandler;
}
public event getOpenReadCompletedEventHandler() {
	return OpenReadCompletedEventHandler;
}
public void setOpenReadCompletedEventHandler(event openReadCompletedEventHandler) {
	OpenReadCompletedEventHandler = openReadCompletedEventHandler;
}
public event getOpenWriteCompletedEventHandler() {
	return OpenWriteCompletedEventHandler;
}
public void setOpenWriteCompletedEventHandler(event openWriteCompletedEventHandler) {
	OpenWriteCompletedEventHandler = openWriteCompletedEventHandler;
}
public event getDownloadStringCompletedEventHandler() {
	return DownloadStringCompletedEventHandler;
}
public void setDownloadStringCompletedEventHandler(event downloadStringCompletedEventHandler) {
	DownloadStringCompletedEventHandler = downloadStringCompletedEventHandler;
}
public event getDownloadDataCompletedEventHandler() {
	return DownloadDataCompletedEventHandler;
}
public void setDownloadDataCompletedEventHandler(event downloadDataCompletedEventHandler) {
	DownloadDataCompletedEventHandler = downloadDataCompletedEventHandler;
}
public event getAsyncCompletedEventHandler() {
	return AsyncCompletedEventHandler;
}
public void setAsyncCompletedEventHandler(event asyncCompletedEventHandler) {
	AsyncCompletedEventHandler = asyncCompletedEventHandler;
}
public event getUploadStringCompletedEventHandler() {
	return UploadStringCompletedEventHandler;
}
public void setUploadStringCompletedEventHandler(event uploadStringCompletedEventHandler) {
	UploadStringCompletedEventHandler = uploadStringCompletedEventHandler;
}
public event getUploadDataCompletedEventHandler() {
	return UploadDataCompletedEventHandler;
}
public void setUploadDataCompletedEventHandler(event uploadDataCompletedEventHandler) {
	UploadDataCompletedEventHandler = uploadDataCompletedEventHandler;
}
public event getUploadFileCompletedEventHandler() {
	return UploadFileCompletedEventHandler;
}
public void setUploadFileCompletedEventHandler(event uploadFileCompletedEventHandler) {
	UploadFileCompletedEventHandler = uploadFileCompletedEventHandler;
}
public event getUploadValuesCompletedEventHandler() {
	return UploadValuesCompletedEventHandler;
}
public void setUploadValuesCompletedEventHandler(event uploadValuesCompletedEventHandler) {
	UploadValuesCompletedEventHandler = uploadValuesCompletedEventHandler;
}
public event getDownloadProgressChangedEventHandler() {
	return DownloadProgressChangedEventHandler;
}
public void setDownloadProgressChangedEventHandler(event downloadProgressChangedEventHandler) {
	DownloadProgressChangedEventHandler = downloadProgressChangedEventHandler;
}
public event getUploadProgressChangedEventHandler() {
	return UploadProgressChangedEventHandler;
}
public void setUploadProgressChangedEventHandler(event uploadProgressChangedEventHandler) {
	UploadProgressChangedEventHandler = uploadProgressChangedEventHandler;
}
protected virtual WebRequest GetWebRequest(Uri address);
protected virtual WebResponse GetWebResponse(WebRequest request);
protected virtual WebResponse GetWebResponse(WebRequest request, IAsyncResult result);
protected virtual void OnDownloadDataCompleted(DownloadDataCompletedEventArgs e);
protected virtual void OnDownloadFileCompleted(AsyncCompletedEventArgs e);
protected virtual void OnDownloadProgressChanged(DownloadProgressChangedEventArgs e);
protected virtual void OnDownloadStringCompleted(DownloadStringCompletedEventArgs e);
protected virtual void OnOpenReadCompleted(OpenReadCompletedEventArgs e);
protected virtual void OnOpenWriteCompleted(OpenWriteCompletedEventArgs e);
protected virtual void OnUploadDataCompleted(UploadDataCompletedEventArgs e);
protected virtual void OnUploadFileCompleted(UploadFileCompletedEventArgs e);
protected virtual void OnUploadProgressChanged(UploadProgressChangedEventArgs e);
protected virtual void OnUploadStringCompleted(UploadStringCompletedEventArgs e);
protected virtual void OnUploadValuesCompleted(UploadValuesCompletedEventArgs e);
		
protected virtual void OnWriteStreamClosed(WriteStreamClosedEventArgs e);



}

*/