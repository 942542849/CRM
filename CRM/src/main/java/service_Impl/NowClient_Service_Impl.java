package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.NowClient_Dao;
import model.NowClient;

import service.NowClient_Service;
import utils.ReturnInfo;
@Service

public class NowClient_Service_Impl implements NowClient_Service{
@Autowired
NowClient_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public List<NowClient> NowClient(String where,String limit) {
	
		return dao.NowClient(where, limit);
	}

	
	public void insert(NowClient t) {
		dao.insert(t);
		
	}
	public void update(NowClient t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public NowClient selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<NowClient> selectAll() {
		return dao.selectAll();
	}



	
}
