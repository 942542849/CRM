package service;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Role;
import utils.ReturnInfo;

public interface Role_Service {
	public ReturnInfo selectAll(String txt,Integer limit,Integer page);
	public Role selectById(int id);
	public void insert(Role t);
	public void update(Role t);
	public void delete(int id);
	public List<Role> select();
}
