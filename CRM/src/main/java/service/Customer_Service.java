package service;

import java.util.List;

import model.Customer;
import utils.ReturnInfo;

public interface Customer_Service {
	public int selectCount(String txt);
	public Customer selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Customer> selectAll();
	public void insert(Customer t);
	public void update(Customer t);
	public void delete(int id);
}
