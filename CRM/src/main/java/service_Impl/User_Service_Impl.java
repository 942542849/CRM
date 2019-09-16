package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.User_Dao;
import dao.Department_Dao;
import dao.Role_Dao;
import model.User;
import service.User_Service;
import service.Department_Service;
import service.Role_Service;
import utils.ReturnInfo;
@Service

public class User_Service_Impl implements User_Service{
@Autowired
User_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(User t) {
		dao.insert(t);
		
	}

	public void update(User t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public User selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	public User login(User u) {
		// TODO Auto-generated method stub
		return dao.login(u);
	}

	
}
