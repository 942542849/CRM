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
    <label class="layui-form-label">qq</label>
    <div class="layui-input-block">
      <input type="text" name="qq"  autocomplete="off" placeholder="请输入qq" class="layui-input">
    </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">email</label>
    <div class="layui-input-block">
      <input type="text" name="email"  autocomplete="off" placeholder="请输入email" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">address</label>
    <div class="layui-input-block">
      <input type="text" name="address"  autocomplete="off" placeholder="请输入address" class="layui-input">
    </div>
  </div>
    
      <div class="layui-form-item">
    <label class="layui-form-label">infos</label>
    <div class="layui-input-block">
      <input type="text" name="infos"  autocomplete="off" placeholder="请输入infos" class="layui-input">
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
    <label class="layui-form-label">status</label>
    <div class="layui-input-block">
      <select name="statu" >
      </select>
    </div>
    </div>
    
    

    
   <div class="layui-form-item">
    <label class="layui-form-label">客户类型</label>
    <div class="layui-input-block">
      <select name="clienttype_id" >
      </select>
    </div>
  </div>
  
  
     <div class="layui-form-item">
    <label class="layui-form-label">负责人总览</label>
    <div class="layui-input-block">
      <input type="text" name="operatorids"  autocomplete="off" placeholder="请输入所有负责人" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">创建人</label>
    <div class="layui-input-block">
      <select name="createoperator_id" >
      </select>
    </div>
  </div>
  
<div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test1" name="createdate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">文件</label>
    <div class="layui-input-block">
      <select name="src_id" >
      </select>
    </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">数量</label>
    <div class="layui-input-block">
      <input type="text" name="count"  autocomplete="off" placeholder="请输入数量" class="layui-input">
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
	getarray("getSexs.action",{},"[name=sex]",json.sex);
	getarray("getLinkstatus.action",{},"[name=linkstatu]",json.linkstatu);
	getarray("getClientstatus.action",{},"[name=clientstatu]",json.clientstatu);
	getarray("getPurposestatus.action",{},"[name=purposestatu]",json.purposestatu);
	getarray("getAssessstatus.action",{},"[name=assessstatu]",json.assessstatu);
	getarray("getExecstatus.action",{},"[name=execstatu]",json.execstatu);
	getarray("getStatus.action",{},"[name=statu]",json.statu);
	getlist("getClienttypes.action",{},"[name=clienttype_id]",json.clienttype_id);
	getlist("getCreateoperators.action",{},"[name=createoperator_id]",json.createoperator_id);
	getlist("getSrcs.action",{},"[name=src_id]",json.src_id);
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