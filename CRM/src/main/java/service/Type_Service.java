package service;

import java.util.List;

import model.Type;
import utils.ReturnInfo;

public interface Type_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Type selectById(int id);
	public void insert(Type t);
	public void update(Type t);
	public void delete(int id);
	public List<Type> select();
}
