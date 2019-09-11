package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Role;
import service_Impl.Role_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Role")
public class RoleController {
	@Autowired
	Role_Service_Impl Roleservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return Roleservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		Roleservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Role b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		Roleservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Role edit(int id){
		return Roleservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Role b,ModelMap m) {
		Roleservice.update(b);
		return "{\"status\":1}";
	}
	
}
