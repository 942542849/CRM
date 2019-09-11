package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Customer;
import service_Impl.Credit_Service_Impl;
import service_Impl.Customer_Service_Impl;

import service_Impl.Level_Service_Impl;
import service_Impl.Pleased_Service_Impl;
import service_Impl.User_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Customer")
public class CustomerController {
		@Autowired
		User_Service_Impl userservice;
		@Autowired
		Level_Service_Impl levelservice;
		@Autowired
		Customer_Service_Impl customerservice;
		@Autowired
		Pleased_Service_Impl pleasedservice;
		@Autowired
		Credit_Service_Impl creditservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String where="";
			if(txt!=null) {
				where="where crm_customer.name like '%"+txt+"%'";
			}
			return customerservice.select(where,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			customerservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Customer b,ModelMap m){

			customerservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Customer edit(int id){
			return customerservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Customer b,ModelMap m) {
			customerservice.update(b);
			return "{\"status\":1}";
		}
	
		
		
		@RequestMapping("getUsers")
		public @ResponseBody List getUsers() {
			return userservice.selectAll();
		}
		
		@RequestMapping("getLevels")
		public @ResponseBody List getLevels() {
			return levelservice.select();
		}
		
		@RequestMapping("getPleaseds")
		public @ResponseBody List getPleaseds() {
			return pleasedservice.select();
		}
		
		@RequestMapping("getCredits")
		public @ResponseBody List getCredits() {
			return creditservice.select();
		}
		

}
