<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link href="../show/lib/layui/css/layui.css" rel="stylesheet">
<script type="text/javascript" src="../show/lib/layui/layui.all.js"></script>
<script src="../show/js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="../show/js/my.js"></script>

<title></title>
</head>
<body>
<style>
.layui-input{width:200px;}
</style>
<form class="layui-form" lay-filter="myform">

 <div class="layui-form-item">
    <label class="layui-form-label">联系人名称</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="请输入姓名" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <select name="sex" >
      </select>
    </div>
    </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block">
      <input type="text" name="tel"  autocomplete="off" placeholder="请输入电话" class="layui-input">
    </div>
  </div>
  

    
   <div class="layui-form-item">
    <label class="layui-form-label">所属客户</label>
    <div class="layui-input-block">
      <select name="customer_id" >
      </select>
    </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">联系人备注</label>
    <div class="layui-input-block">
      <input type="text" name="comment"  autocomplete="off" placeholder="请输入备注信息" class="layui-input">
    </div>
  </div>
 
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">

getarray("getSexs.action",{},"[name=sex]",-1);
getlist("getCustomers.action",{},"[name=customer_id]",-1);
layui.use('form', function(){
	  var form = layui.form;
	  form.on('submit(demo1)', function(data){
		 $.post("insert.action", data.field, function(json) {
			  closeFrame();
			  parent.fresh('demo');
			}, "json");
		    
		    return false;
		  });
});






</script>
</body>
</html>