<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.symantec.eloqua.assetMigrator.Response"%>
<%@page import="com.google.gson.JsonObject"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ page import="com.symantec.eloqua.assetMigrator.user.*"%>
<%@ page import="com.symantec.eloqua.assetMigrator.BulkAndRestClient"%>
<%@page import="com.symantec.eloqua.assetMigrator.emailGroup.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Asset Migration</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet">
<!-- Google font for this template -->
<link href='https://fonts.googleapis.com/css?family=Josefin+Slab'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Josefin+Sans'
	rel='stylesheet' type='text/css'>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.form-body {
	width: 50%;
	/* display:block; */
}

.form-group {
	/* display:inline-flex; */
	
}

#option {
	padding: 10px; border - color : #052682;
	outline: 0;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(5, 38, 130, .6);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px
		rgba(5, 38, 130, .6)
}

.form-control::-moz-placeholder {
	color: # 999;
	opacity: 1
}

.well {
	min-height: 73px;
	padding: 33px;
	margin-bottom: 20px;
	background-color: lightsteelblue;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .05);
}

.h4, h4 {
	font-size: 33px;
}

.logout {
	margin-top: -82px;
	margin-right: -26px;
}

.container-body {
	padding-top: 0px;
}
</style>

<script>
	/* $(document).ready(function(){
	 $(document).ajaxStop(function(){
	 alert("All AJAX requests completed");
	 });}); */
	 
	 
	// $(document).ready(fetchEmailGrp);
	 
	function callServlet() {
		/* alert("calling servlet"); */
		document.location.href = 'CheckEmail';
	}
    function displayDropdown(response)
    {
    	/* var att1=JSON.stringify(response.dropdown)
    	var json=att1.split(",");
    	//var jsonArray = JSON.parse(response.dropdown);
        var select = document.getElementById('dropdown');
        var option; */
        /* for (var i = 0; i < jsonArray.length; i++) 
          option = document.createElement('option');
          option.text = jsonArray[i]["name"];
          select.add(option);
    	 */
          
          
          
          
        /*   var v1= $("#salval1").text();
          var att1=v1.split(",");
          $("#salutationvalues").empty();
 */
           for(var l=0;l<json.length;l++){

              $("#dropdown").append("<option value="+json[l]+">"+json[l]+"</option>");

          }
   
    }
 	 /*function fetchEmailGrp()--2
	 {
		// alert("fetchEmailGroup");
		 $.ajax({
		url:'FetchEmailGroup',	
		type:'POST',
		dataType:'json',
		 success: function (response)
		 {
			 //displayDropdown(response);
			 
			 $.each(response.dropdown,function(i,obj)
		                {
		                 //alert(obj.ID+":"+obj.Name);
		                 var div_data="<option value="+obj.ID+">"+obj.Name+"</option>";
		                //alert(div_data);
		                $(div_data).appendTo('#dropdown'); 
		                });  
			 
			 
			 
			 
			/*  $($.parseJSON(response.dropdown)).map(function () {
				    return $('<option>').val(this.ID).text(this.Name);
				}).appendTo('#dropdown');
			  */
		 /*},--2
		 error: function (xhr,status,error)
		 {
			 alert("Somthing went wrong while fetching Email groups");
		 }
			 
		 
		 });
	 } --2
	  */
	function chkFunction() {
		/* alert("chkFunction()"); */
		$.ajax({
			url : 'ChkDbEmail',
			data : $('#inputId').val(),
			type : 'POST',
			//datatype:'json',

			success : function(response) {
				/* alert("success "+response); */
				/* if (response =="Email was found") */
				if (response == "Email was found") {
					
					//alert("true");
					displayErrorMsg();
				} else {
					//alert("false");
					location.href = 'CheckEmail';
				}

			},
			error : function(xhr, status, error) {
				alert("errror  " + error);
				displayErrorMsg(error);
				//clearForm();
			}

		});

	}
	function displayErrorMsg() {
		
		//fetchEmailGrp();-1
		/* alert("displayErrorModel"); */
		$('#myModalError').modal({
			show : 'true'
		});
	}
</script><script>
	 function endSession() 
	{

		HttpSession session=request.getSession(true);   
		session.invalidate();
		
		response.sendRedirect("index.jsp"); 
		clearForm();
	}
	function clearForm() {

		 $('#myForm').trigger("reset");
		$('#myForm1').trigger("reset"); 
		
		document.getElementById("myForm").reset();
	} 
	 
