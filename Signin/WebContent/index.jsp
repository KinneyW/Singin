<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">

<head>
<meta charset="utf-8">
<title>实习生签到系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Loading Bootstrap -->
<link href="lib/flat-ui/css/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Loading Flat UI -->
<link href="lib/flat-ui/css/flat-ui.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="container">
		<div class="row">
			<div
				class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
				<form id="login-form" class="login-form" onsubmit="userLogin()">
					<div class="login-header">实习生签到</div>
					<div class="form-group">
						<input name="userid" type="text" class="form-control" placeholder="用户ID">
						<span class="form-control-feedback fui-user"></span>
					</div>
					<div class="form-group">
						<input name="password" type="password" class="form-control" placeholder="密码">
						<span class="form-control-feedback fui-lock"></span>
					</div>
					<input type="submit" class="btn btn-block btn btn-primary btn-lg" value="登陆">
				</form>
			</div>

		</div>

	</div>
	<!-- /.container -->


	<!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
	<script src="lib/flat-ui/js/vendor/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="lib/flat-ui/js/flat-ui.min.js"></script>
	<script src="lib/jquery-form.js"></script>
	<script type="text/javascript">
		function userLogin(){
			$("#login-form").ajaxSubmit({
				type:"post",
				url:"<%=request.getContextPath()%>/login.do",
				success:function(data,status){
					
						alert('成功');
					
				},
				error: function(XMLHttpRequest, textStatus, errorThrown) {
					alert(XMLHttpRequest.status);
					alert(XMLHttpRequest.readyState);
					alert(textStatus);
                }
			})
		}
	</script>
</body>

</html>