layui.use(['jquery','layer', 'table','form','laydate'], function() {
    var $ = layui.jquery    //引入jquery模块
        , layer = layui.layer  //引用layer弹出层模块
        , table = layui.table  //引用table数据表格模块

    //layer.msg("测试！！");

    //加载所有员工数据
    loadAllEmp();

    //加载所有员工数据
    function loadAllEmp() {
        $.ajax({
            type:'POST',
            url:'/demo/test',  //调用的是base系列的方法，只需要改mapper.xml文件
            success:function (data) {
                console.log(data);
            },
            error:function () {
                layer.msg("服务器异常！！！",{icon: 6,time:2000,anim: 6,shade:0.5});
            }
        });
    }

})