package service;

import java.util.List;

import model.Credit;
import utils.ReturnInfo;

public interface Credit_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Credit selectById(int id);
	public void insert(Credit t);
	public void update(Credit t);
	public void delete(int id);
	public List<Credit> select();
}
