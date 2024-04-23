package com.xia.shopping.entity.goods;

import java.math.BigDecimal;

/**
 * 苹果商品继承计重商品
 * */
public class Apple extends WeightGoods {

    public Apple(int totalWeight) {
        super("苹果",totalWeight,8);
    }
}
