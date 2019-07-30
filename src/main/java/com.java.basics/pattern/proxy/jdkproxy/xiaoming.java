package com.java.basics.pattern.proxy.jdkproxy;

public class xiaoming implements Person {
    @Override
    public String getName() {
        return "小明";
    }

    @Override
    public String getAge() {
        return "18";
    }
}
