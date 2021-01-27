package com.bh.java.kind.bigDecimal_edit;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 2021/1/13
 * 看程序写结果：
 * 这是因为float类型的数据存储和整数不一样导致的。它们大部分的时候，都是带有有效数字位。
 * <p>
 * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * <p>
 * BigDecimal类：不可变的、任意精度的有符号十进制数,可以解决数据丢失问题。
 */
public class BigDecimalDemo {
    @Test
    public void test() {
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
        System.out.println(1.0 - 0.12);
    }

    /**
     * 构造方法：
     * public BigDecimal(String val)
     * public BigDecimal add(BigDecimal augend) 加
     * public BigDecimal subtract(BigDecimal subtrahend) 减
     * public BigDecimal multiply(BigDecimal multiplicand) 乘
     * public BigDecimal divide(BigDecimal divisor) 除
     * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
     */
    public static void main(String[] args) {
        //创建对象
        BigDecimal bigDecimal1 = new BigDecimal("100");
        BigDecimal bigDecimal2 = new BigDecimal("50");
        //public BigDecimal(String val)
        System.out.println("bigDecimal1:" + bigDecimal1);  //100

        //调用方法完成功能： +  —  *  /
        //public BigDecimal add(BigDecimal augend) 加
        System.out.println("和 是：" + bigDecimal1.add(bigDecimal2));  //150

        //public BigDecimal subtract(BigDecimal subtrahend) 减
        System.out.println("差  是：" + bigDecimal1.subtract(bigDecimal2));  //50

        //public BigDecimal multiply(BigDecimal multiplicand) 乘
        System.out.println("积  是：" + bigDecimal1.multiply(bigDecimal2)); //5000

        //public BigDecimal divide(BigDecimal divisor) 除
        System.out.println("商  是：" + bigDecimal1.divide(bigDecimal2));  //2

        //public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
        /*BigDecimal bigDecimal4 = new BigDecimal("10.01");
        bigDecimal4.divide(BigDecimal.ONE,2,4);
        System.out.println(bigDecimal4);  //10.01*/
    }
}
