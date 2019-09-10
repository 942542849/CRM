package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Type;
import model.Type;
import model.Type;
import service_Impl.Type_Service_Imp;
import utils.ReturnInfo;

@Controller
@RequestMapping("Type")
public class Typecontroller {
	@Autowired
	Type_Service_Imp service;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return service.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		service.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Type b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		service.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Type edit(int id){
		return service.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Type b,ModelMap m) {
		service.update(b);
		return "{\"status\":1}";
	}
	
}
