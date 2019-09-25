package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Order;
import service.Client_Service;
import service.Operator_Service;
import service.Order_Service;


import utils.ReturnInfo;
@Controller
@RequestMapping("Order")
public class OrderController {
		
		@Autowired
		Client_Service clientservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Order_Service orderservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_order.name like '%"+txt+"%'";
			}
			return orderservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			orderservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Order b,ModelMap m){

			orderservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Order edit(int id){
			return orderservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Order b,ModelMap m) {
			orderservice.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return Order.status;
		}
	
		@RequestMapping("getClients")
		public @ResponseBody List getClients() {
			return clientservice.selectAll();
		}
		
		@RequestMapping("getOperators")
		public @ResponseBody List getOperators() {
			return opservice.selectAll();
		}
		
		@RequestMapping("getByClientId")
		public @ResponseBody Order getByClientId(int client_id) {
			return orderservice.getByClientId(client_id);
		}

}
