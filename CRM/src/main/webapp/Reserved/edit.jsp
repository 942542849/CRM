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
<input type="hidden" name="id" >

	
     <div class="layui-form-item">
    <label class="layui-form-label">回访id</label>
    <div class="layui-input-block">
      <input type="text" name="revisit_id"  autocomplete="off" placeholder="请输入回访id" class="layui-input">
    </div>
  </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-block">
      <select name="client_id" >
      </select>
    </div>
    </div>
    
      <div class="layui-form-item">
    <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="text" name="createdate"  autocomplete="off" placeholder="请输入创建时间" class="layui-input">
    </div>
  </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">负责人名称</label>
    <div class="layui-input-block">
      <select name="operator_id" >
      </select>
    </div>
    </div>
    
       <div class="layui-form-item">
    <label class="layui-form-label">时间</label>
    <div class="layui-input-block">
      <input type="text" name="date"  autocomplete="off" placeholder="请输入时间" class="layui-input">
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">创建人名</label>
    <div class="layui-input-block">
      <select name="execoperator_id" >
      </select>
    </div>
    </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">预约类型</label>
    <div class="layui-input-block">
      <select name="type" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">处理名称 </label>
    <div class="layui-input-block">
      <select name="statu" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">执行状况</label>
    <div class="layui-input-block">
      <select name="execstatu" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">结果状况</label>
    <div class="layui-input-block">
      <input type="text" name="result"  autocomplete="off" placeholder="请输入结果状况" class="layui-input">
    </div>
  </div>
  
   
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">
var id="${param.id}";

$.post("edit.action",{id:id}, function(json) {
	render('myform', json);
	getlist("getClients.action",{},"[name=client_id]",json.client_id);
	getlist("getOperators.action",{},"[name=operator_id]",json.operator_id);
	getlist("getExecoperators.action",{},"[name=execoperator_id]",json.execoperator_id);
	getarray("getTypes.action",{},"[name=type]",json.type);
	getarray("getStatus.action",{},"[name=statu]",json.statu);
	getarray("getExecstatus.action",{},"[name=execstatu]",json.execstatu);
	
},"json");
layui.use(['form',], function(){
	  var form = layui.form;
	  form.on('submit(demo1)', function(data){
		 $.post("update.action", data.field, function(json) {
			  closeFrame();
			  parent.fresh('demo');
			}, "json");
		    
		    return false;
		  });
});

layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test1'
	    ,trigger: 'click'
	  });
});


	


</script>
</body>
</html>