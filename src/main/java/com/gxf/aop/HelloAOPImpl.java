package com.gxf.aop;

/**
 * Created by 58 on 2017/12/28.
 */
public class HelloAOPImpl implements HelloAOP {
    public void sayHello() {
        try{
            System.out.println("hello aop");
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
