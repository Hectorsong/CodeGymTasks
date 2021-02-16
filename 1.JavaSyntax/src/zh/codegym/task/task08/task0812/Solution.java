package zh.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 最长序列
1.创建数字列表。
2.使用键盘向列表中添加 10 个数字。
3.显示列表中最长重复数字序列的长度。
列表 2、4、4、4、8、8、4、12、12、14 的示例：
3
值为 3，因为最长的重复数字序列为 3 个 4。
Requirements:
1. 程序必须在屏幕上显示一个数字。
2. 程序应从键盘读取值。
3. 在 main 方法中，声明包含 Integer 元素的 ArrayList 变量并立即初始化该变量。
4. 程序应根据条件将 10 个数字添加到集合中。
5. 程序应显示列表中最长重复数字序列的长度。
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            list.add(num);
        }
///*
// 1 package com.test;
// 2 /**
// 3  *
// 4  * @author 刘玲
// 5  *
// 6  */
//        7 public class TestInteger {
// 8
//         9     /**
//  10      * @param args
//  11      */
//         12     public static void main(String[] args) {
//                13         int i = 128;
//                14         Integer i2 = 128;
//                15         Integer i3 = new Integer(128);
//                16         //Integer会自动拆箱为int，所以为true
//                17         System.out.println(i == i2);
//                18         System.out.println(i == i3);
//                19         System.out.println("**************");
//                20         Integer i5 = 127;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
//                21         Integer i6 = 127;
//                22         System.out.println(i5 == i6);//true
//                23         /*Integer i5 = 128;
//                24         Integer i6 = 128;
//                25         System.out.println(i5 == i6);//false
//                26 */      Integer ii5 = new Integer(127);
//                27         System.out.println(i5 == ii5); //false
//                28         Integer i7 = new Integer(128);
//                29         Integer i8 = new Integer(123);
//                30         System.out.println(i7 == i8);  //false
//                31     }
//32
//        33 }
//        首先，17行和18行输出结果都为true,因为Integer和int比都会自动拆箱（jdk1.5以上）。
//22行的结果为true,而25行则为false,很多人都不动为什么。其实java在编译Integer i5 = 127的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
//所以关键就是看valueOf()函数了。只要看看valueOf()函数的源码就会明白了。JDK源码的valueOf函数式这样的：
//
//1 public static Integer valueOf(int i) {
//2         assert IntegerCache.high >= 127;
//3         if (i >= IntegerCache.low && i <= IntegerCache.high)
//4             return IntegerCache.cache[i + (-IntegerCache.low)];
//5         return new Integer(i);
//6     }
//看一下源码大家都会明白，对于-128到127之间的数，会进行缓存，Integer i5 = 127时，会将127进行缓存，下次再写Integer i6 = 127时，就会直接从缓存中取，
//就不会new了。所以22行的结果为true,而25行为false。
//
//对于27行和30行，因为对象不一样，所以为false。
//
//我对于以上的情况总结如下：
//
//  ①无论如何，Integer与new Integer不会相等。不会经历拆箱过程，i3的引用指向堆，而i4指向专门存放他的内存（常量池），他们的内存地址不一样，所以为false
//  ②两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
//  java在编译Integer i2 = 128的时候,被翻译成-> Integer i2 = Integer.valueOf(128);而valueOf()函数会对-128到127之间的数进行缓存
//  ③两个都是new出来的,都为false
//  ④int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
//* */

        /*跟冒泡排序的方法类似，逐一比较，只是这里不需要换位置
1、sameNum默认值是1
2、判断相邻2个数相同，sameNum就+1，然后比较sameNum和maxNum的大小，将大的值赋给maxNum
3、判断不相同时，就比较sameNum和maxNum的大小，将大的值赋给maxNum，然后把sameNum恢复成1，待后续继续与maxNum进行比较*/

        int sameNum = 1;
        int maxNum = 0;
        for(int i=1;i<10;i++)
        {
            if(list.get(i-1).equals(list.get(i)) )  //要用equals方法代替"=="，原因见上。
            {
                sameNum++;
                if(maxNum < sameNum)
                    maxNum = sameNum;
            }
            else
            {
                if(maxNum < sameNum)
                    maxNum = sameNum;
                sameNum = 1;
            }
        }

        System.out.println(maxNum);
    }
}