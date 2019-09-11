package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Department_Dao;
import model.Department;
import service.Department_Service;
import utils.ReturnInfo;

@Service
public class Department_Service_Impl implements Department_Service{
@Autowired
Department_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Department t) {
			dao.insert(t);
			
		}

		public void update(Department t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Department selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Department> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
