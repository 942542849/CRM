package service;

import java.util.List;

import model.Product;
import utils.ReturnInfo;

public interface Product_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Product selectById(int id);
	public void insert(Product t);
	public void update(Product t);
	public void delete(int id);
	public List<Product> select();
}
