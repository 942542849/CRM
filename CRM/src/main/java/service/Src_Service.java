package service;

import java.util.List;

import model.Src;
import utils.ReturnInfo;

public interface Src_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Src selectById(int id);
	public void insert(Src t);
	public void update(Src t);
	public void delete(int id);
	public List<Src> select();
}
