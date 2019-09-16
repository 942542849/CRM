package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.WorkGroup;
import service_Impl.WorkGroup_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("WorkGroup")
public class WorkGroupController {
	@Autowired
	WorkGroup_Service_Impl wgservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return wgservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		wgservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(WorkGroup b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		wgservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody WorkGroup edit(int id){
		return wgservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(WorkGroup b,ModelMap m) {
		wgservice.update(b);
		return "{\"status\":1}";
	}
	
}
