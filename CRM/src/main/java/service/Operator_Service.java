package service;

import java.util.List;

import model.Operator;
import utils.ReturnInfo;

public interface Operator_Service {
	public int selectCount(String txt);
	public Operator selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<Operator> selectAll();
	public void insert(Operator t);
	public void update(Operator t);
	public void delete(int id);
	public Operator login(Operator u);
}
