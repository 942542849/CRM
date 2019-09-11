package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Department;
import service_Impl.Department_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Department")
public class DepartmentController {
	@Autowired
	Department_Service_Impl departmentservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return departmentservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		departmentservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Department b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		departmentservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Department edit(int id){
		return departmentservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Department b,ModelMap m) {
		departmentservice.update(b);
		return "{\"status\":1}";
	}
	
}
