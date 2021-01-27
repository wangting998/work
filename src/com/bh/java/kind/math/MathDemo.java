package com.bh.java.kind.math;

/**
 * 2021/1/13
 * Math:用于数学运算的类。
 * 成员变量：
 * public static final double PI
 * public static final double E
 * 成员方法：
 * public static int abs(int a)：绝对值
 * public static double ceil(double a):向上取整
 * public static double floor(double a):向下取整
 * public static int max(int a,int b):最大值 (min类同)
 * public static double pow(double a,double b):a的b次幂
 * public static double random():随机数 [0.0,1.0)
 * public static int round(float a) 四舍五入(参数为double)
 * public static double sqrt(double a):正平方根
 */
public class MathDemo {
    public static void main(String[] args) {
        // public static final double PI
        System.out.println("PI:" + Math.PI); //PI:3.141592653589793
        // public static final double E
        System.out.println("E:" + Math.E); //E:2.718281828459045
        System.out.println("--------------");

        // public static int abs(int a)：绝对值
        System.out.println("abs:" + Math.abs(10)); //abs:10
        System.out.println("abs:" + Math.abs(-10)); //abs:10
        System.out.println("--------------");

        // public static double ceil(double a):向上取整
        System.out.println("ceil:" + Math.ceil(12.34)); //ceil:13.0
//        System.out.println("ceil:" + Math.ceil(12.56)); //ceil:13.0
        System.out.println("--------------");

        // public static double floor(double a):向下取整
        System.out.println("floor:" + Math.floor(12.34)); //floor:12.0
        System.out.println("floor:" + Math.floor(12.56)); //floor:12.0
        System.out.println("--------------");

        // public static int max(int a,int b):最大值
        System.out.println("max:" + Math.max(12, 23)); //max:23
        // 需求：我要获取三个数据中的最大值
        // 方法的嵌套调用
        System.out.println("max:" + Math.max(Math.max(12, 23), 18)); //max:23
        // 需求：我要获取四个数据中的最大值
        System.out.println("max:"
                + Math.max(Math.max(12, 78), Math.max(34, 56)));  //max:78
        System.out.println("--------------");

        // public static double pow(double a,double b):a的b次幂
        System.out.println("pow:" + Math.pow(2, 3)); //pow:8.0
        System.out.println("--------------");

        // public static double random():随机数 [0.0,1.0)
        System.out.println("random:" + Math.random()); //random:0.9025433316042355
        // 获取一个1-100之间的随机数
        System.out.println("random:" + ((int) (Math.random() * 100) + 1));
        System.out.println("--------------");

        // public static int round(float a) 四舍五入(参数为double的自学)
        System.out.println("round:" + Math.round(12.34f)); //round:12
        System.out.println("round:" + Math.round(12.56f)); //round:13
        System.out.println("--------------");

        //public static double sqrt(double a):正平方根
        System.out.println("sqrt:" + Math.sqrt(4)); //sqrt:2.0
    }
}
