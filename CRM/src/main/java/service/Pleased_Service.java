package service;

import java.util.List;

import model.Pleased;
import utils.ReturnInfo;

public interface Pleased_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Pleased selectById(int id);
	public void insert(Pleased t);
	public void update(Pleased t);
	public void delete(int id);
	public List<Pleased> select();
}
