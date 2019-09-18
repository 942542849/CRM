package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Orderdetails;
import service.Order_Service;
import service.Orderdetails_Service;
import service.Product_Service;

import utils.ReturnInfo;
@Controller
@RequestMapping("Orderdetails")
public class OrderdetailsController {
		
		@Autowired
		Order_Service oservice;

		@Autowired
		Product_Service pservice;
		@Autowired
		Orderdetails_Service ordsservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_orderdetails.id like '%"+txt+"%'";
			}
			return ordsservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			ordsservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Orderdetails b,ModelMap m){

			ordsservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Orderdetails edit(int id){
			return ordsservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Orderdetails b,ModelMap m) {
			ordsservice.update(b);
			return "{\"status\":1}";
		}

	
		@RequestMapping("getOrders")
		public @ResponseBody List getOrders() {
			System.out.println();
			return oservice.selectAll();
		}
		
		

		@RequestMapping("getProducts")
		public @ResponseBody List getProducts() {
			return pservice.select();
		}
		

}
