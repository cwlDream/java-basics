package com.java.basics.pattern.abstractFactory;

public class Client {
    public static void main(String[] args) {

        AsiaManFactory asiaManFactory = new AsiaManFactory();
        AmericanFactory americanFactory = new AmericanFactory();

        Man anAmericanSuperMan = americanFactory.product();
        Man anAsia = asiaManFactory.product();

        anAsia.eat();
        anAmericanSuperMan.eat();

    }
}
