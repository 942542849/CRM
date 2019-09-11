package service;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Department;
import utils.ReturnInfo;

public interface Department_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Department selectById(int id);
	public void insert(Department t);
	public void update(Department t);
	public void delete(int id);
	public List<Department> select();
}
