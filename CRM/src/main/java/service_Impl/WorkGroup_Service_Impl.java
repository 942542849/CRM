package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.WorkGroup_Dao;
import model.WorkGroup;

import service.WorkGroup_Service;
import utils.ReturnInfo;

@Service
public class WorkGroup_Service_Impl implements WorkGroup_Service{
@Autowired
WorkGroup_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(WorkGroup t) {
			dao.insert(t);
			
		}

		public void update(WorkGroup t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public WorkGroup selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<WorkGroup> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
