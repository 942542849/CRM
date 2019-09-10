package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Book;
import model.Type;
import service_Impl.Book_Service_Imp;
import service_Impl.Type_Service_Imp;
import utils.ReturnInfo;
@Controller
@RequestMapping("Book")
public class Bookcontroller {
		@Autowired
		Type_Service_Imp tservice;
		@Autowired
		Book_Service_Imp service;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where book.name like '%"+txt+"%'";
			}
			return service.select(whera,page,limit);
		}
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			service.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(Book b,ModelMap m){
//			System.out.println("Bookcontroller.insert()");
			service.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody Book edit(int id){
			return service.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(Book b,ModelMap m) {
			service.update(b);
			return "{\"status\":1}";
		}
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return Book.sexs;
		}
		@RequestMapping("getTypes")
		public @ResponseBody List getTypes() {
			return tservice.select();
		}
		
		

}
