toastr.options.positionClass = 'toast-bottom-right';

// 注册
function Enroll() {
    //获取input输入的内容
    var pass1 = $("#password1").val();
    var pass2 = $("#password2").val();
    var usna = $("#username1").val();
    var file = $("#file").val();
    var formData = new FormData(document.getElementById("enrollform"));
    if (usna==""){
        toastr.error("用户名不能为空");
        document.getElementById("usna").innerHTML="用户名不能为空";
    }
    if (file==null){
        toastr.error("选择一个头像");
    }
    //判断输入的内容是否相等
    if (pass1!=pass2){
        //这是一个提示窗简单的使用toastr.error("输入密码不一致");
        toastr.error("输入密码不一致");
        document.getElementById("pass12").innerHTML="用户名不能为空";
    } else if(pass1 != "") {
        $.ajax({
            url : 'enroll',
            type : 'post',
            data : formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success : function (data) {
                toastr.success(data);
            },
            error: function () {
                //请求发生错误会调用error: function () {
                //并且显示提示窗
                toastr.error('注册失败');
            },
        });
    }else {
        toastr.error('密码为空');

    }

}
// 登陆
function Login() {
    $.ajax({
        url : 'login',
        type : 'post',
        data : $('#loginfrom').serialize(),
        success : function (data) {
            if (data == "error"){
                toastr.success("登录失败");

            }else {
                toastr.error(data);
                window.location="/";
            }
        },
        error: function () {
            toastr.error('失败');
        },
    });

}
// 上传图片
function addArticle(){
    var formData = new FormData(document.getElementById("addform"));
    like=window.confirm("是否要上传图片？？？");
    if (like==true){
        $.ajax({
            url : "upimgadd",
            type : "post",
            data : formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success : function (data) {
                toastr.success(data);
            },
            error: function () {
                toastr.error('添加失败');
            },
        })
    }
}

// 加载初始数据（全部的数据）
$(document).ready(function () {
    // get获取后台json
    $.getJSON("http://localhost:8080/getimglist",function(imgList){
        // 使用itme来遍历
        new Item(imgList);
    });
    $.getJSON("http://localhost:8080/getlwinfo?&offset=0",function(lwList){
        // 使用itme来遍历
        new LwItem(lwList);
    });

});
// 遍历图片列表
function Item(imgList) {
    $("div#works").empty();
    var str="";
    $.each(imgList,function(i,item){
        str+="<figure class=\"effect-oscar  wowload fadeIn\">";
        str+="<img src="+item.imgpic+" alt="+item.imgtitle+"/>";
        str+="<figcaption>";
        str+="<h2>"+item.imgcate+"</h2>";
        str+="<p>"+item.imgtitle+"<br/>";
        str+="<a href="+item.imgpic+" title="+item.imgtitle+" data-gallery=\"\">查看大图</a></p>";
        str+="</figcaption>";
        str+="</figure>";
    });
    $("div#works").append(str);
}
// 获取对应分类的数据
function getCate(obj) {
    var cate = $(obj).text();
    // get获取后台json
    $.getJSON("http://localhost:8080/getimglist?cate="+cate,function(imgList){
        // 使用itme来遍历
        new Item(imgList);
    });

}

// 添加评论
function setLW() {
    var lw =  $("#LW").val();
    if (lw==null){
        toastr.error("不能为空！")
    }else {
        $.ajax({
            url : 'setlw',
            type : 'post',
            data : $('#lwform').serialize(),
            success : function (data) {
                if (data == "login"){
                    toastr.error('请先登录....');
                }
                toastr.success('留言成功');
            },
            error: function () {
                //请求发生错误会调用error: function () {
                //并且显示提示窗
                toastr.error('遇到了错误...');
            },
        });
    }
}

// 遍历所有评论
var offset = 3;
function getLwup() {

    $.getJSON("http://localhost:8080/getlwinfo?offset="+offset,function(lwList){
        // 使用itme来遍历
        new LwItem(lwList);
    });
    offset= offset+3;
}

function getLwLow() {
    $.getJSON("http://localhost:8080/getlwinfo?offset="+offset,function(lwList){
        // 使用itme来遍历
        new LwItem(lwList);
    });
    offset= offset-3;
}





function LwItem(lwList) {

    $("div#lwitem").empty();
    var str = "";
    $.each(lwList,function (i, item) {
        str+="<div class=\"item active animated bounceInRight row\">";
        str+="<div class=\"animated slideInLeft col-xs-2\"><img alt=\"portfolio\" src="+'image/'+item.userpic+" width=\"100\" class=\"img-circle img-responsive\"/></div>";
        str+="<div  class=\"col-xs-10\">";
        str+="<p>"+item.lword+"</p>";
        str+="<span>userID - <b>"+item.username+"</b></span>";
        str+="</div>";
        str+="</div>";
    });
    $("div#lwitem").append(str);
}

// 修改用户信息

function upData() {
    //获取input输入的内容
    var pass1 = $("#passwordup1").val();
    var pass2 = $("#passwordup2").val();
    //判断输入的内容是否相等
    if (pass1!=pass2){
        //这是一个提示窗简单的使用toastr.error("输入密码不一致");
        toastr.error("输入密码不一致");
    } else if(pass1 != "") {
        $.ajax({
            url : 'updatainfo',
            type : 'post',
            data : $('#upDataInfo').serialize(),
            success : function (data) {
                if (data==="修改成功"){
                    toastr.success(data);
                }
                else {
                    toastr.error(data);
                }
            },
            error: function () {
                //请求发生错误会调用error: function () {
                //并且显示提示窗
                toastr.error('修改失败');
            },
        });
    }else {
        toastr.error('密码为空');

    }
}