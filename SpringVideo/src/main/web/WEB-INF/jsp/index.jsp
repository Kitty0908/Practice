<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>渡一教育</title>

    <style>
        .videoSelected:hover{
        /*  鼠标变成小手  */
            cursor: pointer;
        /*  字体变成红色+下划线  */
            color: red ;
            text-decoration: underline;
        /*  外边框+阴影  */
            box-shadow: 3px 3px 5px #c2bebe;
        }
    </style>
</head>
<body>
<jsp:include page="../jsp/common/header.jsp"></jsp:include>
<br><br>

<div class="container">
    <!-- 图片轮播 -->
    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="http://localhost:8080/static/img/1.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
                <img src="http://localhost:8080/static/img/2.jpg" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
                <img src="http://localhost:8080/static/img/3.jpg" class="d-block w-100" alt="...">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>

<br>

<div class="container">
    <a href="#" class="float-right">更多 ></a>
    <h4 class="text-center">最新课程</h4>
    <hr class="btn-dark">
    <div class="row">
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
    </div>
</div>
    <br>
<div class="container">
    <a href="#" class="float-right">更多 ></a>
    <h4 class="text-center">常用框架</h4>
    <hr class="btn-dark">
    <div class="row">
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="card videoSelected">
                <img src="http://localhost:8080/static/img/1.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">SpringMvc</h5>
                    <p class="card-text">1234人观看</p>
                    <a href="#" class="badge badge-success">免费</a>
                </div>
            </div>
        </div>
    </div>
</div>
<br>

<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>
