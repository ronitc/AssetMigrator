<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html lang="en">

    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            body {
                background-image: url("img/logx.jpg");
                width: 100%;
                height: 100%;
            }
            .glass {
                position: relative;
                padding: 10px 0;
                border-bottom: 1px solid;
                border-bottom-color: #ccc;
                border-bottom-color: rgba(255, 255, 255, 0.2);
                background-color: rgba(255, 255, 255, 0.4);
                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
                height: 100%;
                min-height: 770px;
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
                width: 500px;
            }
            .panel {
                width: 450px;
                margin-left: 24px;
                margin-top: 187px;
            }
        </style>
    </head>

    <body>
        <div class="container header glass" style="float:left; width:10%; background-color: rgba(42, 45, 45, 0.6);"></div>
        <div class="container header glass" style="float:right; width:10%; background-color: rgba(42, 45, 45, 0.6);"></div>
        <div class="container header glass">

            <div class="panel panel-default" id="blur">
                <div class="panel-body" id="blurx">
                    <div class="row">
                        <div class="col-sm-7 col-sm-offset-2">
                            <h2>Please Enter your credentials</h2>
                            <form class="form-horizontal" method="post" action="Authenticate">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Company Name</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" placeholder="Company Name" name="companyName" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">User name</label>
                                    <div class="col-sm-9">
                                        <input type="text" class="form-control" placeholder="User name" name="userName" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Password</label>
                                    <div class="col-sm-9">
                                        <input type="password" class="form-control" placeholder="Password" name="password" required="required">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-sm-offset-3 col-sm-9">
                                        <button type="submit" class="btn btn-primary btn-lg">Sign In
                                        </button>

                                        <!--To display error if incorrect information is entered  -->

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