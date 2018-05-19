package com.gebilaolitou.jni;

/**
 * Created by libai on 2018/4/12.
 */

public class JNITools {

    static {
        System.loadLibrary("jnidemo3");
    }

    //加法
    public static native int  add(int a,int b);

    //减法
    public static native int sub(int a,int b);

    //乘法
    public static native int mul(int a,int b);

    //除法
    public static native int div(int a,int b);


}
