package com.jl.jvm.stack;

/**
 * @ClassName StackTest
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/24 16:51
 * @Version 1.0
 */
public class StackTest {
    private static int i = 0;
    public void test(){
        i++;
        System.out.println("调用栈"+i+"次");
        test();
    }
}
