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
.layui-input{width:200px;}
.layui-input-inline {
    width: 200px;
}
</style>

<form class="layui-form" lay-filter="myform" >

 <div class="layui-form-item">
		<div class="layui-inline">
			<label class="layui-form-label">客户名称</label>
			<div class="layui-input-block">
				<input name="clientname" class="layui-input" readonly="readonly">
			</div>
		</div>

			<div class="layui-inline">
				<label class="layui-form-label">业绩时间</label>
				<div class="layui-input-block">
					<input class="layui-input" id="test1" name="compdate"
						type="text" placeholder="yyyy-MM-dd" readonly="readonly">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">合同时间</label>
				<div class="layui-input-block">
					<input class="layui-input" id="test2" name="orderdate" type="text"
						placeholder="yyyy-MM-dd" readonly="readonly">
				</div>
			</div>
	</div>
	<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">开始时间</label>
				<div class="layui-input-block">
					<input class="layui-input" id="test3" name="startdate" type="text"
						placeholder="yyyy-MM-dd" readonly="readonly">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">结束时间</label>
				<div class="layui-input-block">
					<input class="layui-input" id="test4" name="enddate" type="text"
						placeholder="yyyy-MM-dd" readonly="readonly">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">额外信息</label>
				<div class="layui-input-block">
					<input type="text" name="info" autocomplete="off"
						placeholder="请输入额外信息" class="layui-input" readonly="readonly">
				</div>
			</div>
	</div>

	<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">创建人</label>
				<div class="layui-input-block">
					<input name="operatorname" class="layui-input" readonly="readonly">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">文件</label>
				<div class="layui-input-block">
					<input type="text" name="files" autocomplete="off"
						placeholder="请输入文件" class="layui-input" readonly="readonly">
				</div>
			</div>
			<div class="layui-inline">
				<label class="layui-form-label">合同状态</label>
				<div class="layui-input-block">
					<input
						type="text" name="statuname" readonly="readonly"
						autocomplete="off" placeholder="合同状态" class="layui-input"
						id="demo" >
				</div>
			</div>
	</div>

	<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">业绩比重</label>
				<div class="layui-input-block">
					<input type="text" name="compweight" autocomplete="off"
						placeholder="请输入业绩比重" class="layui-input" readonly="readonly">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">状态</label>
				<div class="layui-input-block">
					<input name="statuname" class="layui-input" readonly="readonly">
				</div>
			</div>

			<div class="layui-inline">
				<label class="layui-form-label">总金额</label>
				<div class="layui-input-block">
					<input type="text" name="amount" autocomplete="off"
						placeholder="请输入总金额" class="layui-input" readonly="readonly">
				</div>
			</div>
	</div>

	<div class="layui-form-item">
			<div class="layui-inline">
				<label class="layui-form-label">备注</label>
				<div class="layui-input-block">
					<input type="text" name="comments" autocomplete="off"
						placeholder="请输入备注" class="layui-input" readonly="readonly">
				</div>
			</div>
	</div>
  
</form>

<script type="text/javascript">
var client_id="${param.client_id}";

function init(){
	$.post("../../Order/getByClientId",{client_id:client_id}, function(json) {
		render('myform', json);
	},"json");
	
}
if(client_id!=null){
	init();
}
</script>
</body>
</html>