package com.jnti.simple;

public class AppleStore extends Store {
    @Override
    public Phone getPhone(String color) {

        return new Apple(color);
    }
}
