package com.jnti.simple;

public class Apple extends Phone {
    public Apple(String color){
        super.setColor(color);
        super.setPrice(8888);
        super.setType("iPhone13");
    }

    @Override
    public void show() {
        System.out.println("我拿都是尊贵的"+super.getType()+"手机");
    }
}
