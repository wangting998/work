package com.hb.kind.string.test;
/**
 * 需求：把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};
 * 输出结果：
 *		"[1, 2, 3]"
 * 分析：
 * 		A:定义一个字符串对象，只不过内容为空
 * 		B:先把字符串拼接一个"["
 * 		C:遍历int数组，得到每一个元素
 * 		D:先判断该元素是否为最后一个
 * 			是：就直接拼接元素和"]"
 * 			不是：就拼接元素和逗号以及空格
 * 		E:输出拼接后的字符串
 */
public class splicingTest {
    public static void main(String[] args) {
        // 前提是数组已经存在
        int[] arr = {1, 2, 3};
        String s = "";
        s += "["; //定义一个字符串用来与数组中元素拼接
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1){
                s += arr[i];
                s += "]";
            }
            else
            {
                s += arr[i];
                s +=", ";
            }
        }
        System.out.println("最终的字符串是："+s);

        // 写一个功能，实现结果
        String result = arrayToString(arr);
        System.out.println("最终结果是：" + result);
    }

    private static String arrayToString(int[] arr) {
        StringBuffer sb = new StringBuffer();               //创建字符串缓冲区对象
        sb.append("[");                                     //将[添加到缓冲区
        //{1,2,3}
        for (int i = 0; i < arr.length; i++) {               //遍历数组
            //sb.append(arr[i] + ", ");                     //这样做没有]
            if(i == arr.length - 1) {
                sb.append(arr[i]).append("]");              //[1, 2, 3]
            }else {
                sb.append(arr[i]).append(", ");             //[1, 2,
            }
        }
        return sb.toString();
    }
}
