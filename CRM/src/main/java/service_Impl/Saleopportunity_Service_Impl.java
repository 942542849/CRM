package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Saleopportunity_Dao;
import model.Saleopportunity;
import service.Saleopportunity_Service;

import utils.ReturnInfo;
@Service

public class Saleopportunity_Service_Impl implements Saleopportunity_Service{
@Autowired
Saleopportunity_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Saleopportunity t) {
		dao.insert(t);
		
	}

	public void update(Saleopportunity t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Saleopportunity selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Saleopportunity> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	
}
