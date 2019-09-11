package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Customer_Dao;
import model.Customer;

import service.Customer_Service;



import utils.ReturnInfo;
@Service

public class Customer_Service_Impl implements Customer_Service{
@Autowired
Customer_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Customer t) {
		dao.insert(t);
		
	}

	public void update(Customer t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Customer selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Customer> selectAll() {

		return dao.selectAll();
	}

	
}
