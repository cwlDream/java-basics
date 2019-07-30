package com.java.basics.pattern.delegate;

/**
 * 项目经理
 */
public class Manager implements Employee {
    //程序员
    private Programmer programmer;

    Manager(Programmer programmer) {
        this.programmer=programmer;
    }

    @Override
    public void doing() {
        //这是程序员
        programmer.doing();
    }

}
