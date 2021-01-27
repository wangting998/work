package com.bh.java.exception_edit;
/**
 * 异常注意事项:
 * A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类
 * B:如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是其子集,子类不能抛出父类没有的异常
 * C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,
 * 如果子类方法内有异常,那么子类只能try,不能throws
 */

/*public class MyExceptionDemo {

}

class Fu {
    public void show() throws Exception {
    }

    public void method() {
    }
}

class Zi extends Fu {
    @Override
    public void show() throws ArithmeticException {

    }

    @Override
    public void method() {
        // String s = "2014-11-20";
        // SimpleDateFormat sdf = new SimpleDateFormat();
        // Date d = sdf.parse(s);
        // System.out.println(d);
    }
}*/
