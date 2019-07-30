package com.java.basics.pattern.delegate;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager(new Programmer());
        manager.doing();
        //看似是项目经理在做事情
        //其实是叫程序员做的
        //功劳是项目经理的，干活是程序员
    }
}
