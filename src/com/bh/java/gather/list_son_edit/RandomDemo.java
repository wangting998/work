package com.bh.java.gather.list_son_edit;

import java.util.ArrayList;
import java.util.Random;

/**
 * 获取10个1-20之间的随机数，要求不重复
 * 用数组实现，但是数组的长度是固定，所以用集合实现。
 * 分析：
 * A:创建产生随机数的对象
 * B:创建一个存储随机数的集合。
 * C:定义一个统计变量。从0开始。
 * D:判断统计遍历是否小于10
 * 是:先产生一个随机数，判断该随机数在集合中是否存在。
 * 如果不存在:就添加，统计变量++。
 * 如果存在:
 * 否：不搭理它
 * E:遍历集合
 */
public class RandomDemo {
    public static void main(String[] args) {
        //创建产生随机数的对象
        // random()方法返回随机生成的一个实数,它在[0,1)范围内。
        Random random = new Random();
        //创建一个存储随机数的集合
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //定义一个统计变量。从0开始。
        int count = 0;
        //判断统计遍历是否小于10
        while (count < 10) {
            //先产生一个随机数
            int number = random.nextInt(20) + 1;
            //判断该随机数在集合中是否存在。
            if (!arrayList.contains(number)) {
                //如果不存在:就添加，统计变量++。
                arrayList.add(number);
                count++;
            }
            //遍历集合
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        }
    }
}