</script>
<body>
	<div class="container-fluid well  verify-head"
		background="/AssetMigrator/images/bg.jpg">
		<h4>
			<center>
				<strong>Asset Migrator</strong>
			</center>
		</h4>
		<div class="pull-right logout">
			Welcome, <strong> <%=session.getAttribute("userName")%></strong> <a
				href="Logout">
				<button type="button" class="btn btn-danger">Sign Out</button>
			</a>
		</div>
	</div>


	<!--      menutab-->
	<div class="container-fluid navbar-data" id="navbar-data">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.jsp">Email</a></li>
					<li><a href="LandingPage.jsp">Landing Pages</a></li>
					<li><a href="form.jsp">Form</a></li>
					<li class=""><a href="campaign.jsp">Campaign</a>
                                        </li>

				</ul>
			</div>
		</nav>
	</div>
	<!--      panel			-->
	<div class="container form-body">

		<!-- <form action="CheckEmail" method="POST"> -->
		<div class="row">
			<div class="container-fluid" id="option">
				<strong>Email</strong> <input type="text"
					placeholder="Enter Object id" required="required" name="inputId"
					id="inputId">

				<button id="getmail" Name="btnFetch" onClick="chkFunction()">GetMail</button>
				<br>
				<br>
				<%--  <a href="<%="LandingPage.jsp"%>">Landing Page**** UnderConstruction**** </a><br><br> --%>
				<!-- <button id="createEmailGroup" Name="btncreateEmailGroup" onclick="/">Create Email Group</button><br><br> -->
			</div>
		</div>
	<!-- 	<div class="col-md-12">
			<div class="panel panel-default" style="height: 69%; overflow: auto;">
				<div class="panel-body" id="panel-data">
					<div class="col-md-6">
						<form name="myForm" action="Fetchemail" method="post">
							<div class="form-group">
								<label for="email_name">Name</label> <input type="email_name"
									class="form-control" id="email_name"  
									placeholder="Email_Name " name="email_name"
									Value="${email.name}" />
							</div>

							<div class="form-group">
								<label for="email_id">ID</label> <input type="email_id"
									class="form-control" id="email_id" disabled="disabled"
									placeholder="ID" name="Id" Value="${email.id}" />
							</div>
							<div class="form-group">
								<label for="email_Created_At">Created At</label> <input
									type="email_Created_At" class="form-control"
									id="email_Created_At" disabled="disabled"
									placeholder="Created At " name="created_at"
									Value="${email.createdAt}" />
							</div>

							<div class="form-group">
								<label for="email_Created_By">Created By</label> <input
									type="email_Created_By" class="form-control"
									id="email_Created_By" disabled="disabled"
									placeholder="Created By " name="created_by"
									Value="${user.name}-${user.id}" />
							</div>
							<div class="form-group">
								<label for="Original_email_Group">Original_email_Group</label> <input
									type="Original_email_Group" class="form-control"
									id="Original_email_Group" disabled="disabled"
									placeholder="Original_email_Group " name="Original_email_Group"
									Value="${emailGroup.name}-${emailGroup.id}" />
							</div>
							<div class="form-group">
								<label for="Original_email_Folder">Original_email_Folder</label>
								<input type="Original_email_Folder" class="form-control"
									id="Original_email_Folder" disabled="disabled"
									placeholder="Original_email_Folder "
									name="Original_email_Folder" Value="${emailFolder.name}-${emailFolder.id}" />
							</div>
							<div class="form-group">
								<label for="Bounce_back_email">Bounce Back Email</label> <input
									type="Bounce_back_email" class="form-control"
									id="Bounce_back_email" disabled="disabled"
									placeholder="Bounce_back_email" name="Bounce_back_email"
									Value="${email.bounceBackEmail}" />
							</div>
							<div class="form-group">
								<label for="reply_to_email">Reply To Email</label> <input
									type="reply_to_email" class="form-control" id="reply_to_email"
									disabled="disabled" placeholder="reply_to_email"
									name="reply_to_email" Value="${email.replyToEmail}" />
							</div>
							<div class="form-group">
								<label for="reply_to_name">Reply To Name</label> <input
									type="reply_to_name" class="form-control" id="reply_to_name"
									disabled="disabled" placeholder="reply_to_name"
									name="reply_to_name" Value="${email.replyToName}" />
							</div>
							<div class="form-group">
								<label for="sender_email">Sender Email</label> <input
									type="sender_email" class="form-control" id="sender_email"
									disabled="disabled" placeholder="sender_email"
									name="sender_email" Value="${email.senderEmail}" />
							</div>
							<div class="form-group">
								<label for="sender_name">Sender Name</label> <input
									type="sender_name" class="form-control" id="sender_name"
									disabled="disabled" placeholder="sender_name"
									name="sender_name" Value="${email.senderName}" />
							</div>

							<div class="form-group">
								<label for="subject">Subject</label> <input type="subject"
									class="form-control" id="subject" 
									placeholder="subject" name="subject" Value="${email.subject}" />
							</div>
							
							<div class="form-group">
							
							<button type="submit" name="btnMigrate">MigrateMail</button>
							</div>
						
					</div>
					<div class="col-md-6">
						<div class="form-group">
								<label for="TargetRootFolder">TargetEmailGroup</label> <input
									type="targetRootFolder" class="form-control"
									id="TargetEmailGroup" disabled="disabled"
									placeholder="TargetEmailGroup" name="TargetEmailGroup"
									/>
							</div>
							<!-- <div class="form-group">
							
									
									<label for="TargetEmailGroup">TargetEmailGroup</label>
									
									<select name="dropdown" id="dropdown" >
									<option value="none" x>Select Email Group</option>
									</select>
							</div>
 -->
						<!--  	<div class="form-group">
								<label for="TargetRootFolder">TargetRootFolder</label> <input
									type="targetRootFolder" class="form-control"
									id="TargetRootFolder" disabled="disabled"
									placeholder="TargetRootFolder" name="TargetRootFolder"
									Value="Test_Ronit" />
							</div>
							<div class="form-group">
								<label for="TargetBounceBack">TargetBounceBack</label> <input
									type="TargetBounceBack" class="form-control"
									id="TargetBounceBack" disabled="disabled"
									placeholder="TargetBounceBack " name="TargetBounceBack"
									Value="${email.bounceBackEmail}" />
							</div>

							<div class="form-group">
								<label for="TargetReplyBackAddress">Target Reply To
									Address</label> <input type="TargetReplyToAddress" class="form-control"
									id="TargetReplyToAddress" disabled="disabled"
									placeholder="TargetReplyToAddress " name="TargetReplyToAddress"
									Value="${email.replyToEmail}" />
							</div>
							<div class="form-group">
								<label for="TargetSenderAddress">Target Sender Address</label> <input
									type="TargetSenderAddress" class="form-control"
									id="TargetSenderAddress" disabled="disabled"
									placeholder="TargetSenderAddress " name="TargetSenderAddress"
									Value="${email.senderEmail}" />
							</div>
							<div class="form-group">

								<label for="TargetSenderName">Target Sender Name</label> <input
									type="TargetSenderName" class="form-control"
									id="TargetSenderName" disabled="disabled"
									placeholder="TargetSenderName " name="TargetSenderName"
									Value="${email.senderName}" />
							</div>
				
						</form>
					</div>


				</div>
			</div>
		</div>

