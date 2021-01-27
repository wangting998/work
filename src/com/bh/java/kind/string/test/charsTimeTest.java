package com.bh.java.kind.string.test;

import java.util.Scanner;

/**
 * 需求：
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：
 * "Hello123World"
 * 结果：
 * 大写字符：2个
 * 小写字符：8个
 * 数字字符：3个
 * <p>
 * 分析：
 * 前提：字符串要存在
 * A:定义三个统计变量
 * bigCount=0
 * smallCount=0
 * numberCount=0
 * B:遍历字符串，得到每一个字符。
 * length()和charAt()结合
 * C:判断该字符到底是属于那种类型的
 * 大：bigCount++
 * 小：smallCount++
 * 数字：numberCount++
 * <p>
 * 这道题目的难点就是如何判断某个字符是大的，还是小的，还是数字的。
 * ASCII码表：
 * 0	48
 * A	65
 * a	97
 * 虽然，我们按照数字的这种比较是可以的，但是想多了，有比这还简单的
 * char ch = s.charAt(x);
 * if(ch>='0' && ch<='9') numberCount++
 * if(ch>='a' && ch<='z') smallCount++
 * if(ch>='A' && ch<='Z') bigCount++
 * D:输出结果。
 * <p>
 * 练习：把给定字符串的方式，改进为键盘录入字符串的方式。
 */
public class charsTimeTest {
    public static void main(String[] args) {
        //定义一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String name = scanner.nextLine();
        //定义三个统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //遍历字符串，得到每一个字符。length()和charAt()结合
        for (int x = 0; x < name.length(); x++) {
            // char charAt(int index):获取指定索引位置的字符
            char ch = name.charAt(x);

            //判断该字符到底是属于那种类型的
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        //输出结果
        System.out.println("大写字母" + bigCount + "个");
        System.out.println("小写字母" + smallCount + "个");
        System.out.println("数字" + numberCount + "个");
    }
}
