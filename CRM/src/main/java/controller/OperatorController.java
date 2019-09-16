package controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import model.Operator;
import service_Impl.Operator_Service_Impl;
import service_Impl.WorkGroup_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Operator")
public class OperatorController {
		@Autowired
		WorkGroup_Service_Impl wkservice;
		@Autowired
		Operator_Service_Impl opservice;
		
		
		@RequestMapping("login")
		public @ResponseBody String login(Operator u) {
			try {
				
				SecurityUtils.getSubject().login(new UsernamePasswordToken(u.getTel(), u.getPass()));
			}catch (Exception e) {
				return "false";
			}
			return "true";
			
		}
		
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_operator.name like '%"+txt+"%'";
			}
			return opservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			opservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Operator b,ModelMap m){

			opservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Operator edit(int id){
			return opservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Operator b,ModelMap m) {

			opservice.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getPowers")
		public @ResponseBody String[] getPowers() {
			return Operator.powers;
		}
		@RequestMapping("getStatuss")
		public @ResponseBody String[] getStatuss() {
			return Operator.statuss;
		}
	
		
		@RequestMapping("getGroups")
		public @ResponseBody List getGroups() {
			return wkservice.select();
		}
		
		

}
