package com.xia.shopping.entity.goods;

import java.math.BigDecimal;

/**
 * 超市中的计重商品，有重量属性,它是抽象类
 * */
public abstract class WeightGoods {

    private String name;
    /**
     * 总重量
     * */
    private Integer totalWeight;
    /**
     * 价格
     * */
    private BigDecimal price;
    /**
     * 折扣
     * */
    private BigDecimal discount;

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public WeightGoods(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public WeightGoods(String name,Integer totalWeight, BigDecimal price, BigDecimal discount) {
        this.name=name;
        this.totalWeight = totalWeight;
        this.price = price;
        this.discount = discount;
    }

    public WeightGoods(String name,Integer totalWeight,double price,double discount) {
        this(name,totalWeight,new BigDecimal(price),new BigDecimal(discount));
    }

    public WeightGoods(String name, Integer totalWeight, double price) {
        this.name = name;
        this.totalWeight = totalWeight;
        this.price = new BigDecimal(price);
    }

}
