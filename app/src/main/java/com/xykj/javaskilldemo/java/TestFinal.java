package com.xykj.javaskilldemo.java;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestFinal {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String[] args){

        //finally总是执行，除非程序或线程被中断，如果try里面一直死循环，那么finally也可能不执行
//        try{
//            System.out.println("======try=====");
//            System.exit(1);
//        }finally {
//            System.out.println("======finally=====");
//        }
//
//        //List.of 本身创建的就是不可变对象
//
//        List<Integer> list = null;
//
//        Objects.requireNonNull(list);

        testReference();

    }

    //虚引用关联队列
    public static void testReference(){

        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

        PhantomReference<Object> phantomReference = new PhantomReference<>(object,referenceQueue);

        object = null;

        System.gc();

        try {
            Reference<Object> reference = (Reference<Object>) referenceQueue.remove(1000l);
            if (reference != null){
                System.out.println("==========remove=====");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
