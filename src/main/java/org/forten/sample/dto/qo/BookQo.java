package org.forten.sample.dto.qo;

import org.forten.utils.common.StringUtil;

/**
 * Created by Administrator on 2017/7/27.
 */
public class BookQo {
    private String name;
    private int minPrice;
    private int maxPrice;

    public BookQo() {
    }

    public BookQo(String name, int minPrice, int maxPrice) {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        if (StringUtil.hasText(this.name)) {
            return "%" + name + "%";
        } else {
            return null;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public String toString() {
        return "BookQo{" +
                "name='" + name + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }
}
