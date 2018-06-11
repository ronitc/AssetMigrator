<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html lang="en">

    <head>
        <title>Asset Migrator</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            body {
                padding-top: 0px;
                width: 100%;
                height: 100%;
                overflow: none;
            }
            .glass {
                position: relative;
                padding: 10px 0;
                border-bottom: 1px solid;
                border-bottom-color: #ccc;
                border-bottom-color: rgba(255, 255, 255, 0.2);
                background-color: rgba(255, 255, 255, 0.4);
                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
                height: 40%;
                min-height: 610px;
            }
            .glass::before {
                position: absolute;
                top: 0;
                left: 0;
                z-index: -1;
                width: 100%;
                height: 100%;
                background-position: center bottom;
                background-attachment: fixed;
                background-size: cover;
                content: "";
                -webkit-filter: blur(50px);
                filter: blur(50px);
            }
            .glass .legacy-ie-fix {
                position: absolute;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background-color: #fff;
                -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(opacity=20)";
            }
            .glass h1 {
                position: relative;
                margin: 0;
                color: black;
                color: rgba(255, 255, 255, 1);
                font-size: 180px;
                font-weight: normal;
                font-family: "Megrim", sans-serif;
                line-height: 1;
                text-align: center;
                -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(opacity=50)";
            }
            @media only screen {
                .glass h1 {
                    -ms-filter: "none";
                }
            }
            .container {
                width: 756px;
            }
        }
        .jumbotron {
            padding-top: 0px;
            padding-bottom: 0px;
            margin-bottom: 0px;
        }
        .jumbotron {
            padding-top: 13px;
            padding-bottom: 35px;
            margin-bottom: 0px;
            height: 150px;
            background: transparent;
        }
        .panel-default {
            width: 722px;
            margin-left: 19px;
            margin-top: 5px;
            background: transparent;
            border: none;
        }
        .panel-body {
            height: 100px;
            padding: 24px;
        }
        strong,
        h1,
        p {
            color: white;
        }
        .row {
            background: transparent;
        }
        .col-sm-7 {
            margin-left: 85px;
        }
        h3{
        	text-align: center;
        }
        
        .col-sm-7 
        {
        	margin-left: 133px;
        }
        </style>
    </head>

    <body background="/AssetMigrator/images/migration.jpg" />


    <div class="jumbotron">
        <div class="container">
            <h1>
				<strong>Asset </strong> <font color="white">Migrator</font>
			</h1>
            <p>
                for <strong><font color="#F22613">ELOQUA</font></strong>
            </p>
        </div>
    </div>


    <div class="container header glass">

        <div class="panel panel-default" id="blur">

            <div class="panel-body" id="blurx">
                <div class="container">
                    <!-- row of columns -->
                    <div class="row">
                        <div class="col-sm-7 col-sm-offset-4">

                            <h2><font color="oldlace">Please Enter your credentials</h2>
                            <form class="form-horizontal" method="post" action="Authenticate">
                                <div>
                                    <div class="form-group">
                                    	<h3>Source Instance</h3>
                                        <label class="col-sm-3 control-label">Company Name</label>
                                        <div class="col-sm-9">
                                            <input type="text" class="form-control" value="SymantecSandbox2" placeholder="Company Name" name="companyName" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">User name</label>
                                        <div class="col-sm-9">
                                            <input type="text" class="form-control" value="Ronit.chougule" placeholder="User name" name="userName" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Password</label>
                                        <div class="col-sm-9">
                                            <input type="password" class="form-control" value="Ronit@kdym1" placeholder="Password" name="password" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-9">
                                            <!-- <button type="submit" class="btn btn-primary btn-lg">Sign In
                                            </button> -->

                                            <!--To display error if incorrect information is entered  -->
                                            <font color="red"> ${errorMessage} </font>
                                        </div>
                                    </div>
                                    <H3>Destination Instance</H3>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Destination Company Name</label>
                                        <div class="col-sm-9">
                                            <input type="text" class="form-control" value="SymantecSandbox1" placeholder="Company Name" name="DcompanyName" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Destination User name</label>
                                        <div class="col-sm-9">
                                            <input type="text" class="form-control" value="Ronit.chougule" placeholder="User name" name="DuserName" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Destination Password</label>
                                        <div class="col-sm-9">
                                            <input type="password" class="form-control" value="Ronit@kdym1" placeholder="Password" name="Dpassword" required="required">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-9">
                                            <button type="submit" class="btn btn-primary btn-lg"> Sign In
                                            </button>

                                            <!--To display error if incorrect information is entered  -->
                                            <font color="red"> ${errorMessage} </font>
                                        </div>
                                    </div>
                                </div>

                            </form>
                        </div>
                        <!-- /col-md-7 col-md-offset-4 -->
                    </div>




                </div>
            </div>


        </div>

        </body>

    </html>