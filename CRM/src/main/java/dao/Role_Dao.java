package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Role;



@Repository
public interface Role_Dao {
	@Select("select*from crm_user_role where id=#{id}")
	public Role selectById(int id);
	@Select("select*from crm_user_role ${txt} ${limit}")
	public List<Role> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_user_role")
	public List<Role> select();
	@Insert("insert into crm_user_role(name) values(#{name})")
	public void insert(Role t);
	@Update("update crm_user_role set name=#{name} where id=#{id}")
	public void update(Role t);
	@Delete("delete from crm_user_role where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_user_role ${txt}")
	public int selectCount(@Param("txt") String txt);
}
