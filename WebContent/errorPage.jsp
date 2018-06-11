<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Asset Migration</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<!-- Google font for this template -->
<link href='https://fonts.googleapis.com/css?family=Josefin+Slab'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Josefin+Sans'
	rel='stylesheet' type='text/css'>

<%
	response.addHeader("Cache-Control",
			"no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0");
	response.addHeader("Pragma", "no-cache");
	response.addDateHeader("Expires", 0);
%>
</head>
<body>
	<nav class="navbar navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<h3 class="navbar-brand" style="margin-left: 0px;"></h3>
			</div>
		</div>
		<!-- /.container -->
	</nav>
	<!-- /.navbar -->

	<div class="container">
		<div class="row" style="margin-top: 100px; color: #F22613">
			<h1>SomeThing is Broken !!!</h1>
		</div>	<!-- /.row -->
		<div class="row">
			<font size="10em">
				<strong><%=response.getStatus() %></strong> Error
			</font>	
		</div>	<!-- /.row -->
		<div class="row text-info">
		( <%=exception.getMessage()%> )
		</div>
		<div class="row" style="margin-top:25px">
			Please try logging again - <a href="login.jsp">Login</a>
		</div>	<!-- /.row -->
	</div>	<!-- /.container -->

</body>
</html>