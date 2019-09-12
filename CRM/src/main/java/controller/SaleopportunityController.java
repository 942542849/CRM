package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Saleopportunity;
import service_Impl.Customer_Service_Impl;

import service_Impl.Role_Service_Impl;
import service_Impl.Saleopportunity_Service_Impl;
import service_Impl.User_Service_Impl;
import utils.ReturnInfo;
@Controller
@RequestMapping("Saleopportunity")
public class SaleopportunityController {
		@Autowired
		Customer_Service_Impl customerservice;
		@Autowired
		User_Service_Impl userservice;
		@Autowired
		Saleopportunity_Service_Impl saleoptservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where crm_sale_opportunity.name like '%"+txt+"%'";
			}
			return saleoptservice.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			saleoptservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Saleopportunity b,ModelMap m){
			saleoptservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Saleopportunity edit(int id){
			return saleoptservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Saleopportunity b,ModelMap m) {
			saleoptservice.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getOptstates")
		public @ResponseBody String[] getOptstates() {
			return Saleopportunity.optstates;
		}
	
		@RequestMapping("getCustomers")
		public @ResponseBody List getCustomers() {
			return customerservice.selectAll();
		}
		
		@RequestMapping("getUsers")
		public @ResponseBody List getUsers() {
			return userservice.selectAll();
		}
		
		

}
