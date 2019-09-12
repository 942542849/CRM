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
    <label class="layui-form-label">销售渠道</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="销售客户来源" class="layui-input">
    </div>
  </div>
   
    <div class="layui-form-item">
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-block">
      <select name="customer_id" >
      </select>
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">客户电话</label>
    <div class="layui-input-block">
      <input type="text" name="optcutel"  autocomplete="off" placeholder="销售客户电话" class="layui-input">
    </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">销售成功率%</label>
    <div class="layui-input-block">
      <input type="text" name="optsuccess"  autocomplete="off" placeholder="销售成功率" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">销售状态</label>
    <div class="layui-input-block">
      <select name="optstate" >
      </select>
    </div>
    </div>
    
      <div class="layui-form-item">
    <label class="layui-form-label">销售细节</label>
    <div class="layui-input-block">
      <input type="text" name="optdetail"  autocomplete="off" placeholder="销售细节" class="layui-input">
    </div>
  </div>
  

    
   <div class="layui-form-item">
    <label class="layui-form-label">销售负责人</label>
    <div class="layui-input-block">
      <select name="user_id" >
      </select>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">销售创建时间</label>
    <div class="layui-input-block">
      <input type="text" name="createtime"  autocomplete="off" placeholder="销售创建时间" class="layui-input">
    </div>
  </div>
  
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">
getlist("getCustomers.action",{},"[name=customer_id]",-1);
getarray("getOptstates.action",{},"[name=optstate]",-1);

getlist("getUsers.action",{},"[name=user_id]",-1);

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