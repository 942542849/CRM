package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Client_Dao;
import model.Client;
import service.Client_Service;


import utils.ReturnInfo;
@Service

public class Client_Service_Impl implements Client_Service{
@Autowired
Client_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Client t) {
		dao.insert(t);
		
	}

	public void update(Client t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Client selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Client> selectAll() {
		return dao.selectAll();
	}

	
}
