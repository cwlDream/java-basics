package com.java.basics.pattern.simple;

import com.java.basics.pattern.simple.SimpleFactory;

/**
 * 请求用户
 */
public class SimpleUser {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory();
        factory.factoryCreate("benchi");
    }
}
