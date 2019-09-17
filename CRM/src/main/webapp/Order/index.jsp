<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<link href="../show/lib/layui/css/layui.css" rel="stylesheet">
<script type="text/javascript" src="../show/lib/layui/layui.all.js"></script>
<script src="../show/js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="../show/js/my.js"></script>
<title></title>
<style type="text/css">
.input {
	font-size: 16px; width : 200px;
	height: 30px;
	margin-top: -10px;
	margin-right: 10px;
	width: 200px;
}

.layui-form-select{width:200px;
}
</style>
</head>
<body>
	<table id="demo" lay-filter="test"></table>
	<script type="text/html" id="barDemo">
<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
	<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <div class="layui-input-inline">
      <input type="text" name="txt" lay-verify="title"  autocomplete="off" placeholder="请输入名称" class="layui-input input">
    </div>
    <button class="layui-btn layui-btn-sm" lay-event="search">查询合同</button>
    <button class="layui-btn layui-btn-sm" lay-event="add">新增合同</button>
  </div>
</script>

	<script>
	
		layui.use('table', function() {
			var table = layui.table;

			//第一个实例
			table.render({
				elem : '#demo',
				height : 462,
				url : 'index.action' //数据接口
				,
				toolbar : '#toolbarDemo',
				page : true //开启分页
				,
				cols : [ [ //表头
				{
					field : 'id',
					title : 'ID',
					width : 80,
					sort : true,
				}, {
					field : 'name',
					title : '合同名称',
					width : 180
				},
				{
					field : 'clientname',
					title : '客户性名',
					width : 180
				}, 
				{
					field : 'createdate',
					title : '创建日期',
					width : 180
				}, 
				{
					field : 'compdate',
					title : '业绩日期',
					width : 180
				}, 
				{
					field : 'orderdate',
					title : '合同日期',
					width : 180
				}, 
				{
					field : 'startdate',
					title : '起始日期',
					width : 180
				}, 
				{
					field : 'enddate',
					title : '截止日期',
					width : 180
				}, 
				{
					field : 'operatorname',
					title : '合同负责人',
					width : 180
				}, 
				{
					field : 'info',
					title : '合同条款',
					width : 180
				}, 
				{
					field : 'files',
					title : '合同文件',
					width : 180
				}, 
				{
					field : 'compoperatorids',
					title : '业绩人员组',
					width : 180
				}, 
				{
					field : 'compweight',
					title : '业绩权重',
					width : 180
				}, 
				{
					field : 'statuname',
					title : '合同状态',
					width : 80
				}, 
				{
					field : 'amount',
					title : '总金额',
					width : 80,
					
				},
			    {
					field : 'comments',
					title : '备注',
					width : 80
				},{
					fixed : 'right',
					title : '操作',
					toolbar : '#barDemo',
					width : 150,
					align : 'center'
				}

				] ],
				parseData : function(res) {
					return {
						"code" : res.code,
						"msg" : res.msg,
						"count" : res.count,
						data : res.list
					}
				}
			});
			
			

			//obj 行      obj.data 行数据    data.id 列
			//test  是table的lay-filter="test" 属性
			table.on('tool(test)', function(obj) {
				var data = obj.data;
				if (obj.event === 'del') { ///lay-event 属性
					
					myconfirm("刪除？",function(){
						$.post("delete.action", {id:data.id}, 
								function(json) {
							if(json.status!=1) console.log("");
							else{
								obj.del();
							}
							layer.close(layer.index);
								}, "json");
					});
				}else{
					openFrame('edit.jsp?id='+data.id);
				}
			});

			table.on('toolbar(test)', function(obj) {
				if (obj.event === 'search') {
					var txt = $(event.target).prev().find("input").val();
					reload('demo',{txt : txt});
				} else if(obj.event === 'add') {
					openFrame("add.jsp");
				}
			});

		});
	</script>
</body>
</html>