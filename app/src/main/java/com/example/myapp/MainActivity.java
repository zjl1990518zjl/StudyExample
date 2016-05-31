package com.example.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.lang.reflect.Proxy;
import java.util.Arrays;

import kkinterface.Shopping;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //静态代理
       // Object[] doshopping = new ProxyShopping(new ShoppingImp()).doshopping(100);
       // Log.e("kktest",Arrays.toString(doshopping));

        ShoppingImp shoppingImp = new ShoppingImp();
        //动态代理
        Shopping newProxyInstance = (Shopping) Proxy.newProxyInstance(Shopping.class.getClassLoader(), shoppingImp.getClass().getInterfaces(), new ShoppingInvocationHandler(shoppingImp));
        Object[] doshopping1 = newProxyInstance.doshopping(100);
        Log.e("kktest", Arrays.toString(doshopping1));
    }

}