-->
		<div>
			<c:if test="${result.name != null}">
				<script>
					$(function() {
						$('#myModal').modal({
							show : 'true'
						});
					});
				</script>


				<!-- Modal -->
				<div class="modal fade" id="myModal" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Email Was Successfully Posted</h4>
							</div>
							<div class="modal-body">
								<p>Details</p>

								<div class="form-group">
									<label for="TargetEmailGroup">EmailName</label> <input
										type="targetEmailGroup" class="form-control"
										id="targetEmailGroup" disabled="disabled"
										placeholder="targetEmailGroup " name="email_name"
										Value="${result.name}" />
								</div>

								<div class="form-group">
									<label for="TargetRootFolder">Destination Folder</label> <input
										type="targetRootFolder" class="form-control"
										id="TargetRootFolder" disabled="disabled"
										placeholder="TargetRootFolder" name="TargetRootFolder"
										Value="${email.folderId}" />
								</div>
								<%-- <div class="form-group">
									<label for="TargetBounceBack">Created By</label> <input
										type="TargetBounceBack" class="form-control"
										id="TargetBounceBack" disabled="disabled"
										placeholder="TargetBounceBack " name="TargetBounceBack"
										Value="${newuser.name}" />
								</div>
 --%>

							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal" onClick="endSession()">Close</button>
							</div>
						</div>

					</div>
				</div>


			</c:if>
		</div>
		
		<%-- 
		<c:if test="${email != null}">
			$displayDropdown();
	</c:if>
	 
		 --%>
		
		<div>
			<!-- Modal For Error Message-->
			<div class="modal fade" id="myModalError" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Email Was Already migrated</h4>
						</div>
						<div class="modal-body">
							<p>Do you Still want to migrate ???</p>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal" id="migrateEmail"onClick="callServlet()">Yes</button>
							<button type="button" class="btn btn-default"
								data-dismiss="modal" onClick="endSession()">No</button>
						</div>
					</div>

				</div>
			</div>

		</div>

	</div>
</body>
</html>