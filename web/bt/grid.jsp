<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2021/10/16
  Time: 1:47 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网格系统/栅格系统</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--    引入css文件--%>
    <link rel="stylesheet" href="/servlet/plugins/bs/css/bootstrap.min.css">
</head>
<body>

<button class="btn btn-default">默认按钮</button>
<button class="btn btn-info">信息按钮</button>
<button class="btn btn-primary">主题按钮</button>
<button class="btn btn-danger">危险按钮</button>
<button class="btn btn-success">成功按钮</button>
<buttton class="btn btn-warning">警告按钮</buttton>
<button class="btn btn-link">链接按钮</button>

<hr>

<%--    布局--%>
<div class="container" style="border:1px solid red;height: 350px;">
    container.. 左右两边会留白
</div>

<div class="container-fluid">
    <%--        定义行 - 永远只有12列--%>
    <div class="row">
        <%--            定义列--%>
        <div class="col-md-3 col-xs-6">
            <img src="../img/ya.png">
        </div>
        <div class="col-md-3 col-xs-6">
            <img src="../img/ya.png">
        </div>
        <div class="col-md-3 col-xs-6">
            <img src="../img/ya.png">
        </div>
        <div class="col-md-3 col-xs-6">
            <img src="../img/ya.png">
        </div>
        <div class="col-md-3 col-xs-6">
            <img src="../img/ya.png">
        </div>
    </div>
</div>

<%--    引入jquery文件,注意点:bootstrap框架是依赖于jquery框架,所以必须先引入jquery--%>
<script src="/servlet/plugins/jquery/jquery.min.js"></script>
<script src="/servlet/plugins/bs/js/bootstrap.min.js"></script>
</body>
</html>
