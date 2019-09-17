package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Src;






@Repository
public interface Src_Dao {
	@Select("select*from c_src where id=#{id}")
	public Src selectById(int id);
	@Select("select*from c_src ${txt} ${limit}")
	public List<Src> selectAll(@Param("txt")String txt,@Param("limit") String limit);
	@Select("select*from c_src")
	public List<Src> select();
	@Insert("insert into c_src(name) values(#{name})")
	public void insert(Src t);
	@Update("update c_src set name=#{name} where id=#{id}")
	public void update(Src t);
	@Delete("delete from c_src where id=#{id}")
	public void delete(int id);
	@Select("select count(1) from c_src ${txt}")
	public int selectCount(@Param("txt") String txt);
}
