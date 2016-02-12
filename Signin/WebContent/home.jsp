<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="utf-8">
    <title>实习生签到系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap -->
    <link href="lib/flat-ui/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Flat UI -->
    <link href="lib/flat-ui/css/flat-ui.min.css" rel="stylesheet">


    <!-- FullCalendar -->
    <link rel="stylesheet" type="text/css" href="lib/fullcalendar/fullcalendar.min.css">

    <!-- 自定义样式 -->
    <link rel="stylesheet" type="text/css" href="css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-3">
                    <span class="sr-only">Toggle navigation</span>
                </button>
                <a class="navbar-brand" href="#">签到系统</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-collapse-3">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">签到</a></li>
                    <li><a href="#">考勤</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">退出</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        <div class="row">
            <div class="col-xs-12 col-sm-8">

                <button class="btn btn-primary btn-block btn-sign">点我签到</button>

            </div>
            <div class="col-xs-12 col-sm-4">
                <div class="sign-info">
                    <div class="sign-info-line">
                        <span class="fui-user"></span>
                        <label>姓名：</label>
                        <label id="username">章琦</label>
                    </div>
                    <div class="sign-info-line">
                        <span class="fui-calendar"></span>
                        <label>日期：</label>
                        <label id="datetime">2016年1月28日</label>
                    </div>
                    <div class="sign-info-line">
                        <span class="fui-calendar"></span>
                        <label>本月签到天数：</label>
                        <label id="signdays">28天</label>
                    </div>

                    <div id="calendar-home" class="cal"></div>

                </div>
            </div>
        </div>
    </div>
    <!-- /.container -->


    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src="lib/flat-ui/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="lib/flat-ui/js/flat-ui.min.js"></script>、
    <script src="lib/fullcalendar/moment.min.js"></script>
    <script src="lib/fullcalendar/fullcalendar.min.js"></script>
    <script src="lib/fullcalendar/zh-cn.js"></script>
    <script>
        $(function () {
            $('#calendar-home').fullCalendar({
                header: false,
                businessHours: true, // display business hours
                firstDay: 0,
                editable: true,
                events: [
//                    {
//                        start: '2016-02-03',
//                        rendering: 'background',
//                        color: '#15be97'
//				    }
                ]
            });
        });
    </script>

</body>

</html>