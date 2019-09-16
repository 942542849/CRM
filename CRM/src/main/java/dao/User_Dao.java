package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.User;



@Repository
public interface User_Dao {
	@Select("select count(1) from( crm_user inner join crm_user_department on crm_user_department.id=crm_user.department_id) inner join crm_user_role on crm_user.role_id =crm_user_role.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select crm_user.*,crm_user_role.name rolename,crm_user_department.name departmentname from ( crm_user inner join crm_user_department on crm_user_department.id=crm_user.department_id) inner join crm_user_role on crm_user.role_id =crm_user_role.id where crm_user.id=#{id}")
	public User selectById(int id); 
	@Select("select crm_user.*,crm_user_role.name rolename,crm_user_department.name departmentname from ( crm_user inner join crm_user_department on crm_user_department.id=crm_user.department_id) inner join crm_user_role on crm_user.role_id =crm_user_role.id ${txt} ORDER BY crm_user.id ${limit}")
	public List<User> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select crm_user.*,crm_user_role.name rolename,crm_user_department.name departmentname from ( crm_user inner join crm_user_department on crm_user_department.id=crm_user.department_id) inner join crm_user_role on crm_user.role_id =crm_user_role.id")
	public List<User> selectAll();
	@Insert("insert into crm_user(name,sex,tel,pass,department_id,role_id,status) values(#{name},#{sex},#{tel},#{pass},#{department_id},#{role_id},#{status})")
	public void insert(User t);
	@Update("update crm_user set name=#{name},sex=#{sex},tel=#{tel},pass=#{pass},department_id=#{department_id},role_id=#{role_id},status=#{status} where id=#{id}")
	public void update(User t);
	@Delete("delete from crm_user where id=#{id}")
	public void delete(int id);
	@Select("select crm_user.* from crm_user where name=#{name} and pass=#{pass}")
	public User login(User u);
}
