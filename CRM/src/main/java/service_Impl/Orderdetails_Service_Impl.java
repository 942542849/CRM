package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.Orderdetails_Dao;
import model.Orderdetails;
import service.Orderdetails_Service;
import utils.ReturnInfo;
@Service

public class Orderdetails_Service_Impl implements Orderdetails_Service{
@Autowired
Orderdetails_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Orderdetails t) {
		dao.insert(t);
		
	}

	public void update(Orderdetails t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Orderdetails selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Orderdetails> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	
}
