package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Pleased;
import service_Impl.Pleased_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Pleased")
public class PleasedController {
	@Autowired
	Pleased_Service_Impl pleasedservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return pleasedservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		pleasedservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Pleased b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		pleasedservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Pleased edit(int id){
		return pleasedservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Pleased b,ModelMap m) {
		pleasedservice.update(b);
		return "{\"status\":1}";
	}
	
}
