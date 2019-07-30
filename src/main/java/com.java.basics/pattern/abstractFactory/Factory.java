package com.java.basics.pattern.abstractFactory;

/**
 * 抽象工厂,为所有的不同的工厂提供一个制作人造人的相同方法
 */
public abstract class Factory {
    public abstract Man product(); //把上面的抽象类(Man)抽象到着了
}
