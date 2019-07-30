package com.java.basics.pattern.proxy.jdkproxy;

public class Demo {

    public static void main(String[] args){
        JDKProxy jdkProxy = new JDKProxy();
        //xiaoming xiaoming = new xiaoming();
        Person newProxy = (Person) jdkProxy.newProxy(new xiaoming());

    }
}
