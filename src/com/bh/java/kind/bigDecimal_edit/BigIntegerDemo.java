package com.bh.java.kind.bigDecimal_edit;

import org.junit.Test;

import java.math.BigInteger;

/**
 * BigInteger:可超过Integer范围内的数据进行运算
 * 构造方法
 * BigInteger(String val)
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        //这几个测试，是为了简单超过int范围内，Integer就不能再表示
        /*Integer integer = new Integer(100);
        System.out.println(integer);
        System.out.println(Integer.MAX_VALUE);
        //100 2147483647

        Integer ii = new Integer("2147483647");
        System.out.println(ii); //2147483647

        Integer iii = new Integer("2147483648");
        System.out.println(iii);//NumberFormatException*/

        // 通过大整数来创建对象
        BigInteger bigInteger = new BigInteger("2147483648");
        System.out.println("bigInteger:" + bigInteger);
        //2147483648
    }

    /**
     * public BigInteger add(BigInteger val):加
     * public BigInteger subtract(BigInteger val):减
     * public BigInteger multiply(BigInteger val):乘
     * public BigInteger divide(BigInteger val):除
     * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
     */
    @Test
    public void test() {
        //创建对象
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        //public BigInteger add(BigInteger val):加
        System.out.println("add:" + bi1.add(bi2));  //150
        //public BigInteger subtract(BigInteger val):减
        System.out.println("add:" + bi1.subtract(bi2));  //50
        //public BigInteger multiply(BigInteger val):乘
        System.out.println("add:" + bi1.multiply(bi2));  //5000
        //public BigInteger divide(BigInteger val):除
        System.out.println("add:" + bi1.divide(bi2));  //2

        //public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
        BigInteger[] bigIntegers = bi1.divideAndRemainder(bi2);
        //System.out.println("divideAndRemainder:"+ Arrays.toString(bigIntegers));  //Arrays.toString重载
        System.out.println("商:" + bigIntegers[0] + "余数:" + bigIntegers[1]);
    }
}
