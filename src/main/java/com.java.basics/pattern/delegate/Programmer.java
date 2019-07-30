package com.java.basics.pattern.delegate;

/**
 * 程序员
 */
public class Programmer implements Employee {
    @Override
    public void doing() {
        System.out.println("程序员码代码");
    }
}
