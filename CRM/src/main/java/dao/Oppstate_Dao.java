package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Oppstate;





@Repository
public interface Oppstate_Dao {
	@Select("select*from crm_sale_opportunity_state where id=#{id}")
	public Oppstate selectById(int id);
	@Select("select*from crm_sale_opportunity_state ${txt} ${limit}")
	public List<Oppstate> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from crm_sale_opportunity_state")
	public List<Oppstate> select();
	@Insert("insert into crm_sale_opportunity_state(name) values(#{name})")
	public void insert(Oppstate t);
	@Update("update crm_sale_opportunity_state set name=#{name} where id=#{id}")
	public void update(Oppstate t);
	@Delete("delete from crm_sale_opportunity_state where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from crm_sale_opportunity_state ${txt}")
	public int selectCount(@Param("txt") String txt);
}
