package service;

import java.util.List;

import model.Orderdetails;
import utils.ReturnInfo;

public interface Orderdetails_Service {
	public int selectCount(String txt);
	public Orderdetails selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Orderdetails> selectAll();
	public void insert(Orderdetails t);
	public void update(Orderdetails t);
	public void delete(int id);
}
