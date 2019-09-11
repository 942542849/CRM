package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Pleased;




@Repository
public interface Pleased_Dao {
	@Select("select*from crm_customer_pleased where id=#{id}")
	public Pleased selectById(int id);
	@Select("select*from crm_customer_pleased ${txt} ${limit}")
	public List<Pleased> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_customer_pleased")
	public List<Pleased> select();
	@Insert("insert into crm_customer_pleased(name) values(#{name})")
	public void insert(Pleased t);
	@Update("update crm_customer_pleased set name=#{name} where id=#{id}")
	public void update(Pleased t);
	@Delete("delete from crm_customer_pleased where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_customer_pleased ${txt}")
	public int selectCount(@Param("txt") String txt);
}
