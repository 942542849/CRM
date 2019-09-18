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
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-block">
      <select name="client_id" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">联通状态</label>
    <div class="layui-input-block">
      <select name="linkstatu" >
      </select>
    </div>
    </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">客户状态</label>
    <div class="layui-input-block">
      <select name="clientstatu" >
      </select>
    </div>
    </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">意向状态</label>
    <div class="layui-input-block">
      <select name="purposestatu" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">评估状态 </label>
    <div class="layui-input-block">
      <select name="assessstatu" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">处理状态</label>
    <div class="layui-input-block">
      <select name="execstatu" >
      </select>
    </div>
    </div>
    
    
     <div class="layui-form-item">
    <label class="layui-form-label">询问状况</label>
    <div class="layui-input-block">
      <input type="text" name="askinfo"  autocomplete="off" placeholder="请输入询问状况" class="layui-input">
    </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">跟踪状况</label>
    <div class="layui-input-block">
      <input type="text" name="followinfo"  autocomplete="off" placeholder="请输入跟踪状况" class="layui-input">
    </div>
  </div>

    
     <div class="layui-form-item">
    <label class="layui-form-label">问题状况</label>
    <div class="layui-input-block">
      <input type="text" name="probleminfo"  autocomplete="off" placeholder="请输入问题状况" class="layui-input">
    </div>
  </div>

  
  
    <div class="layui-form-item">
    <label class="layui-form-label">status</label>
    <div class="layui-input-block">
      <select name="statu" >
      </select>
    </div>
    </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">备注</label>
    <div class="layui-input-block">
      <input type="text" name="comments"  autocomplete="off" placeholder="请输入备注" class="layui-input">
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
	getarray("getLinkstatus.action",{},"[name=linkstatu]",json.linkstatu);
	getarray("getClientstatus.action",{},"[name=clientstatu]",json.clientstatu);
	getarray("getPurposestatus.action",{},"[name=purposestatu]",json.purposestatu);
	getarray("getAssessstatus.action",{},"[name=assessstatu]",json.assessstatu);
	getarray("getExecstatus.action",{},"[name=execstatu]",json.execstatu);
	getarray("getStatus.action",{},"[name=statu]",json.statu);
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