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
    <label class="layui-form-label">订单名称</label>
    <div class="layui-input-block">
      <select name="order_id" >
      </select>
    </div>
    </div>
      <div class="layui-form-item">
    <label class="layui-form-label">产品名称</label>
    <div class="layui-input-block">
      <select name="product_id" >
      </select>
    </div>
    </div>
    


  <div class="layui-form-item">
    <label class="layui-form-label">产品数量</label>
    <div class="layui-input-block">
      <input type="text" name="count"  autocomplete="off" placeholder="请输入数量" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">产品金额</label>
    <div class="layui-input-block">
      <input type="text" name="amount"  autocomplete="off" placeholder="请输入金额" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">产品折扣</label>
    <div class="layui-input-block">
      <input type="text" name="disc"  autocomplete="off" placeholder="请输入折扣" class="layui-input">
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

getlist("getOrders.action",{},"[name=order_id]",-1);
getlist("getProducts.action",{},"[name=product_id]",-1);
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