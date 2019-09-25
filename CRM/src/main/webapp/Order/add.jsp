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
.layui-input{width:160px;}
.layui-input-block{width:160px;}
</style>
<form class="layui-form" lay-filter="myform">

 <div class="layui-form-item">
 
 	<div class="layui-inline">
    <label class="layui-form-label">合同名称</label>
    <div class="layui-input-block">
      <input type="text" name="name"  autocomplete="off" placeholder="请输入合同名称" class="layui-input">
    </div>
    </div>
    
    <div class="layui-inline">
    <label class="layui-form-label">所属客户</label>
    <div class="layui-input-block">
      <select name="client_id" >
      </select>
    </div>
 	 </div>
 	 
     <div class="layui-inline">
    <label class="layui-form-label">客户负责人</label>
    <div class="layui-input-block">
      <select name="operator_id" >
      </select>
    </div>
 	 </div>
 </div>
 	 
 	 <div class="layui-form-item">
 	   <div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test1" name="createdate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>
 	
 	   <div class="layui-inline">
      <label class="layui-form-label">业绩时间</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test2" name="compdate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>


      <div class="layui-inline">
      <label class="layui-form-label">合同日期</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test3" name="orderdate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>
       </div>
    
        <div class="layui-form-item">
        <div class="layui-inline">
      <label class="layui-form-label">起始日期</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test4" name="startdate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>
  
     <div class="layui-inline">
      <label class="layui-form-label">截止日期</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test5" name="enddate" type="text" placeholder="yyyy-MM-dd" >
      </div>
    </div>
     </div>
  
  
  
 
 
  
  <div class="layui-form-item">
   <div class="layui-inline">
    <label class="layui-form-label">合同条款</label>
    <div class="layui-input-block">
      <input type="text" name="info"  autocomplete="off" placeholder="请输入合同条款" class="layui-input">
    </div>
  </div>
  
    <div class="layui-inline">
    <label class="layui-form-label">合同文件</label>
    <div class="layui-input-block">
      <input type="text" name="files"  autocomplete="off" placeholder="请输入合同文件" class="layui-input">
    </div>
  </div>
  
  <div class="layui-inline">
    <label class="layui-form-label">业绩人员组</label>
    <div class="layui-input-block">
      <input type="text" name="compoperatorids"  autocomplete="off" placeholder="请输入业绩人员组" class="layui-input">
    </div>
  </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">业绩权重</label>
    <div class="layui-input-block">
      <input type="text" name="compweight"  autocomplete="off" placeholder="请输入业绩权重" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">合同状态</label>
    <div class="layui-input-block">
      <select name="statu" >
      </select>
    </div>
    </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">总金额</label>
    <div class="layui-input-block">
      <input type="text" name="amount"  autocomplete="off" placeholder="总金额" class="layui-input">
    </div>
  </div>
    
     <div class="layui-form-item">
    <label class="layui-form-label">备注</label>
    <div class="layui-input-block">
      <input type="text" name="comments"  autocomplete="off" placeholder="备注" class="layui-input">
    </div>
  </div>
    
   
 
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
    </div>
  </div>
</form>

<script type="text/javascript">
getlist("getClients.action",{},"[name=client_id]",-1);
getlist("getOperators.action",{},"[name=operator_id]",-1);
getarray("getStatus.action",{},"[name=statu]",-1);

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


layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test1'
	    ,trigger: 'click'
	  });
});
layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test2'
	    ,trigger: 'click'
	  });
});

layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test3'
	    ,trigger: 'click'
	  });
});

layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test4'
	    ,trigger: 'click'
	  });
});

layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //常规用法
	  laydate.render({
	    elem: '#test5'
	    ,trigger: 'click'
	  });
});





</script>
</body>
</html>