package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Revisit;

import service.Client_Service;

import service.Revisit_Service;

import utils.ReturnInfo;
@Controller
@RequestMapping("Revisit")
public class RevisitController{
		
		@Autowired
		Client_Service cservice;
	
		@Autowired
		Revisit_Service reservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return reservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			reservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Revisit b,ModelMap m){

			reservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Revisit edit(int id){
			return reservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Revisit b,ModelMap m) {
			reservice.update(b);
			return "{\"status\":1}";
		}
		
	
		@RequestMapping("getLinkstatus")
		public @ResponseBody String[] getLinkstatus() {
			return Revisit.linkstatus;
		}
		@RequestMapping("getClientstatus")
		public @ResponseBody String[] getClientstatus() {
			return Revisit.clientstatus;
		}
		@RequestMapping("getPurposestatus")
		public @ResponseBody String[] getPurposestatus() {
			return Revisit.purposestatus;
		}
		@RequestMapping("getAssessstatus")
		public @ResponseBody String[] getAssessstatus() {
			return Revisit.assessstatus;
		}
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return Revisit.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return Revisit.status;
		}
		
		
		
		
		@RequestMapping("getClients")
		public @ResponseBody List getClients() {
			return cservice.selectAll();
		}
	

}
