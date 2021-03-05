<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/upload.do" method="post" enctype="multipart/form-data">
    <input name="text" type="text" value="">
    <input type="file" name="file" >
    <button>提交</button>
  </form>

  <a href="/download.do" >download</a>
  </body>
</html>
