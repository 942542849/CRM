package controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.User;
import service_Impl.Department_Service_Impl;
import service_Impl.Role_Service_Impl;
import service_Impl.User_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("User")
public class UserController {
		@Autowired
		Department_Service_Impl depservice;
		@Autowired
		Role_Service_Impl roleservice;
		@Autowired
		User_Service_Impl userservice;
		
		
		@RequestMapping("login")
		public @ResponseBody String login(User u) {
			try {
				System.out.println(u.getName()+"  "+u.getPass());
			SecurityUtils.getSubject().login(new UsernamePasswordToken(u.getName(), u.getPass()));
			}catch (Exception e) {
				return "false";
			}
			return "true";
			
		}
		
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where crm_user.name like '%"+txt+"%'";
			}
			return userservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			userservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(User b,ModelMap m){

			userservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody User edit(int id){
			return userservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(User b,ModelMap m) {
			userservice.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return User.sexs;
		}
		@RequestMapping("getStatuss")
		public @ResponseBody String[] getStatuss() {
			return User.statuss;
		}
		@RequestMapping("getDepartments")
		public @ResponseBody List getDepartments() {
			return depservice.select();
		}
		
		@RequestMapping("getRoles")
		public @ResponseBody List getRoles() {
			return roleservice.select();
		}
		
		

}
