package com.example.myapp;

import android.util.Log;

import kkinterface.Shopping;

/**
 * Author ${ZhangJialei}
 * Date 2016/5/24
 */
public class ShoppingImp implements Shopping{

    @Override
    public Object[] doshopping(int money) {
        Log.e("kktest","买东西花了"+money);
        return new Object[]{"鞋子","衣服"};
    }
}
