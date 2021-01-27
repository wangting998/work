package com.bh.java.exception_edit;

/**
 * java不可能对所有的情况都考虑到，所以，在实际的开发中，需要定义异常。
 * 类是一个异常类，就必须继承自Exception或者RuntimeException
 * <p>
 * 两种方式：
 * A:继承Exception
 * B:继承RuntimeException  回滚(出异常了要回滚到最初状态)
 */
public class MyException extends Exception {
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}

/*
public class MyException extends RuntimeException {
    @Test
    public void test() {
        try {
            System.out.println(",,,");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源,一定会执行
        }
    }
}*/
