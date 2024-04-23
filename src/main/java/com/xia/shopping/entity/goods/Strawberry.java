package com.xia.shopping.entity.goods;
/**
 * 草莓商品继承计重商品
 * */

public class Strawberry extends WeightGoods {
    public Strawberry(int totalWeight) {
        super("草莓",totalWeight,13);
    }

    public Strawberry(int totalWeight,double discount) {
        super("草莓",totalWeight,13,discount);
    }
}
