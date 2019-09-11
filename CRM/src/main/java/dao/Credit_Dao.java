package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Credit;



@Repository
public interface Credit_Dao {
	@Select("select*from crm_customer_credit where id=#{id}")
	public Credit selectById(int id);
	@Select("select*from crm_customer_credit ${txt} ${limit}")
	public List<Credit> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_customer_credit")
	public List<Credit> select();
	@Insert("insert into crm_customer_credit(name) values(#{name})")
	public void insert(Credit t);
	@Update("update crm_customer_credit set name=#{name} where id=#{id}")
	public void update(Credit t);
	@Delete("delete from crm_customer_credit where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_customer_credit ${txt}")
	public int selectCount(@Param("txt") String txt);
}
