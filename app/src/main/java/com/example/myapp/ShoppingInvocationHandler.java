package com.example.myapp;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author ${ZhangJialei}
 * Date 2016/5/26
 */
public class ShoppingInvocationHandler implements InvocationHandler{
    private  Object mObject;
    public ShoppingInvocationHandler(Object object) {
        mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
     //利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。

        if("doshopping".equals(method.getName())){
            Log.e("kktest","开始购物啦");
            Object things = method.invoke(mObject, args[0]);
            Log.e("kktest", "购物结束啦");
            return things;

        }
        return  null;
    }
}
