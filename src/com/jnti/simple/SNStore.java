package com.jnti.simple;



public class SNStore {
    public Phone getPhone(String type,String color){
        Phone phone = null;
        if (type.equals("苹果")){
            phone = new Apple(color);
        } else if (type.equals("三星")){
            phone = new Samsung(color);
        }
        return phone;
    }
}
