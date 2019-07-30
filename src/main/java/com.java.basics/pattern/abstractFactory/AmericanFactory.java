package com.java.basics.pattern.abstractFactory;

public class AmericanFactory extends Factory {
    @Override
    public Man product() {
        AmericanSuperMan anAmericanSuperMan = new AmericanSuperMan();
        return anAmericanSuperMan;
    }
}
