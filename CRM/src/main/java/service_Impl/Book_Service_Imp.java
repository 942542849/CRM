package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import dao.Tpye_Dao;
import model.Book;
import service.Book_Service;
import utils.ReturnInfo;
@Service

public class Book_Service_Imp implements Book_Service{
@Autowired
Book_Dao dao;
	public ReturnInfo select(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.select(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

	public void insert(Book t) {
		dao.insert(t);
		
	}

	public void update(Book t) {
		dao.update(t);
	}

	public void delete(int id) {
		dao.delete(id);
	}

	public Book selectById(int id) {
		return dao.selectById(id);
	}

	public int selectCount(String txt) {
		
		return dao.selectCount(txt);
	}

	public List<Book> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	
}
