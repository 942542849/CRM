package service;

import java.util.List;

import model.Order;
import utils.ReturnInfo;

public interface Order_Service {
	public int selectCount(String txt);
	public Order selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Order> selectAll();
	public void insert(Order t);
	public void update(Order t);
	public void delete(int id);
}
