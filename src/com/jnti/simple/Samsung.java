package com.jnti.simple;

public class Samsung extends Phone {
    public Samsung(String color) {
        super.setColor(color);
        super.setPrice(9888);
        super.setType("s22");
    }

    @Override
    public void show() {
        System.out.println("我拿都是尊贵的"+super.getType()+"手机");
    }
}
