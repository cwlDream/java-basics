package com.java.basics.pattern.abstractFactory;

/**
 * 继承抽象化的人，实现就具体方法
 */
public class AsiaMan extends Man {
    @Override
    public void eat() {
        System.out.println("亚洲人用筷子吃");
    }
}
