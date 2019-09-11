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
    <label class="layui-form-label">名称</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="请输入客户名称" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">电话</label>
    <div class="layui-input-block">
      <input type="text" name="tel"  autocomplete="off" placeholder="请输入客户电话" class="layui-input">
    </div>
  </div>
  
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">区域</label>
    <div class="layui-input-block">
      <input type="text" name="area"  autocomplete="off" placeholder="请输入客户区域" class="layui-input">
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">用户名称</label>
    <div class="layui-input-block">
      <select name="user_id" >
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">客户等级</label>
    <div class="layui-input-block">
      <select name="level_id" >
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">客户满意度</label>
    <div class="layui-input-block">
      <select name="pleased_id" >
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">客户信誉度</label>
    <div class="layui-input-block">
      <select name="credit_id" >
      </select>
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">地址</label>
    <div class="layui-input-block">
      <input type="text" name="address"  autocomplete="off" placeholder="请输入客户地址" class="layui-input">
    </div>
  </div>
    
 
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">


getlist("getUsers.action",{},"[name=user_id]",-1);
getlist("getLevels.action",{},"[name=level_id]",-1);
getlist("getPleaseds.action",{},"[name=pleased_id]",-1);
getlist("getCredits.action",{},"[name=credit_id]",-1);

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