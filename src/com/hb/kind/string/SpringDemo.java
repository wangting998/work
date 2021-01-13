package com.hb.kind.string;

import org.junit.Test;

/**  2021/1/12
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组
 * 通过查看API，我们可以知道
 *      A：字符串字面值"abc"也可以看成是一个字符串对象。
 *      B：字符串是常量，一旦被赋值，就不能被改变。
 *
 * 构造方法
 *      public String():空构造
 *      public String(byte[] bytes):把字节数组转成字符串
 *      public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
 *      public String(char[] value):把字符数组转成字符串
 *      public String(char[] value,int ondex,int count):把字符数组的一部分转成字符串
 *      public String(String original):把字符串常量值转成字符串
 */
public class SpringDemo {
     /**
      * Spring构造方法
      */
   public static void main(String[] args){
        //public String():空构造
        String string = new String();
        System.out.println("string:" + string);
        System.out.println("string.length():" + string.length());
        System.out.println("--------------------------------");

        //public String(byte[] bytes):把字节数组转成字符串
        byte[] bytes = {97,98,99,100,101};
        String string2 = new String(bytes);
        System.out.println("string2:" + string2);
        System.out.println("string2.length():" + string2.length());
        System.out.println("------------------------------------");

        //public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
        //我想得到字符串"bcd"
        String string3 = new String(bytes,1,3);
        System.out.println("string3:" + string3);
        System.out.println("string3.length():" + string3.length());
        System.out.println("------------------------------------");

        //public String(char[] value):把字符数组转成字符串
        char[] chars= {'a','b','c','d','e','王','文','婷'};
        String string4 = new String(chars);
        System.out.println("string4:" + string4);
        System.out.println("string4.length():" + string4.length());
        System.out.println("------------------------------------");

        //public String(char[] value,int ondex,int count):把字符数组的一部分转成字符串
        String string5 = new String(chars,2,4);
        System.out.println("string5:" + string5);
        System.out.println("string5.length():" + string5.length());
        System.out.println("------------------------------------");

        //public String(String original):把字符串常量值转成字符串
        String string6 = new String("abcde");
        System.out.println("string6:" + string6);
        System.out.println("string6.length():" + string6.length());
        System.out.println("------------------------------------");

        //字符串字面值"abc"也可以看成是一个字符串对象。
        String string7 = "abcde";
        System.out.println("string7:"+string7);
        System.out.println("string7.length():"+string7.length());
   }


     /**
      * String类的判断功能：
      * boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
      * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
      * boolean contains(String str):判断大字符串中是否包含小字符串
      * boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
      * boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
      * boolean isEmpty():判断字符串是否为空。
      *
      * 注意：
      * 		字符串内容为空和字符串对象为空。
      * 		String s = "";
      * 		String s = null;
      */
   @Test
   public void test(){
        // 创建字符串对象
        String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "HelloWorld";

        // boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
        System.out.println("equals:" + s1.equals(s2)); //true
        System.out.println("equals:" + s1.equals(s3)); //false
        System.out.println("-----------------------");

        // boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
        System.out.println("equals:" + s1.equalsIgnoreCase(s2)); //true
        System.out.println("equals:" + s1.equalsIgnoreCase(s3)); //true
        System.out.println("---------------------------------");

        // boolean contains(String str):判断大字符串中是否包含小字符串
        System.out.println("contains:" + s1.contains("hello")); //true
        System.out.println("contains:" + s1.contains("hw"));  //flase
        System.out.println("--------------------------------");

        // boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
        System.out.println("startsWith:" +s1.startsWith("h")); //true
        System.out.println("startsWith:" +s1.startsWith("hello")); //true
        System.out.println("startsWith:" +s1.startsWith("world")); //flase
        System.out.println("-----------------------------------");

        /**练习：boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾*/
        System.out.println("endsWith:" + s1.endsWith("world")); //true
        System.out.println("endsWith:" + s1.endsWith("h"));     //flase
        System.out.println("--------------------------------");

        /**boolean isEmpty():判断字符串是否为空。*/
        System.out.println("isEmpty:" + s1.isEmpty()); //false

        String s4 = "";
        String s5 = null;
        System.out.println("isEmpty:" + s4.isEmpty()); //true
        // NullPointerException
        // s5对象都不存在，所以不能调用方法，空指针异常
        /**System.out.println("isEmpty:" + s5.isEmpty());*/
   }

