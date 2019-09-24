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
		<label class="layui-form-label">处理人</label>
		<div class="layui-input-block">
			<input type="text" name="operatornames" readonly="readonly"
				autocomplete="off" placeholder="请输入处理人" class="layui-input"
				id="opids" ts-selected=""> <input type="hidden"
				name="operatorids">
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
  
<!--   
    <div class="layui-form-item">
    <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="text" name="createdate"  autocomplete="off" placeholder="请输入创建时间" class="layui-input">
    </div>
  </div> -->
  
  <div class="layui-form-item">
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

getarray("getSexs.action",{},"[name=sex]",-1);
getarray("getLinkstatus.action",{},"[name=linkstatu]",-1);
getarray("getClientstatus.action",{},"[name=clientstatu]",-1);
getarray("getPurposestatus.action",{},"[name=purposestatu]",-1);
getarray("getAssessstatus.action",{},"[name=assessstatu]",-1);
getarray("getExecstatus.action",{},"[name=execstatu]",-1);
getarray("getStatus.action",{},"[name=statu]",-1);
getlist("getClienttypes.action",{},"[name=clienttype_id]",-1);
getlist("getCreateoperators.action",{},"[name=createoperator_id]",-1);
getlist("getSrcs.action",{},"[name=src_id]",-1);
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