package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import service.Product_Service;


import utils.ReturnInfo;
@Controller
@RequestMapping("Product")
public class ProductController {
	@Autowired
	Product_Service proservice;
	@RequestMapping("index")
	public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
		String whera="";
		if(txt!=null) {
			whera="where name like '%"+txt+"%'";
		}
		return proservice.selectAll(whera,page,limit);
	}
	@RequestMapping("delete")
	public @ResponseBody String delete(int id){
		proservice.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("insert")
	public @ResponseBody String insert(Product b,ModelMap m){
//		System.out.println("Typecontroller.insert()");
		proservice.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("edit")
	public @ResponseBody Product edit(int id){
		return proservice.selectById(id);
	}
	@RequestMapping("update")
	public @ ResponseBody String update(Product b,ModelMap m) {
		proservice.update(b);
		return "{\"status\":1}";
	}
	
}
