package org.forten.sample.bo;

import javax.annotation.Resource;

import org.forten.sample.dao.MyBatisDao;
import org.forten.sample.dto.qo.BookQo;
import org.forten.sample.mapper.BookMapper;
import org.forten.sample.model.Book;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bookBo")
public class BookBo {
	@Resource
	private MyBatisDao<BookMapper> dao;
	
	@Transactional
	public int doSave(Book book){
		BookMapper bm = dao.getMapper(BookMapper.class);
		return bm.insert(book);
	}

	@Transactional(readOnly = true)
	public List<Book> queryBy(BookQo qo){
		BookMapper bm = dao.getMapper(BookMapper.class);
		return bm.selectBy(qo);
	}
}
