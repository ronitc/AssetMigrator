/*package com.symantec.eloqua.assetMigrator.Email.Images.Test;

public class Uri {#
	region Assembly;
	System;
	,Version = 4.0.0;
	,Culture = neutral;
	,PublicKeyToken = b77a5c561934e089;
	endregion;
	import System.ComponentModel;
	import System.Runtime.Serialization;

	namespace System {
	    
	    @TypeConverter(typeof(UriTypeConverter))
	    public class Uri extends ISerializable {
	        
	        public static string UriSchemeFile;
	        
	        public static string UriSchemeFtp;
	        
	        public static string UriSchemeGopher;
	        
	        public static string UriSchemeHttp;
	        
	        public static string UriSchemeHttps;
	        
	        public static string UriSchemeMailto;
	        
	        public static string UriSchemeNews;
	        
	        public static string UriSchemeNntp;
	        
	        public static string UriSchemeNetTcp;
	        
	        public static string UriSchemeNetPipe;
	        
	        public static string SchemeDelimiter;
	        
	        public Uri(string uriString) {
	            
	        }
	        
	        public Uri(Uri baseUri, Uri relativeUri) {
	            
	        }
	        
	        public Uri(Uri baseUri, string relativeUri) {
	            
	        }
	        
	        @Obsolete("The constructor has been deprecated. Please use new Uri(string). The dontEscape parameter is deprecat" +
	        "ed and is always false. http://go.microsoft.com/fwlink/?linkid=14202")
	        public Uri(string uriString, boolean dontEscape) {
	            
	        }
	        
	        public Uri(string uriString, UriKind uriKind) {
	            
	        }
	        
	        @Obsolete("The constructor has been deprecated. Please new Uri(Uri, string). The dontEscape parameter is depreca" +
	        "ted and is always false. http://go.microsoft.com/fwlink/?linkid=14202")
	        public Uri(Uri baseUri, string relativeUri, boolean dontEscape) {
	            
	        }
	        
	        protected Uri(SerializationInfo serializationInfo, StreamingContext streamingContext) {
	            
	        }
	        
	        public final string PathAndQuery {
	            get {
	            }
	        }
	        
	        public final string LocalPath {
	            get {
	            }
	        }
	        
	        public final string Authority {
	            get {
	            }
	        }
	        
	        public final UriHostNameType HostNameType {
	            get {
	            }
	        }
	        
	        public final boolean IsDefaultPort {
	            get {
	            }
	        }
	        
	        public final boolean IsFile {
	            get {
	            }
	        }
	        
	        public final boolean IsLoopback {
	            get {
	            }
	        }
	        
	        public final string[] Segments {
	            get {
	            }
	        }
	        
	        public final boolean IsAbsoluteUri {
	            get {
	            }
	        }
	        
	        public final string Host {
	            get {
	            }
	        }
	        
	        public final int Port {
	            get {
	            }
	        }
	        
	        public final string Query {
	            get {
	            }
	        }
	        
	        public final string Fragment {
	            get {
	            }
	        }
	        
	        public final string Scheme {
	            get {
	            }
	        }
	        
	        public final string OriginalString {
	            get {
	            }
	        }
	        
	        public final string DnsSafeHost {
	            get {
	            }
	        }
	        
	        public final string AbsoluteUri {
	            get {
	            }
	        }
	        
	        public final boolean IsUnc {
	            get {
	            }
	        }
	        
	        public final string AbsolutePath {
	            get {
	            }
	        }
	        
	        public final string UserInfo {
	            get {
	            }
	        }
	        
	        public final boolean UserEscaped {
	            get {
	            }
	        }
	        
	        public static UriHostNameType CheckHostName(string name) {
	        }
	        
	        public static boolean CheckSchemeName(string schemeName) {
	        }
	        
	        public static int Compare(Uri uri1, Uri uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType) {
	        }
	        
	        public static string EscapeDataString(string stringToEscape) {
	        }
	        
	        public static string EscapeUriString(string stringToEscape) {
	        }
	        
	        public static int FromHex(char digit) {
	        }
	        
	        public static string HexEscape(char character) {
	        }
	        
	        public static char HexUnescape(string pattern, ref int index) {
	        }
	        
	        public static boolean IsHexDigit(char character) {
	        }
	        
	        public static boolean IsHexEncoding(string pattern, int index) {
	        }
	        
	        public static boolean IsWellFormedUriString(string uriString, UriKind uriKind) {
	        }
	        
	        public static boolean TryCreate(string uriString, UriKind uriKind, out Uri result) {
	        }
	        
	        public static boolean TryCreate(Uri baseUri, string relativeUri, out Uri result) {
	        }
	        
	        public static boolean TryCreate(Uri baseUri, Uri relativeUri, out Uri result) {
	        }
	        
	        public static string UnescapeDataString(string stringToUnescape) {
	        }
	        
	        @Obsolete("The method has been deprecated. Please use GetComponents() or static EscapeUriString() to escape a Ur" +
	        "i component or a string. http://go.microsoft.com/fwlink/?linkid=14202")
	        protected static string EscapeString(string str) {
	        }
	        
	        @Obsolete("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected static boolean IsExcludedCharacter(char character) {
	        }
	        
	        public boolean Equals(object comparand) {
	        }
	        
	        public final string GetComponents(UriComponents components, UriFormat format) {
	        }
	        
	        public int GetHashCode() {
	        }
	        
	        public final string GetLeftPart(UriPartial part) {
	        }
	        
	        public final boolean IsBaseOf(Uri uri) {
	        }
	        
	        public final boolean IsWellFormedOriginalString();
	        
	       ("The method has been deprecated. Please use MakeRelativeUri(Uri uri). http://go.microsoft.com/fwlink/?" +
	        "linkid=14202")
	        public final  void MakeRelative(Uri toUri) {
	        }
	        
	        public final Uri MakeRelativeUri(Uri uri) {
	        }
	        
	        public   ToString() {
	        }
	        
	        ("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected  void Canonicalize() {
	        }
	        
	        ("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected  void CheckSecurity() {
	        }
	        
	        @Obsolete("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected  void Escape() {
	        }
	        
	        protected final void GetObjectData(SerializationInfo serializationInfo, StreamingContext streamingContext) {
	        }
	        
	        @Obsolete("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected  IsBadFileSystemCharacter(char character) {
	        }
	        
	        @Obsolete("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected   IsReservedCharacter(char character) {
	        }
	        
	        @Obsolete("The method has been deprecated. It is not used by the system. http://go.microsoft.com/fwlink/?linkid=" +
	        "14202")
	        protected  void Parse() {
	        }
	        
	        @Obsolete("The method has been deprecated. Please use GetComponents() or static UnescapeDataString() to unescape" +
	        " a Uri component or a string. http://go.microsoft.com/fwlink/?linkid=14202")
	        protected  string Unescape(string path) {
	        }
	        
	        public  boolean Operator(Uri uri1, Uri uri2) {
	        }
	        
	        
	    }
	}*/