package com.java.basics.pattern.method;

/**
 * 工厂方法的请求
 */
public class MethodUser {
    public static void main(String[] args){
        String car1 = new BenChi().getCar();
        System.out.println("=======car的名字"+car1);
        String car2 = new BaoMa().getCar();
        System.out.println("=======car的名字"+car2);
    }
}
