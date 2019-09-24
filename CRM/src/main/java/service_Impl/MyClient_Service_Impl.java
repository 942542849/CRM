package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MyClient_Dao;
import model.MyClient;
import service.MyClient_Service;
import utils.ReturnInfo;
@Service

public class MyClient_Service_Impl implements MyClient_Service{
@Autowired
MyClient_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {  
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public List<MyClient> NowClient(String where,String limit) {
	
		return dao.NowClient(where, limit);
	}

	
	public void insert(MyClient t) {
		dao.insert(t);
		
	}
	public void update(MyClient t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public MyClient selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<MyClient> selectAll() {
		return dao.selectAll();
	}

	public int remove(MyClient u) {
		// TODO Auto-generated method stub
		return dao.remove(u);
	}

	public MyClient getAllById(int client_id) {
		// TODO Auto-generated method stub
		return dao.getAllById(client_id);
	}

	
}
