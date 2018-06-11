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
                                        <li class="active"><a href="LandingPage.jsp">Landing Pages</a>
                                        </li>
                                        <li><a href="form.jsp">Form</a>
                                        </li>
                                        <li class=""><a href="campaign.jsp">Campaign</a>
                                        </li>

                                    </ul>
                                </div>
                            </nav>
                        </div>
                        <!--      panel			-->
                        <div class="container form-body">

                            <form action="FetchLandingPage" method="POST">
                                <div class="row">
                                    <div class="container-fluid" id="option">
                                        <strong>LandingPage</strong>
                                        <input type="text" placeholder="Enter Object id" required="required" name="inputId" id="inputId">

                                        <button id="getmail" Name="btnFetch">GetObject</button>
                                        <br>
                                        <br>
                                        <%-- <a href="<%=" LandingPage.jsp "%>">Landing Page**** UnderConstruction**** </a>
                                            <br>
                                            <br> --%>
                                            <!-- <button id="createEmailGroup" Name="btncreateEmailGroup" onclick="/">Create Email Group</button><br><br> -->
                                    </div>
                                </div>
                                <div class="col-md-12">
                                    <div class="panel panel-default" style="height:69% ; overflow:auto;">
                                        <div class="panel-body" id="panel-data">
                                            <div class="col-md-6">
                                                <form>
                                                    <div class="form-group">
                                                        <label for="email_name">Name</label>
                                                        <input type="email_name" class="form-control" id="email_name" disabled="disabled" placeholder="Email_Name " name="email_name" Value="${landingPage.name}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="email_id">ID</label>
                                                        <input type="email_id" class="form-control" id="email_id" disabled="disabled" placeholder="ID" name="Id" Value="${landingPage.id}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="email_Created_At">Created At</label>
                                                        <input type="email_Created_At" class="form-control" id="email_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${landingPage.createdAt}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="email_Created_By">Created By</label>
                                                        <input type="email_Created_By" class="form-control" id="email_Created_By" disabled="disabled" placeholder="Created By " name="created_by" Value="${user.name}" />
                                                    </div>
                                                    <%-- <div class="form-group">
                                                        <label for="Original_email_Group">Original_email_Group</label>
                                                        <input type="Original_email_Group" class="form-control" id="Original_email_Group" disabled="disabled" placeholder="Original_email_Group " name="Original_email_Group" Value="${landingPage.emailGroupId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Original_email_Folder">Original_email_Folder</label>
                                                        <input type="Original_email_Folder" class="form-control" id="Original_email_Folder" disabled="disabled" placeholder="Original_email_Folder " name="Original_email_Folder" Value="${landingPage.folderId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Bounce_back_email">Bounce Back Email</label>
                                                        <input type="Bounce_back_email" class="form-control" id="Bounce_back_email" disabled="disabled" placeholder="Bounce_back_email" name="Bounce_back_email" Value="${email.bounceBackEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_email">Reply To Email</label>
                                                        <input type="reply_to_email" class="form-control" id="reply_to_email" disabled="disabled" placeholder="reply_to_email" name="reply_to_email" Value="${email.replyToEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_name">Reply To Name</label>
                                                        <input type="reply_to_name" class="form-control" id="reply_to_name" disabled="disabled" placeholder="reply_to_name" name="reply_to_name" Value="${email.replyToName}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_email">Sender Email</label>
                                                        <input type="sender_email" class="form-control" id="sender_email" disabled="disabled" placeholder="sender_email" name="sender_email" Value="${email.senderEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_name">Sender Name</label>
                                                        <input type="sender_name" class="form-control" id="sender_name" disabled="disabled" placeholder="sender_name" name="sender_name" Value="${email.senderName}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="subject">Subject</label>
                                                        <input type="subject" class="form-control" id="subject" disabled="disabled" placeholder="subject" name="subject" Value="${email.subject}" />
                                                    </div> --%>
                                                </form>
                                            </div>
                                            <div class="col-md-6">
                                                <form>
                                                    <div class="form-group">
                                                        <label for="email_name">Name</label>
                                                        <input type="email_name" class="form-control" id="email_name" disabled="disabled" placeholder="Email_Name " name="email_name" Value="${landingPage.name}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="email_id">ID</label>
                                                        <input type="email_id" class="form-control" id="email_id" disabled="disabled" placeholder="ID" name="Id" Value="${landingPage.id}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="email_Created_At">Created At</label>
                                                        <input type="email_Created_At" class="form-control" id="email_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${landingPage.createdAt}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="email_Created_By">Created By</label>
                                                        <input type="email_Created_By" class="form-control" id="email_Created_By" disabled="disabled" placeholder="Created By " name="created_by" Value="${user.name}" />
                                                    </div>
                                                    <%-- <div class="form-group">
                                                        <label for="Original_email_Group">Original_email_Group</label>
                                                        <input type="Original_email_Group" class="form-control" id="Original_email_Group" disabled="disabled" placeholder="Original_email_Group " name="Original_email_Group" Value="${email.emailGroupId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Original_email_Folder">Original_email_Folder</label>
                                                        <input type="Original_email_Folder" class="form-control" id="Original_email_Folder" disabled="disabled" placeholder="Original_email_Folder " name="Original_email_Folder" Value="${email.folderId}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="Bounce_back_email">Bounce Back Email</label>
                                                        <input type="Bounce_back_email" class="form-control" id="Bounce_back_email" disabled="disabled" placeholder="Bounce_back_email" name="Bounce_back_email" Value="${email.bounceBackEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_email">Reply To Email</label>
                                                        <input type="reply_to_email" class="form-control" id="reply_to_email" disabled="disabled" placeholder="reply_to_email" name="reply_to_email" Value="${email.replyToEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="reply_to_name">Reply To Name</label>
                                                        <input type="reply_to_name" class="form-control" id="reply_to_name" disabled="disabled" placeholder="reply_to_name" name="reply_to_name" Value="${email.replyToName}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_email">Sender Email</label>
                                                        <input type="sender_email" class="form-control" id="sender_email" disabled="disabled" placeholder="sender_email" name="sender_email" Value="${email.senderEmail}" />
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="sender_name">Sender Name</label>
                                                        <input type="sender_name" class="form-control" id="sender_name" disabled="disabled" placeholder="sender_name" name="sender_name" Value="${email.senderName}" />
                                                    </div>

                                                    <div class="form-group">
                                                        <label for="subject">Subject</label>
                                                        <input type="subject" class="form-control" id="subject" disabled="disabled" placeholder="subject" name="subject" Value="${email.subject}" />
                                                    </div> --%>
                                                </form>
                                            </div>


                                        </div>
                                    </div>
                                </div>
                                <div class="container-fluid" id="option">
                                    <div class="pull-right">
                                        <form action="FetchLandingPage" method="POST">

                                            <input type="text" placeholder="Object to Migrate " required="required" name="inputId" id="btnMigrateId" Value="${landingPage.id}">

                                            <button type="submit" name="btnMigrate">MigrateMail</button>

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
                                            <option value="Fetchemail">Email</option>
                                            <option value="FetchForm">Forms</option>
                                            
                                        </select> -->


                                    <input type="text" placeholder="Enter Object id" required="required" name="inputId">

                                    <button type="submit" id="fetch" Name="btnFetch">GetObject</button>

                                </div>
                            </div>
                            <div class="form-group">

                            </div>

                            <div class="form-group">
                                <label for="email_name">Name</label>
                                <input type="email_name" class="form-control" id="email_name" disabled="disabled" placeholder="Email_Name " name="email_name" Value="${landingPage.name}" />
                            </div>

                            <div class="form-group">
                                <label for="email_id">ID</label>
                                <input type="email_id" class="form-control" id="email_id" disabled="disabled" placeholder="ID" name="Id" Value="${landingPage.id}" />
                            </div>
                            <div class="form-group">
                                <label for="email_Created_At">Created At</label>
                                <input type="email_Created_At" class="form-control" id="email_Created_At" disabled="disabled" placeholder="Created At " name="created_at" Value="${landingPage.createdAt}" />
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