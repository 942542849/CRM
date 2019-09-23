package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.NoheadClient;
import service.ClientType_Service;
import service.NoheadClient_Service;
import service.Operator_Service;
import service.Src_Service;
import utils.ReturnInfo;
@Controller
@RequestMapping("NoheadClient")
public class NoheadClientController{
		
		@Autowired
		ClientType_Service ctservice;
		@Autowired
		Operator_Service opservice;
		@Autowired
		Src_Service srcservice;
		@Autowired
		NoheadClient_Service  nclientservice;
		
		@RequestMapping("index")
		public @ResponseBody ReturnInfo index(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return nclientservice.select(whera,page,limit);
		}
		@RequestMapping("nohead")
		public @ResponseBody ReturnInfo index1(String txt,Integer page,Integer limit){
			String whera="";
			if(txt!=null) {
				whera="where c_client.name like '%"+txt+"%'";
			}
			return nclientservice.Nohead(whera,page,limit);
		}
		
		
		@RequestMapping("delete")
		public @ResponseBody String delete(int id){
			nclientservice.delete(id);
			return "{\"status\":1}";
		}
		@RequestMapping("insert")
		public @ResponseBody String insert(NoheadClient b,ModelMap m){

			nclientservice.insert(b);
			return "{\"status\":1}";
		}
		@RequestMapping("edit")
		public @ResponseBody NoheadClient edit(int id){
			return nclientservice.selectById(id);
		}
		@RequestMapping("update")
		public @ ResponseBody String update(NoheadClient b,ModelMap m) {
			nclientservice.update(b);
			return "{\"status\":1}";
		}
		
		@RequestMapping("getSexs")
		public @ResponseBody String[] getSexs() {
			return NoheadClient.sexs;
		}
		@RequestMapping("getLinkstatus")
		public @ResponseBody String[] getLinkstatus() {
			return NoheadClient.linkstatus;
		}
		@RequestMapping("getClientstatus")
		public @ResponseBody String[] getClientstatus() {
			return NoheadClient.clientstatus;
		}
		@RequestMapping("getPurposestatus")
		public @ResponseBody String[] getPurposestatus() {
			return NoheadClient.purposestatus;
		}
		@RequestMapping("getAssessstatus")
		public @ResponseBody String[] getAssessstatus() {
			return NoheadClient.assessstatus;
		}
		@RequestMapping("getExecstatus")
		public @ResponseBody String[] getExecstatus() {
			return NoheadClient.execstatus;
		}
		@RequestMapping("getStatus")
		public @ResponseBody String[] getStatus() {
			return NoheadClient.status;
		}
		
		
		
		
		@RequestMapping("getClienttypes")
		public @ResponseBody List getClienttypes() {
			return ctservice.select();
		}
		
		@RequestMapping("getCreateoperators")
		public @ResponseBody List getCreateoperators() {
			return opservice.selectAll();
		}
		@RequestMapping("getSrcs")
		public @ResponseBody List getSrcs() {
			return opservice.selectAll();
		}
		

}
