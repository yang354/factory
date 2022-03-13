package com.jnti.simple;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SNStore store = new SNStore();
        System.out.println("需要什么手机");
        String type = scanner.next();

        System.out.println("需要什么颜色");
        String color = scanner.next();
//        Phone phone = store.getPhone(type, color);
//        phone.show();

        AppleStore appleStore = new AppleStore();
        Phone phone = appleStore.getPhone(color);
        phone.show();
        scanner.close();
        System.out.println();
    }
}
