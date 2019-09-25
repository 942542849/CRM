package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.Order_Dao;
import model.Order;
import service.Order_Service;


import utils.ReturnInfo;
@Service

public class Order_Service_Impl implements Order_Service{
@Autowired
Order_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Order t) {
		dao.insert(t);
		
	}

	public void update(Order t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Order selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Order> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	public Order getByClientId(int client_id) {
		// TODO Auto-generated method stub
		return dao.getByClientId(client_id);
	}
}
