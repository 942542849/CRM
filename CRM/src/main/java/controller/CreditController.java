package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Credit;
import service_Impl.Credit_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Credit")
public class CreditController {
	@Autowired
	Credit_Service_Impl creditservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return creditservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		creditservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Credit b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		creditservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Credit edit(int id){
		return creditservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Credit b,ModelMap m) {
		creditservice.update(b);
		return "{\"status\":1}";
	}
	
}
