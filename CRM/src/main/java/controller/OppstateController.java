package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Oppstate;
import service_Impl.Oppstate_Service_Impl;

import utils.ReturnInfo;
@Controller
@RequestMapping("Oppstate")
public class OppstateController {
	@Autowired
	Oppstate_Service_Impl oppstateservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return oppstateservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		oppstateservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Oppstate b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		oppstateservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Oppstate edit(int id){
		return oppstateservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Oppstate b,ModelMap m) {
		oppstateservice.update(b);
		return "{\"status\":1}";
	}
	
}
