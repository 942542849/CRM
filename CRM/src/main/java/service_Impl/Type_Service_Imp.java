package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Tpye_Dao;
import model.Type;
import service.Type_Service;
import utils.ReturnInfo;
@Service

public class Type_Service_Imp implements Type_Service{
@Autowired
Tpye_Dao dao;
public ReturnInfo selectAll(String txt,Integer page,Integer max) {
	boolean canpage=page!=null;
	ReturnInfo info = new ReturnInfo();
	info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
	if(canpage)info.setCount(dao.selectCount(txt));
	return info;
}

	public void insert(Type t) {
		dao.insert(t);
		
	}

	public void update(Type t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Type selectById(int id) {
		
		return dao.selectById(id);
	}


	public List<Type> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}
	
}
