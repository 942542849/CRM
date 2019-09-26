package service_Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import dao.NoheadClient_Dao;
import model.NoheadClient;
import service.NoheadClient_Service;
import utils.ReturnInfo;
@Service

public class NoheadClient_Service_Impl implements NoheadClient_Service{
@Autowired  
NoheadClient_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	public ReturnInfo Nohead(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.Nohead(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}
	
	public void insert(NoheadClient t) {
		dao.insert(t);
		
	}
	public void update(NoheadClient t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public NoheadClient selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<NoheadClient> selectAll() {
		return dao.selectAll();
	}
	public int updates(String clientid, String operatorids, String operatornames) {
		// TODO Auto-generated method stub
		return dao.updates(clientid,operatorids,operatornames);
	}
	
}
