package com.jnti.simple;



public class SNStore {
    public Phone getPhone(String type,String color){
        Phone phone = null;
        if (type.equals("čšć")){
            phone = new Apple(color);
        } else if (type.equals("ä¸ć")){
            phone = new Samsung(color);
        }
        return phone;
    }
}
