package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.WorkGroup;







@Repository
public interface WorkGroup_Dao {
	@Select("select*from c_workgroup where id=#{id}")
	public WorkGroup selectById(int id);
	@Select("select*from c_workgroup ${txt} ${limit}")
	public List<WorkGroup> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from c_workgroup")
	public List<WorkGroup> select();
	@Insert("insert into c_workgroup(name) values(#{name})")
	public void insert(WorkGroup t);
	@Update("update c_workgroup set name=#{name} where id=#{id}")
	public void update(WorkGroup t);
	@Delete("delete from c_workgroup where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from c_workgroup ${txt}")
	public int selectCount(@Param("txt") String txt);
}
