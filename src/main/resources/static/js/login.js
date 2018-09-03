$(function () {
     alert(window.location.host);
});

$("#submit_bt").on("click", function () {
    var login_name = $("#login-name").val();
    var login_pass = $("#login-pass").val();
    if (login_name == null || login_name == "") {

    }
    if (login_pass == null||login_pass == "") {

    }




    function getQueryData(title, url, param, handler) {
        $.ajax({
            type: "POST",
            url: url,
            data: param,
            dataType: "json",
            success: function (data) {
                if (data == null || !data.success) {
                    bootbox.alert(title + "数据获取失败！");
                    return;
                }
                handler.call(this, data.obj);
            },
            error: function () {
                bootbox.alert(title + "ajax请求失败！");
            }
        });
    }
});