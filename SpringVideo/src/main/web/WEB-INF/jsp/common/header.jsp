<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!-- 导航条 -->
<nav class="navbar shadow navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">渡一教育</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll"
                aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
                <li class="nav-item active">
                    <a class="nav-link" href="#">首页 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">课程</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">会员</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">直播</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">工具</a>
                </li>
            </ul>
            <a href="/" data-toggle="modal" data-target="#loginModel">登录</a>&nbsp;&nbsp;/&nbsp;&nbsp;<a href=""
                                                                                                        class="mr-4"
                                                                                                        data-toggle="modal"
                                                                                                        data-target="#registModel">注册</a>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="搜索视频" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜索</button>
            </form>
        </div>
    </div>
</nav>



