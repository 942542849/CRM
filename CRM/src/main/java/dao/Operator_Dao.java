package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Operator;





@Repository
public interface Operator_Dao {
	@Select("select count(1) from c_operator inner join c_workgroup on c_operator.group_id=c_workgroup.id ${txt}")
	public int selectCount(@Param("txt") String txt);
	@Select("select c_operator.*,c_workgroup.name groupname from c_operator inner join c_workgroup on c_operator.group_id=c_workgroup.id where c_operator.id=#{id}")
	public Operator selectById(int id); 
	@Select("select c_operator.*,c_workgroup.name groupname from c_operator inner join c_workgroup on c_operator.group_id=c_workgroup.id ${txt} ORDER BY c_operator.id ${limit}")
	public List<Operator> select(@Param("txt") String txt,@Param("limit") String limit);
	@Select("select c_operator.*,c_workgroup.name groupname from c_operator inner join c_workgroup on c_operator.group_id=c_workgroup.id")
	public List<Operator> selectAll();
	@Insert("insert into c_operator(tel,pass,name,group_id,power,status) values(#{tel},#{pass},#{name},#{group_id},#{power},#{status})")
	public void insert(Operator t);
	@Update("update c_operator set tel=#{tel},pass=#{pass},name=#{name},group_id=#{group_id},power=#{power},status=#{status} where id=#{id}")
	public void update(Operator t);
	@Delete("delete from c_operator where id=#{id}")
	public void delete(int id);
	@Select("select * from c_operator where tel = #{tel} and pass = #{pass}")
	public Operator login(Operator u);
	
	@Select("select * from c_operator where tel=#{tel}")
	public Operator selectByTel(String tel);
}
