<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link href="../../show/lib/layui/css/layui.css" rel="stylesheet">
<script type="text/javascript" src="../../show/lib/layui/layui.all.js"></script>
<script src="../../show/js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="../../show/js/my.js"></script>
<script type="text/javascript" src="../../show/js/tableSelect.js"></script>
<title></title>
</head>
<body>
<style>
.layui-input{width:250px;}
.layui-input-inline {
    width: 250px;
}
</style>

<form class="layui-form" lay-filter="myform" >

  <div class="layui-form-item">
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-inline">
      <input type="text" name="name"  autocomplete="off" class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-inline">
      <input name="sexname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">联系方式</label>
    <div class="layui-input-inline">
      <input type="text" name="tel"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">QQ</label>
    <div class="layui-input-inline">
      <input type="text" name="qq"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-inline">
      <input type="text" name="email"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
   
   <div class="layui-form-item">
    <label class="layui-form-label">地址</label>
    <div class="layui-input-inline">
      <input type="text" name="address"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">额外信息</label>
    <div class="layui-input-inline">
      <input type="text" name="infos"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">电话状态</label>
    <div class="layui-input-inline">
      <input name="linkstatuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户状态</label>
    <div class="layui-input-inline">
      <input name="clientstatuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">意向状态</label>
    <div class="layui-input-inline">
      <input name="purposestatuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">评估状态</label>
    <div class="layui-input-inline">
      <input name="assessstatuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">执行状态</label>
    <div class="layui-input-inline">
      <input name="execstatuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-inline">
      <input name="statuname" class="layui-input" readonly="readonly"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户类型</label>
    <div class="layui-input-inline">
      <input name="clienttypename" readonly="readonly" class="layui-input"></input>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">处理人</label>
    <div class="layui-input-inline">
		<input type="text" name="operatornames" readonly="readonly" autocomplete="off" class="layui-input"> 
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">创建人</label>
    <div class="layui-input-inline">
      <input type="text" name="createoperatorname"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  
  <div class="layui-form-item">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input class="layui-input" id="test1" name="createdate" type="text" readonly="readonly">
      </div>
    </div>
  
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户来源</label>
    <div class="layui-input-inline">
      <input type="text" name="srcname"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">回访次数</label>
    <div class="layui-input-inline">
      <input type="text" name="count"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">备注</label>
    <div class="layui-input-inline">
      <input type="text" name="comments"  autocomplete="off"  class="layui-input" readonly="readonly">
    </div>
  </div>
  
</form>

<script type="text/javascript">
var client_id="${param.client_id}";
function init(){
	$.post("../getAllById.action",{client_id:client_id}, function(json) {
		render('myform', json);
	},"json");
	
}
if(client_id!=null){
	init();
}
</script>
</body>
</html>