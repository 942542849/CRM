package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Level_Dao;
import model.Level;
import service.Level_Service;
import utils.ReturnInfo;

@Service
public class Level_Service_Impl implements Level_Service{
@Autowired
Level_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Level t) {
			dao.insert(t);
			
		}

		public void update(Level t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Level selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Level> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
