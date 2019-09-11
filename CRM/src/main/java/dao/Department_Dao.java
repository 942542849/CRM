package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Department;


@Repository
public interface Department_Dao {
	@Select("select*from crm_user_department where id=#{id}")
	public Department selectById(int id);
	@Select("select*from crm_user_department ${txt} ${limit}")
	public List<Department> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_user_department")
	public List<Department> select();
	@Insert("insert into crm_user_department(name) values(#{name})")
	public void insert(Department t);
	@Update("update crm_user_department set name=#{name} where id=#{id}")
	public void update(Department t);
	@Delete("delete from crm_user_department where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_user_department ${txt}")
	public int selectCount(@Param("txt") String txt);
}
