package com.xykj.javaskilldemo.java;

import android.os.Build;

import androidx.annotation.RequiresApi;

public interface TestInterface {

    void success();

    @RequiresApi(api = Build.VERSION_CODES.N)
    default void onError(String msg){

        System.out.println("java 8新特性");
    }

}
