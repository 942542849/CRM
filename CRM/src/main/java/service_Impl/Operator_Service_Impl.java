package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import dao.Operator_Dao;

import model.Operator;

import service.Operator_Service;

import utils.ReturnInfo;
@Service

public class Operator_Service_Impl implements Operator_Service{
@Autowired
Operator_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Operator t) {
		dao.insert(t);
		
	}

	public void update(Operator t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Operator selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Operator> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	public Operator login(Operator u) {
		// TODO Auto-generated method stub
		return dao.login(u);
	}


	
}
