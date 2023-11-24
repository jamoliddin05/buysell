<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1><hr>
<h3>Подробная информация о пользователе ${user.name}: </h3>
<b>Номер телефона: </b> ${user. phoneNumber}<br>
<b>Email: </b> ${user.email}<br>

<h4>Товары пользователя ${user.name}</h4>
<#list products as product>
    <p><b>${product.title}</b> ${product.price} сум. |
        <a href="/product/${product.id}">Подробнее...</a></p>
    <#else>
    <h3>Товаров не найдено</h3>
</#list>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>

</body>
</html>