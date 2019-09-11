package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Level;





@Repository
public interface Level_Dao {
	@Select("select*from crm_customer_level where id=#{id}")
	public Level selectById(int id);
	@Select("select*from crm_customer_level ${txt} ${limit}")
	public List<Level> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_customer_level")
	public List<Level> select();
	@Insert("insert into crm_customer_level(name) values(#{name})")
	public void insert(Level t);
	@Update("update crm_customer_level set name=#{name} where id=#{id}")
	public void update(Level t);
	@Delete("delete from crm_customer_level where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_customer_level ${txt}")
	public int selectCount(@Param("txt") String txt);
}
