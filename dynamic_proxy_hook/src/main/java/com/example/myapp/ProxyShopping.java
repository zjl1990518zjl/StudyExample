package com.example.myapp;

import android.util.Log;

import kkinterface.Shopping;

/**
 * Author ${ZhangJialei}
 * Date 2016/5/24
 * 静态代理，对shoppingImp进行方法代理
 */
public class ProxyShopping implements Shopping{
    public Shopping base;
    public ProxyShopping(Shopping base) {
        this.base = base;
    }

    @Override
    public Object[] doshopping(int money) {
        Log.e("kktest","开始买东西");
        Object[] things = base.doshopping(money);
        Log.e("kktest","买完东西了");
        return things;
    }
}
