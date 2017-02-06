<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
    <title>welcome to my home</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
    <script src="<%=request.getContextPath()%>/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        function goLogin() {
            var formObj = document.form1;
            var reg_user = /^[a-zA-Z0-9_.]{6,16}$/
            if (formObj.userName.value == "") {
                alert("用户信息不能为空！");
            } else if (!reg_user.test(formObj.userName.value)) {
                alert("用户名格式输入错误！");
            } else if (formObj.password.value == "") {
                alert("密码信息不能为空！");
            }else {
                formObj.action = "<%=request.getContextPath() %>/login.do";
                formObj.submit();
            }
        }
        $(function () {
            //获取输入用户明焦点
            $("input[name=userName]")[0].focus();
            //点击enter键触发登录操作
            $(document).keypress(function (event) {
                if (event.keyCode == '13') {
                    goLogin();
                }
            });
        });
    </script>
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }
    </style>

</head>
<body>

<div class="container">
    <form class="form-signin" name="form1" method="post">

        <div class="form-group">
            <label for="username">账号：</label>
            <input id="username" type="text" class="form-control" name="userName" placeholder="请输入账号">
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input id="password" type="password" class="form-control" name="password" placeholder="请输入密码">
        </div>
        <br/>

        <div class="input-group">
            <input type="button" name="loginSubmit" class="btn btn-large btn-info" onclick="goLogin();" value="登录"/>&nbsp;&nbsp;&nbsp;
            <!-- <input type="button" name="register" class="btn btn-large btn-info" onclick="goRegister();" value="注册"/> -->
        </div>
        <br/>
    </form>
</div>

</body>
</html>