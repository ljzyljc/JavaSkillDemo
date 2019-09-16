package com.xykj.javaskilldemo.java;

public class TestString {

    public static void main(String[] args){

        String msg = new StringBuffer("djflsd").append("123456").append("987").toString();


        String msgString = "aa"+"bb"+"cc"+"dd";

        String detail = "aabbccdd";

        System.out.println(msgString == detail); //true


        String s1 = new String("do");
        s1.intern();
        String s2 = "do";

        System.out.println(s1 == s2);

        String s3 = new String("12") + new String("34");
        s3.intern();
        String s4 = "1234";
        System.out.println(s3 == s4);//true





//        看了评论中的，感觉误区还是不少的，这里经过心爱之人极大的帮助，总结如下，
//        首先要搞清楚一个概念，就是到底创建了几个对象。基于1.8
//        String s1=new String("11");//在堆中创建对象，并且新建一个"11"对象放入常量池
//
//        对比声明式拼接
//        String s1=new String("11")+new String("111");//创建5个，分别是堆中的3个："11" "111" "11111"，常量池2个 "11"
//        "111"
//
//        看到不同了么，很多人认为，new出来的只在堆里，这就是最大的错误
//
//        我们再说常量池，早知道，常量池里不止是字面量常量，还有引用型常量，这是重点
//
//
//        intern这个方法是这样说的，如果该对象代表的字符串在常量池可以找到，那么，返回该常量的引用，如果找不到，那么，去堆中查找，堆中存在，
//
//        则讲堆中对象的引用放入常量池，并返回该引用（看到了么，是将堆中对象的引用放入常量池），如果都没有找到，则讲该字面量放入常量池




        //char占两个byte,同样长度的char数组和byte数组容量差两倍


//        (1) String的创建机理
//        由于String在Java世界中使用过于频繁，Java为了避免在一个系统中产生大量的String对象，引入了字符串常量池。
//
//        其运行机制是：创建一个字符串时，首先检查池中是否有值相同的字符串对象，如果有则不需要创建直接从池中刚查找到的对象引用；
//
//        如果没有则新建字符串对象，返回对象引用，并且将新创建的对象放入池中。但是，通过new方法创建的String对象是不检查字符串池的，
//
//        而是直接在堆区或栈区创建一个新的对象，也不会把对象放入池中。上述原则只适用于通过直接量给String对象引用赋值的情况。
//
//        举例：String str1 = "123"; //通过直接量赋值方式，放入字符串常量池
//        String str2 = new String(“123”);//通过new方式赋值方式，不放入字符串常量池
//
//        注意：String提供了intern()方法。调用该方法时，如果常量池中包括了一个等于此String对象的字符串（由equals方法确定），则返回池中的字符串。
//
//        否则，将此String对象添加到池中，并且返回此池中对象的引用。


//        回答一下上面一个人的问题，问题是“”String s3 = new String("12") + new String("34");
//        s3.intern();
//        String s4 = "1234";
//        System.out.println(s3 == s4);//true
//
//        求解,为什么在第二段比较中会返回true,从字节码看s3应该就是生成了一个stringbuilder对象完成连接操作后执行了toString,
//
//        s3不是应该仍然是堆内的对象地址吗?为什么会和常量池中的地址相等?“”
//
//
//
//        我之前也是不明白s3为什么等于s4，查了下资料，说是在jdk1.7之后，如果字符串在堆中有实例，那intern方法就会把这个字符串的引用放在字符串常量池里，
//
//        所以，String s3 = new String("12") + new String("34");这里在字符串常量池里放了一个字符串“12”，一个字符串“34”，在堆里存放他们的运算结果“1234”，
//
//        然后把“1234”的引用返回给s3，
//        s3.intern()这段代码运行时，jvm在堆里先到了字符串“1234”，所以就会把他的引用放到字符串常量池里，这个引用和s3相等，

//        String s4 = "1234";这个代码时，会把字符串常量池里“1234”的引用返回给s4，所以s3是等于s4的，

        //https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html


    }


}
