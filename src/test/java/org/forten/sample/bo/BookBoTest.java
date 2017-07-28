package org.forten.sample.bo;

import org.forten.sample.dto.qo.BookQo;
import org.forten.sample.model.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/*.xml"})
public class BookBoTest {
    @Resource
    private BookBo bo;

    @Test
    public void testQueryBy(){
        BookQo qo = new BookQo();
        List<Book> list = bo.queryBy(qo);
        Assert.assertNotNull(list);
        Assert.assertEquals(5,list.size());
    }
}
