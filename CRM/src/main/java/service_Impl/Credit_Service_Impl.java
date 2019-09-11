package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Credit_Dao;
import model.Credit;
import service.Credit_Service;
import utils.ReturnInfo;

@Service
public class Credit_Service_Impl implements Credit_Service{
@Autowired
Credit_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Credit t) {
			dao.insert(t);
			
		}

		public void update(Credit t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Credit selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Credit> select() {
			// TODO Auto-generated method stub
			return dao.select();
		}
}
