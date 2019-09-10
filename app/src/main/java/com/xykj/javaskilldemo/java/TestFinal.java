package com.xykj.javaskilldemo.java;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestFinal {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String[] args){

        //finally总是执行，除非程序或线程被中断，如果try里面一直死循环，那么finally也可能不执行
        try{
            System.out.println("======try=====");
            System.exit(1);
        }finally {
            System.out.println("======finally=====");
        }

        //List.of 本身创建的就是不可变对象

        List<Integer> list = null;

        Objects.requireNonNull(list);

    }

}
