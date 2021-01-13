package com.hb.kind.string.test;

import org.junit.Test;

/** 2021/1/13
 * 方法之间传参数
 * 一、值    bigdata  100000000  山东大学   查询、修改   start("山东大学")
 *
 *    //需求：交换两个数的值  num1 = 100; num2 = 90 ==>
 *    //定义功能：
 */
public class transfer_paramers_test {
    @Test
    public void test1() {
        int number1 = 100;
        int numbur2 = 90;
        exchange(number1, numbur2);
        System.out.println("交换后的值number1:"+number1+"交换后的值numbur2:"+numbur2);
        //100 90
    }

    public static  void exchange( int num1,int num2){
        int temp;
        temp = num1;
        num1 = num2;
        System.out.println("交换后的值num1:"+num1+"交换后的值num2:"+num2);
        //90 90
    }

    /**两个变量转换，怎样可以不用第三个变量转换*/
    @Test
    public void test() {
        int number1 = 100;
        int numbur2 = 90;
        exchange1(number1, numbur2);
        System.out.println("交换后的值number1:"+number1+"交换后的值numbur2:"+numbur2);
        //100 90
    }
    public  static void exchange1(int num1,int num2){
        /*num1 = num1^num2;
        num2 = num2^num1;
        num1 = num1^num2;*/
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("交换后的值num1:" + num1 +"交换后的值num2:" +num2);
    }

    /**
     * 引用
     *      地址值--   int[] array={1,2,3}    Student s;
     * 	             change(List list)   ArrayList arrayList
     *
     * 	//需求：把数组中的元素值都加10
     */
    @Test
    public  void test2(){
        int[] array={1,2,3};
        for (int i = 0;i<array.length;i++){
            System.out.println("增加之前第"+(i+1)+"元素的值是："+array[i]);
        }     //1,2,3

        //调用方法，完成功能
        add(array);
        for(int i = 0;i<array.length;i++){
            System.out.println("调用方法后第"+(i+1)+"元素的值是："+array[i]);
        }  //11,12,13
    }

    public void add(int[] array){
        //实现代码
        //遍历
        for (int i = 0;i<array.length;i++){
            array[i] +=10;    //short s = 90；  s=s +1;  s +=1；
        }
        //输出
        for (int i=0;i<array.length;i++){
            System.out.println("方法体内第"+(i+1)+"元素的值是："+array[i]);
        }   //11,12,13
    }
}
