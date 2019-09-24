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
<script type="text/javascript" src="../show/js/tableSelect.js"></script>

<title></title>
</head>
<body>
<style>
.layui-input{width:200px;}
.layui-input-block{width:200px;}
.layui-layer {
	width: 400px;
	height: 500px;
}
</style>
<form class="layui-form" lay-filter="myform">
<input type="hidden" name="id" >


 
  
  
   <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">确认放弃</button>
    </div>
  </div>
</form>

<script type="text/javascript">
var id="${param.id}";

$.post("edit.action",{id:id}, function(json) {
	render('myform', json);
/* 	getarray("getSexs.action",{},"[name=sex]",json.sex); */
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

var tableSelect = layui.tableSelect;
tableSelect.render({
	elem : '#opids', //定义输入框input对象 必填
	checkedKey : 'name', //表格的唯一建值，非常重要，影响到选中状态 必填
	searchKey : 'txt', //搜索输入框的name值 默认keyword
	searchPlaceholder : '关键词搜索', //搜索输入框的提示文字 默认关键词搜索
	table : { //定义表格参数，与LAYUI的TABLE模块一致，只是无需再定义表格elem
		url : '../Operator/index',
		cols : [ [ {
			type : 'checkbox'
		}, {
			field : 'id',
			title : 'ID',
			width : 100,
		}, {
			field : 'name',
			title : '用户名',
			width : 100
		} ,{
			field : 'tel',
			title : '联系电话',
			width : 100
		} , {
			field : 'groupname',
			title : '用户名',
			width : 100
		} ] ],
		parseData : function(res) {
			return {
				"code" : res.code, //解析接口状态
				"msg" : res.msg,//解析提示文本
				"count" : res.count,//解析数据长度
				"data" : res.list
			//解析数据列表
			}
		}
	},
	done : function(elem, data) {
		//选择完后的回调，包含2个返回值 elem:返回之前input对象；data:表格返回的选中的数据 []
		//拿到data[]后 就按照业务需求做想做的事情啦~比如加个隐藏域放ID...
		var NEWJSON = []
		var NEWJSON1 = []
		layui.each(data.data, function(index, item) {
			NEWJSON.push(item.name);
			NEWJSON1.push(item.id);
		})
		elem.val(NEWJSON.join(","))
		$('[name=operatorids]').val(NEWJSON1.join(","))
	}
})

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