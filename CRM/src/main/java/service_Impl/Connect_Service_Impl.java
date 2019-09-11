package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Connect_Dao;

import model.Connect;
import service.Connect_Service;
import service.User_Service;

import utils.ReturnInfo;
@Service

public class Connect_Service_Impl implements Connect_Service{
@Autowired
Connect_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Connect t) {
		dao.insert(t);
		
	}

	public void update(Connect t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Connect selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Connect> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	
}
