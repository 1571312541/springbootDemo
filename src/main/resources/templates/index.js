function getUser() {
    $.ajax({
        type:"post",
        url:"user/getUser",
        data:"",
        dataType:"json",
        success:function (data) {
            console.log(data);
            alert("成功");
        },error:function (res) {
            alert("请求出错"+res);
        }

    });
}