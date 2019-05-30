package com.jl.jvm.stack;

/**
 * @ClassName StackErrorMock
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/24 16:27
 * @Version 1.0
 */
public class StackErrorMock {
    private static int index =1 ;

    public static void call(){
        index++;
        call();
    }

    public static void main(String[] args){

        StackErrorMock mock = new StackErrorMock();
        while(true){
            try {
                    mock.call();
            } catch (Throwable  e) {
                System.out.println("Stack deep : "+index);
                e.printStackTrace();
            }

        }
    }
}
