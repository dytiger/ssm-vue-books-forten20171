package org.forten.sample.action;

import javax.annotation.Resource;

import org.forten.sample.bo.BookBo;
import org.forten.sample.dto.qo.BookQo;
import org.forten.sample.dto.ro.Message;
import org.forten.sample.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookAction {
	@Resource
	private BookBo bo;
	
	@RequestMapping("save")
	public @ResponseBody
	Message
	save(@RequestBody Book book){
		int i = bo.doSave(book);
		return Message.info("插入了"+i+"条数据。");
	}

	@RequestMapping("list")
	public @ResponseBody
	List<Book> list(@RequestBody BookQo qo){
		return bo.queryBy(qo);
	}
}
