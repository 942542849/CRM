package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Role_Dao;
import model.Role;
import service.Role_Service;
import utils.ReturnInfo;

@Service
public class Role_Service_Impl implements Role_Service{
@Autowired
Role_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Role t) {
			dao.insert(t);
			
		}

		public void update(Role t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Role selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Role> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
