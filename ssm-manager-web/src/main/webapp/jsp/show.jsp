<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>姓名</td>
            <td>${user.username}</td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>${user.age}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${user.sex}</td>
        </tr>
    </table>
    <a href="http://localhost:8081/error/test">全局异常小测试</a>
</body>
</html>
