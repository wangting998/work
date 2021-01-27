package com.bh.java.gather.list_son_edit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 * 分析：
 * A:创建键盘录入数据对象
 * B:键盘录入多个数据,不确定数量，所以用集合存储
 * C:以0结束,这个简单，只要键盘录入的数据是0，停止录入
 * D:把集合转成数组
 * E:对数组排序
 * F:获取该数组中的最大索引的值
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        // 创建键盘录入数据对象
        Scanner scanner = new Scanner(System.in);
        //键盘录入多个数据,不确定数量，所以用集合存储
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //以0结束,这个简单，只要键盘录入的数据是0，停止录入
        while (true) {
            System.out.println("请输入数据：");
            // nextInt()方法：用来接收输入的整数。
            // nextLine()方法：用来接收输入的字符串。
            int number = scanner.nextInt();
            if (number != 0) {
                arrayList.add(number);
            } else {
                break;
            }
        }
        //把集合转成数组
        Integer[] i = new Integer[arrayList.size()];
        arrayList.toArray(i);
        /**
         * ArrayList提供了一个将List转为数组的一个非常方便的方法toArray。
         * toArray有两个重载的方法：
         *      1）list.toArray();
         *      2）list.toArray(T[]  a);
         *      于第一个重载方法，是将list直接转为Object[] 数组；
         *      第二种方法是将list转化为你所需要类型的数组，当然我们用的时候会转化为与list内容相同的类型。
         */
        // 对数组排序
        Arrays.sort(i);
        // 获取该数组中的最大索引的值
        System.out.println("数组是：" + arrayToString(i));
        System.out.println("最大值是:" + i[i.length - 1]);
    }

    private static String arrayToString(Integer[] i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < i.length; x++) {
            if (x == i.length - 1) {
                sb.append(i[x]);
            } else {
                sb.append(i[x]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
