package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Oppstate_Dao;
import model.Oppstate;
import service.Oppstate_Service;
import utils.ReturnInfo;

@Service
public class Oppstate_Service_Impl implements Oppstate_Service{
@Autowired
Oppstate_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Oppstate t) {
			dao.insert(t);
			
		}

		public void update(Oppstate t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Oppstate selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Oppstate> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
