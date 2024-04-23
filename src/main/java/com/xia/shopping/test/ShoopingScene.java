package com.xia.shopping.test;

import com.xia.shopping.entity.goods.Apple;
import com.xia.shopping.entity.goods.Mango;
import com.xia.shopping.entity.goods.Strawberry;
import com.xia.shopping.entity.shoppingcar.ShoppingCar;
public class ShoopingScene {
    /**
     * 模拟购物场景
     * */
    public static void main(String[] args) {
        /**
         * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
         * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
         * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * */
        //scene01();
        /**
         * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
         * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 B 购买的水果斤数(水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * */
        //scene02();
        /**
         * 3、超市做促销活动，草莓限时打 8 折。
         * 现在顾客 C 在超市购买了若干斤苹果、草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * */
        //scene03();
        /**
         * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
         * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
         * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
         * */
        scene04();
    }

    private static void scene04() {
        ShoppingCar shoppingCar=new ShoppingCar();
        shoppingCar.addGoods(new Apple(3));
        //草莓打8折
        shoppingCar.addGoods(new Strawberry(2,0.8));
        shoppingCar.addGoods(new Mango(3));
        Double totalCost=shoppingCar.countTotalCost(true);//是否执行优惠政策，满100元减掉10元
        System.out.println("总计花费:"+totalCost);
    }

    private static void scene03() {
        ShoppingCar shoppingCar=new ShoppingCar();
        shoppingCar.addGoods(new Apple(1));
        //草莓打8折
        shoppingCar.addGoods(new Strawberry(2,0.8));
        shoppingCar.addGoods(new Mango(2));
        Double totalCost=shoppingCar.countTotalCost();
        System.out.println("总计花费:"+totalCost);
    }

    private static void scene02() {
        ShoppingCar shoppingCar=new ShoppingCar();
        shoppingCar.addGoods(new Apple(1));
        shoppingCar.addGoods(new Strawberry(2));
        shoppingCar.addGoods(new Mango(2));
        Double totalCost=shoppingCar.countTotalCost();
        System.out.println("总计花费:"+totalCost);
    }

    private static void scene01() {
        ShoppingCar shoppingCar=new ShoppingCar();
        shoppingCar.addGoods(new Apple(1));
        shoppingCar.addGoods(new Strawberry(2));
        Double totalCost=shoppingCar.countTotalCost();
        System.out.println("总计花费:"+totalCost);
    }
}
