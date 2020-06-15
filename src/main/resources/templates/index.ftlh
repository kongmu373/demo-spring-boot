<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#--${list}-->
<table>
    <thead>
    <tr>
        <th>排名</th>
        <th>名字</th>
        <th>分数</th>
    </tr>
    </thead>
    <tbody>
    <#list list as item>
        <tr>
            <td>${item?index}</td>
            <td>${item.user.name}</td>
            <td>${item.score}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>