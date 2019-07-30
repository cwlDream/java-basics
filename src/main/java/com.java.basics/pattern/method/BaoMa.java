package com.java.basics.pattern.method;

/**
 * 工厂方法的实现类
 */
public class BaoMa implements Factory {
    @Override
    public String getCar() {
        return "宝马";
    }
}
