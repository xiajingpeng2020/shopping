package com.xia.shopping.entity.shoppingcar;

import com.xia.shopping.entity.goods.WeightGoods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCar {
    private List<WeightGoods> goodsList=null;

    public void addGoods(WeightGoods weightGoods){
        if(Objects.nonNull(weightGoods)){
            boolean checkFlag=checkWeiht(weightGoods);
            if(!checkFlag){
                System.out.println(weightGoods.getName()+"必须得按整斤购买！");
                return;
            }
            if(Objects.isNull(goodsList)){
                goodsList=new ArrayList<>();
            }
            //添加商品
            goodsList.add(weightGoods);
        }
    }

    private boolean checkWeiht(WeightGoods weightGoods) {//校验重量是否是大于0的整数
        if(Objects.nonNull(weightGoods)) {
            Integer totalWeight = weightGoods.getTotalWeight();
            return Objects.nonNull(totalWeight)&&totalWeight>0;
        }
        return false;
    }

    public double countTotalCost(){
        BigDecimal sum=new BigDecimal(0);
        if(Objects.nonNull(this.goodsList)&&!this.goodsList.isEmpty()){
            for(WeightGoods weightGoods:goodsList){
                BigDecimal price=weightGoods.getPrice();
                Integer totalWeight=weightGoods.getTotalWeight();
                BigDecimal discount=weightGoods.getDiscount();
                if(Objects.isNull(discount)){//判断是否是打折
                    discount=new BigDecimal(1);
                }
                if(Objects.nonNull(price)&&Objects.nonNull(totalWeight)) {
                    //计算商品的总价值
                    sum = sum.add(price.multiply(new BigDecimal(totalWeight)).multiply(discount));
                }
            }
        }
        return sum.doubleValue();
    }

    public double countTotalCost(boolean discountFlag){
        BigDecimal sum=new BigDecimal(countTotalCost());
        if(discountFlag&&sum.compareTo(new BigDecimal(100))>=0){
            sum=sum.subtract(new BigDecimal(10));
        }
        sum=sum.setScale(1,BigDecimal.ROUND_DOWN);
        return sum.doubleValue();
    }

}
