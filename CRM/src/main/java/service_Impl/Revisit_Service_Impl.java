package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.Revisit_Dao;
import model.Revisit;

import service.Revisit_Service;
import utils.ReturnInfo;
@Service

public class Revisit_Service_Impl implements Revisit_Service{
@Autowired
Revisit_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Revisit t) {
		dao.insert(t);
		
	}

	public void update(Revisit t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Revisit selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Revisit> selectAll() {
		return dao.selectAll();
	}

	
}
