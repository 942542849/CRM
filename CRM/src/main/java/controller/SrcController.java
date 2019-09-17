package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Src;
import service.Src_Service;


import utils.ReturnInfo;
@Controller
@RequestMapping("Src")
public class SrcController {
	@Autowired
	Src_Service srcservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return srcservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		srcservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Src b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		srcservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Src edit(int id){
		return srcservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Src b,ModelMap m) {
		srcservice.update(b);
		return "{\"status\":1}";
	}
	
}
