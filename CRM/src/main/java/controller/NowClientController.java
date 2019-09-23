package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.NowClient;
import model.Operator;
import service.ClientType_Service;
import service.NowClient_Service;
import service.Operator_Service;
import service.Src_Service;
import utils.ReturnInfo;
@Controller
@RequestMapping("NowClient")
public class NowClientController{
		
		@Autowired
		ClientType_Service ctservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Src_Service srcservice;
		@Autowired
		NowClient_Service  clientservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return clientservice.select(whera,page,limit);
		}
		
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
		
		
		
		
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			clientservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(NowClient b,ModelMap m){

			clientservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody NowClient edit(int id){
			return clientservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(NowClient b,ModelMap m) {
			clientservice.update(b);
			return "{\"status\":1}";
		}
		
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return NowClient.sexs;
		}
		@RequestMapping("getLinkstatus")
		public @ResponseBody String[] getLinkstatus() {
			return NowClient.linkstatus;
		}
		@RequestMapping("getClientstatus")
		public @ResponseBody String[] getClientstatus() {
			return NowClient.clientstatus;
		}
		@RequestMapping("getPurposestatus")
		public @ResponseBody String[] getPurposestatus() {
			return NowClient.purposestatus;
		}
		@RequestMapping("getAssessstatus")
		public @ResponseBody String[] getAssessstatus() {
			return NowClient.assessstatus;
		}
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return NowClient.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return NowClient.status;
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
		

}
