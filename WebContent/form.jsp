<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ page import="com.symantec.eloqua.assetMigrator.Response" %>
        <%@ page import="com.symantec.eloqua.assetMigrator.user.*" %>
            <%@ page import="com.symantec.eloqua.assetMigrator.BulkAndRestClient" %>
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
                    <link href='https://fonts.googleapis.com/css?family=Josefin+Slab' rel='stylesheet' type='text/css'>
                    <link href='https://fonts.googleapis.com/css?family=Josefin+Sans' rel='stylesheet' type='text/css'>


                    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
                    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
                    <style>
                        .form-body {
                            width: 50%;
                            /* display:block; */
                        }
                        .form-group {
                            /* display:inline-flex; */
                        }
                        #option {
                            padding: 10px;
                            border - color: #052682;
                            outline: 0;
                            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(5, 38, 130, .6);
                            box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(5, 38, 130, .6)
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
                        .h4,
                        h4 {
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


                    <body>
                        <div class="container-fluid well  verify-head" background="/AssetMigrator/images/bg.jpg">
                            <h4><center><strong>Asset Migrator</strong></center></h4>
                            <div class="pull-right logout">
                                Welcome,
                                <strong> <%=session.getAttribute( "userName")%></strong>
                                <a href="Logout">
                                    <button type="button" class="btn btn-danger">Sign Out
                                    </button>
                                </a>
                            </div>
                        </div>


                        <!--      menutab			-->
                        <div class="container-fluid navbar-data" id="navbar-data">
                            <nav class="navbar navbar-default">
                                <div class="container-fluid">
                                    <ul class="nav navbar-nav">
                                        <li><a href="index.jsp">Email</a>
                                        </li>
                                        <li ><a href="LandingPage.jsp">Landing Pages</a>
                                        </li>
                                        <li class="active"><a href="form.jsp">Form</a>
                                        </li>
                                        
                                        <li class=""><a href="campaign.jsp">Campaign</a>
                                        </li>
				
                                    </ul>
                                </div>
                            </nav>
                        </div>
                        <!--      panel			-->
                        <div class="container form-body">

                            <form action="FetchForm" method="POST">
                                <div class="row">
                                    <div class="container-fluid" id="option">
                                        <strong>Forms</strong>
                                        <input type="text" placeholder="Enter Object id" required="required" name="inputId" id="inputId">

                                        <button id="getmail" Name="btnFetch">GetObject</button>
                                        <br>
                                        <br>
                                        <%-- <a href="<%=" LandingPage.jsp "%>">Landing Page**** UnderConstruction**** </a>
                                            <br>
                                            <br> --%>
                                            <!-- <button id="createformGroup" Name="btncreateformGroup" onclick="/">Create form Group</button><br><br> -->
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="panel panel-default" style="height:69% ; overflow:auto;">
                                        <div class="panel-body" id="panel-data">
                                            <div class="col-md-6">
                                                <form>
                                                    <div class="form-group">
                                                        <label for="form_name">Name</label>
                                                        <input type="form_name" class="form-control" id="form_name" disabled="disabled" placeholder="form_Name " name="form_name" Value="${form.name}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="form_id">ID</label>
                                                        <input type="form_id" class="form-control" id="form_id" disabled="disabled" placeholder="ID" name="Id" Value="${form.id}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="form_Created_At">Created At</label>
                                                        <input type="form_Created_At" class="form-control" id="form_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${form.createdAt}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="form_Created_By">Created By</label>
                                                        <input type="form_Created_By" class="form-control" id="form_Created_By" disabled="disabled" placeholder="Created By " name="created_by" Value="${user.name}" />
                                                    </div>
                                                    <%-- <div class="form-group">
                                                        <label for="Original_form_Group">Original_form_Group</label>
                                                        <input type="Original_form_Group" class="form-control" id="Original_form_Group" disabled="disabled" placeholder="Original_form_Group " name="Original_form_Group" Value="${landingPage.formGroupId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Original_form_Folder">Original_form_Folder</label>
                                                        <input type="Original_form_Folder" class="form-control" id="Original_form_Folder" disabled="disabled" placeholder="Original_form_Folder " name="Original_form_Folder" Value="${landingPage.folderId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Bounce_back_form">Bounce Back form</label>
                                                        <input type="Bounce_back_form" class="form-control" id="Bounce_back_form" disabled="disabled" placeholder="Bounce_back_form" name="Bounce_back_form" Value="${form.bounceBackform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_form">Reply To form</label>
                                                        <input type="reply_to_form" class="form-control" id="reply_to_form" disabled="disabled" placeholder="reply_to_form" name="reply_to_form" Value="${form.replyToform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_name">Reply To Name</label>
                                                        <input type="reply_to_name" class="form-control" id="reply_to_name" disabled="disabled" placeholder="reply_to_name" name="reply_to_name" Value="${form.replyToName}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_form">Sender form</label>
                                                        <input type="sender_form" class="form-control" id="sender_form" disabled="disabled" placeholder="sender_form" name="sender_form" Value="${form.senderform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_name">Sender Name</label>
                                                        <input type="sender_name" class="form-control" id="sender_name" disabled="disabled" placeholder="sender_name" name="sender_name" Value="${form.senderName}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="subject">Subject</label>
                                                        <input type="subject" class="form-control" id="subject" disabled="disabled" placeholder="subject" name="subject" Value="${form.subject}" />
                                                    </div> --%>
                                                </form>
                                            </div>
                                            <div class="col-md-6">
                                                <form>
                                                    <div class="form-group">
                                                        <label for="form_name">Name</label>
                                                        <input type="form_name" class="form-control" id="form_name" disabled="disabled" placeholder="form_Name " name="form_name" Value="${form.name}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="form_id">ID</label>
                                                        <input type="form_id" class="form-control" id="form_id" disabled="disabled" placeholder="ID" name="Id" Value="${form.id}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="form_Created_At">Created At</label>
                                                        <input type="form_Created_At" class="form-control" id="form_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${form.createdAt}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="form_Created_By">Created By</label>
                                                        <input type="form_Created_By" class="form-control" id="form_Created_By" disabled="disabled" placeholder="Created By " name="created_by" Value="${user.name}" />
                                                    </div>
                                                    <%-- <div class="form-group">
                                                        <label for="Original_form_Group">Original_form_Group</label>
                                                        <input type="Original_form_Group" class="form-control" id="Original_form_Group" disabled="disabled" placeholder="Original_form_Group " name="Original_form_Group" Value="${form.formGroupId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Original_form_Folder">Original_form_Folder</label>
                                                        <input type="Original_form_Folder" class="form-control" id="Original_form_Folder" disabled="disabled" placeholder="Original_form_Folder " name="Original_form_Folder" Value="${form.folderId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Bounce_back_form">Bounce Back form</label>
                                                        <input type="Bounce_back_form" class="form-control" id="Bounce_back_form" disabled="disabled" placeholder="Bounce_back_form" name="Bounce_back_form" Value="${form.bounceBackform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_form">Reply To form</label>
                                                        <input type="reply_to_form" class="form-control" id="reply_to_form" disabled="disabled" placeholder="reply_to_form" name="reply_to_form" Value="${form.replyToform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_name">Reply To Name</label>
                                                        <input type="reply_to_name" class="form-control" id="reply_to_name" disabled="disabled" placeholder="reply_to_name" name="reply_to_name" Value="${form.replyToName}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_form">Sender form</label>
                                                        <input type="sender_form" class="form-control" id="sender_form" disabled="disabled" placeholder="sender_form" name="sender_form" Value="${form.senderform}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_name">Sender Name</label>
                                                        <input type="sender_name" class="form-control" id="sender_name" disabled="disabled" placeholder="sender_name" name="sender_name" Value="${form.senderName}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="subject">Subject</label>
                                                        <input type="subject" class="form-control" id="subject" disabled="disabled" placeholder="subject" name="subject" Value="${form.subject}" />
                                                    </div> --%>
                                                </form>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                                <div class="container-fluid" id="option">
                                    <div class="pull-right">
                                        <form action="FetchForm" method="POST">

                                            <input type="text" placeholder="Object to Migrate " required="required" name="inputId" id="btnMigrateId" Value="${form.id}">

                                            <button type="submit" name="btnMigrate">Migrate</button>

                                        </form>

                                    </div>
                                </div>
                    </body>

                </html>

                <%-- <body class="container-body">




                    <div class="container-fluid well  verify-head" background="/AssetMigrator/images/bg.jpg">
                        <h4><center><strong>Asset Migrator</strong></center></h4>
                        <div class="pull-right logout">
                            Welcome,
                            <strong> <%=session.getAttribute( "userName")%></strong>
                            <a href="Logout">
                                <button type="button" class="btn btn-danger">Sign Out
                                </button>
                            </a>
                        </div>
                    </div>


                    <div class="container form-body">

                        <form action="FetchLandingPage" method="POST">
                            <div class="row">
                                <div class="container-fluid" id="option">
                                    <strong> LandingPage</strong>



                                    <!--  <select class="selectpicker" id="dropDown" data-style="btn-info">
                                            <option value="FetchLandingPage">Landing pages</option>
                                            <option value="Fetchform">form</option>
                                            <option value="FetchForm">Forms</option>
                                            
                                        </select> -->


                                    <input type="text" placeholder="Enter Object id" required="required" name="inputId">

                                    <button type="submit" id="fetch" Name="btnFetch">GetObject</button>

                                </div>
                            </div>
                            <div class="form-group">

                            </div>

                            <div class="form-group">
                                <label for="form_name">Name</label>
                                <input type="form_name" class="form-control" id="form_name" disabled="disabled" placeholder="form_Name " name="form_name" Value="${landingPage.name}" />
                            </div>

                            <div class="form-group">
                                <label for="form_id">ID</label>
                                <input type="form_id" class="form-control" id="form_id" disabled="disabled" placeholder="ID" name="Id" Value="${landingPage.id}" />
                            </div>
                            <div class="form-group">
                                <label for="form_Created_At">Created At</label>
                                <input type="form_Created_At" class="form-control" id="form_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${landingPage.createdAt}" />
                            </div>

                        </form>
                        <div class="container-fluid" id="option">
                            <div class="pull-right">
                                <form action="FetchLandingPage" method="POST">

                                    <input type="text" placeholder="Object to Migrate " required="required" name="inputId" Value="${landingPage.id}">

                                    <button type="submit" name="btnMigrate">Migrate</button>

                                </form>


                            </div>
                        </div>
                    </div>



                    </body>
                    --%>