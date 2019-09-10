package service;

import java.util.List;

import model.Book;
import utils.ReturnInfo;

public interface Book_Service {
	public int selectCount(String txt);
	public Book selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Book> selectAll();
	public void insert(Book t);
	public void update(Book t);
	public void delete(int id);
}
