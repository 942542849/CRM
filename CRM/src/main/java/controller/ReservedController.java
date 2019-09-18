package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Reserved;
import service.Client_Service;
import service.Operator_Service;
import service.Reserved_Service;


import utils.ReturnInfo;
@Controller
@RequestMapping("Reserved")
public class ReservedController{
		
		@Autowired
		Client_Service cservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Reserved_Service reservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_reserved.id like '%"+txt+"%'";
			}
			return reservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			reservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Reserved b,ModelMap m){

			reservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Reserved edit(int id){
			return reservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Reserved b,ModelMap m) {
			reservice.update(b);
			return "{\"status\":1}";
		}
		
		
		@RequestMapping("getTypes")
		public @ResponseBody String[] getTypes() {
			return Reserved.types;
		}
	
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return Reserved.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return Reserved.status;
		}
		
		
		
		
		@RequestMapping("getClients")
		public @ResponseBody List getClients() {
			return cservice.selectAll();
		}
		

		@RequestMapping("getOperators")
		public @ResponseBody List getOperators() {
			return opservice.selectAll();
		}

		@RequestMapping("getExecoperators")
		public @ResponseBody List getExecoperators() {
			return opservice.selectAll();
		}

}
