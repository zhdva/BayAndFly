<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Вход</title>
    <link rel="stylesheet" type="text/css" href="/res/login.css"/>
    <script type="text/javascript">
          // Get the modal
          var modal = document.getElementById('id01');

          // When the user clicks anywhere outside of the modal, close it
          window.onclick = function(event) {
              if (event.target == modal) {
                  modal.style.display = "none";
              }
        }
    </script>
</head>
<body>

    <!-- Button to open the modal login form -->
    <button onclick="document.getElementById('id01').style.display='block'" class="loginbtn">Вход</button>

    <!-- The Modal -->
    <div id="id01" class="modal">
        <span onclick="document.getElementById('id01').style.display='none'"
        class="close" title="Close Modal">&times;</span>

        <!-- Modal Content -->
        <form class="modal-content animate" modelAttribute="user" action="/login" method="POST">
            <div class="imgcontainer">
                <img src="/res/login.png" alt="Avatar" width="200px" height="200px" class="avatar">
            </div>

            <div class="container">
                <label for="login"><b>Логин</b></label>
                <input type="text" placeholder="Enter Username" name="login" size="50" maxlength="50" required>

            <label for="password"><b>Пароль</b></label>
            <input type="password" placeholder="Enter Password" name="password" size="50" maxlength="50" required>

            <button type="submit">Войти</button>
            <label>
                <input type="checkbox" checked="checked" name="remember">Запомнить меня
            </label>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Отмена</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </div>
</body>
</html>