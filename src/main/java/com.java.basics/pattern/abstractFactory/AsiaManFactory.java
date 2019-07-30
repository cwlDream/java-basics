package com.java.basics.pattern.abstractFactory;

public class AsiaManFactory extends Factory {
    @Override
    public Man product() {
        Man anAisaMan = new AsiaMan();
        return anAisaMan;
    }
}