     /**
      * String类的获取功能
      * int length():获取字符串的长度。
      * char charAt(int index):获取指定索引位置的字符
      * int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
      * 		为什么这里是int类型，而不是char类型?
      * 		原因是：'a'和97其实都可以代表'a'
      * int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
      * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
      * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
      * String substring(int start):从指定位置开始截取字符串,默认到末尾。
      * String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
      */
   @Test
   public void gainTest(){
        // 定义一个字符串对象
        String s = "helloworld";

        // int length():获取字符串的长度。
        System.out.println("s.length:" + s.length());
        System.out.println("---------------------");  //10

        // char charAt(int index):获取指定索引位置的字符
        System.out.println("charAt:" + s.charAt(7));
        System.out.println("---------------------");  //r

        // int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
        System.out.println("indexOf:" + s.indexOf('l'));
        System.out.println("---------------------");  //2

        // int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
        System.out.println("indexOf:" + s.indexOf("owo"));
        System.out.println("---------------------");  //4

        // int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
        System.out.println("indexOf:" + s.indexOf('l',4)); //8
        System.out.println("indecOf:" + s.indexOf('k',4)); //-1
        System.out.println("indecOf:" + s.indexOf('l',40)); //-1
        System.out.println("-----------------------------------------");

        /**自己练习：int indexOf(String str,int
          fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。*/
        System.out.println("indexOf:" + s.lastIndexOf("owo",2)); //-1
        System.out.println("indexOf:" + s.lastIndexOf("owo",20)); //4
        System.out.println("-----------------------------------------------");

        // String substring(int start):从指定位置开始截取字符串,默认到末尾。包含start这个索引
        System.out.println("substring:" + s.substring(5)); //world
        System.out.println("substring:" + s.substring(0)); //helloworld
        System.out.println("----------------------");

        // String substring(int start,int
        // end):从指定位置开始到指定位置结束截取字符串。包括start索引但是不包end索引
        System.out.println("substring:" + s.substring(3,8)); //lowor
        System.out.println("substring:" + s.substring(0,s.length())); //helloworld
        System.out.println("--------------------------------------");
   }

     /**
      * String的转换功能：
      * byte[] getBytes():把字符串转换为字节数组。
      * char[] toCharArray():把字符串转换为字符数组。
      * static String valueOf(char[] chs):把字符数组转成字符串。
      * static String valueOf(int i):把int类型的数据转成字符串。
      * 		注意：String类的valueOf方法可以把任意类型的数据转成字符串。
      * String toLowerCase():把字符串转成小写。
      * String toUpperCase():把字符串转成大写。
      * String concat(String str):把字符串拼接。
      */
   @Test
   public void  shiftTest(){
        //定义一个字符串对象
        String string = "JavaSE";

        // byte[] getBytes():把字符串转换为字节数组。
        byte[] bytes = string.getBytes();
        for (int x=0;x<bytes.length;x++){
             System.out.println(bytes[x]);
        }   //74、 97、118、97、83、69
        System.out.println("------------");

        // char[] toCharArray():把字符串转换为字符数组。
        char[] chars = string.toCharArray();
        for (int x=0;x<chars.length;x++){
             System.out.println(chars[x]);
        } //J、a、V、a、S、E
        System.out.println("------------");

        // static String valueOf(char[] chs):把字符数组转成字符串。
        String ss = string.valueOf(chars);
        System.out.println(ss); //JaVaSE
        System.out.println("------------");

        // static String valueOf(int i):把int类型的数据转成字符串。
        int i = 100;
        String sss = string.valueOf(i);
        System.out.println(sss);  //100
        System.out.println("------------");

        // String toLowerCase():把字符串转成小写。
        System.out.println("toLowerCase:" + string.toLowerCase()); //javase
        System.out.println("string:" + string); //JavaSE
        System.out.println("----------------");
        //String toUpperCase():把字符串转成大写。
        System.out.println("toUpperCase:" + string.toUpperCase()); //JAVASE
        System.out.println("----------------");

        //String concat(String str):把字符串拼接。
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        System.out.println("s3:"+s3); //helloworld
        System.out.println("s4:"+s4); //helloworld
   }
}