package service_Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AchieveClient_Dao;

import model.AchieveClient;
import service.AchieveClient_Service;

import utils.ReturnInfo;
@Service

public class AchieveClient_Service_Impl implements AchieveClient_Service{
@Autowired  
AchieveClient_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	public ReturnInfo Achieve(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.Achieve(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	
	public void insert(AchieveClient t) {
		dao.insert(t);
		
	}
	public void update(AchieveClient t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public AchieveClient selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<AchieveClient> selectAll() {
		return dao.selectAll();
	}
	

	
}
