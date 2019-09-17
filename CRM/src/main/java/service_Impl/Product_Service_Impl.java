package service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.Product_Dao;
import model.Product;

import service.Product_Service;
import utils.ReturnInfo;

@Service
public class Product_Service_Impl implements Product_Service{
@Autowired
Product_Dao dao;
	public ReturnInfo selectAll(String txt,Integer page,Integer max) {
		boolean canpage=page!=null;
		ReturnInfo info = new ReturnInfo();
		info.setList(dao.selectAll(txt,ReturnInfo.getLimit(page, max)));
		if(canpage)info.setCount(dao.selectCount(txt));
		return info;
	}

		public void insert(Product t) {
			dao.insert(t);
			
		}

		public void update(Product t) {
			dao.update(t);
		}

		public void delete(int id) {
			dao.delete(id);
		}

		public Product selectById(int id) {
			
			return dao.selectById(id);
		}


		public List<Product> select() {
			return dao.select();
		}
}
