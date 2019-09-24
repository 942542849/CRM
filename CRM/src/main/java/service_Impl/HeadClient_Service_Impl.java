package service_Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HeadClient_Dao;
import model.HeadClient;
import service.HeadClient_Service;
import utils.ReturnInfo;
@Service

public class HeadClient_Service_Impl implements HeadClient_Service{
@Autowired  
HeadClient_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null; 
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	public ReturnInfo Head(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.Head(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	
	public void insert(HeadClient t) {
		dao.insert(t);
		
	}
	public void update(HeadClient t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public HeadClient selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<HeadClient> selectAll() {
		return dao.selectAll();
	}

	
}
