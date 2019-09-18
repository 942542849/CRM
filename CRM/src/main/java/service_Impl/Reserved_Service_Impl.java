package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Reserved_Dao;
import model.Reserved;
import service.Reserved_Service;

import utils.ReturnInfo;
@Service

public class Reserved_Service_Impl implements Reserved_Service{
@Autowired
Reserved_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Reserved t) {
		dao.insert(t);
		
	}

	public void update(Reserved t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Reserved selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Reserved> selectAll() {
		return dao.selectAll();
	}

	
}
