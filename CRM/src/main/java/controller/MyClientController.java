package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.MyClient;
import model.Operator;
import service.ClientType_Service;
import service.MyClient_Service;
import service.Operator_Service;
import service.Reserved_Service;
import service.Revisit_Service;
import service.Src_Service;
import utils.ReturnInfo;
@Controller
@RequestMapping("MyClient")
public class MyClientController{
		
		@Autowired
		ClientType_Service ctservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Src_Service srcservice;
		@Autowired
		MyClient_Service  clientservice;
		@Autowired
		Reserved_Service  reservedservice;
		@Autowired
		Revisit_Service   revisitservice;
		
		
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return clientservice.select(whera,page,limit);
		}
		//分配未处理客户
		@RequestMapping("NowClient")
		public @ResponseBody ReturnInfo index2(String tel,String txt,Integer page,Integer limit) {
			ReturnInfo info = new ReturnInfo();
			String where="";
			Operator u = opservice.selectByTel(tel);
			where="where c_client.operatornames = ''";
			if(u!=null)	where="where c_client.operatornames like '%"+u.getName()+"%' and c_client.count = 0";
			if(txt!=null) where=where+" and c_client.name like '%"+txt+"%'";
			System.out.println(where);
			String lim = info.getLimit(page, limit);
			info.setCount(clientservice.selectCount(where));
			info.setList(clientservice.NowClient(where, lim));
			return info;
		}
		
		// 查看我的预约客户
		@RequestMapping("Myreserved")
		public @ResponseBody ReturnInfo index3(String tel, String txt, Integer page, Integer limit) {
			ReturnInfo info = new ReturnInfo();
			String where = "";
			Operator u = opservice.selectByTel(tel);
			where = "where c_reserved.execoperator_id = ''";
			if (u != null)
				where = "where c_reserved.execoperator_id =" + u.getId();
			if (txt != null)
				where = where + " and c_client.name like '%" + txt + "%'";
			System.out.println(where);
			String lim = info.getLimit(page, limit);
			info.setCount(reservedservice.selectMyCount(where));
			info.setList(reservedservice.getMyreserved(where, lim));
			return info;
		} 
		
		// 查看预约表的回访记录
			@RequestMapping("Myrevisit")
			public @ResponseBody ReturnInfo index4(int execoperator_id, String txt, Integer page, Integer limit) {
				ReturnInfo info = new ReturnInfo();
				String where = "";
				Operator u = opservice.selectById(execoperator_id);
				where = "where c_revisit.execoperator_id = ''";
				if (u != null)
					where = "where c_revisit.execoperator_id =" + u.getId();
				if (txt != null)
					where = where + " and c_client.name like '%" + txt + "%'";
				System.out.println(where);
				String lim = info.getLimit(page, limit);
				info.setCount(revisitservice.selectMyCount(where));
				info.setList(revisitservice.getMyrevisit(where, lim));
				return info;
			}
		

			// 查看我的已处理客户
			@RequestMapping("Myexecuted")
			public @ResponseBody ReturnInfo index5(String tel, String txt, Integer page, Integer limit) {
				ReturnInfo info = new ReturnInfo();
				String where = "";
				Operator u = opservice.selectByTel(tel);
				where = "where c_client.operatornames = ''";
				if (u != null)
					where = "where c_client.operatornames like '%" + u.getName() + "%' and c_client.count != 0 and c_client.execstatu=2";
				if (txt != null)
					where = where + " and c_client.name like '%" + txt + "%'";
				String lim = info.getLimit(page, limit);
				info.setCount(clientservice.selectCount(where));
				info.setList(clientservice.getMyexecuted(where, lim));
				return info;
			}
		
		
		
		 
		
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			clientservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(MyClient b,ModelMap m){

			clientservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody MyClient edit(int id){
			return clientservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(MyClient b,ModelMap m) {
			clientservice.update(b);
			return "{\"status\":1}";
		}
		
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return MyClient.sexs;
		}
		@RequestMapping("getLinkstatus")
		public @ResponseBody String[] getLinkstatus() {
			return MyClient.linkstatus;
		}
		@RequestMapping("getClientstatus")
		public @ResponseBody String[] getClientstatus() {
			return MyClient.clientstatus;
		}
		@RequestMapping("getPurposestatus")
		public @ResponseBody String[] getPurposestatus() {
			return MyClient.purposestatus;
		}
		@RequestMapping("getAssessstatus")
		public @ResponseBody String[] getAssessstatus() {
			return MyClient.assessstatus;
		}
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return MyClient.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return MyClient.status;
		}
		
		
		
		
		@RequestMapping("getClienttypes")
		public @ResponseBody List getClienttypes() {
			return ctservice.select();
		}
		
		@RequestMapping("getCreateoperators")
		public @ResponseBody List getCreateoperators() {
			return opservice.selectAll();
		}
		@RequestMapping("getSrcs")
		public @ResponseBody List getSrcs() {
			return opservice.selectAll();
		}
		
		
		@RequestMapping("remove")
		public @ResponseBody String remove(MyClient u) {
			clientservice.remove(u);
			return "{\"status\":1}";
		}

		@RequestMapping("getAllById")
		public @ResponseBody MyClient getAllById(int client_id) {
			return clientservice.getAllById(client_id);
		}
		
}
