package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Src_Dao;
import model.Src;
import service.Src_Service;
import utils.ReturnInfo;

@Service
public class Src_Service_Impl implements Src_Service{
@Autowired
Src_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Src t) {
			dao.insert(t);
			
		}

		public void update(Src t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Src selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Src> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
