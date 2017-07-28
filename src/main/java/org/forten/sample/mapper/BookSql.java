package org.forten.sample.mapper;

import org.forten.sample.dto.qo.BookQo;
import org.forten.utils.common.StringUtil;

/**
 * Created by Administrator on 2017/7/27.
 */
public class BookSql {
    private static final String SQL = "SELECT id,name,author,publisher,price,page,discount,pub_date FROM test_book WHERE 1=1 ";
    public String getSql(BookQo qo){
        StringBuilder sb = new StringBuilder(SQL);
        if(StringUtil.hasText(qo.getName())){
            sb.append("AND name LIKE #{name} ");
        }
        if(qo.getMinPrice()>=0&&qo.getMaxPrice()>qo.getMinPrice()){
            sb.append("AND price*discount BETWEEN #{minPrice} AND #{maxPrice} ");
        }
        sb.append("ORDER BY id DESC");
        return sb.toString();
    }
}
