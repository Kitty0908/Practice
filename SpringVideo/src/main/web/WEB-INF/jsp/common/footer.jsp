<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- 网站尾部 -->
<div class="bg-light">
    <hr class="btn-muted">
    <div class="container text-secondary pt-3" style="font-size: 13px">
        <div class="row">
            <a href="#" class="text-reset">帮助中心</a>&nbsp;&nbsp;
            <a href="#" class="text-reset">联系我们</a>&nbsp;&nbsp;
            <a href="#" class="text-reset">关于我们</a>&nbsp;&nbsp;
            <a href="#" class="text-reset">客服QQ: 123</a>
        </div>
        <br>
        <div class="row">
            <a href="#" class="text-reset">官方粉丝群: 123123</a>&nbsp;&nbsp;<text>Copyright © 2019 上海XXXXXXXXXX公司 Java课堂
            沪ICP备XXX
        </text>
        </div>
    </div>
    <br>
</div>


<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
<%--<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"--%>
<%--        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">--%>
<%--</script>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous">
</script>


<!-- 登录 Model -->
<div class="modal fade" id="loginModel" data-backdrop="static" data-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">登录</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form>
                <div class="modal-body">

                    <div class="form-group">
                        <label for="email">邮箱</label>
                        <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
                        <small id="emailHelp" class="form-text text-muted">我们不会将您的邮箱用作其他用途</small>
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input type="password" class="form-control" id="password">
                    </div>
                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="autoLogin">
                        <label class="form-check-label" for="autoLogin">自动登录</label>
                        <a class="float-right" href="" data-dismiss="modal">忘记密码</a>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                    <input type="submit" class="btn btn-primary" value="登录"/>
                </div>
            </form>
            <a href="#" class="ml-3 mb-2" data-dismiss="modal" data-toggle="modal"
               data-target="#registModel">还没有账号？点我注册</a>
        </div>
    </div>
</div>

<!-- 注册 Model -->
<div class="modal fade" id="registModel" data-backdrop="static" data-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="registLabel">注册</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="/regist" method="post" onsubmit="return checkOnSubmit();">
                    <div class="form-group">
                        <label for="rEmail">邮箱</label>
                        <input name="email" type="email" class="form-control" required="required" id="rEmail"
                               aria-describedby="rEmailHelp" onblur="checkEmail(this)"
                        >
                        <small id="rEmailHelp" class="form-text text-danger"></small>
                    </div>
                    <div class="form-group">
                        <label for="RegPasswordInput">密码</label>
                        <input name="password" type="password" maxlength="16" onchange="checkPwd()"
                               class="form-control" required="required" id="RegPasswordInput">
                        <small id="RegPwdInputHelp" class="form-text text-danger"></small>
                    </div>
                    <div class="form-group">
                        <label for="confirmPassword">确认密码</label>
                        <input type="password" required="required"
                               class="form-control" id="confirmPassword" maxlength="16" onchange="checkPwd()">
                        <small id="RegPwdConfirmHelp" class="form-text text-danger"></small>
                    </div>
                    <div class="form-group">
                        <label for="RegCheckCode">验证码：</label>
                        <div class="row">
                            <input name="vcode" type="text" class="form-control col-6 ml-3" maxlength="4"
                                   id="RegCheckCode">
                            <img class="col-4" style="cursor: pointer" src="http://localhost:8080/vCode"
                                 onclick="changeVCode(this)"
                            />
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                        <input type="submit" class="btn btn-primary" id="registButton"
                               value="注册"
                        />
                    </div>
                </form>
                <a href="#" class="mb-3" data-dismiss="modal" data-toggle="modal"
                   data-target="#loginModel">已有账号？点我登录</a>
            </div>
        </div>
    </div>
</div>

<script type="application/javascript">

    window.onload = function(){

        document.getElementById("confirmPassword");

    }

    function checkEmail(emailNode){
        let email = emailNode.value;
        let pattern = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
        if(!pattern.test(email)){
            $("#rEmail").removeClass("is-valid").addClass("is-invalid");
            $("#rEmailHelp").text("邮箱格式不正确");
            return;
        }

        $.ajax({
            url:"/checkEmail?email="+email,
            success:function(result){
                let resp = result;
                if(resp.code == -1 || resp.code == 0){
                    $("#rEmail").removeClass("is-valid").addClass("is-invalid");
                    $("#rEmailHelp").text(resp.message);
                }else{
                    $("#rEmail").removeClass("is-invalid").addClass("is-valid");
                    $("#rEmailHelp").text("");
                }
            }
        });
    }

    function changeVCode(imgNode){
        imgNode.src = "/vCode?ram="+new Date().getTime();
    }

    function checkPwd() {
        let pwdValue = $("#RegPasswordInput").val(),
         pwdConfirmValue = $("#confirmPassword").val(),
         length = pwdValue.length;
        if(length < 6){
            $("#RegPwdInputHelp").text("密码长度最少6位，请检查或重新输入");
            return ;
        }else if(length>16){
            $("#RegPwdInputHelp").text("密码长度最多16位，请检查或重新输入");
            return ;
        }
        $("#RegPwdInputHelp").text("");
        if(pwdValue !== pwdConfirmValue ){
            $("#RegPwdConfirmHelp").text("两次密码不一致，请检查或重新输入");
        }else{
            $("#RegPwdConfirmHelp").text("");
        }
    }

    function checkOnSubmit(){
        if(
            $("#RegPwdConfirmHelp").text() == ""
            && $("#rEmailHelp").text() == ""
            && $("#RegPwdInputHelp").text() == ""
        ){
            return true;
        }
        return false;
    }

</script>