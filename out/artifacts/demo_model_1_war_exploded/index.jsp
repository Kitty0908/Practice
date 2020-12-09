<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>小旋风商业集团</title>
    <style>
      .loginBox{
        background: lightblue;
        width: 270px;
        height: 180px;
        margin: 10px 10px;
        border: 3px solid dodgerblue;
        border-radius: 10px;
      }
      .loginBox tr{
        height: 35px;
      }
      .loginBox button{
        margin: 10px;
      }
    </style>
    <script>
      window.onload=function (){
        let login = document.getElementById("login");
        let register = document.getElementById("register");

        login.onclick = loginFun();
        register.onclick = registFun();

        function loginFun(){
          let username = document.getElementById("username").value;
          let password = document.getElementById("password").value;

          let xmlHttps = new XMLHttpRequest();
          xmlHttps.open("","",true);
          xmlHttps.onreadystatechange = function(){
            if(this.readyState == 4 && this.status == 200){
              doBack();
            }
          }
        }

        function registFun(){

        }

        function doBack(){

        }
      }

    </script>
  </head>
  <body>
  <div class="loginBox" align="center">
    <table>
      <thead><tr><td colspan="2" align="center"><h3>用户登录</h3></td></tr></thead>
      <tBody>
      <tr><td>账号：</td><td><input type="text" id="username" value="" required="required"></td></tr>
      <tr><td>密码：</td><td><input type="password" id="password" value="" required="required"></td></tr>
      <tr><td colspan="2" align="center"><button id="login">登录</button><button id="register">注册</button></td></tr>
      </tBody>
    </table>
  </div>
  </body>
</html>
