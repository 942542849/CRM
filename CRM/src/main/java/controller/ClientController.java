package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Client;
import service.ClientType_Service;
import service.Client_Service;
import service.Operator_Service;
import service.Src_Service;
import utils.ReturnInfo;
@Controller
@RequestMapping("Client")
public class ClientController{
		
		@Autowired
		ClientType_Service ctservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Src_Service srcservice;
		@Autowired
		Client_Service  clientservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return clientservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			clientservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Client b,ModelMap m){

			clientservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Client edit(int id){
			return clientservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Client b,ModelMap m) {
			clientservice.update(b);
			return "{\"status\":1}";
		}
		
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return Client.sexs;
		}
		@RequestMapping("getLinkstatus")
		public @ResponseBody String[] getLinkstatus() {
			return Client.linkstatus;
		}
		@RequestMapping("getClientstatus")
		public @ResponseBody String[] getClientstatus() {
			return Client.clientstatus;
		}
		@RequestMapping("getPurposestatus")
		public @ResponseBody String[] getPurposestatus() {
			return Client.purposestatus;
		}
		@RequestMapping("getAssessstatus")
		public @ResponseBody String[] getAssessstatus() {
			return Client.assessstatus;
		}
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return Client.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return Client.status;
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
