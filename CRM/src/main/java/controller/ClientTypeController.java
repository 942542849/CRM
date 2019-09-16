package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.ClientType;
import service_Impl.ClientType_Service_Impl;

import utils.ReturnInfo;
@Controller
@RequestMapping("ClientType")
public class ClientTypeController {
	@Autowired
	ClientType_Service_Impl ctservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return ctservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		ctservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(ClientType b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		ctservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody ClientType edit(int id){
		return ctservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(ClientType b,ModelMap m) {
		ctservice.update(b);
		return "{\"status\":1}";
	}
	
}
