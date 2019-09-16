package service;

import java.util.List;

import model.User;
import utils.ReturnInfo;

public interface User_Service {
	public int selectCount(String txt);
	public User selectById(int id);
	public ReturnInfo select(String txt,Integer limit,Integer page);
	public List<User> selectAll();
	public void insert(User t);
	public void update(User t);
	public void delete(int id);
	public User login(User u);
}
