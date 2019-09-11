package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Pleased_Dao;
import model.Pleased;
import service.Pleased_Service;
import utils.ReturnInfo;

@Service
public class Pleased_Service_Impl implements Pleased_Service{
@Autowired
Pleased_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Pleased t) {
			dao.insert(t);
			
		}

		public void update(Pleased t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Pleased selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Pleased> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
