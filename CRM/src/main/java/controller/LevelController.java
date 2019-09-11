package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Level;
import service_Impl.Level_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Level")
public class LevelController {
	@Autowired
	Level_Service_Impl levelservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return levelservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		levelservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Level b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		levelservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Level edit(int id){
		return levelservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Level b,ModelMap m) {
		levelservice.update(b);
		return "{\"status\":1}";
	}
	
}
