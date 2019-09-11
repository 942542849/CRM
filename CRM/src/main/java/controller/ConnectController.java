package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Connect;
import service_Impl.Connect_Service_Impl;
import service_Impl.Customer_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Connect")
public class ConnectController {
		
		@Autowired
		Customer_Service_Impl customerservice;
		@Autowired
		Connect_Service_Impl connectservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where crm_customer_connect.name like '%"+txt+"%'";
			}
			return connectservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			connectservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Connect b,ModelMap m){

			connectservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Connect edit(int id){
			return connectservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Connect b,ModelMap m) {
			connectservice.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return Connect.sexs;
		}
	
		@RequestMapping("getCustomers")
		public @ResponseBody List getCustomers() {
			return customerservice.selectAll();
		}
		
		

}
