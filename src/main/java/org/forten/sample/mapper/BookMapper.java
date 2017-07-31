package org.forten.sample.mapper;

import org.apache.ibatis.annotations.*;
import org.forten.sample.dto.qo.BookQo;
import org.forten.sample.model.Book;

import java.util.List;

public interface BookMapper {
	@Results(id="bookMap",value={
			@Result(property="pubDate",column="pub_date")
	})
	@Insert("INSERT INTO test_book (name,author,publisher,price,page,discount,pub_date) "
			+ "VALUES (#{name},#{author},#{publisher},#{price},#{page},#{discount},#{pubDate})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	int insert(Book book);

	@Results(id="bookMap",value={
			@Result(property="pubDate",column="pub_date")
	})
	@SelectProvider(type = BookSql.class,method = "getSql")
	List<Book> selectBy(BookQo qo);

	@Delete("<script>" +
			"DELETE FROM test_book WHERE id IN " +
			"<foreach collection='array' item='id' open='(' separator=',' close=')'>" +
			"#{id}" +
			"</foreach>"+
			"</script>")
	int delete(int... ids);
}
