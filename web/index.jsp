<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2021/10/16
  Time: 9:28 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <title>用户登录</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <%--    引入css文件--%>
  <link rel="stylesheet" href="/servlet/plugins/bs/css/bootstrap.min.css">
</head>
<body>
<%--    定义导航--%>
<div class="container-fluid">
  <%--        定义行--%>
  <div class="row">
    <nav class="navbar navbar-inverse" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse"
                  data-target="#example-navbar-collapse">
            <span class="sr-only">切换导航</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">伟大的江科大</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="/servlet/index.jsp">首页</a></li>
            <li><a href="/servlet/user/loginView">登录</a></li>
            <li><a href="#">注册</a></li>
            <li><a href="#">安全退出</a></li>
            <li><a href="#">我的订单</a></li>
            <li><a href="#">我的购物车</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                个人中心 <b class="caret"></b>
              </a>
              <ul class="dropdown-menu">
                <li><a href="#">jmeter</a></li>
                <li><a href="#">EJB</a></li>
                <li><a href="#">Jasper Report</a></li>
                <li class="divider"></li>
                <li><a href="#">分离的链接</a></li>
                <li class="divider"></li>
                <li><a href="#">另一个分离的链接</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</div>

<%--    引入jquery文件,注意点:bootstrap框架是依赖于jquery框架,所以必须先引入jquery--%>
<script src="/servlet/plugins/jquery/jquery.min.js"></script>
<script src="/servlet/plugins/bs/js/bootstrap.min.js"></script>
</body>
</html>

