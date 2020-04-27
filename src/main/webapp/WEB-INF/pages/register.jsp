<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Регистрация</title>
  <link href="<c:url value="/res/register.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body>
  <form class="regform">
      <div class="container">
        <h1>Регистрация</h1>
        <p>Пожалуйста, заполните поля формы.</p>
        <hr>

        <label for="first name"><b>Имя</b></label>
        <input type="text" placeholder="Введите имя" name="first name" required>

        <label for="last name"><b>Фамилия</b></label>
        <input type="text" placeholder="Введите фамилию" name="last name" required>

        <label for="login"><b>Логин</b></label>
        <input type="text" placeholder="Введите логин" name="login" required>

        <label for="psw"><b>Пароль</b></label>
        <input type="password" placeholder="Введите пароль" name="psw" required>

        <label for="psw-repeat"><b>Повторите пароль</b></label>
        <input type="password" placeholder="Повторите пароль" name="psw-repeat" required>

        <label>
          <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Запомнить меня
        </label>

        <p>При создании аккаунта вы ни с чем не соглашаетесь.</p>

        <button type="submit" class="signupbtn">Создать аккаунт</button>

      </div>
    </form>
</body>
</html>